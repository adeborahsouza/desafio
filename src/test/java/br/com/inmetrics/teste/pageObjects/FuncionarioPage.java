package br.com.inmetrics.teste.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.inmetrics.teste.dataProviders.ConfigFileReader;

public class FuncionarioPage {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public FuncionarioPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}


}
