;1. Find the sum of all the multiples of 3 or 5 below 1000

(def multiple-of (comp (partial rest) (partial range 0 1000)))

(def multiple-of-3-or-5 (into #{} (concat (multiple-of 5) (multiple-of 3))))
(def multiple-of-3-or-5 (clojure.set/union (into #{} (multiple-of 5)) (into #{} (multiple-of 3))))
 
(def sum-of-all-the-multiples-of-3-or-5 (reduce + multiple-of-3-or-5))


