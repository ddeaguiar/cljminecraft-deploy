# cljminecraft-deploy

A Leiningen plugin that adds a hook to `lein jar` to deploy the cljminecraft
plugin to the Bukkit `plugins` directory.

## Usage

Put `[cljminecraft-deploy "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your
`:user` profile, or if you are on Leiningen 1.x do `lein plugin install
cljminecraft-deploy 0.1.0-SNAPSHOT`.

Add `:hooks [leiningen.cljminecraft-deploy]` to your cljminecraft plugin
project.clj.

## License

Copyright © 2013 Daniel De Aguiar

Distributed under the Eclipse Public License, the same as Clojure.
