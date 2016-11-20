import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class firefoxprofile {

	public static void main(String[] args) {
		
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fr = pr.getProfile("");
		WebDriver driver = new FirefoxDriver(fr);
		

	}

}
