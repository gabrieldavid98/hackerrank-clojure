(ns hackerrank.core
  (:require [clojure.string]))

(defn am? [time]
  (clojure.string/ends-with? time "AM"))

(defn pm? [time]
  (clojure.string/ends-with? time "PM"))

(defn process [time replacer part-mapper]
  (->> time
       (replacer)
       (#(clojure.string/split % #":"))
       (map #(Integer/parseInt %))
       (map-indexed part-mapper)
       (map #(format "%2d" %))
       (map #(clojure.string/replace % #" " "0"))
       (clojure.string/join ":")))

(defn am-replacer [time]
  (clojure.string/replace time #"AM" ""))

(defn pm-replacer [time]
  (clojure.string/replace time #"PM" ""))

(defn am-part-mapper [index item]
  (if (and (= index 0) (= item 12)) 0 item))

(defn pm-part-mapper [index item]
  (cond
    (and (= index 0) (< item 12)) (+ 12 item)
    :else item))

(defn solve [time]
  (cond
    (am? time) (process time am-replacer am-part-mapper)
    (pm? time) (process time pm-replacer pm-part-mapper)))
