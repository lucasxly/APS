## APS 5º Semestre

# Aplicação de Conversa (APS - Arquitetura de Redes de Computadores)

Este repositório contém uma aplicação de chat em Java desenvolvida como trabalho da APS para o 5º semestre. A aplicação implementa um servidor simples que aceita múltiplas conexões de clientes e uma interface gráfica (Swing) para cliente e servidor.

**Visão geral**:
- A aplicação permite iniciar um servidor que aceita conexões TCP.
- Clientes podem conectar, enviar mensagens e receber broadcast das mensagens enviadas por outros usuários.

**Tecnologias**: Java SE, Swing, sockets TCP.

**Entradas principais**:
- Interface de inicialização: [Programa APS/Aps-5S/src/chatform/Start.java](Programa%20APS/Aps-5S/src/chatform/Start.java#L1)
- Cliente (GUI): [Programa APS/Aps-5S/src/chatform/Client.java](Programa%20APS/Aps-5S/src/chatform/Client.java#L1)
- Tela de login (cliente): [Programa APS/Aps-5S/src/chatform/Login.java](Programa%20APS/Aps-5S/src/chatform/Login.java#L1)
- Configuração e inicialização do servidor (GUI): [Programa APS/Aps-5S/src/chatform/SetupServer.java](Programa%20APS/Aps-5S/src/chatform/SetupServer.java#L1)
- Lógica do servidor (threads, broadcast): [Programa APS/Aps-5S/src/connection/Server.java](Programa%20APS/Aps-5S/src/connection/Server.java#L1)
- Classe que inicia a aplicação via código: [Programa APS/Aps-5S/src/main/Run.java](Programa%20APS/Aps-5S/src/main/Run.java#L1)

**Estrutura do projeto**

- `Programa APS/Aps-5S/src/chatform/` — interfaces gráficas (Start, Login, Client, SetupServer).
- `Programa APS/Aps-5S/src/connection/` — implementação do servidor multithread (`Server.java`).
- `Programa APS/Aps-5S/src/main/` — ponto de entrada `Run.java` que chama a GUI de `Start`.

Descrição rápida dos componentes:
- `Start` : Tela inicial que permite escolher executar como servidor ou cliente.
- `SetupServer` : Tela para configurar a porta e iniciar o servidor. Internamente cria um `ServerSocket` e instancia `connection.Server` para cada conexão aceita.
- `Login` : Tela de login do cliente (IP, porta, nome de usuário). Por padrão define o IP local e usuário `unip1`.
- `Client` : GUI do cliente que gerencia o socket com o servidor, envio de mensagens e exibição do chat.
- `connection.Server` : Thread que mantém a lista de clientes, recebe mensagens e faz broadcast para todos.

Requisitos
- Java Development Kit (JDK) 8 ou superior.
- Ambiente para compilar/rodar programas Java (IDE como IntelliJ/Eclipse ou linha de comando).

Como compilar e executar (linha de comando)

1) Compilar (exemplo simples):

```powershell
javac -d "Programa APS/Aps-5S/bin" Programa APS/Aps-5S/src/chatform/*.java Programa APS/Aps-5S/src/connection/*.java Programa APS/Aps-5S/src/main/*.java
```

2) Executar a aplicação (abre a tela inicial):

```powershell
java -cp "Programa APS/Aps-5S/bin" main.Run
```

Observações de execução
- Para iniciar apenas o servidor: abra a aplicação e clique em "Servidor" (ou execute `SetupServer.main`).
- Para iniciar um cliente: abra a aplicação e clique em "Cliente" (ou execute `Login.main`).
- No `Login`, informe o IP do servidor (por padrão preenche com o IP local), a porta definida em `SetupServer` e um nome de usuário.

Scripts úteis
- `build-and-run.ps1` — script PowerShell que compila os fontes em `Programa APS/Aps-5S/bin` e executa `main.Run`.
- `build-and-run.bat` — script para Prompt de Comando (Windows) que faz a mesma operação.

Como usar (PowerShell):

```powershell
# Se necessário, permita execução temporária:
Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass

.\build-and-run.ps1
```

Como usar (Prompt de Comando):

```bat
build-and-run.bat
```

Observação: os scripts assumem que o JDK está no `PATH` (comandos `javac` e `java`).

Notas de funcionamento
- Ao conectar, o `Client` envia o nome de usuário como primeira linha. O `Server` lê esse nome e adiciona o cliente à lista.
- Mensagens são enviadas no formato `Text&[usuario] ~> mensagem` e transmitidas a todos os clientes.
- Para desconectar o cliente, o texto `Disconnect <user>` é usado e o servidor remove o usuário da lista.

Licença
- Veja o arquivo `LICENSE` neste repositório.

-----