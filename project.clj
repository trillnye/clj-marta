(defproject itg/clj-marta "1.0.0-SNAPSHOT"
  :description "Basic API clojure client for MARTA rail and bus schedules"
  :url "https://github.com/csmith-cb/clj-marta"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"
            :distribution :repo
            :comments "MIT license"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [net.mikera/core.matrix "0.62.0"]
                 [clatrix "0.5.0"]
                 [clojurewerkz/support "1.1.0"]
                 [camel-snake-kebab "0.4.0"]
                 [clj-http "3.9.1"]
                 [cheshire "5.8.1"]
                 [environ "1.1.0"]
                 [clj-time "0.15.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [incanter "1.9.3"]]
  :profiles {:1.10 {:dependencies [[org.clojure/clojure "1.10.0"]]}
             :master {:dependencies [[org.clojure/clojure "1.10.0"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.10:dev,master"]}
  :repositories {"sonatype" {:url "https://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail}}
                 "sonatype-snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  :javac-options      ["-target" "1.8" "-source" "1.8"]
  :jvm-opts           ["-Dfile.encoding=utf-8"]
  :source-paths       ["src/clojure"]
  :java-source-paths  ["src/java"])
