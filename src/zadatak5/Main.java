package zadatak5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	private static List<GeometrijskaSlika> listaFigura = new ArrayList<>();

	private static void printout(List<GeometrijskaSlika> listaFigura) {
		for (GeometrijskaSlika f : listaFigura) {
			System.out.println(f.toString());
		}
	}
	
	private static void dodajFiguru(GeometrijskaSlika... figura) {
		listaFigura.addAll(Arrays.asList(figura));
	}

	public static void main(String[] args) {

		Krug krug1 = new Krug();
		krug1.setPoluprecnik(3.6);
		
		GeometrijskaSlika krug2 = new Krug(10.5);
	
		Krug krug3 = new Krug(true, "crvena", 2.5);
		
		Krug elipsa1 = new Elipsa(1.5);
		elipsa1.setPoluprecnik(8.1);
		
		Elipsa elipsa2 = new Elipsa(7.0, 2.0);
		
		Elipsa elipsa3 = new Elipsa();
		elipsa3.setFill(false);
		elipsa3.setPoluprecnik(4.2);
		elipsa3.setMalaPoluosa(1.7);
		

		Trougao trougao = new Trougao(true, "zelena", 5.3);
		
		NejednakostranicniTrougao nejednakostranicniTrougao = new NejednakostranicniTrougao(false, "zuta", 3.0, 4.0, 5.0);
		
		Kvadrat kvadrat = new Kvadrat(true, "ljubicasta", 7.2);
		
		Pravougaonik pravougaonik = new Pravougaonik(false, "siva", 2.3, 6.1);
				
		dodajFiguru(krug1, krug2, krug3, elipsa1, elipsa2, elipsa3, trougao, nejednakostranicniTrougao, kvadrat, pravougaonik);
		printout(listaFigura);

	}

}
