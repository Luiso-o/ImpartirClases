package Aula;

public abstract class Persona {

	//Atributos
    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;
     
    //Contantes
    private final String[] nombresChicos={"Jose", "Fernando", "Alberto", "Nacho", "Mario"}; 
    private final String[] nombresChicas={"Alicia", "Laura", "Ana", "Rebeca", "Elena"}; 
    private final int CHICO=0;
    private final int CHICA=1;
     
    //Constructor
    public Persona(){
        
        //entre 0 y 1
        int determinar_sexo=MetodosSueltos.generaNumeroAleatorio(0,1);
         
        //Si es 0 es un chico
        if(determinar_sexo==CHICO){
            nombre=nombresChicos[MetodosSueltos.generaNumeroAleatorio(0,4)];
            sexo='H';
        }else{
            nombre=nombresChicas[MetodosSueltos.generaNumeroAleatorio(0,4)];
            sexo='M';
        }
         
        //Indicamos la disponibilidad
        disponibilidad();
         
    }
 
    //metodos
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
 
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
     
    //abtracto, las clases hijas deben implementarlo
    public abstract void disponibilidad();
     
	
}
