(defn check-till [n] (Math/ceil (Math/sqrt n)))
(def denominators-for (comp (partial range 2) (partial inc)(partial check-till)))
(defn divisible-by? [nominator denominator] (zero? (rem nominator denominator)))

(defn is-prime? [number] (not (some (partial divisible-by? number) (denominators-for number))))




