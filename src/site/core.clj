(ns site.core
  (:require  [hiccup.page :as hp]))

(defn page  [data]
  (hp/html5
    [:head
      [:title  "Hi, I'm Franka"]
       (hp/include-css "main.css")]
    [:body
      [:div  {:class "wrapper"}
              (-> data :entry :content)]]
   ))
