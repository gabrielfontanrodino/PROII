package com.bobbyesp.proii;

import java.util.List;

/**
 * @author Docente
 */
public class RepasoBloqueII {

    public static void main(String[] args) {
        ClubDeportivo club = new ClubDeportivo(20);

        Corredor corredor = new Corredor(1.2, "1", "Juan Perez", "Senior", 25);
        Nadador nadadora = new Nadador(35, "2", "Ana Gómez", "Junior", 35);
        corredor.añadirMarca(new Marca(12.5, 100, "100 metros lisos", 5, 5, 2025));
        nadadora.añadirMarca(new Marca(55.3, 100, "100 metros espalda", 1, 1, 2025));

        club.insertaDeportista(nadadora);
        club.insertaDeportista(corredor);
        club.insertaDeportista(new Corredor(1.0, "3", "luis", "Juvenil", 12));

        System.out.println("Mostrar club deportivo");
        System.out.println(club);

        System.out.println("JUVENILES");
        club.filtrarDeportistas("Juvenil");

        //USANDO LAMBDAS
        List<Deportista> juniors = club.filtrarDeportistas(d -> d.getCategoria().equalsIgnoreCase("Junior"));
        juniors.forEach(System.out::println);

    }
}
