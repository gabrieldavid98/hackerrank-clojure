(ns hackerrank.core)

(defn diagonal-differnce [a]
  (Math/abs (- (reduce + (map #(apply nth %) (map vector a (range 0 (count a)))))
               (reduce + (map #(apply nth %) (map vector a (range (dec (count a)) -1 -1)))))))
