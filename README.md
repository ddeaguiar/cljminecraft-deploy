# cljminecraft-deploy

A Leiningen plugin that adds a hook to `lein deploy` to deploy the cljminecraft
plugin jar to the local Bukkit `plugins` directory.

## Usage

Put `[cljminecraft-deploy "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your
`:dev` profile.

Add `:bukkit-plugins-dir "path/to/bukkit/plugins/dir"` to your `:dev` profile.

Add `:hooks [leiningen.cljminecraft-deploy]` to your cljminecraft plugin
project.clj.

To deploy a plugin use `lein deploy`. If you need to deploy an uberjar, use
`lein deploy :uberjar`.

## License

Copyright © 2013 Daniel De Aguiar

Distributed under the Eclipse Public License, the same as Clojure.
