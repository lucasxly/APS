# build-and-run.ps1
# Script PowerShell para compilar e executar a aplicação Java deste projeto (Windows PowerShell)

$root = Split-Path -Parent $MyInvocation.MyCommand.Definition
$src = Join-Path $root 'Programa APS\Aps-5S\src'
$bin = Join-Path $root 'Programa APS\Aps-5S\bin'

# Cria diretório de saída
New-Item -ItemType Directory -Force -Path $bin | Out-Null

Write-Host "Compilando fontes..."
javac -d "$bin" "$src\chatform\*.java" "$src\connection\*.java" "$src\main\*.java"
if ($LASTEXITCODE -ne 0) {
    Write-Error "Compilação falhou. Verifique erros de compilação acima."
    exit $LASTEXITCODE
}

Write-Host "Executando aplicação (Start GUI)..."
java -cp "$bin" main.Run
