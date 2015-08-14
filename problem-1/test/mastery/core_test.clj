(ns mastery.core-test
  (:require [clojure.test :refer :all]
            [mastery.core :refer :all]))

(def test-name "test")

(defn say-hello-output
  []
  (with-out-str (with-in-str test-name (say-hello))))

(deftest say-hello-test
  (testing "Prints out inputted name"
    (is (.contains (say-hello-output) test-name)))

  (testing "Prints out multiple greetings"
    (is (some #(.contains (say-hello-output) %) ["Hello", "Howdy", "Hey"])))

  (testing "Prompts for user input"
    (is (.contains (say-hello-output) "Put in your name"))))
