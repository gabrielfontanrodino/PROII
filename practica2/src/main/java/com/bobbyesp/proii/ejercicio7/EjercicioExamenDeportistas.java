package com.bobbyesp.proii.ejercicio7;

import com.bobbyesp.proii.ejercicio1.Entrada;
import com.bobbyesp.proii.ejercicio7.club.Club;
import com.bobbyesp.proii.ejercicio7.exceptions.EmptyClubException;
import com.bobbyesp.proii.ejercicio7.exceptions.InvalidCategoryException;

import static com.bobbyesp.proii.ejercicio1.Entrada.leerCadena;
import static com.bobbyesp.proii.ejercicio1.Entrada.leerEntero;
import static com.bobbyesp.proii.ejercicio7.Categoria.leerCategoria;

public class EjercicioExamenDeportistas {
    public static void main(String[] args) {
        int opc;
        Club miclub = initializeClub();

        insertSampleDeportistas(miclub);

        do {
            opc = menu();
            try {
                handleMenuOption(opc, miclub);
            } catch (NumberFormatException exc) {
                System.err.println("Error - Formato numérico no válido.");
            } catch (IllegalArgumentException exc) {
                System.err.println("Error - Argumento ilegal. " + exc.getMessage());
            } catch (EmptyClubException e) {
                System.err.println(e.getMessage());
            }
        } while (opc != 0); // Fin del programa (opc == 0)
    }

    private static Club initializeClub() {
        int maxDeportistas;
        do {
            maxDeportistas = leerEntero("Cuantos deportistas como máximo va a tener el club: ");
        } while (maxDeportistas <= 0);
        return new Club(maxDeportistas);
    }

    private static void insertSampleDeportistas(Club miclub) {
        miclub.insertarDeportista(new Deportista("12345678Z", "Juan", Categoria.ALEVIN, 11));
        miclub.insertarDeportista(new Deportista("23456789D", "Ana", Categoria.BENJAMIN, 8));
        miclub.insertarDeportista(new Deportista("34567890V", "Luis", Categoria.ALEVIN, 10));
    }

    private static void handleMenuOption(int opc, Club miclub) {
        switch (opc) {
            case 1 -> insertDeportista(miclub);
            case 2 -> showDeportista(miclub);
            case 3 -> System.out.println("El club tiene " + miclub.getNumDeportistas() + " deportistas.");
            case 4 -> System.out.println("El club puede tener como máximo " + miclub.getMax() + " deportistas.");
            case 5 -> miclub.mostrarListaDeportistas();
            case 6 -> deleteDeportistaByPosition(miclub);
            case 7 -> deleteDeportistaByDNI(miclub);
            case 8 -> showAverageAge(miclub);
            case 9 -> changeDeportistaAge(miclub);
            case 10 -> changeDeportistaCategory(miclub);
            case 11 -> listDeportistasByCategory(miclub);
        }
    }

    private static void insertDeportista(Club miclub) {
        Deportista newDeportista = leerDeportista();
        try {
            miclub.insertarDeportista(newDeportista);
        } catch (IllegalArgumentException e) {
            System.err.println("Error al insertar deportista - " + e.getMessage());
        }
    }

    private static void showDeportista(Club miclub) {
        int option;
        miclub.mostrarListaDeportistas();
        do {
            option = leerEntero("Seleccione el deportista: ");
        } while (option < 0 || option > miclub.getNumDeportistas());
        System.out.println(miclub.getDeportista(option - 1).toString());
    }

    private static void deleteDeportistaByPosition(Club miclub) {
        int pos = leerEntero("Introduce la posición del deportista a eliminar: ");
        miclub.eliminarDeportista(pos);
    }

    private static void deleteDeportistaByDNI(Club miclub) {
        String dni = leerCadena("Introduce el DNI del deportista a eliminar: ");
        miclub.eliminarDeportista(dni);
    }

    private static void showAverageAge(Club miclub) {
        double media = miclub.generarMediaDeEdades();
        System.out.println("La media de edad de los deportistas es de: " + String.format("%.2f", media) + " años.");
    }

    private static void changeDeportistaAge(Club miclub) {
        int option;
        miclub.mostrarListaDeportistas();
        do {
            option = leerEntero("Seleccione el deportista: ");
        } while (option < 0 || option > miclub.getNumDeportistas());
        Deportista modifiableDeportista = miclub.getDeportista(option - 1);
        int nuevaEdad = Entrada.leerEntero("Introduce la edad del deportista: ");
        modifiableDeportista.setEdad(nuevaEdad);
    }

    private static void changeDeportistaCategory(Club miclub) {
        int option;
        miclub.mostrarListaDeportistas();
        do {
            option = leerEntero("Seleccione el deportista: ");
        } while (option < 0 || option > miclub.getNumDeportistas());
        Deportista modifiableDeportista = miclub.getDeportista(option - 1);
        Categoria nuevaCategoria = leerCategoria();
        modifiableDeportista.setCat(nuevaCategoria);
    }

    private static void listDeportistasByCategory(Club miclub) {
        Categoria cat = leerCategoria();
        miclub.mostrarListaDeportistas(cat);
    }

    private static Deportista leerDeportista() {
        String dni;
        String nombre;
        Categoria categoria;
        int edad;
        Deportista d = null;

        System.out.println("\n\t ----> Inserción de nuevo deportista");
        do {
            try {
                dni = leerCadena("Introduce DNI: ");
                nombre = leerCadena("Introduce nombre: ");
                System.out.println("Seleccione su categoría: ");
                categoria = leerCategoria();
                edad = leerEntero("Introduce edad: ");
                if (!categoria.esValidaEdad(edad)) {
                    throw new InvalidCategoryException();
                }
                d = new Deportista(dni, nombre, categoria, edad);
            } catch (NumberFormatException exc) {
                System.err.println("Error - Formato numérico no válido.");
            } catch (IllegalArgumentException exc) { //También va incluída la de InvalidCategoryException
                System.err.println("Error - " + exc.getMessage());
            }
        } while (d == null);
        System.out.println("\t");
        return d;
    }

    private static int menu() {
        int opc;
        do {
            System.out.println("=========== MENU ===========");
            System.out.println("1. Insertar deportista"); //(Comprobar previamente que no exista ya).
            System.out.println("2. Obtener los datos de un deportista");
            System.out.println("3. Saber cuantos deportista tiene el club");
            System.out.println("4. Saber el numero máximo de deportistas que puede tener el club");
            System.out.println("5. Listar deportistas");
            System.out.println("6. Eliminar un deportista por su posición");
            System.out.println("7. Eliminar deportista por DNI");
            System.out.println("8. Generar la media de las edades de los deportistas");
            System.out.println("9. Cambiar la edad de un deportista");
            System.out.println("10. Cambiar la categoría de un deportista");
            System.out.println("11. Listar los deportistas de una categoría");
            System.out.println("0. Salir");
            System.out.println("============================");
            opc = leerEntero("\tIntroduce opción: ");
        } while ((opc < 0) || (opc > 11));
        return opc;
    }
}
