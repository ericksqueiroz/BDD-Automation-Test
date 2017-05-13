package br.com.erick.teste;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.parser.Step;
import br.gov.frameworkdemoiselle.behave.parser.jbehave.CommonSteps;
import br.gov.frameworkdemoiselle.behave.runner.Runner;
import br.gov.frameworkdemoiselle.behave.runner.ui.Element;
import br.gov.frameworkdemoiselle.behave.runner.webdriver.util.ByConverter;

public class MySteps extends CommonSteps implements Step {
	

	/*Quando/Então aguardo "tempo" segundos*/

	@Then("aguardo \"$tempo\" segundo(s)")
	@When("aguardo \"$tempo\" segundo(s)")
	public void aguardoSegundos(String tempo) {

		try {
			Thread.sleep(Long.parseLong(tempo) * 1000);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/*Quando pressiono TAB no campo "nomeCampo"*/

	@When("pressiono TAB no campo \"$nomeCampo\"")
	public void pressionoTAB(String nomeCampo) {
	    WebElement webElement = getWebElement(runner, currentPageName,
	            nomeCampo);
	    webElement.sendKeys(Keys.TAB);
	}

	public static WebElement getWebElement(Runner runner,
	        String currentPageName, String elementName) {
	    WebDriver driver = (WebDriver) runner.getDriver();

	    try {
	        Element element = (Element) runner.getElement(currentPageName,
	                elementName);

	        String locator = element.getElementMap().locator()[0];

	        ElementLocatorType type = element.getElementMap().locatorType();

	        new WebDriverWait(driver, 120).until(ExpectedConditions
	                .presenceOfElementLocated(ByConverter
	                        .convert(type, locator)));

	        return driver.findElement(ByConverter.convert(type, locator));
	    } catch (Exception ex) {
	        return null;
	    }
	}

}
