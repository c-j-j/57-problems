(ns problem-2.core-test
  (:require [clojure.test :refer :all]
            [problem-2.core :refer :all]))

(def test-input "test")

(defn count-letters-output
  []
  (with-out-str (with-in-str test-input (count-letters))))

(deftest count-letters-test
  (testing "Prints out input"
    (is (.contains (count-letters-output) test-input)) )
  (testing "Prints out length"
    (is (.contains (count-letters-output) (str (count test-input)))))
  )
