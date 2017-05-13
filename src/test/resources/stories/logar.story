Funcionalidade: logar usuário

Narrativa:
Para realizar uma compra
Como um visitante
Desejo efetuar o login no site Mercado Livre

Cenário: Efetuando login de usuário

Dado que vou para a tela "Logar"
Então será exibido "Olá! Para continuar, digite o seu e-mail ou usuário"
Quando informo "testqa@outlook.com.br" no campo "E-mail ou usuário"
Quando clico em "Continuar"
Então será exibido "Agora, a sua senha"
Quando informo "senha123" no campo "Senha"
Quando clico em "Entrar"

