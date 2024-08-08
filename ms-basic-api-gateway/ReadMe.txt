1. Add following POm dependencies
   - Devtools
   - gateway (spring cloud) not gateway-mvc
   - Eureka client
   
2. Add following lines in application.properties

server.port=8765
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka

#spring.cloud.gateway.discovery.locator.enabled=true
#spring.cloud.gateway.discovery.locator.lower-case-service-id=true



   