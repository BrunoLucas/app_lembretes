package lembretes.rukaso.com.br.lembretes.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import lembretes.rukaso.com.br.lembretes.R;
import lembretes.rukaso.com.br.lembretes.adapter.LembreteRecyclerAdapter;
import lembretes.rukaso.com.br.lembretes.model.Lembrete;
import lembretes.rukaso.com.br.lembretes.util.Constants;

/**
 * Created by lucas on 22/01/17.
 */

public class DetalhamentoLembreteActivity  extends AppCompatActivity{

    private Lembrete lembrete;
    private TextView tituloLembrete;
    private TextView descricaoLembrete;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhamento_item_lembrete);
        tituloLembrete = (TextView) findViewById(R.id.detalhamento_titulo_lembrete);
        descricaoLembrete = (TextView) findViewById(R.id.detalhamento_descricao_lembrete);
        tituloLembrete.setText(getIntent().getStringExtra(Constants.TITULO_LEMBRETE));
        descricaoLembrete.setText(getIntent().getStringExtra(Constants.DESCRICAO_LEMBRETE));
        lembrete = new Lembrete();
    }



    public Lembrete getLembrete() {
        return lembrete;
    }

    public void setLembrete(Lembrete lembrete) {
        this.lembrete = lembrete;
    }

    public TextView getTituloLembrete() {
        return tituloLembrete;
    }

    public void setTituloLembrete(TextView tituloLembrete) {
        this.tituloLembrete = tituloLembrete;
    }

    public TextView getDescricaoLembrete() {
        return descricaoLembrete;
    }

    public void setDescricaoLembrete(TextView descricaoLembrete) {
        this.descricaoLembrete = descricaoLembrete;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        Intent intent = new Intent(DetalhamentoLembreteActivity.this, MainActivity.class);
//        startActivity(intent);
        Log.i("Log", "onBackPressed()");

    }

}
