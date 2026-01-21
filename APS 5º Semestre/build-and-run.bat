@echo off
REM build-and-run.bat
REM Script para compilar e executar a aplicação Java no Prompt do Windows

setlocal
set ROOT=%~dp0
set SRC=%ROOT%Programa APS\Aps-5S\src
set BIN=%ROOT%Programa APS\Aps-5S\bin












endlocaljava -cp "%BIN%" main.Runecho Executando aplicacao (Start GUI)...)  exit /b 1  echo Compilacao falhou. Verifique os erros acima.if errorlevel 1 (javac -d "%BIN%" "%SRC%\chatform\*.java" "%SRC%\connection\*.java" "%SRC%\main\*.java"echo Compilando fontes...md "%BIN%" 2>nuln