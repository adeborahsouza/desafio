package br.com.inmetrics.teste.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.inmetrics.teste.cucumber.TestContext;
import br.com.inmetrics.teste.pageObjects.FuncionarioPage;
import br.com.inmetrics.teste.pageObjects.LoginPage;

public class CadastroSteps {
	WebDriver driver;
	TestContext testContext;
	FuncionarioPage funcionariosPage;
	LoginPage loginPage;

	public CadastroSteps(TestContext context) {

		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}

}
