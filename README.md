# clj-server-template

Repo to create basic REST service project Leiningen template.

    When cloning a project, renaming directories/namespaces is too cumbersome

The project created using the template will have the following setup:

    :dependencies [[org.clojure/clojure "1.6.0"]
                   [compojure "1.1.5"]
                   [hiccup "1.0.4"]
                   [ring/ring-json "0.3.1"]]

    :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.3"]]}}

    :plugins [[lein-ring "0.8.7"]
              [lein-idea "1.0.1"]]

## Creating template

### Dependencies

This project requires [lein-create-template](https://github.com/tcw/lein-create-template) plugin.

    Tested with [lein-create-template "0.1.1"]


### Usage

    $ lein create-template <template name>
    
    $ cd <template name> 
    #Update project.clj version to not have snapshot
    $ lein install
    $ cd some-where
    $ lein new <template name> project-name

## License

Distributed under the Eclipse Public License.

