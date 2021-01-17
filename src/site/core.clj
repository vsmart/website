(ns site.core
  (:require  [hiccup.page :as hp]))

(defn page  [data]
  (hp/html5
    [:head
     [:title  "Hi, I'm Franka"]
     [:div {:class "navbar"}
       [:a {:href "/index.html" :class "navbar-item"} "Home"]
       [:a {:href "/projects.html" :class "navbar-item"} "Projects"]
       [:a {:href "/talks.html" :class "navbar-item"} "Speaking"]
       ]
     (hp/include-css "main.css")]
    [:body
      [:div  {:class "wrapper"}
        (-> data :entry :content)]]))
