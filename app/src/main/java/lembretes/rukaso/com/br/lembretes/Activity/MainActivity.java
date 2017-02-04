package lembretes.rukaso.com.br.lembretes.Activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import lembretes.rukaso.com.br.lembretes.R;
import lembretes.rukaso.com.br.lembretes.adapter.LembreteRecyclerAdapter;
import lembretes.rukaso.com.br.lembretes.listener.CustomTouchListener;
import lembretes.rukaso.com.br.lembretes.listener.onItemClickListener;
import lembretes.rukaso.com.br.lembretes.model.Lembrete;
import lembretes.rukaso.com.br.lembretes.util.Constants;

public class MainActivity extends AppCompatActivity {

    private List<Lembrete> listaDeLembretes = Collections.emptyList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaDeLembretes = mockListLembrete();
        iniciarRecyleView();
    }

    private void iniciarRecyleView() {

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lista_de_atividades);
        LembreteRecyclerAdapter lembreteRecyclerAdapter = new LembreteRecyclerAdapter(listaDeLembretes, getApplication());
        recyclerView.setAdapter(lembreteRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        recyclerView.addOnItemTouchListener(new CustomTouchListener(this, new onItemClickListener() {
            @Override
            public void onClick(View view, int index) {
                Log.i("Log", view.toString());
                TextView tituloLembrete = (TextView) view.findViewById(R.id.titulo_item_lembrete);
                TextView descricaoLembrete = (TextView) view.findViewById(R.id.descricao_item_lembrete);

                Intent intent = new Intent(MainActivity.this, DetalhamentoLembreteActivity.class);
                intent.putExtra(Constants.TITULO_LEMBRETE, tituloLembrete.getText().toString());
                intent.putExtra(Constants.DESCRICAO_LEMBRETE, descricaoLembrete.getText().toString());
                startActivity(intent);
            }
        }));


        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Log.i("LOG", "FAB");
                                               Intent intent = new Intent(MainActivity.this, NovoItemLembreteActivity.class);
                                               startActivity(intent);
                                           }
                                       });
    }

    private List<Lembrete> mockListLembrete(){
        List<Lembrete> lista = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Lembrete l = new Lembrete();
            l.setTitulo("Titulo "+ i);
            l.setDescricao("Descricao " + i);
            lista.add(l);
        }
        return lista;
    }
}
