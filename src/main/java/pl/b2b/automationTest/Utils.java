package pl.b2b.automationTest;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	private List<Integer> lista = new ArrayList();
	
	public Utils(List<Integer> lista) {
		this.lista = lista;
	}
	
	public int zliczElementyParzyste() {
		int licznik = 0;
		for(Integer zmienna : lista) {
			if(zmienna % 2 == 0) {
				licznik++;
			}
		}
		return licznik;
	}
	
	public int zliczElementyKtorychSumaCyfrJestWiekszaOd4() {
		int licznik = 0;
		for(Integer zmienna: lista) {
			int liczbaJednostek = zmienna%10;
			int liczbaDziesiatek = zmienna/10;
			int suma = liczbaJednostek + liczbaDziesiatek;
			if(suma > 4) {
				licznik++;
			}
		}
		
		return licznik;
		
	}
}
