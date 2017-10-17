package pl.b2b.automationTest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopTest {
	private WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
	}

	// @Test
	// public void
	// sprawdzCzyPoKliknieciuLogowaniaNastapiloPrawidlowePrzekierowanie() {
	// UtilAtomationStatic.klikniecieLogowania(driver);
	// assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account",
	// driver.getCurrentUrl());
	// }
	//
	// @Test
	// public void czyPoKliknieciuContacUsNastapiloPrawidlowePrzekierowanie() {
	// WebElement element =
	// driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
	// element.click();
	//
	// assertEquals("http://automationpractice.com/index.php?controller=contact",
	// driver.getCurrentUrl());
	// }
	//
	// @Test
	// public void czyMoznaSieZalogowac() {
	// UtilAtomationStatic.logowanie(driver);
	//
	// assertEquals("http://automationpractice.com/index.php?controller=my-account",
	// driver.getCurrentUrl());
	// }
	//
	// @Test
	// public void czyNastapiPrawidlowePrzekierowaniePoKliknieciuWomen() {
	////
	// UtilAtomationStatic.logowanie(driver);
	// UtilAtomationStatic.przekierowanieNaWomen(driver);
	//
	// assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category",
	// driver.getCurrentUrl());
	// }

//	@Test
//	public void czyIloscKategoriiPoZalogowaniuSieIWybraniuSekcjiWomenWynosi2() {
//		UtilAtomationStatic.logowanie(driver);
//		UtilAtomationStatic.przekierowanieNaWomen(driver);
//		List<WebElement> wybor = UtilAtomationStatic.pobranieElementowKategorii(driver);
//		
//		assertEquals(true, wybor.size() == 2);
//	}
//	
//	@Test
//	public void czyIloscWlasciwosciPoZalogowaniuSieIWybraniuSekcjiWomenWynosi5() {
//		UtilAtomationStatic.logowanie(driver);
//		UtilAtomationStatic.przekierowanieNaWomen(driver);
//		List<WebElement> wybor = UtilAtomationStatic.pobranieElementowSekcjiProperties(driver);
//		
//		assertEquals(true, wybor.size() == 5);
//	}
	
//	@Test
//	public void czyWsrodWlasciwosciJestOpcjaMaxiDress() {
//		UtilAtomationStatic.logowanie(driver);
//		UtilAtomationStatic.przekierowanieNaWomen(driver);
//		List<WebElement> wybor = UtilAtomationStatic.pobranieElementowSekcjiProperties(driver);
//		boolean czyJestMaxi = UtilAtomationStatic.czyWsrodElementowJestElementOWlasciwosciMaxi(wybor);
//		
//		assertEquals(true, czyJestMaxi);
//	}
//
//	
//	@Test
//	public void czyWsrodOpcjiRozmiaruPoZalogowaniuSieIPoWybraniuSekcjiWomentJestOpcjaL() {
//		UtilAtomationStatic.logowanie(driver);
//		UtilAtomationStatic.przekierowanieNaWomen(driver);
//		List<WebElement> wybor = UtilAtomationStatic.pobranieElementowSekcjiSize(driver);
//		boolean czyJestMaxi = UtilAtomationStatic.czyWsrodElementowJestElementOWlasciwosciL(wybor);
//		
//		assertEquals(true, czyJestMaxi);
//	}
	
//	@Test
//	public void czyIloscKolorowPoZalogowaniuSieIWybraniuOpcjiTShirtWynosi2() {
//		UtilAtomationStatic.logowanie(driver);
//		UtilAtomationStatic.przekierowanieNaTShirt(driver);
//		List<WebElement> util = UtilAtomationStatic.pobranieElementowSekcjiKolor(driver);
//		
//		assertEquals(2, util.size());
//		
//	}
	
//	@Test
//	public void czyIloscKolorowPoWybraniuSekcjiDressesJestWiekszaNizPoWybraniuSekcjiTShirt() {
//		UtilAtomationStatic.logowanie(driver);
//		UtilAtomationStatic.przekierowanieNaDresses(driver);
//		List<WebElement> kolorDresses = UtilAtomationStatic.pobranieElementowSekcjiKolor(driver);
//		UtilAtomationStatic.przekierowanieNaTShirt(driver);
//		List<WebElement> kolorTShirt = UtilAtomationStatic.pobranieElementowSekcjiKolor(driver);
//		
//		assertEquals(true, kolorDresses.size()>kolorTShirt.size());
//		
//	}
	
//	@Test
//	public void poZalogowaniuSieIWybraniuSekcjiDressesKliknijWSekcjiSizeRozmiarL() {
//		UtilAtomationStatic.logowanie(driver);
//		UtilAtomationStatic.przekierowanieNaDresses(driver);
//		List<WebElement> sizeDresses = UtilAtomationStatic.pobranieElementowSekcjiSize(driver);
//		
//		for(WebElement el : sizeDresses) {
//			if(el.getText().contains("L")) {
//				el.click();
//				break;
//			}
//		}
//		WebDriverWait waiter = new WebDriverWait(driver, 15);
//		waiter.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//*[@id=\\\"center_column\\\"]/ul"), 14));
//		
//		int iloscElementowDoWyboru = UtilAtomationStatic.elementyKtoreSaDoWyboru(driver).size();
//		assertEquals(5,  iloscElementowDoWyboru);
//	}
	
	@Test
	public void poZalogowaniuSieIWybraniuSekcjiDressesIObszaruCasualDodaniePierwszegoElementuDoKoszyka() throws InterruptedException {
		UtilAtomationStatic.logowanie(driver);
		UtilAtomationStatic.przekierowanieNaDresses(driver);
		UtilAtomationStatic.clickCasualDressess(driver);
		UtilAtomationStatic.clickPierwszObrazek(driver);
		UtilAtomationStatic.clickProceedToCheckout(driver);
		UtilAtomationStatic.przekierowanieDoKoszyka(driver);
		List<WebElement> produkty = UtilAtomationStatic.listaElementowKtoreSaGotoweDoZakupu(driver);
		assertEquals(true,  produkty.size() == 1);
		
		
	}
	



	@After
	public void close() {
//		driver.quit();
	}

}
