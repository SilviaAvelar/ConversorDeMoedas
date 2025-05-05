# 💱 Conversor de Moedas - Java

[![Java Version](https://img.shields.io/badge/Java-17%2B-%23ED8B00?style=for-the-badge&logo=openjdk)](https://openjdk.java.net/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)

Bem-vindo ao **Conversor de Moedas** em Java!  
Este é um aplicativo de terminal que consome a API pública da [ExchangeRate-API](https://www.exchangerate-api.com/) para realizar conversões entre moedas internacionais em tempo real.

---

## 🖥️ Demonstração no Terminal

```bash
╔════════════════════════════════════════════════════╗
║           💱 Bem-vindo ao Conversor de Moedas 💱   ║
╚════════════════════════════════════════════════════╝

============== 🌍 MENU DE CONVERSÃO 🌍 ================
1️⃣  Dólar (USD)                >> Peso Argentino (ARS)
2️⃣  Peso Argentino (ARS)       >> Dólar (USD)
3️⃣  Dólar (USD)                >> Real Brasileiro (BRL)
4️⃣  Real Brasileiro (BRL)      >> Dólar (USD)
5️⃣  Dólar (USD)                >> Peso Colombiano (COP)
6️⃣  Peso Colombiano (COP)      >> Dólar (USD)
7️⃣  Sair ❌ 
=======================================================
👉 Escolha uma opção:

🔄 Buscando taxas de câmbio para USD...
Resposta da API: {"result":"success","documentation":"https://www.exchangerate-api.com/docs","terms_of_use":"https://www.exchangerate-api.com/terms","base_code":"USD","conversion_rates":{"USD":1,"BRL":5.15,"ARS":880.50,"COP":3920.75}}

💰 Digite o valor que deseja converter: 10

========= 💱 Resultado da Conversão 💱 =========
  10.00 USD  =>  51.50 BRL
================================================


🛠️ Tecnologias Utilizadas
📦 Java 17+
🌐 java.net.http.HttpClient
📊 Biblioteca Gson para JSON parsing
🎨 Cores ANSI para deixar o terminal mais interativo


📌 Funcionalidades
Consulta de taxas de câmbio atualizadas
Conversão entre diferentes moedas
Interface amigável no terminal com cores e emojis
Validação de entrada do usuário
Tratamento de erros de conexão/API


✅ Pré-requisitos
Java 17 ou superior
Conexão com a internet
Uma chave de API gratuita da ExchangeRate API


📸 Captura de Tela
![Captura do Projeto](https://raw.githubusercontent.com/SilviaAvelar/ConversorDeMoedas/main/assets/captura.png)


Desenvolvido com 💙 por Silvia Avelar
