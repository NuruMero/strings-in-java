public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Emails ***");

        // Nombre completo del usuario
        var nombre = " Adán Guerrero Mesa ";
        System.out.println("Nombre usuario: " + nombre);

        // Procesar o normalizar el nombre del usuario
        // Limpiar los espacios en blanco al inicio y al final
        var nombreNmz = nombre.strip();
        // Reemplazar los espacios en blanco por punto
        nombreNmz = nombreNmz.replace(" ", ".");
        // Convertimos a minusculas
        nombreNmz = nombreNmz.toLowerCase();
        System.out.println("Nombre usuario normalizado: " + nombreNmz);

        // Datos de la empresa
        var empresa = " Apetecán Team ";
        System.out.println("\nNombre empresa: " + empresa);
        var dominio = ".com.es";
        System.out.println("Extensión del dominio: " + dominio);

        // Quitamos los espacios en blanco y convertimos a minúsculas
        var empresaNmz = empresa.strip().replace(" ", ".").toLowerCase();
        var dominioNmz = "@" + empresaNmz + dominio;
        System.out.println("Dominio de email normalizado: " + dominioNmz);

        var resultado = nombreNmz.concat(dominioNmz);
        System.out.println("\nEmail final generado: " + resultado);
    }
}
