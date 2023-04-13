package Aula;

//Clase profesor que hereda de la clase Persona
public class Profesor extends Persona{
     
    //Atributos
    private String materia;
    
    //constructor
    public Profesor(){
       super(); //Llama al constructor padre
        
       super.setEdad(MetodosSueltos.generaNumeroAleatorio(25,50)); //llama al metodo padre
        
       materia=Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];
    }
 
    //Metodos     
    public String getMateria() {
        return materia;
    }
 
    public void setMateria(String materia) {
        this.materia = materia;
    }
   
    @Override//Calcula la disponibilidad del profesor(20%)
    public void disponibilidad() {
        
        int probabilidad=MetodosSueltos.generaNumeroAleatorio(0, 100);
         
        if(probabilidad<20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
         
    }
    
}
		
	

