(ns problem-2.core)

(defn get-input []
  (do
    (println "Enter something:")
    (read-line)))

(defn count-letters []
  (let
    [input       (get-input)
     input-count (count input)
     output      (str input " has " input-count " characters")]
    (println output)))

(defn -main[]
  (count-letters))
