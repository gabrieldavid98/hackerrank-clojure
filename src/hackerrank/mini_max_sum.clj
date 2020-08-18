(ns hackerrank.core)

(defn solve [a]
  (let [sums (map (fn [x] (->> (keep-indexed #(if (not= x %1) %2) a) (apply +))) (range 0 (count a)))
        -min (apply min sums)
        -max (apply max sums)]
    (format "%d %d" -min -max)))

(defn miniMaxSum [arr]
  (print (solve arr)))
