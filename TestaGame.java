package exercio03;

import java.time.LocalDate;

public class TestaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate data =  LocalDate.of(2020, 9 ,20);
		Produto g1 = new Produto(1,"Valorant",1, "Riot Games",data,1200.0f);
		
		g1.visualizar();
		
	}

}
