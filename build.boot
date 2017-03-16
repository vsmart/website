(set-env!
  :source-paths #{"src" "content"}
  :dependencies '[[perun  "0.3.0" :scope "test"]
                  [pandeiro/boot-http "0.7.0"]
                  [hiccup "1.0.5"]])

(require '[io.perun :refer :all]
         '[pandeiro.boot-http :refer  [serve]])
