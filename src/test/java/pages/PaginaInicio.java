package pages;

import control.Image;
import org.openqa.selenium.By;

public class PaginaInicio {
	public Image signUpFreeImage = new Image(By.xpath("//img[@src=\"/Images/design/pagesignup.png\"]"));
	
	public Image loginImage = new Image(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
}
