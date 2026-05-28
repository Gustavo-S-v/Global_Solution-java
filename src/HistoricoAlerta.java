public class HistoricoAlerta {
    private int idAlerta;
    private String descricao;

    public HistoricoAlerta(int idAlerta, String descricao) {
        this.idAlerta = idAlerta;
        this.descricao = descricao;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
