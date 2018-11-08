(defproject pmp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [org.eclipse.jetty/jetty-servlet "9.4.12.v20180830"]
                 [org.zkoss.zk/zk "8.5.1.2-Eval"]
                 [org.zkoss.zk/zkbind "8.5.1.2-Eval"]
                 ;; [org.zkoss.zk/zkhex "8.5.1.2-Eval"] ; ZK PE
                 ;; [org.zkoss.zk/zkmax "8.5.1.2-Eval"] ; ZK EE
                 [org.zkoss.zk/zuti "8.5.1.2-Eval"]
                 [org.zkoss.zk/zhtml "8.5.1.2-Eval"]
                 [org.zkoss.zk/zkplus "8.5.1.2-Eval"]
                 ]
  :main ^:skip-aot pmp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repositories [["releases2" {:url "http://mavensync.zkoss.org/maven2"}]
                 ["releases1" {:url "http://mavensync.zkoss.org/eval"}]])
