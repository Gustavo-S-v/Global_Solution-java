package Modelo;

public class Satelite {
    private int id;
    private String nome;
    private double altitude;

    public Satelite(int id, String nome, double altitude) {
        this.id = id;
        this.nome = nome;
        this.altitude = altitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String toString() {
        return "Satelite" +
                "id= " + id +
                "\nnome= " + nome  +
                "\naltitude= " + altitude
                ;
    }
}