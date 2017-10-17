package pl.b2b.automationTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PowtorkaZRefactoremTest {
	
	private List<Integer> lista = new ArrayList();
	
	@Before
	public void inicjalizacjaListy() {
		lista = new ArrayList<Integer>();
		lista.add(22);
		lista.add(31);
		lista.add(62);
		lista.add(56);
	}
	
	@Test
	public void iloscElementowParzystychWZadanejLiscie() {
		Utils utils = new Utils(lista);
		int licznik = utils.zliczElementyParzyste();
		
		assertEquals(3, licznik);
	}
	

	
	@Test
	public void iloscElementowWZadanejLiscieKtorychSumaCyfrJestWiekszaOd4() {
		Utils utils = new Utils(lista);
		int licznik = utils.zliczElementyKtorychSumaCyfrJestWiekszaOd4();
		
		assertEquals(2, licznik);
		
	}

}
