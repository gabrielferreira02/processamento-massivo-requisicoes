package com.gabrielferreira02.processamentoMassivoRequisicoes;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
    @Override
    public void processarResposta() throws InterruptedException {
        Thread.sleep(200);
    }
}
