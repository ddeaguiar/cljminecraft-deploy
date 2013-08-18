(ns leiningen.cljminecraft-deploy
  (:require [robert.hooke :as rh]
            [leiningen.jar :as jar]
            [leiningen.uberjar :as uberjar]
            [leiningen.deploy]
            [leiningen.core.main :as main]
            [clojure.java.io :as io]
            [clojure.pprint :as cpp :only [pprint]]
            [clojure.string :as str :only [split join]]))

(defn- copy-file! [source dest]
  (do
    (main/info (str/join " " ["Copying" source "to" dest]))
    (io/copy (io/file source) (io/file dest))))

(defn copy-plugin-to-bukkit-hook [f & args]
  (let [params (set (map read-string (rest args)))
        uberjar? (contains? params :uberjar)
        source-file-path (if uberjar? (apply uberjar/uberjar args)
                             (apply jar/jar args))
        file-name (last (str/split source-file-path #"/"))
        plugins-dir (System/getenv "BUKKIT_PLUGINS_DIR")
        target-file-path (str/join [plugins-dir "/" file-name])]
    (copy-file! source-file-path target-file-path)
    source-file-path))

(defn activate []
  (rh/add-hook #'leiningen.deploy/deploy #'copy-plugin-to-bukkit-hook))
