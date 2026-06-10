package Modelo;
import Interfaces.Monitoravel;

public class SateliteTermico extends Satelite implements Monitoravel {
    private double temperaturaFoco;
    private double areaAfetadaHectares;

    public SateliteTermico(int id, String nome, double altitude, double temperaturaFoco, double areaAfetadaHectares) {
        super(id, nome, altitude);
        this.temperaturaFoco = temperaturaFoco;
        this.areaAfetadaHectares = areaAfetadaHectares;
    }

    public double getTemperaturaFoco() {
        return temperaturaFoco;
    }

    public void setTemperaturaFoco(double temperaturaFcoo) {
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
        System.out.println("id: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Status: " + getNome() + " escaneando radiação infravermelha de calor na superfície");
        System.out.println("Altitude: " + getAltitude());
        System.out.println("Temperatura: " + getTemperaturaFoco() + "°C");
        System.out.println("Hectares escaniados: " + getAreaAfetadaHectares());
    }

    @Override
    public boolean verificarAlertaCritico() {
        return this.temperaturaFoco > 50.0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTemperatura do Foco: " + temperaturaFoco +
                "\nÁrea Afetada (hectares): " + areaAfetadaHectares;
    }
}
