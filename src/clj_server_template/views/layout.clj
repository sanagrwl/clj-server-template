(ns clj-server-template.views.layout
  (:use [hiccup.core]))

(defn view-layout [title & content]
  (html
    [:head [:meta {:http-equiv "Content-type"
                   :content "text/html; charset=utf-8"}]
     [:title title]]
    [:body content]))
