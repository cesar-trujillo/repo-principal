public class Perro {

    //atributos
    String nombre;
    int edad;

    Perro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    Perro(){
        this.nombre = "";
        this.edad = 0;
    }

    Perro(String nombre){

    }

    //método ladrar
    public void ladrar(){
        System.out.println("GUAU");
    }

    public void ladrar(String nombre, int edad){
        System.out.println("soy " + nombre + "y mi edad es: " + edad);
    }

    public static void main(String[] args) throws Exception {
        Perro miPerro = new Perro("solovino", 2);
        miPerro.ladrar();
        System.out.println(miPerro.nombre + "" + miPerro.edad);
        Perro miPerro2 = new Perro();
        miPerro2.ladrar("firulais", 3);

    }
}
