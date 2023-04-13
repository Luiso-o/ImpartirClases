package Aula;

public class Alumno extends Persona{    
    //Atributos
    private int nota;
     
    //Constructor
    public Alumno(){
        super();
        
        nota=MetodosSueltos.generaNumeroAleatorio(0,10);
         
        super.setEdad(MetodosSueltos.generaNumeroAleatorio(12,15));
         
    }
 
    //Metodos
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
 
    @Override//Indica si el alumno esta disponible (50%)
    public void disponibilidad() {
         
        int probabilidad=MetodosSueltos.generaNumeroAleatorio(0, 100);
         
        if(probabilidad<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
         
    }
    
   //Muestra la informacion del alumno
    public String toString(){
        
        return "Nombre: "+super.getNombre()+" ,sexo: "+super.getSexo()+" , nota: "+nota;
        
    }
     
     
     
     
}
