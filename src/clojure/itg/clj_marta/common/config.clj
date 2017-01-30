(ns itg.clj-marta.common.config
  (:require [environ.core :refer [env]]))


(def config {:marta-api-key (env :marta-api-key)
             :marta-api-uri (env :marta-api-uri)})
