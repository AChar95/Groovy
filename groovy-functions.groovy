#!/usr/bin/env groovy
String formatMessageForCurrentUser(String message) {
	"Hi ${system.getenv("USER")}, ${message}"
}
println formatMessageForCurrentUser("how are you?")