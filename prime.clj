(defn check-till [n] (Math/ceil (Math/sqrt n)))
(def denominators-for (comp (partial range 2)(partial inc)(partial check-till)))
(defn divisible-by? [nominator denominator] (zero? (rem nominator denominator)))

(defn is-prime? [number] (not (some (partial divisible-by? number) (denominators-for number))))

; bug is ---check for 2 is-prime or not

; Find the sum of all the primes below two million.

; (take-while neg? [-2 -1 0 1 2 3])

(def all-primes-below (comp (partial filter is-prime?) (partial range 2)))
(def sum-of-all-the-primes-below (comp (partial reduce +) (partial all-primes-below)))


(take 10001 (filter is-prime? (range)))