(ns clj-server-template.views.index
  (:require [clj-server-template.views.layout :refer [view-layout]])
  (:use [hiccup.core]))

(defn contents []
  (view-layout "Homepage"
    [:h2 ""]
    [:p {:id "an-id"} "Clojure!!"]
    [:div {:id "statuses"} "Another div"]
    [:script {:src "/js/jquery.js"}]))
