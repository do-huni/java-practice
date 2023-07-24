# Compile
path: root@goorm:/workspace/java-practice/OBJECTS#

javac -d ./bin ./src/<packageName>/*.java

1. BadTicketApp
javac -d ./bin ./src/BadTicketApp/*.java

# Run
path: root@goorm:/workspace/java-practice/OBJECTS#

java -cp ./bin <packageName>.<className>

1. BadTicketApp
java -cp ./bin BadTicketAppMain
