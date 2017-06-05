package br.com.erick.teste;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.Link;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;

public class Cadastro {
	
	@ScreenMap(name = "Mercado Livre", location = "www.mercadolivre.com.br")
	public class Main {
		
		@ElementMap(name = "Cadastre-se", locatorType = ElementLocatorType.XPath, locator = "/html/body/header/div/div/nav/a[1]")
		private Link linkIssue;
		
		@ElementMap(name = "Nome", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='signupFirstName']")
		private TextField nome;	
		
		@ElementMap(name = "Sobrenome", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='signupLastName']")
		private TextField sobrenome;
		
		@ElementMap(name = "Telefone (fixo ou celular)", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='signupPhoneNumber']")
		private TextField telefone;
		
		@ElementMap(name = "E-mail", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='signupEmail']")
		private TextField email;
		
		@ElementMap(name = "Criar senha", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='signupPassword']")
		private TextField senha;
		
		@ElementMap(name = "Cadastrar-me", locatorType = ElementLocatorType.XPath, locator = "/html/body/main/div/div/div[2]/form/div/div[2]/div[2]/input")
		private Button cadastro;

	}
}
		
	/*@ScreenMap(name = "Logar", location = "https://www.mercadolivre.com/jms/mlb/lgz/msl/login/H4sIAAAAAAAEA0WOwQrDIBBE_2XPxdw99kfCRlcr0SrrplJC_r1rofQ4j5nhnZBrTM9V3o3AgqeARxa4QcsooXJZk1desqKehH5xmxVkLCTEHewJsWrvIdLssowxTCF26GtOLybjajEbLzpiiqnrhuat8EHzeE9tDdhFGN3-56oWyd9JPabct31dH7L3MK6zAAAA/user")
	public class Logar {
		
		Login

		@ElementMap(name = "E-mail ou usuário", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='user_id']")
		private TextField emailuser;

		@ElementMap(name = "Continuar", locatorType = ElementLocatorType.XPath, locator = "/html/body/main/div/div[1]/div/div[3]/form/div[2]/input")
		private Button continuar;

		@ElementMap(name = "Senha", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='password']")
		private TextField senha;
		
		@ElementMap(name = "Entrar", locatorType = ElementLocatorType.XPath, locator = "/html/body/main/div/div[1]/div/div[3]/form/div[2]/input")
		private Button entrar;
		
		
		
	}	*/
	
	
	/*@ScreenMap(name = "Minha conta", location = "https://myaccount.mercadolivre.com.br/summary")
	public class Modifica {
		
		Modifica
	
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
	
	}*/

	
	/*@ScreenMap(name = "Uni7", location = "www.uni7setembro.edu.br")
	public class Main {

		@ElementMap(name = "ACESSO RÁPIDO", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='menu-item-3360']")
		private Link linkIssue;
		
		@ElementMap(name = "Acadêmico Online", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='menu-item-3361']")
		private Link linkIssues;	

	}
	
	@ScreenMap(name = "Acadêmico Online", location = "portaltotvs.7setembro.com.br/Corpore.NET/Login.aspx")
	public class Academico {
		
		@ElementMap(name = "Acessar", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='btnLogin']")
		private Link avancar;
		
		@ElementMap(name = "Usuário ou Email", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='txtUser']")
		private TextField usuario;
		
		@ElementMap(name = "Senha", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='txtPass']")
		private TextField senha;
		
		@ElementMap(name = "Notas/faltas etapas", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='ctl17_EDU_EduNotaEtapaActionWeb_LinkControl']")
		private Link notas;
		
		
	}
		

	@ScreenMap(name = "Github", location = "https://github.com/demoiselle/behave")
	public class Main {

		@ElementMap(name = "Dúvidas e Questões", locatorType = ElementLocatorType.XPath, locator = "//a//span[./text()='Issues']")
		private Link linkIssues;

		@ElementMap(name = "uma dúvida", locatorType = ElementLocatorType.XPath, locator = "(//a[contains(@class, 'issue-title')])[2]")
		private Link linkIssue;
	}

	@ScreenMap(name = "Documentação", location = "http://demoiselle.sourceforge.net/docs/components/behave/reference/lastversion/html/index.html")
	public class Popup {

		@ElementMap(name = "Roteiro Rápido", locatorType = ElementLocatorType.XPath, locator = "//a[contains(./text(),'Roteiro Rápido')]")
		private Link linkRR;

		@ElementMap(name = "Link Principal", locatorType = ElementLocatorType.XPath, locator = "//a//strong[contains(./text(),'Principal')]")
		private Link linkP;

		@ElementMap(name = "Testes de Regressão", locatorType = ElementLocatorType.XPath, locator = "//a[contains(./text(),'Testes de Regressão')]")
		private Link lintTR;
	}*/


