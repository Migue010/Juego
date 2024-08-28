import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int Jugador1, Jugador2 , victoria1=0 , victoria2=0;

        System.out.println("BIENVENIDO AL JUEGO  DE PIEDRA PAPEL O TIJERA GANAS CON 2 RONDAS \n########################################### ");

        /* 1= Piedra 2= Papel 3=Tijera*/
        System.out.println("NUMERO 1 = PIEDRA \nNUMERO 2 = PAPEL \nNUMERO 3 = TIJERA \n******************");

        while(victoria1<2 && victoria2<2){
            Jugador1 = aleatorio.nextInt(1, 4);
            Jugador2 = aleatorio.nextInt(1, 4);
            System.out.println("Jugador 1 saco el numero: "+Jugador1);
            System.out.println("Jugador 2 saco el numero: "+Jugador2);

            if(Jugador1==Jugador2){
                System.out.println("EMPATE NADIE GANA\n|–|–|–|–|–|–|–|–|–|–|-|-|–|-|-|-|-|-|-|-|–|-|–|–|");
            }else if(Jugador1==1 && Jugador2==3 || Jugador1==2 && Jugador2==1 || Jugador1==3 && Jugador2==2){
                victoria1++;
                System.out.println("JUGADOR 1 GANA ESTA RONDA\n|–|–|–|–|–|–|–|–|–|–|-|-|–|-|-|-|-|-|-|-|–|-|–|–|");
            }else{
                victoria2++;
                System.out.println("JUGADOR 2 GANA ESTA RONDA\n|–|–|–|–|–|–|–|–|–|–|-|-|–|-|-|-|-|-|-|-|–|-|–|–|");

            }


        }
            if(victoria1>victoria2){
                System.out.println("JUGADOR 1 GANA EL JUEGO :)");
            }else{
                System.out.println("JUGADOR 2 GANA EL JUEGO :)");
            }

    }
}
