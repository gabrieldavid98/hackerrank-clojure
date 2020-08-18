(ns hackerrank.core)

(defn solve [ar]
  (let [-max (apply max ar)
        tallest-candles (filter #(= % -max) ar)]
    (count tallest-candles)))

; Complete the birthdayCakeCandles function below.
(defn birthdayCakeCandles [ar]
  (solve ar))
