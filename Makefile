#Dikatso Moshweunyane 
#Assignment 2 Makefile 
#15 March 2022 

play: Hangman.class HangmanApp.class
	java HangmanApp

Hangman.class: Hangman.java
	javac Hangman.java

HangmanApp.class: HangmanApp.java
	javac HangmanApp.java

clean: 
	rm *.class 
