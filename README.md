# Microservicos
 Spring Boot + Spring Cloud Netflix Eureka + Zuul + RabbitMQ + Spring Security

<br><br>
Configura��o para o RabbitMQ.

Para usar o RabbitMQ, � necess�rio realizar a configura��o abaixo:

1- Adicione uma "Queue" com o name de "crud.produto.queue" clicando na aba "Queues";
2- Atrele a "Queue" criada � uma "Exchanger" que foi iniciada pelo microservi�o "crud" pela routing key "crud.produto.routingkey";