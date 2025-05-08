# 💱 Conversor de Moedas - Java 

Bem-vindo ao **Conversor de Moedas** em Java!

[![Java Version](https://img.shields.io/badge/Java-17%2B-%23ED8B00?style=for-the-badge&logo=openjdk)](https://openjdk.java.net/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)
[![API Status](https://img.shields.io/badge/API-Online-green?style=for-the-badge)](https://www.exchangerate-api.com/)

> Aplicativo de terminal que consome a API da [ExchangeRate-API](https://www.exchangerate-api.com/) para conversões monetárias em tempo real com dados do ECB

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

👉 Escolha uma opção: 3

🔄 Buscando taxas de câmbio para USD...
💰 Digite o valor que deseja converter: 10

========= 💱 Conversão Realizada 💱 =========
📈 1 USD = 5,72 BRL
💰 10,00 USD = 57,20 BRL
==========================================

Pressione Enter para continuar...
```

## 🛠️ Tecnologias Utilizadas

| Componente          | Detalhes                                                                  |
|---------------------|--------------------------------------------------------------------------|
| <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width=20> **Java 17** | JDK com novos recursos como sealed classes |
| <img src="https://img.shields.io/badge/HTTP_Client-Nativo-007396?style=flat-square" width=120> | Implementado via `java.net.http` |
| <img src="https://img.shields.io/badge/Gson-2.10+-EA4335?style=flat-square&logo=google" width=100> | Desserialização de JSON |
| <img src="https://img.shields.io/badge/ANSI-Terminal_Colors-000000?style=flat-square" width=120> | Formatação de texto colorido |


## 🎯 Funcionalidades
| Feature               | Descrição                                  |
|-----------------------|--------------------------------------------|
| 🌍 Multi-moedas       | Suporte a 160+ moedas via API              |
| ⚡ Tempo real         | Taxas atualizadas hourly                  |
| 🛡️ Validação         | Checagem de entradas inválidas            |
| 📊 Logs               | Registro de operações em arquivo           |


## ✅ Pré-requisitos

| <img src="https://img.shields.io/badge/Requisito-Detalhes-blue?style=flat-square" width=120> | <img src="https://img.shields.io/badge/Especificação-Importante-green?style=flat-square" width=150> |
|-------------------------------|---------------------------------------------------------------------|
| ![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat-square&logo=java) | JDK instalado (verifique com `java -version`) |
| ![Internet](https://img.shields.io/badge/Internet-Conectado-green?style=flat-square) | Conexão estável para chamadas API |
| ![API Key](https://img.shields.io/badge/API_Key-Gratuita-FFA500?style=flat-square) | Obtenha em [ExchangeRate-API](https://www.exchangerate-api.com/) |


## 🖼️ Demonstração Visual

| Preview da Interface | Logo do Projeto |
|----------------------|-----------------|
| ![Interface do Conversor](assets/preview.png) | ![Logo](assets/logo.png) |
*Interface do terminal e identidade visual do projeto*


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