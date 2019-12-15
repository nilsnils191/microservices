# Notes
 Notes can be found here spring-microservices-presentation.pdf file 
https://github.com/nilsnils191/microservices/blob/master/spring-microservices-presentation.pdf

 
 

# Diagram

```
   CurrencyConversionService   CurrencyExchangeService  
		|                  |
                           
                        | 
                        
		   Rabbit MQ
							  
                        |
		Zipkin Distributed Tracing Server
    
		        |
		      Database 	

```

# Zuul
Zuul acts as an API gateway or Edge service. It receives all the requests coming from the UI and then delegates the requests to internal microservices


# Running Zipkin on Windows

```
download zipkin JAR from https://zipkin.io/pages/quickstart site

Run below two separate commands
set RABBIT_URI=amqp://localhost
java -jar zipkin-server-2.7.0-exec.jar
```



# Installing Rabbit MQ

```
Windows
https://www.rabbitmq.com/install-windows.html
https://www.rabbitmq.com/which-erlang.html
http://www.erlang.org/downloads
Video - https://www.youtube.com/watch?v=gKzKUmtOwR4
```

you can start and stop RabbitMq using services window
