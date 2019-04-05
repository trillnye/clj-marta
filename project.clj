(defproject itg/clj-marta "1.0.0-SNAPSHOT"
  :description "Basic API clojure client for MARTA rail and bus schedules"
  :url "https://github.com/csmith-cb/clj-marta"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"
            :distribution :repo
            :comments "MIT license"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clojurewerkz/support "1.1.0"]
                 [camel-snake-kebab "0.4.0"]
                 [clj-http "2.3.0"]
                 [cheshire "5.7.0"]
                 [environ "1.1.0"]
                 [org.clojure/data.csv "0.1.4"]]
  :profiles {:1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :master {:dependencies [[org.clojure/clojure "1.9.0-master-SNAPSHOT"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.8:dev,master"]}
  :repositories {"sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  :javac-options      ["-target" "1.6" "-source" "1.6"]
  :jvm-opts           ["-Dfile.encoding=utf-8"]
  :source-paths       ["src/clojure"]
  :java-source-paths  ["src/java"])
