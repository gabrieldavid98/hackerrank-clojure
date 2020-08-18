(ns hackerrank.core)

(defn birth-day-candles [ar]
  (let [-max (apply max ar)
        tallest-candles (filter #(= % -max) ar)]
    (count tallest-candles)))
