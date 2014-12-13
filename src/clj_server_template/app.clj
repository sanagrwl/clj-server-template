(ns clj-server-template.app
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [clj-server-template.views.index :as index-page])
  (:use [ring.middleware.json :only [wrap-json-response wrap-json-body]]
        [compojure.core]))

(defroutes main-routes
  (GET "/" []
    (index-page/contents))

  (POST "/status" []
    {:body {:status "No params"}})

  (GET "/status/:id" [id]
    {:body {:status id}})

  (route/resources "/"))

(def app
  (->
    (handler/api main-routes)
    (wrap-json-body)
    (wrap-json-response)))