
public class Main {

    public static void main(String[] args) {
        
        Cliente cliente_1 = new Cliente();
        
        cliente_1.edad = 32;
        cliente_1.nombre = "Mario";
        cliente_1.telefono = "3813855555";
        cliente_1.credito = 1234;
        
        System.out.println("Cliente: " + cliente_1.nombre + " tiene " + cliente_1.edad + " su telefono es " + cliente_1.telefono + " y su credito es de " + cliente_1.credito);
        
        Trabajador trabajador_1 = new Trabajador();
        
        trabajador_1.edad = 25;
        trabajador_1.nombre = "Federico";
        trabajador_1.telefono = "3814911234";
        trabajador_1.salario = 34453;
        
        System.out.println("Trabajador: " + trabajador_1.nombre + " tiene " + trabajador_1.edad + " su telefono es " + trabajador_1.telefono + " y su salario es de " + trabajador_1.salario);
    }
    
}

class Persona{
    int edad;
    String nombre;
    String telefono;
};

class Cliente extends Persona{
    int credito;
};

class Trabajador extends Persona{
    int salario;
};
