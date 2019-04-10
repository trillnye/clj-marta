(ns itg.clj-marta.analyzer.core
  (:require [cheshire.core :refer :all]
            [clojure.string :as string]
            [itg.clj-marta.common.util :refer :all]
            [itg.clj-marta.analyzer.static-schedule :refer :all]
            [camel-snake-kebab.core :refer :all]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]))

(def static-rail-schedule (load-schedule))
