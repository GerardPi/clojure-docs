(ns playground-test
  (:require [clojure.test :as tst]
            [playground :as pg]
            ))

(tst/deftest shouting
  (tst/is (= "H E L L O!!!" (pg/shout "hello"))))
