package Aula;

public class MetodosSueltos {

	//genera un numero aleatorio tomando como parametros un numero min y un max
    public static int generaNumeroAleatorio(int minimo, int maximo){       
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
	
}
