package lembretes.rukaso.com.br.lembretes.model;

import java.io.Serializable;

/**
 * Created by lucas on 22/01/17.
 */

public class Lembrete  implements Serializable{

    private Long codigo;
    private String titulo;
    private String descricao;


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

