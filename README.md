# cljminecraft-deploy

A Leiningen plugin that adds a hook to `lein deploy` to deploy the cljminecraft
plugin jar to the local Bukkit `plugins` directory.

## Usage

`export BUKKIT_PLUGINS_DIR="/path/to/bukkit/plugins`

Add the following to your cljminecraft plugin project.clj:

    :plugins [[cljminecraft-deploy "0.1.0-SNAPSHOT"]]
    :hooks [leiningen.cljminecraft-deploy]

To deploy a plugin use `lein deploy`. If you need to deploy an uberjar, use
`lein deploy :uberjar`.

## License

Copyright © 2013 Daniel De Aguiar

Distributed under the Eclipse Public License, the same as Clojure.
