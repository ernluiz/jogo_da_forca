<h1 align="center">Detetive de Palavras</h1>

Projeto avaliativo do 2º bimestre da disciplina de Métodos de Desenvolvimento do curso de Engenharia de Software do Centro Universitário FAG. 

## Descrição

O "Detetive de palavras" é uma reinterpretação do clássico jogo de palavras ocultas, em uma versão com nomes de animais. Este projeto foi criado para os amantes de desafios linguísticos e programação. O "Detetive de Palavras" é uma versão moderna do famoso jogo da forca, projetada para entreter e educar enquanto permite explorar as possibilidades criativas das linguagens de programação utilizadas no projeto.

## Construído com:

* [SPRING BOOT](https://spring.io/) - um framework de desenvolvimento de aplicações Java que simplifica a criação de aplicativos de alta qualidade, fornece uma abordagem mais fácil e rápida para criar aplicativos baseados na plataforma Spring, automatizando muitas tarefas comuns de configuração. Inclui um servidor incorporado, altamente configurável. Ele é amplamente utilizado no desenvolvimento de aplicativos web, microserviços e aplicativos de back-end, facilitando a criação e o empacotamento de aplicativos de forma eficiente.

* [HTML](https://www.w3schools.com/html/) - HTML abreviação para a expressão inglesa HyperText Markup Language, que significa: "Linguagem de Marcação de Hipertexto" é uma linguagem de marcação utilizada na construção de páginas na Web. Documentos HTML podem ser interpretados por navegadores. A tecnologia é fruto da junção entre os padrões HyTime e SGML.

* [CSS](https://www.w3schools.com/css/default.asp) - Cascading Style Sheets é um mecanismo para adicionar estilo a um documento web. O código CSS pode ser aplicado diretamente nas tags ou ficar contido dentro das tags "style". Também é possível, em vez de colocar a formatação dentro do documento, criar um link para um arquivo CSS que contém os estilos.

* [JAVASCRIPT](https://www.w3schools.com/js/default.asp) - JavaScript é uma linguagem de programação interpretada estruturada, de script em alto nível com tipagem dinâmica fraca e multiparadigma. Juntamente com HTML e CSS, o JavaScript é uma das três principais tecnologias da World Wide Web.

* [JAVA](https://www.java.com/) - Java é uma linguagem multiplataforma, orientada a objetos e centrada em rede que pode ser usada como uma plataforma em si. É uma linguagem de programação rápida, segura e confiável para codificar tudo, desde aplicações móveis e software empresarial até aplicações de big data e tecnologias do servidor.

## Autor

* **Luiz Fernando Ern** - *responsável pela construção, desenvolvimento e criação do layout*

## Licença
Este projeto está licenciado sob licença pública e pode ser utilizado como exemplo didático, desde que citado a fonte. Contribuições de qualquer nível de habilidade são bem-vindas, desde a otimizações do código, melhorias na interface do usuário e expansões de funcionalidades.

## Características
* Jogabilidade: desafie a si mesmo ou seus amigos para adivinhar palavras ocultas em um ambiente amigável e competitivo;
* Personalização:  permite escolher entre três níveis de dificuldade;
* Placar: visualização da quantidade de alternativas restantes através da quantidade de itens na tela;
* Personalização:  permite escolher entre três níveis de dificuldade;
* Educativo:  ferramenta para expandir o vocabulário e habilidades de adivinhação de palavras;
* Personalização:  permite escolher entre três níveis de dificuldade.

## Objetivos futuros
Expandir as categorias de palavras para atender maior número de jogadores.

## Como funciona
Após subir o servidor do Spring Boot, o jogador deve acessar http://localhost:8080/start em seu navegador web. 
Na tela inicial, deve ser um dos níveis de dificuldade do jogo. Isso permite que a palavra seja exibida mas com seus caracteres ocultos. Neste momento, uma espécie de teclado com todas as letras do alfabeto também é exibido.
Ao clicar em qualquer botão destas letras, é verificado se a letra clicada existe na palavra oculta. Se existe, é exibida no local correspondente da palavra oculta e a cor da fonte do botão é alterada para a cor azul; se não, um raio do sol é diminuído e a cor da fonte do botão é alterada para vermelho. Em ambos os casos, o botão é desabilitado após o clique, portanto só é possível clicar uma vez em cada botão até ser gerada nova palavra.
Cada palavra permite 8 erros (quantidade de raios do sol no topo esquerdo da página).
Uma nova palavra pode ser gerada a qualquer momento através do menu de seleção do nível de dificuldade.
Se o jogador descobrir todas as letras da palavra oculta, é exibida uma página com congratulações e um áudio com palmas é executado. Se obter 8 erros, é exibida uma página onde a palavra oculta é revelada e um áudio com reação negativa. Em ambas as ocasiões, o jogador tem a possibilidade de iniciar um novo jogo.
