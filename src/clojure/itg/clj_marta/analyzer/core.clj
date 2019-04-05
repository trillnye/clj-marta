(ns itg.clj-marta.analyzer.core
  (:require [cheshire.core :refer :all]
            [clojure.string :as string]
            [itg.clj-marta.common.util :refer :all]
            [camel-snake-kebab.core :refer :all]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]))

(def static-schedule-root "data/schedules/")
(def rail-root "rail/")
(def bus-root "bus/")
(def weekday-root "weekday/")
(def saturday-root "saturday/")
(def sunday-root "sunday/")
(def northbound-root "northbound/")
(def southbound-root "southbound/")
(def westbound-root "westbound/")
(def eastbound-root "eastbound/")


(defn load-static-schedule []
  (with-open [reader (io/reader "data/schedules/rail/weekday/northbound/gold.csv")]
    (doall
      (csv/read-csv reader))))

(defn get-rail-schedule [station direction]
  (let [static-schedule (load-static-schedule)] (reduce (fn [acc item]
             (conj acc {(keyword (get item 0)) (drop 1 item)})
             ) [] (apply mapv vector static-schedule))))