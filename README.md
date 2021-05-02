# Microservicos
 Spring Boot + Spring Cloud Netflix Eureka + Zuul + RabbitMQ + Spring Security

<br><br>
Configuração para o RabbitMQ.

Para usar o RabbitMQ, é necessário realizar a configuração abaixo:

1- Adicione uma "Queue" com o name de "crud.produto.queue" clicando na aba "Queues";
2- Atrele a "Queue" criada à uma "Exchanger" que foi iniciada pelo microserviço "crud" pela routing key "crud.produto.routingkey";