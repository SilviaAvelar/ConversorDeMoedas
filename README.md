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

============ 💱 Resultado da Conversão 💱 =============
  10.00 USD  =>  51.50 BRL
=======================================================
```

## 🛠️ Tecnologias Utilizadas
Este projeto foi construído utilizando as seguintes tecnologias e bibliotecas:
* ☕ **Java 17+: Versão mais recente do Java com as suas funcionalidades modernas.
* 🌐 **java.net.http.HttpClient: Cliente HTTP nativo do Java para realizar requisições à API.
* 📦 **Gson: Biblioteca do Google para serializar e desserializar objetos Java para JSON e vice-versa.
* 🌈 **Cores ANSI: Sequências de escape ANSI para adicionar cores e estilo ao texto no terminal, melhorando a interface do usuário.


## ✨ Funcionalidades
*   🌍 **Taxas de Câmbio Atualizadas:** Busca as taxas mais recentes diretamente da API.
*   🔄 **Múltiplas Conversões:** Suporta conversão entre as seguintes moedas e mais (via API):
    *   Dólar Americano (USD)
    *   Peso Argentino (ARS)
    *   Real Brasileiro (BRL)
    *   Peso Colombiano (COP)
*   🎨 **Interface Amigável:** Utiliza cores ANSI e emojis para uma experiência mais interativa no terminal.
*   🔒 **Validação de Entrada:** Verifica se as opções e valores inseridos pelo usuário são válidos.
*   🔌 **Tratamento de Erros:** Gerencia possíveis erros de conexão com a API ou respostas inesperadas.


## ✅ Pré-requisitos
* Java 17 ou superior
* Conexão com a internet
* Uma chave de API gratuita da ExchangeRate API


## 📸 Captura de Tela
![Captura do Projeto](assets/logo.png)


## 🧑‍💻 Autor
<p align="center">
<img src="https://readme-typing-svg.herokuapp.com/?font=Righteous&size=35&color=Fira&center=true&vCenter=true&width=650&height=70&duration=4000&lines=Olá!+Sou+a+Sílvia+Avelar...;Desenvolvedora+WEB...+Front-End...;Eternamente+Aprendendo...;Amante+de+Código+e+Café...;Confira+meus+links!+☕" alt="Typing SVG" />
</p>
<p align="center">
Desenvolvido com 💙 por <strong>Sílvia Avelar</strong>
</p>
<p align="center">
<a href="https://www.linkedin.com/in/silvia-avelar/" target="_blank">
<img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn">
</a>
&nbsp;&nbsp;
<a href="https://silviaavelar.github.io/Portfolio/" target="_blank">
<img src="https://img.shields.io/badge/-Portfólio-FF4081?style=for-the-badge&logo=vercel&logoColor=white" alt="Portfólio">
</a>
</p>
<p align="center">
Entre em contato ou veja outros projetos!
</p>