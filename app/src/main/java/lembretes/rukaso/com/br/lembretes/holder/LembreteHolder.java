package lembretes.rukaso.com.br.lembretes.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import lembretes.rukaso.com.br.lembretes.R;

/**
 * Created by lucas on 22/01/17.
 */

public class LembreteHolder extends RecyclerView.ViewHolder {

    private TextView codigo;
    private TextView titulo;
    private TextView descricao;


    public LembreteHolder(View itemView) {
        super(itemView);
        titulo = (TextView) itemView.findViewById(R.id.titulo_item_lembrete);
        descricao = (TextView) itemView.findViewById(R.id.descricao_item_lembrete);
    }


    public TextView getCodigo() {
        return codigo;
    }

    public void setCodigo(TextView codigo) {
        this.codigo = codigo;
    }

    public TextView getTitulo() {
        return titulo;
    }

    public void setTitulo(TextView titulo) {
        this.titulo = titulo;
    }

    public TextView getDescricao() {
        return descricao;
    }

    public void setDescricao(TextView descricao) {
        this.descricao = descricao;
    }
}
