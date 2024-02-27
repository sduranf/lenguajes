public class Main {
  public static void main(String[] args) {
    //evidenciamos herencia, puesto que esta se refiere a la creación de nuevos objetos o clases, a partir de otra clase, en este caso, creamos varios objetos

Persona p1 = new Persona("profesor", "Juan", 25, 70, 1.75f, true);
Persona p2 = new Persona("estudiante", "Maria", 18, 55, 1.30f, false);
Persona p3 = new Persona("administrativo", "Pedro", 35, 80, 1.85f, true);



    //aplicamos los métodos para cada instancia de la clase persona
    p1.Descansar();
    p1.cuantoPesa();
    p1.sexo();
    p2.Descansar();
    p2.cuantoPesa();
    p2.sexo();
    p3.Descansar();
    p3.cuantoPesa();
    p3.sexo();
  }

}