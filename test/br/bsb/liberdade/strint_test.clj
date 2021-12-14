(ns br.bsb.liberdade.strint-test
  (:require [clojure.test :refer :all]
            [br.bsb.liberdade.strint :as strint]))

(deftest string-interpolation
  (testing "Verify common scenarios"
    (is (= "Hello Joe!"
           (strint/strint "Hello %{name}!" {"name" "Joe"})))
    (is (= "My name is Frank and I am 21 years old."
           (strint/strint "My name is %{name} and I am %{age} years old."
                          {"name" "Frank"
                           "age"  21})))
  ))
