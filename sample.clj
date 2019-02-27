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

(def square (comp (partial apply *) (partial repeat 2)))

(square 6)

;-------------------------------------------------------------------

(def first-and-last (partial (juxt first last)))
(first-and-last "abcd")

(def first-and-last-equal? (comp (partial apply =)  first-and-last))
(first-and-last-equal? "abca")

(def middle (comp rest butlast))
(middle "abcd")

(def times (comp #(quot % 2) (partial count)))
(times "adff")









