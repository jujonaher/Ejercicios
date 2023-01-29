public class Main {
    public static void main(String[] args) {
        persona Persona1 = new persona();
        Persona1.setNombre("Marcos");
        Persona1.setEdad(23);
        Persona1.setTelefono(313241396);

        System.out.println(Persona1.getNombre());
        System.out.println(Persona1.getEdad());
        System.out.println(Persona1.getTelefono());

    }

    static class persona {
        // Properties of the class:
        private int edad;
        private String nombre;
        private long telefono;

        // Setters:
        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        // Getters:
        public int getEdad() {
            return edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getTelefono() {
            return (int) telefono;
        }
    }
}