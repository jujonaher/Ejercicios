public class Main {
    public static void main(String[] args) {
        int numeroIf = -3;
        int numeroWhile = 0;
        int numeroDoWhile = 1;

        if (numeroIf < 0) {
            System.out.println("El numeroIf es negativo");
        } else if (numeroIf > 0) {
            System.out.print("El numeroIf es positivo");
        } else {
            System.out.print("El numeroIf es cero (0)");
        }

        while (numeroWhile < 3) {
            System.out.print("El numeroWhile es: " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do {
            System.out.print("El numeroDoWhile es: " + numeroDoWhile);
            numeroWhile++;
        } while (numeroWhile < 1);

        for (int numeroFor = 0; numeroFor < 3 ; numeroFor++) {
            System.out.println("El numeroFor es: " + numeroFor);
        }
        var estacion = "Invierno";
        switch (estacion = "Invierno") {
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
        }
    }
}