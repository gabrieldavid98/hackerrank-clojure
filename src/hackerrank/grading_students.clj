(ns hackerrank.core)

(defn get-next-5-multiple [n]
  (->> (range n (+ n 10))
       (filter #(= (mod % 5) 0))
       (first)))

(defn mapper [n]
  (let [next-5-multiple (get-next-5-multiple n)
        diff (- next-5-multiple n)]
    (cond
      (< n 38) n
      (< diff 3) next-5-multiple
      (>= diff 3) n)))

(defn solve [grades]
  (map mapper grades))
