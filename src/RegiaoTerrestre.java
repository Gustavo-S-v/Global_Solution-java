public class RegiaoTerrestre {
    private String nomeRegiao;
    private String coordenadas;

    public RegiaoTerrestre(String nomeRegiao, String coordenadas) {
        this.nomeRegiao = nomeRegiao;
        this.coordenadas = coordenadas;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void setNomeRegiao(String nomeRegiao) {
        this.nomeRegiao = nomeRegiao;
    }

    public String getNomeRegiao() {
        return nomeRegiao;
    }

    @Override
    public String toString() {
        return "Região: " + regiao +
                "\nCoordenadas: " + coordenadas;
    }
}
