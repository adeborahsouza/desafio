package br.com.inmetrics.teste.manager;

import org.openqa.selenium.WebDriver;

import br.com.inmetrics.teste.pageObjects.CadastroPage;
import br.com.inmetrics.teste.pageObjects.FuncionarioPage;
import br.com.inmetrics.teste.pageObjects.LoginPage;

public class PageObjectManager {
	private WebDriver driver;

	private LoginPage loginPage;

	private CadastroPage cadastroPage;

	private FuncionarioPage funcionarioPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

	}

	public CadastroPage getCadastroPage() {
		return (cadastroPage == null) ? cadastroPage = new CadastroPage(driver) : cadastroPage;

	}

	public FuncionarioPage getFuncionarioPage() {
		return (funcionarioPage == null) ? funcionarioPage = new FuncionarioPage(driver) : funcionarioPage;

	}

	}
