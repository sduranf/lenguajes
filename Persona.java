class Persona {

  // se evidencia el encapsulamiento al momento de declarar estas variables privadas, es decir, que serán únicamente modificadas con métodos propios de la clase
  private String oficio;
    private String nombre;
    private int edad;
    private float peso;
    private float altura;
    private boolean macho;

  //abstracción al momento de la creación del constructorya que podemos evidenciar los atributos de los cuales estarán compuestos nuestras instancias
    public Persona(String Oficio, String Nombre, int Edad, float Peso, float Altura, boolean Macho) {
       this.oficio = Oficio;
      this.nombre = Nombre;
        this.edad = Edad;
        this.peso = Peso;
        this.altura = Altura;
        this.macho = Macho;
    }


  //polimorfismo al emplear un método igual pero con menor cantidad de atributos
  public Persona (String nombre) {
    this.nombre = nombre;
  }
    



    // Setters
public void setOficio(String Oficio){ 
  this.oficio = Oficio;
   }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.edad = Edad;
    }

    public void setPeso(float Peso) {
        this.peso = Peso;
    }

    public void setAltura(float Altura) {
        this.altura = Altura;
    }

    public void setMacho(boolean Macho) {
        this.macho = Macho;
    }

    // Getters
 public String getOficio() {   
   return this.oficio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public float getPeso() {
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public boolean isMacho() {
        return this.macho;
    }

  // creo los métodos para después usarlos con las instancias de mi clase Persona
public void Descansar() {

  if (this.oficio == "profesor") {
 System.out.println(this.nombre + " esta descansando como un profesor");
  }
if (this.oficio == "estudiante"){
  System.out.println(this.nombre + " esta descansando como un ESTUDIANTE");
}
  if (this.oficio == "administrativo"){
System.out.println("El administrativo " + this.nombre + " esta descansando");
 }

}

  public void cuantoPesa() {

  System.out.println("el peso de: "+this.nombre+" es de "+ this.peso);
     }

 
  

public void sexo() {

if (this.macho == true){
System.out.println("es un HOMBRE!!");
  
}
  if (this.macho == false){
    System.out.println("es una MUJER!!");
  }
  
}


  
  
}