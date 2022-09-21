(ns algo-vanity-clj.core
  (:import (com.algorand.algosdk.account Account)
           (java.util.regex Pattern))
  (:gen-class))

(defn get-address [acc]
  (-> acc (. getAddress)))

(defn to-mnemonic [acc]
  (-> acc (. toMnemonic)))

(defn get-vanity-address [re-pattern]
  (let [acc (Account.)]
    (when (re-matches re-pattern (str (get-address acc)))
      (println (str "Address: " (get-address acc)))
      (println (str "Mnemonic: " (to-mnemonic acc)))
      true)))

(defn -main [& args]
  (println "")
  (println "╔═╗╦  ╔═╗╔═╗  ╦  ╦╔═╗╔╗╔╦╔╦╗╦ ╦  ╔═╗╦   ╦")
  (println "╠═╣║  ║ ╦║ ║  ╚╗╔╝╠═╣║║║║ ║ ╚╦╝  ║  ║   ║")
  (println "╩ ╩╩═╝╚═╝╚═╝   ╚╝ ╩ ╩╝╚╝╩ ╩  ╩   ╚═╝╩═╝╚╝")
  (println "")

  (println "Enter the start of the address (recommend under 6 characters)")
  (let [reader (java.io.BufferedReader. *in*)
        starts-with (.readLine reader)
        p (Pattern/compile (str "^" starts-with ".+") Pattern/CASE_INSENSITIVE)
        start-time (. System (currentTimeMillis))]
    (loop [re-pattern p
           x 0]
      (if (get-vanity-address re-pattern)
        (println (str "Done after " x " addresses checked"))
        (do
          (when (= (mod x 100000) 0)
            (println (str "Addresses checked: " x " after " (/ (double (- (. System (currentTimeMillis)) start-time)) 1000.0) " seconds")))
          (recur re-pattern (inc x)))))))