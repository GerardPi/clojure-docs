(ns playground
  (:require [clojure.string :as str] [clojure.tools.logging :as log])

  (:gen-class))

(defn shout [text]
  (as-> (seq text) $
        (interpose \  $)
        (concat $ (repeat 3 \!))
        (clojure.string/join $)
        (str/upper-case $)))

(defn -main [& args]
  (log/info "args=" args)
  (let [foo ""]
    (->> args
         (map shout)
         (apply str)
         println)))

