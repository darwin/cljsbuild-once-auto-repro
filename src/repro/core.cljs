(ns repro.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async]))

(def x "something123")

; this file must use some macros to trigger the issue
(go)