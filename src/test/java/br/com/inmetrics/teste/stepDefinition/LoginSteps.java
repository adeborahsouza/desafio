package br.com.inmetrics.teste.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.inmetrics.teste.cucumber.TestContext;
import br.com.inmetrics.teste.pageObjects.CadastroPage;
import br.com.inmetrics.teste.pageObjects.FuncionarioPage;

public class LoginSteps {
	WebDriver driver;
	TestContext testContext;
	CadastroPage cadastroPage;
	FuncionarioPage funcionariosPage;

	public LoginSteps(TestContext context) {

		testContext = context;
		cadastroPage = testContext.getPageObjectManager().getCadastroPage();
	}

}
