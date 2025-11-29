# Processamento massivo de requisições

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![RabbitMQ](https://img.shields.io/badge/Rabbitmq-FF6600?style=for-the-badge&logo=rabbitmq&logoColor=white)

Api desenvolvida em Java + Spring com rabbitmq simulando um cenário em que o processamento do serviço demora uma certa quantidade de tempo. Para isso a api dispõe de dois endpoints, o /lento e /rapido. No endpoint /lento o serviço é chamado diretamente e no /rapido é publicado no rabbitmq para ser consumido de forma assincrona reduzindo o tempo de resposta da requisição.

Utilizando uma ferramenta de testes como apachebench pode ver a diferênca de eficiência entre os endpoints dado um certo nuúmero de requisições

# Como rodar o projeto

1 - Clone o projeto
```
git clone https://github.com/gabrielferreira02/processamento-massivo-requisicoes.git
cd processamento-massivo-requisicoes
```

2 - Rode utilizando docker
```
docker compose up -d
```

3 - Com o projeto no ar testes podem ser realizados utilizando chamadas diretas a api ou com ferramentas terceiras
