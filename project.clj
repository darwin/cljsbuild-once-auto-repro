(defproject once-auto-repro "0.0.1"
  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.clojure/clojurescript "1.8.40" :scope "provided"]
                 [org.clojure/core.async "0.2.374"]]

  :plugins [[lein-cljsbuild "1.1.3"]]

  :source-paths ["src"]

  :resource-paths ["resources"]

  :clean-targets ^{:protect false} ["target"
                                    "resources/compiled"]

  :cljsbuild {:builds {:build-a
                       {:source-paths ["src"]
                        :compiler     {:output-to     "resources/compiled/repro.js"
                                       :output-dir    "resources/compiled"
                                       :asset-path    "compiled"
                                       :optimizations :none
                                       :source-map    true}}}}

  :aliases {"good" ["do"
                    "clean,"
                    "cljsbuild" "auto"]
            "bad"  ["do"
                    "clean,"
                    "cljsbuild" "once,"
                    "cljsbuild" "auto"]})