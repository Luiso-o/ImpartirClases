package Aula;

public class Principal {

	public static void main(String[] args) {
		 //Creamos el objeto
        Aula aula=new Aula();
         
        //Indicamos si se puede dar la clase
        if(aula.darClase()){
            aula.notas();
        }

	}

}
