public class Persoane {
    String prenume;
    String nume;
    int varsta;

    public Persoane(String prenume, String nume, int varsta) {
        this.prenume = prenume;
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public String toString(){
return prenume + " " + nume + " " + varsta;
    }
}
