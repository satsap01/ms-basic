1. Add following Lines in application.properties

	server.port=8761
	
	eureka.client.register-with-eureka=false
	eureka.client.fetch-registry=false


2. Following dependencies in Pom
   - Eureka Server
   - Devtools
   
3. Following line in  main class

   @EnableEurekaServer  
