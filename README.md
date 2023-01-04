# Teste Selenium WebDriver                     

## O que é Selenium WebDriver?

**_Selenium_** é um conjunto de ferramentas de código aberto multiplataforma, usado para testar aplicações web pelo browser de forma automatizada.

**_Selenium_** executa testes de funcionalidades da aplicação web e testes de compatibilidade entre browser e plataformas diferentes.

**_Selenium_** suporta diversas linguagens de programação, como por exemplo **Java, C# e Python**, e vários navegadores web como o Chrome e o Firefox.

## Selenium WebDriver

O **Selenium WebDriver** usa o próprio driver do navegador para a automação. É a forma mais moderna de interação atualmente, pois cada browser possui
o seu respectivo drive, permitindo a interação entre o script de teste e o respectivo browser.

 <center>![image](https://user-images.githubusercontent.com/106537496/210465145-e76f1684-769b-4b9f-b855-531d91d2680b.png)</center>

  
  ## Classe WebDriver
  
  **get(url)** = Carrega uma página
  
  **getCurrentUrl()** = Retorna a url
  
  **getPageSource()** = Retorna o código fonte da página
  
  **getTitle()** = Retorna o título da página
  
  **quit()** = Fecha o browser
  
  ###  Elemento Página
  
  **findElement(localizador)** - Localiza um elemento na página
  
  **findElements(localizador)** - Localiza elementos da página
  
  ### Classe By
  
  Mecanismo utilizado para localizar um elemento dentro de um documento.
  
  **id**("identificador do elemento")
  
  **classeName**("nome da classe")
  
  **tagName**("nome da tag")
  
  **name**("nome do elemento")
  
  **cssSelector**("css")
  
  **xpath**("xpath")
  
  **partialLinkText**("link parcial")
  
  **linkText**("link")
  
  ### Classe WebElement
  Representa um elemento e oferece métodos para interagir com ele.
  
  **getText()** - Retorna o texto contido no elemento
  
  **click()** - Clica sobre o elemento
  
  **getAttribute(nome)** - Retorna o valor do atributo
  
  **getCssValue(nome)** - Retorna o valor da propriedade
  
  **getTagName()** - Retorna o nome da tag
  
  **getTexto()** - Retorna o texto contido no elemento
  
  **clear()** - Limpa o texto contido no elemento
  
  **getValue()** - Retorna o valor do elemento
  
  **sendKeys(text)** - Envia um texto para o elemento
  
  **setSelect()** - Seleciona um elemento
  
  
  
  
  
        


