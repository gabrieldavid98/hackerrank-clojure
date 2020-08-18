(ns hackerrank.core)

(defn solve [a]
  (let [pos-ratio (/ (count (filter pos? a)) (count a))
        neg-ratio (/ (count (filter neg? a)) (count a))
        zero-ratio (/ (count (filter zero? a)) (count a))]
    (map #(->> % (double) (format "%.6f")) [pos-ratio neg-ratio zero-ratio])))

(defn plus-minus [arr]
  (print (clojure.string/join "\n" (solve arr))))
