#!/usr/bin/env groovy
/*
  ___  ____   __    __   _  _  _  _    ____  _  _  __ _  ____  __   _  _
 / __)(  _ \ /  \  /  \ / )( \( \/ )  / ___)( \/ )(  ( \(_  _)/ _\ ( \/ )
( (_ \ )   /(  O )(  O )\ \/ / )  /   \___ \ )  / /    /  )( /    \ )  (
 \___/(__\_) \__/  \__/  \__/ (__/    (____/(__/  \_)__) (__)\_/\_/(_/\_)


*/
//First Task
println "code for the first task"

// String Interpolation
def codeForSecondTask() {
	return ""
}

String name = "Al"
println "Hello ${name}"

def user = System.console().readLine("What's your name?\n")
def age = System.console().readLine("Hi " + user + ", what is your age?\n")
println("Your name is " + user + " and you are " + age + " years old.")