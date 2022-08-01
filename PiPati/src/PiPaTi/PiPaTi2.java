package PiPaTi;

import java.util.*;

public class PiPaTi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		
		int rondas=5,roncont=5,j1cont=0,j2cont=0,j1,j2,j1per=0,j2per=0;
		boolean ban=false;
		
		System.out.println("Vamos a jugar al Piedra, Papel o Tijera.\nEl jugador que primero llegue a 5 rondas ganadas, gana.");
		
		for(int i=0;i<roncont;i++);{
			do {
			
				do {	
				System.out.println("Jugador 1, ingresá: \n1 para 'Piedra' \n2 para 'Papel' \n3 para 'Tijera'");
				j1 = in.nextInt();
				if(j1 > 0 && j1<4) {
					ban=true;
				}else {
					ban=false;
					System.out.println("Error! Ingresá 1,2 o 3.");
				}
				}while(!ban);
				
				System.out.flush();
				
				do {
				System.out.println("Jugador 2, ingresá: \n1 para 'Piedra' \n2 para 'Papel' \n3 para 'Tijera'");
				j2 = in.nextInt();
				if(j2 > 0 && j2<4) {
					ban=true;
				}else {
					ban=false;
					System.out.println("Error! Ingresá 1,2 o 3.");
				}
				}while(!ban);
			
				if(j1==1) {
					if(j2==1) {
						roncont++;
						System.out.println("Empate.\nResultado parcial: \nJugador 1: " +j1cont+"\nJugador 2: " + j2cont);
					} else if (j2==2) {
						j2cont++;
						j1per++;
						System.out.println("Gana la ronda el Jugador 2.\nResultado parcial: \nJugador 1: " +j1cont+"\nJugador 2: " + j2cont);
					}else {
						j1cont++;
						j2per++;
						System.out.println("Gana la ronda el Jugador 1.\nResultado parcial: \nJugador 1: " +j1cont+"\nJugador 2: " + j2cont);
					}	
				}
				
				if(j1==2) {
					if(j2==2) {
						roncont++;
						System.out.println("Empate.\nResultado parcial: \nJugador 1: " +j1cont+"\nJugador 2: " + j2cont);
					} else if (j2==3) {
						j2cont++;
						j1per++;
						System.out.println("Gana la ronda el Jugador 2.\nResultado parcial: \nJugador 1: " +j1cont+"\nJugador 2: " + j2cont);
					}else {
						j1cont++;
						j2per++;
						System.out.println("Gana la ronda el Jugador 1.\nResultado parcial: \nJugador 1: " +j1cont+"\nJugador 2: " + j2cont);	
					}	
				}
				
				if(j1==3) {
					if(j2==3) {
						roncont++;
						System.out.println("Empate.\nResultado parcial: \nJugador 1: " +j1cont+"\nJugador 2: " + j2cont);
					} else if (j2==1) {
						j2cont++;
						j1per++;
						System.out.println("Gana la ronda el Jugador 2.\nResultado parcial: \nJugador 1: " +j1cont+"\nJugador 2: " + j2cont);
					}else {
						j1cont++;
						j2per++;
						System.out.println("Gana la ronda el Jugador 1.\nResultado parcial: \nJugador 1: " +j1cont+"\nJugador 2: " + j2cont);
					}	
				}
				
				if(j1cont==rondas) {
					System.out.println("Ganó el jugador número 1!");
					break;
				}
				if(j2cont==rondas){
					System.out.println("Ganó el jugador número 2!");
					break;
				}
				
				
				
			}while(j1cont != rondas | j2cont != rondas | j1per != rondas | j2per != rondas);
			
			
			
		}
		
	} 
	
}
