(ns mastery.core)

(defn get-name []
  (do
    (println "Put in your name:")
    (read-line)))

(defn random-greeting []
  (rand-nth ["Howdy", "Hello", "Hey"]))

(defn say-hello []
  (let [user-name          (get-name)
        greeting           (random-greeting)
        greeting-with-name (str greeting ", " user-name)]
    (println greeting-with-name)))

(defn -main []
  (say-hello))
