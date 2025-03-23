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
        int opc = 0;
        int pos;
        Club miclub;
        int maxDeportistas;

        do {
            maxDeportistas = leerEntero("Cuantos deportistas como máximo" + " va a tener el club: ");
        } while (maxDeportistas <= 0);

        miclub = new Club(maxDeportistas);

        miclub.insertarDeportista(new Deportista("12345678", "Juan", Categoria.ALEVIN, 11));
        miclub.insertarDeportista(new Deportista("23456789", "Ana", Categoria.BENJAMIN, 8));
        miclub.insertarDeportista(new Deportista("34567890", "Luis", Categoria.ALEVIN, 10));

        do {
            try {
                opc = menu();
                switch (opc) {
                    case 1 -> {
                        Deportista newDeportista = leerDeportista();

                        try {
                            miclub.insertarDeportista(newDeportista);
                        } catch (IllegalArgumentException e) {
                            System.err.println("Error al insertar deportista - " + e.getMessage());
                        }

                    }
                    case 2 -> {
                        int option;

                        miclub.mostrarListaDeportistas();

                        do {
                            option = leerEntero("Seleccione el deportista: ");
                        } while (option < 0 && option > miclub.getNumDeportistas());

                        System.out.println(miclub.getDeportista(option - 1).toString());
                    }
                    case 3 -> {
                        System.out.println("El club tiene " + miclub.getNumDeportistas() + " deportistas.");
                    }
                    case 4 -> {
                        System.out.println("El club puede tener como máximo " + miclub.getMax() + " deportistas.");
                    }
                    case 5 -> {
                        miclub.mostrarListaDeportistas();
                    }
                    case 6 -> {
                        pos = leerEntero("Introduce la posición del deportista a eliminar: ");
                        miclub.eliminarDeportista(pos);
                    }
                    case 7 -> {
                        String dni = leerCadena("Introduce el DNI del deportista a eliminar: ");
                        miclub.eliminarDeportista(dni);
                    }
                    case 8 -> {
                        double media = miclub.generarMediaDeEdades();
                        System.out.println("La media de edad de los deportistas es de: " + String.format("%.2f", media) + " años.");
                    }
                    case 9 -> {
                        int option;
                        int nuevaEdad;

                        miclub.mostrarListaDeportistas();

                        do {
                            option = leerEntero("Seleccione el deportista: ");
                        } while (option < 0 && option > miclub.getNumDeportistas());

                        Deportista modifiableDeportista = miclub.getDeportista(option - 1);

                        nuevaEdad = Entrada.leerEntero("Introduce la edad del deportista: ");

                        modifiableDeportista.setEdad(nuevaEdad);
                    }
                    case 10 -> {
                        int option;
                        Categoria nuevaCategoria;

                        miclub.mostrarListaDeportistas();

                        do {
                            option = leerEntero("Seleccione el deportista: ");
                        } while (option < 0 && option > miclub.getNumDeportistas());

                        Deportista modifiableDeportista = miclub.getDeportista(option - 1);

                        nuevaCategoria = leerCategoria();

                        modifiableDeportista.setCat(nuevaCategoria);
                    }
                    case 11 -> {
                        Categoria cat;
                        cat = leerCategoria();
                        miclub.mostrarListaDeportistas(cat);
                    }
                }
            } catch (NumberFormatException exc) {
                System.err.println("Error - Formato numérico no válido.");
            } catch (IllegalArgumentException exc) {
                System.err.println("Error - Argumento ilegal. " + exc.getMessage());
            } catch (EmptyClubException e) {
                System.err.println(e.getMessage());
            }
        } while (opc != 0); // Fin del programa (opc == 0)

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
