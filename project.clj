(defproject counsyl/vault-clj "0.2.0-SNAPSHOT"
  :description "Clojure client for the Vault secret management system."
  :url "https://github.com/counsyl/vault-clj"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :deploy-branches ["master"]

  :dependencies
  [[cheshire "5.5.0"]
   [clj-http "2.0.0"]
   [org.clojure/clojure "1.7.0"]
   [org.clojure/tools.logging "0.3.1"]])
