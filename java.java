public class Presentacion {
    public static void main(String[] args) {
        String nombre = "Pau Joli Diaz";
        String estudios = "Grado Superior en Desarrollo Web (DAW) & Máster en Ciberseguridad";
        String[] pasiones = {"Ordenadores", "Programación en Java", "Seguridad Informática"};

        System.out.println("=========================================");
        System.out.println("   ¡Hola! 👋 Bienvenido/a a mi perfil   ");
        System.out.println("=========================================");
        System.out.println("• Nombre: " + nombre);
        System.out.println("• Formación: " + estudios);
        System.out.print("• Pasiones tecnológicas: ");
        
        for (int i = 0; i < pasiones.length; i++) {
            System.out.print(pasiones[i] + (i < pasiones.length - 1 ? ", " : ""));
        }
        
        System.out.println("\n-----------------------------------------");
        System.out.println("¡Gracias por pasarte por aquí! 🚀");
    }
}