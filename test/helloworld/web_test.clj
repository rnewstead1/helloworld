(ns helloworld.web-test
  (:use midje.sweet))

(defn first-element [sequence default]
  (if (empty? sequence)
    default
    (first sequence)))

(fact "it normally returns the first element"
      (first-element [1 2 3] :default) => 1
      (first-element '(1 2 3) :default) => 1)

