{:repl {:env {:marta-api-key "475ad2ba-5928-4063-9d00-ae06fbb02f3c"
              :marta-api-uri "http://developer.itsmarta.com"}
        :dependencies [[org.clojure/tools.nrepl "0.2.13"]
                       [org.clojure/data.csv "0.1.4"]
                       [camel-snake-kebab "0.4.0"]]}}
{:dev {:resource-paths ["test/resources"]
       :plugins [[codox "0.10.0"]]
       :codox {:source-paths ["src/clojure"]}
       :env {:marta-api-key "475ad2ba-5928-4063-9d00-ae06fbb02f3c"
             :marta-api-uri "http://developer.itsmarta.com"}}}
