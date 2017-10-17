package pl.b2b.automationTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilAtomationStatic {

	public static void klikniecieLogowania(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		element.click();// developer musi sam wiedzieć że znaleziony element jest klikalny

	}

	public static void logowanie(WebDriver driver) {
		klikniecieLogowania(driver);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("b2bnetworkwarszawa@gmail.com");

		WebElement haslo = driver.findElement(By.cssSelector("#passwd"));
		haslo.sendKeys("n3tw0rk2017");

		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span/i"));
		submit.click();
	}

	public static void przekierowanieNaWomen(WebDriver driver) {
		WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		women.click();
	}
	
	public static void przekierowanieNaTShirt(WebDriver driver) {
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		tshirt.click();
	}
	
	public static void przekierowanieNaDresses(WebDriver driver) {
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		tshirt.click();
	}
	
	

	public static List<WebElement> pobranieElementowKategorii(WebDriver driver) {
		WebElement kategorie = driver.findElement(By.xpath("//*[@id=\"ul_layered_category_0\"]"));
		List<WebElement> wybor = kategorie.findElements(By.tagName("li"));
		return wybor;
	}

	public static List<WebElement> pobranieElementowSekcjiProperties(WebDriver driver) {
		WebElement kategorie = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_feature_7\"]"));
		List<WebElement> wybor = kategorie.findElements(By.tagName("li"));
		return wybor;
	}

	public static List<WebElement> pobranieElementowSekcjiSize(WebDriver driver) {
		WebElement kategorie = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_1\"]"));
		List<WebElement> wybor = kategorie.findElements(By.tagName("li"));
		return wybor;
	}
	
	public static List<WebElement> pobranieElementowSekcjiKolor(WebDriver driver) {
		WebElement kolor = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_3\"]"));
		List<WebElement> kolory = kolor.findElements(By.tagName("li"));
		return kolory;
	}

	public static boolean czyWsrodElementowJestElementOWlasciwosciMaxi(List<WebElement> wybor) {
		boolean czyJestMaxi = false;
		for (WebElement element : wybor) {
			if (element.getText().contains("Maxi")) {
				czyJestMaxi = true;
			}
		}
		return czyJestMaxi;
	}

	public static boolean czyWsrodElementowJestElementOWlasciwosciL(List<WebElement> wybor) {
		boolean czyJestMaxi = false;
		for (WebElement element : wybor) {
			if (element.getText().contains("L")) {
				czyJestMaxi = true;
			}
		}
		return czyJestMaxi;
	}
	
	public static List<WebElement> elementyKtoreSaDoWyboru(WebDriver driver){
		WebElement glownyElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul"));
		List<WebElement> doWyboru = glownyElement.findElements(By.tagName("li"));
		return doWyboru;
	}
	
	public static void clickCasualDressess(WebDriver driver) {
		WebElement el = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
		el.click();
	}
	
	public static void clickPierwszObrazek(WebDriver driver) {
		WebElement el = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		el.click();
	}
	
	public static void clickProceedToCheckout(WebDriver driver) {
		WebElement el = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		el.click();
	}
	
	public static void przekierowanieDoKoszyka(WebDriver driver) {
		driver.navigate().to("http://automationpractice.com/index.php?controller=order");
	}
	
	public static List<WebElement> listaElementowKtoreSaGotoweDoZakupu(WebDriver driver){
		WebElement tabela = driver.findElement(By.xpath("//*[@id=\"cart_summary\"]/tbody"));
		List<WebElement> produkty = tabela.findElements(By.tagName("tr"));
		return produkty;
		
		
		
	}

}
