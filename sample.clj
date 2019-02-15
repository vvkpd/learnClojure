(defn select-odd-numbers
  [coll]
  (filter odd? coll))

(select-odd-numbers [2 3 4 5 7 90])

(defn select-even-numbers
  [coll]
  (filter even? coll))

(select-even-numbers [2 3 4 5 7 90])

(defn sum-of-numbers
  [coll]
  (reduce + coll))

(sum-of-numbers [2 3 4 5 7 90])

; to reverse a list just do 
(reverse [2 3 4 5 7 90])

