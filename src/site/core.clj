(ns site.core
  (:require  [hiccup.page :as hp]))

(defn page  [data]
  (hp/html5
    [:head
     [:title  "Hi, I'm Franka"]
     [:div {:class "navbar"}
       [:a {:href "/index.html" :class "navbar-item"} "Hi"]
       [:a {:href "/talks.html" :class "navbar-item"} "Speaking"]
       [:a {:href "/games.html" :class "navbar-item"} "Games"]
       [:a {:href "/projects.html" :class "navbar-item"} "Projects"]]
     (hp/include-css "main.css")]
    [:body
      [:div  {:class "wrapper"}
        (-> data :entry :content)]]))
