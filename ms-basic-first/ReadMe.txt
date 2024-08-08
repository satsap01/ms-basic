1. Add following dependencies in POM file
  - Eureka client
  - Devtools
  - Web Server

2. Add following in application.properties

server.port=8000
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka

3. Create a new controller class and return string

4. Executing URLs

- Without api-gateway
   http://localhost:8000/hello
   
- With API Gateway
  http://localhost:8765/MS-BASIC-FIRST/hello   
  