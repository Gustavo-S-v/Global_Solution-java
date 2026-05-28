package Modelo;
import Interfaces.Monitoravel;

public class SateliteTermico extends Satelite implements Monitoravel {
    private double temperaturaFoco;
    private double areaAfetadaHectares;

    public SateliteTermico(int id, String nome, double altitude, double temperaturaFcoo, double areaAfetadaHectares) {
        super(id, nome, altitude);
        this.temperaturaFoco = temperaturaFcoo;
        this.areaAfetadaHectares = areaAfetadaHectares;
    }

    public double getTemperaturaFcoo() {
        return temperaturaFoco;
    }

    public void setTemperaturaFcoo(double temperaturaFcoo) {
        this.temperaturaFoco = temperaturaFcoo;
    }

    public double getAreaAfetadaHectares() {
        return areaAfetadaHectares;
    }

    public void setAreaAfetadaHectares(double areaAfetadaHectares) {
        this.areaAfetadaHectares = areaAfetadaHectares;
    }

    @Override
    public void analisarDados() {
        System.out.println("Satelite: " + getNome() + " escaneando radiação infravermelha de calor na superfície");
    }

    @Override
    public boolean verificarAlertaCritico() {
        return this.temperaturaFoco > 50.0;
    }
}
