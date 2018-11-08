(ns pmp.server
  (:require [ring.adapter.jetty :refer [run-jetty]]


            [clojure.java.io :as io])
  (:import [org.zkoss.zk.ui.http DHtmlLayoutServlet]
           [org.eclipse.jetty.servlet ServletHandler]))




(defn handlerclj [request]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "ly"})





(defn -main
  ""
  []
  (let [h1 (proxy [ServletHandler] []
             (init [context]
               (println "----> INIT CALLED")
               (.setInitParameter context "update-uri" "/zkau")))

        handler (doto h1
                  (.addServletWithMapping DHtmlLayoutServlet "*.zul")
                  )
        ]
    (run-jetty handlerclj {:port         3000
                           :join         true
                           :configurator (fn [server]
                                           (let [h (ServletHandler.)]
                                             (.setHandler server h1)
                                             (doseq [x (.getServlets h1)]
                                               (.setInitParameter x "update-uri" "/zkau"))
                                             ))})))
