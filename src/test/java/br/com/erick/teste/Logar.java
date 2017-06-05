package br.com.erick.teste;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;

public class Logar {

	@ScreenMap(name = "Logar", location = "https://www.mercadolivre.com/jms/mlb/lgz/msl/login/H4sIAAAAAAAEA0WOwQrDIBBE_2XPxdw99kfCRlcr0SrrplJC_r1rofQ4j5nhnZBrTM9V3o3AgqeARxa4QcsooXJZk1desqKehH5xmxVkLCTEHewJsWrvIdLssowxTCF26GtOLybjajEbLzpiiqnrhuat8EHzeE9tDdhFGN3-56oWyd9JPabct31dH7L3MK6zAAAA/user")
	public class Main {

		@ElementMap(name = "E-mail ou usuário", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='user_id']")
		private TextField emailuser;

		@ElementMap(name = "Continuar", locatorType = ElementLocatorType.XPath, locator = "/html/body/main/div/div[1]/div/div[3]/form/div[2]/input")
		private Button continuar;

		@ElementMap(name = "Senha", locatorType = ElementLocatorType.XPath, locator = ".//*[@id='password']")
		private TextField senha;

		@ElementMap(name = "Entrar", locatorType = ElementLocatorType.XPath, locator = "/html/body/main/div/div[1]/div/div[3]/form/div[2]/input")
		private Button entrar;

	}
}


