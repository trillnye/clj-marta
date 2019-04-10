{:repl {:env {:marta-api-key "api-key-here"
              :marta-api-uri "http://developer.itsmarta.com"}
        :dependencies [[org.clojure/tools.nrepl "0.2.13"]
                       [org.clojure/data.csv "0.1.4"]
                       [camel-snake-kebab "0.4.0"]]}}
{:dev {:resource-paths ["test/resources"]
       :plugins [[codox "0.10.0"]]
       :codox {:source-paths ["src/clojure"]}
       :env {:marta-api-key "api-key-here"
             :marta-api-uri "http://developer.itsmarta.com"}}}
