package Aula;

public class Aula {
	
	/*Atributos*/
    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;
     
    /*Constantes*/
    private final int cantidadMaxAlumnos=20;
    private int numeroAula=1;
     
    /*Constructores*/
    public Aula(){
         
        id=numeroAula++;
         
        profesor=new Profesor();
        alumnos= new Alumno[cantidadMaxAlumnos];
        creaAlumnos();
        materia=Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];
         
    }
     
    //Metodos
    private void creaAlumnos(){
         
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=new Alumno();
        }
         
    }
     
    //Indica si la asistencia de los alumnos es mayor del 50%
    private boolean asistenciaAlumnos(){
         
        int cuentaAsistencias=0;
         
        //contamos las asistencias
        for(int i=0;i<alumnos.length;i++){
             
            if(alumnos[i].isAsistencia()){
                cuentaAsistencias++;
            }
             
        }
         
        //Muestro la asistencia total
        System.out.println("Hay "+cuentaAsistencias+" alumnos");
         
        return cuentaAsistencias>=((int)(alumnos.length/2));
         
    }
     
    //Indicamos si se puede dar clase
    public boolean darClase(){
         
        //Indicamos las condiciones para que se pueda dar la clase
         
        if(!profesor.isAsistencia()){
            System.out.println("El profesor no esta, no se puede dar clase");
            return false;
        }else if(!profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no es la misma, no se puede dar clase");
            return false;
        }else if (!asistenciaAlumnos()){
            System.out.println("La asistencia no es suficiente, no se puede dar clase");
            return false;
        }
         
        System.out.println("Se puede dar clase");
        return true;
         
    }
     
   //Indicamos las notas de los alumnos aprobados, chicos y chicas
    public void notas(){
         
        int chicosAprobados=0;
        int chicasAprobadas=0;
         
         for(int i=0;i<alumnos.length;i++){
            
           //Comprobamos si el alumno esta aprobado
           if(alumnos[i].getNota()>=5){
               //Segun el sexo, aumentara uno o otro
               if(alumnos[i].getSexo()=='H'){
                   chicosAprobados++;
               }else{
                   chicasAprobadas++;
               }
                
               System.out.println(alumnos[i].toString());
                
           }
             
        }
          
        System.out.println("Hay "+chicosAprobados+" chicos y "+chicasAprobadas+" chicas aprobados/as");
         
    }
	
	
}
