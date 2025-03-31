import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Persoane> persoane = new ArrayList<>();
        //Asa citesc din fisier, fiecare parte o sparg ca sa fac trimitere catre variabila
        try (BufferedReader br = new BufferedReader(new FileReader("PERSOANE.txt"))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                String[] parts = linie.split(" ");
                if (parts.length == 3) {
                    persoane.add(new Persoane(parts[0], parts[1], Integer.parseInt(parts[2])));
                }
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
        }

        // Sortare nume
        persoane.sort(Comparator.comparing(p -> p.nume));

        //Afisez
        for (Persoane p : persoane) {
            System.out.println(p);
        }
    }
}