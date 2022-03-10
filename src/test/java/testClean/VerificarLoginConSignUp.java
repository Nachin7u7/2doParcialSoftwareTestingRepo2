package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MenuSection;
import pages.PaginaInicio;
import pages.SignUpModal;

public class VerificarLoginConSignUp extends BaseTodoLy {

	PaginaInicio paginaInicio = new PaginaInicio();
	SignUpModal signUpModal = new SignUpModal();
	MenuSection menuSection = new MenuSection();
	LoginModal loginModal = new LoginModal();

	@Test
	public void verifyLoginWithRegister() throws InterruptedException {
		paginaInicio.signUpFreeImage.click();
		signUpModal.fullNameTextBox.setText("Ignacio Valencia");
		signUpModal.emailTextBox.setText("ignacio.valencia.sauma@gmail.com");
		signUpModal.passwordTextBox.setText("Secreta123");
		signUpModal.terminosCheckBox.click();
		
		signUpModal.enviarInformation.click();
		
		Thread.sleep(2000);
		
		Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR fallo en login");
	}
	


}
