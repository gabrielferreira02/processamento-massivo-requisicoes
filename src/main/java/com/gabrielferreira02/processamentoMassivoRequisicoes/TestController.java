package com.gabrielferreira02.processamentoMassivoRequisicoes;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class TestController {

    private final TestService testService;
    private final RabbitTemplate rabbitTemplate;

    public TestController(TestService testService, RabbitTemplate rabbitTemplate) {
        this.testService = testService;
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("rapido")
    public ResponseEntity<String> endpointRapido() throws InterruptedException {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE_NOME,
                RabbitMQConfig.ROUTING_KEY
        );
        return ResponseEntity.ok("resposta processada");
    }

    @PostMapping("lento")
    public ResponseEntity<String> endpointLento() throws InterruptedException {
        testService.processarResposta();
        return ResponseEntity.ok("resposta processada");
    }
}
