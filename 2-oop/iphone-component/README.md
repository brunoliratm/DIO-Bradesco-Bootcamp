# 📱 Desafio de Modelagem e Diagramação UML do Componente iPhone

## Objetivo

Este desafio propõe a modelagem e, opcionalmente, a implementação em Java das funcionalidades essenciais do componente iPhone, conforme apresentado no vídeo de lançamento de 2007. O foco é na representação das funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet através de um diagrama UML e, se desejar, da implementação das classes e interfaces correspondentes em arquivos `.java`.

## Funcionalidades a Modelar

- Reprodutor Musical

  - tocar(): Inicia a reprodução da música.
  - pausar(): Pausa a reprodução da música.
  - selecionarMusica(String musica): Seleciona a música a ser tocada.

- Aparelho Telefônico

  - ligar(String numero): Realiza uma ligação para o número especificado.
  - atender(): Atende uma chamada recebida.
  - iniciarCorreioVoz(): Inicia o correio de voz.

- Navegador na Internet
  - exibirPagina(String url): Exibe a página da URL fornecida.
  - adicionarNovaAba(): Abre uma nova aba no navegador.
  - atualizarPagina(): Atualiza a página atualmente exibida.

## Diagrama UML

```mermaid
classDiagram
  class ReprodutorMusical {
    <<interface>>
    +tocar() void
    +pausar() void
    +selecionarMusica(String musica) void
  }

  class AparelhoTelefonico {
    <<interface>>
    +ligar(String numero) void
    +atender() void
    +iniciarCorreioVoz() void
  }

  class NavegadorInternet {
    <<interface>>
    +exibirPagina(String url) void
    +adicionarNovaAba() void
    +atualizarPagina() void
  }

  class iPhone {
    +tocar() void
    +pausar() void
    +selecionarMusica(String musica) void
    +ligar(String numero) void
    +atender() void
    +iniciarCorreioVoz() void
    +exibirPagina(String url) void
    +adicionarNovaAba() void
    +atualizarPagina() void
  }

  iPhone ..|> ReprodutorMusical
  iPhone ..|> AparelhoTelefonico
  iPhone ..|> NavegadorInternet
```
