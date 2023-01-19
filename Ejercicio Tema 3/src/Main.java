public class Main {
    public static void main(String[] args) {
        //suma(10, 10, 10);
        coche miCoche = new coche();
        miCoche.PonerPuerta();
        miCoche.PonerPuerta();
        miCoche.PonerPuerta();
        miCoche.QuitarPuerta();
        System.out.print("Número de puertas de mi coche:" + miCoche.numeroPuertas);
    }

    public static int suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.print(resultado);
        return resultado;
    }
}

