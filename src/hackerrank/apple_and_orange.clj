(ns hackerrank.core
  (:require [clojure.set :refer [intersection]]))

(defn fallen-fruits-pos [main-pos fruits]
  (->> fruits
       (map #(+ main-pos %))
       (into #{})))

(defn solve [s t a b apples oranges]
  (let [sams-house (into #{} (range s (inc t)))
        fallen-apples-pos (fallen-fruits-pos a apples)
        fallen-oranges-pos (fallen-fruits-pos b oranges)
        apples-in-sams-house (intersection sams-house fallen-apples-pos)
        oranges-in-sams-house (intersection sams-house fallen-oranges-pos)]
    (map count [apples-in-sams-house oranges-in-sams-house])))
