package br.com.erick.teste;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.Link;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;


public class AlteraNome {
	
	@ScreenMap(name = "Minha conta", location = "https://myaccount.mercadolivre.com.br/summary")
	public class main{
		
	
		@ElementMap(name = "JOÃO DASNEVES", locatorType = ElementLocatorType.XPath, locator = "/html/body/header/div/div/nav/div/label/i")
		private Link user;

		@ElementMap(name = "Minha conta", locatorType = ElementLocatorType.XPath, locator = "/html/body/header/div/div/nav/div/nav/a[1]")
		private Link conta;

		@ElementMap(name = "Configuração", locatorType = ElementLocatorType.XPath, locator = "/html/body/main/div[1]/nav/div/ul/li[6]/span")
		private TextField senha;
	
		@ElementMap(name = "Dados pessoais", locatorType = ElementLocatorType.XPath, locator = "/html/body/main/div[1]/nav/div/ul/li[6]/ul/li[1]/a")
		private Link dados;
	
		@ElementMap(name = "Modificar", locatorType = ElementLocatorType.XPath, locator = "/html/body/main/div/form/fieldset[1]/div[1]/a")
		private Link modifica;

		@ElementMap(name = "Usuário novo:", locatorType = ElementLocatorType.XPath, locator = "/html/body/div/div/main/form/div[1]/input")
		private TextField novousuario;
	
		@ElementMap(name = "Modificar", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='btn_submmit']")
		private Button modificar;
	
	}
}


