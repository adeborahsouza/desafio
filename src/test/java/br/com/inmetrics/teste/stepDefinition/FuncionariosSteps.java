package br.com.inmetrics.teste.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.inmetrics.teste.cucumber.TestContext;
import br.com.inmetrics.teste.pageObjects.CadastroPage;
import br.com.inmetrics.teste.pageObjects.LoginPage;

public class FuncionariosSteps {
	WebDriver driver;
	TestContext testContext;
	CadastroPage cadastroPage;
	LoginPage loginPage;

	public FuncionariosSteps(TestContext context) {

		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}
}
