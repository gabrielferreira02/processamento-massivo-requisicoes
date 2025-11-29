package com.gabrielferreira02.processamentoMassivoRequisicoes;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ProcessaEventoImpl implements ProcessaEvento {

    private final TestService testService;

    public ProcessaEventoImpl(TestService testService) {
        this.testService = testService;
    }

    @Override
    @RabbitListener(queues = RabbitMQConfig.QUEUE_NOME, containerFactory = "rabbitListenerContainerFactory")
    public void processar() throws InterruptedException {
        testService.processarResposta();
    }
}
