build:
	javac *java

clean:
	rm *.class

rmi:
	rmiregistry &

server:
	java -Djava.security.policy=server.policy AtomicCountServer

client:
	java -Djava.security.policy=server.policy AtomicCountClient