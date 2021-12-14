(ns br.bsb.liberdade.strint
  (:require [clojure.string :as s]))

(defn- to-key [x]
  (format "%%{%s}" x))

(defn- coerce [x]
  (format "%s" x))

(defn strint
  [inlet params]
  (reduce (fn [box [key value]]
            (s/replace box (to-key key) (coerce value)))
          inlet
          params))
