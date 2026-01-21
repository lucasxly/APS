# Site sobre Energias — APS 1º Semestre (UNIP Tatuapé)

Projeto da APS desenvolvido no 1º semestre na UNIP (campus Tatuapé). Trata-se de um site estático informativo sobre diferentes fontes de energia, criado com HTML, CSS (Bootstrap) e JavaScript simples.

Preview: https://medronic.github.io/UnipAPS_1Semestre/

**O que tem neste repositório**
- Páginas informativas sobre energias: solar, eólica, hidrelétrica, geotérmica, biomassa, etc.
- Estrutura de pastas com ativos: `css/`, `js/`, `img/`, e páginas em HTML.

**Como visualizar localmente**
- Método rápido: abra `index.html` no navegador.
- Servidor local (recomendado para evitar problemas com caminhos):

	- Com Python 3 instalado:

```bash
cd "APS 1° Semestre/Site-Energia"
python -m http.server 8000
# então abra http://localhost:8000 no navegador
```

	- Ou use uma extensão/servidor estático como Live Server no VS Code.

**Estrutura principal**
- `index.html` — página inicial
- `css/` — estilos (Bootstrap + style.css)
- `js/` — scripts e dependências do Bootstrap
- `energias/`, `paginas/` — conteúdo sobre tipos de energia
- `img/` — imagens organizadas por tema


**Licença**
- Ver arquivo `LICENSE` para detalhes sobre a licença do projeto.

