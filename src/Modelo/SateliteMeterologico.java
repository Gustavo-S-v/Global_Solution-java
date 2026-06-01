package Modelo;
import Interfaces.Monitoravel;

public class SateliteMeterologico extends Satelite implements Monitoravel {
    private double indicePluviometrico;

    public SateliteMeterologico(int id, String nome, double altitude, double indicePluviometrico) {
        super(id, nome, altitude);
        this.indicePluviometrico = indicePluviometrico;
    }

    public double getIndicePluviometrico() {
        return indicePluviometrico;
    }

    public void setIndicePluviometrico(double indicePluviometrico) {
        this.indicePluviometrico = indicePluviometrico;
    }

    @Override
    public void analisarDados() {
        System.out.println("id: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Status: " + getNome() + " medindo volume de chuvas e massas de ar");
        System.out.println("Altitude: " + getAltitude());
        System.out.println("Indice  pluviométrico: " + getIndicePluviometrico());
    }

    @Override
    public boolean verificarAlertaCritico() {
        return this.indicePluviometrico > 100.0;
    }
}
