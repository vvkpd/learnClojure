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

; to select only nth elements from a list just do 
(take-nth 3 [2 3 4 5 7 90])

(defn factorial-of
  [number]
  (if (<= number 1) 1
      (* (factorial-of (dec number)) number)))

(factorial-of 5)
