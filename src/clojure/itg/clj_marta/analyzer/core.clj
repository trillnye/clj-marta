(ns itg.clj-marta.analyzer.core
  (:require [cheshire.core :refer :all]
            [clojure.string :as string]
            [itg.clj-marta.common.util :refer :all]
            [camel-snake-kebab.core :refer :all]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]))

(def rail-file-location "data/schedules/rail/%s/%s/%s.csv")

(def rail-schedules ["weekday" "saturday" "sunday"])

(def rail-lines  {"red" ["northbound" "southbound"]
                  "gold" ["northbound" "southbound"]
                  "blue" ["eastbound" "westbound"]
                  "green" ["eastbound" "westbound"]})


(defn rotate-matrix [matrix]
  (apply mapv vector matrix))

(defn get-schedule-file-name [schedule line direction]
  (format rail-file-location schedule line direction))

(defn load-static-schedule [schedule line direction]
  (with-open [reader (io/reader  (get-schedule-file-name schedule line direction))]
    (rotate-matrix
     (doall
      (csv/read-csv reader)))))

(defn load-station-arrivals [schedule line direction]
  (let [static-schedule (load-static-schedule schedule line direction)]
    (reduce
     (fn [acc item]
      (merge acc
              {
               :station-name (get item 0)
               :arrivals (take 5 (drop 1 item))
              })) [] static-schedule)))

(defn load-directions [schedule line directions]
    (reduce (fn [acc item]
              (assoc acc (keyword item) (load-station-arrivals schedule line item))
              ) {} directions))

(defn load-lines [schedule lines]
  (reduce (fn [acc item]
            (assoc acc (keyword item) (load-directions schedule item (rail-lines item)))
            ) {} lines))

(defn load-schedules []
  (reduce (fn [acc item]
            (assoc acc (keyword item) (load-lines item (keys rail-lines)))
            ) {} rail-schedules))

(comment (defn get-static-schedule-by-station [station-name]
   (let [stations (parse-static-schedule (load-static-schedule))]
     (filter #(= (% :station-name) station-name) stations))))
