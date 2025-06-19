# 💱 Conversor de Moedas em Java

Um programa de conversão de moedas via console, escrito em Java, que permite ao usuário selecionar entre várias opções de conversão e consultar taxas de câmbio em **tempo real** usando a API [ExchangeRate API](https://www.exchangerate-api.com/).

---

## 📌 Funcionalidades

- app.Menu interativo via console com 6 opções de conversão:
  - USD ↔ ARS
  - USD ↔ BRL
  - USD ↔ COP
- Conversão em tempo real usando [ExchangeRate API](https://www.exchangerate-api.com/).
- Tratamento de entradas inválidas do usuário.
- Estrutura modular com separação de responsabilidades.
- Código comentado e pronto para expansão.

---

## 🛠️ Requisitos

- Java JDK 8 ou superior
- IntelliJ IDEA (ou outro IDE compatível)
- Biblioteca externa:
  - [Gson 2.10.1](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar)

---

## 📦 Instalação

1. **Clone ou baixe este repositório:**

```bash
git clone https://github.com/fausto18/conversor-moeda-java.git

Adicione o Gson ao projeto:

Se você não estiver usando Maven, faça o seguinte:

Baixe o .jar do Gson aqui

Coloque-o na pasta /lib

No IntelliJ: File > Project Structure > Modules > Dependencies > + > JARs or directories e adicione gson-2.10.1.jar

Execute a classe app.ConversorApp.java

🔑 Chave da API
Este projeto utiliza a API da ExchangeRate API, que requer uma chave de acesso (API key).

Como configurar:
Crie uma conta gratuita: https://www.exchangerate-api.com/

Copie sua chave de API

Vá até o arquivo src/config/Config.java e substitua:

java
Copiar código
public static final String API_KEY = "SUA_CHAVE_AQUI";
🗂️ Estrutura do Projeto
bash
Copiar código
Conversor_moeda/
├── src/
│   ├── config/
│   │   └── Config.java          # Armazena a chave da API
│   ├── app.ApiService.java          # Requisições à API de câmbio
│   ├── app.ConversorApp.java        # Classe principal (main)
│   ├── app.ConversorMoeda.java      # Controla as conversões
│   ├── app.Menu.java                # Exibe o menu e trata escolhas
│   └── app.Util.java                # Leitura segura de input
├── lib/
│   └── gson-2.10.1.jar          # Biblioteca para ler JSON
└── README.md
🧪 Exemplo de Execução
mathematica
Copiar código
==== CONVERSOR DE MOEDAS ====
1) Dólar => Peso argentino
2) Peso argentino => Dólar
3) Kwanza Angolano => Real brasileiro
4) Real brasileiro => Kwanza Angolano
5) Dólar => € Europeu
6) €uro Europeu => Dólar
7) Sair
Escolha uma opção: 3
Digite o valor a converter: 100
Resultado: 100000,00 AOA = 588,00 BRL
📄 Licença
Este projeto é de uso livre para fins acadêmicos e educacionais.

🙋‍♂️ Autor
Desenvolvido por [Fausto Sacufundala].
Contato: fausto.sacufundala1997@gmail.com
```
