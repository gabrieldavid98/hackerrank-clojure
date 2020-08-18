(ns hackerrank.core)

(defn mapper [[a b]]
  (cond
    (> a b) [1 0]
    (< a b) [0 1]
    :else [0 0]))

(defn sum-up [l]
  (let [a (apply + (take-nth 2 l))
        b (apply + (take-nth 2 (rest l)))]
    [a b]))

(defn compare-triplets [a b]
  (->>
   (map vector a b)
   (map mapper)
   (flatten)
   (sum-up)))
