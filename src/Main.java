import java.io.*;
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

        // Scriere lista sortata in output.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            for (Persoane p : persoane) {
                bw.write(p.toString());
                bw.newLine();
            }
        }
            catch(IOException e){
                System.out.println("Eroare la citirea fiserului:"+ e.getMessage());
            }


        //Afisez
        for (Persoane p : persoane) {
            System.out.println(p);
        }
    }
}