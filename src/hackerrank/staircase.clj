(ns hackerrank.core)

(defn gen-row [[n m]]
  (->> " "
    (repeat (- m n))
    (#(concat % (repeat n "#")))))

(defn gen-groups [n]
  (map vector (range 1 (inc n)) (repeat n)))

(defn gen-result-string [n]
  (->> n
    (gen-groups)
    (map gen-row)
    (interpose "\n")
    (flatten)
    (apply str)
    (print)))

(defn staircase [n]
  (gen-result-string n))
