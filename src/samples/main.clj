(ns clojure.examples.hello
	(:gen-class))

(defn hello-world [username]
(println (format "Hello, %s" username)))

(hello-world "world")
