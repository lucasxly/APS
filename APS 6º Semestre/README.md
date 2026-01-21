# APS 6 Semestre
Projeto acadêmico: aplicação de controle de acesso com autenticação biométrica.

## Resumo

Aplicação Java desenvolvida como parte da Atividade Prática Supervisionada (APS) do 6º semestre na UNIP. O objetivo é controlar o acesso a dados (ex.: banco de informações sobre agrotóxicos) usando reconhecimento de digitais, com diferentes níveis de autorização.

Qual a proposta desse semestre?
-----------
Criar uma aplicação que faça autenticação biométrica que restrinja o acesso de digitais não cadastradas.

Principais funcionalidades
-----------
- Autenticação biométrica (captura e verificação de digitais).
- Múltiplos níveis de acesso (ex.: nível 1 — uso geral; nível 2 — gerência; nível 3 — administrador/ministro).
- Interface gráfica para cadastro e login.

Tecnologias
-----------
- Java
- OpenCV (para processamento/biometria)
- Maven (gerência de build)

# Interface Gráfica

Tela de Login

![image](https://user-images.githubusercontent.com/54387145/140671569-e2d5a464-0cbc-4008-bf7a-37aec31f6fc1.png)

Como executar
-----------
Requisitos básicos: JDK 11+ e Maven (ou use o wrapper incluído).

Windows (linha de comando):

```powershell
# No diretório do projeto
.\mvnw.cmd clean package
# Em seguida, execute pelo IDE ou use o artefato gerado em target
```

Obs.: o projeto pode exigir configuração adicional do OpenCV (bibliotecas nativas). Se usar uma IDE, importe como projeto Maven e configure a biblioteca nativa do OpenCV no classpath.

Estrutura do repositório (resumo)
-----------
- `src/main/java` — código-fonte principal
- `src/main/resources` — recursos e configurações (ex.: persistence.xml, icons)
- `digitais APS/` — módulos/experimentos de reconhecimento digital (ex.: classes de captura e treino)

Licença
-----------
Ver arquivo `LICENSE` no repositório.
