all:
	java -jar sablecc.jar parser.grammar
	javac compiler/*/*.java compiler/*.java

clean:
	rm -rf compiler/analysis compiler/lexer compiler/node compiler/parser compiler/*.class compiler/assembly/*.class compiler/symboltable/*.class compiler/visitors/*.class *~