# spring-boot-logback-demo



## References



###### [Logback Manual](https://logback.qos.ch/manual/index.html)



## jars needed



* slf4j-api.jar

* logback-core.jar

* logback-classic.jar



## Glossary



### Logger context



* LoggerContext is responsible for manufacturing Loggers

* Every Single Logger is attached to LoggerContext

* LoggerContext arranges Loggers in a tree like hierarchy



### Logger



* Root logger resides at the top of the logger hierarchy. It is exceptional in that it is part of every hierarchy at its inception.

* "java" is a parent of "java.util" and an ancestor of "java.util.Vector"



### Log Levels



* TRACE

* DEBUG

* INFO

* WARN

* ERROR



### Effective Log Level



* If a given logger is not assigned a level, then it inherits one from its closest ancestor with an assigned level.

* Root logger always has an assigned level. By default, this level is DEBUG

* A log request of level p issued to a logger having an effective level q, is enabled if p >= q.



### Appender



* An output destination is called an Appender

* Appenders exist for many different destinations including 

	* console

	* files

	* UNIX Syslog

	* TCP Sockets

	* JMS

	* Databases

	* many more

* More than one Appender can be attached to a Logger



### Encoders



* Encoders are responsible for transforming an event into a byte array as well as writing out that byte array into an OutputStream.

* Encoders have total control over the format of the bytes written out, but also control when (and if) those bytes get written out.



### Layouts



* Layouts are logback components responsible for transforming and formatting an incoming event into a String.



### Filters



* Logback filters are based on ternary logic allowing them to be assembled or chained together to compose an arbitrarily complex filtering policy.



### Mapped Daignostic Contexts



* In a typical multithreaded implementation of distributed system, different threads will handle different clients.

* Log request servicing a given client is uniquely stamped and the user puts contextual information into the MDC, the abbreviation of Mapped Diagnostic Context.



### How to print logback diagnostics



    

    // print internal state

    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();

    StatusPrinter.print(lc);

    

