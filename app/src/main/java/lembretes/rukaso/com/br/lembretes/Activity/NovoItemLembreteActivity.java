package lembretes.rukaso.com.br.lembretes.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

import lembretes.rukaso.com.br.lembretes.R;
import lembretes.rukaso.com.br.lembretes.dao.LembreteDao;
import lembretes.rukaso.com.br.lembretes.model.Lembrete;

/**
 * Created by lucas on 04/02/17.
 */

public class NovoItemLembreteActivity  extends AppCompatActivity {

        private Lembrete lembrete;
        private EditText tituloLembrete;
        private EditText descricaoLembrete;

        private LembreteDao lembreteDao;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.novo_item_lembrete);
            tituloLembrete = (EditText) findViewById(R.id.tituloEditText);
            descricaoLembrete = (EditText) findViewById(R.id.descricaoEditText);

        }

        public boolean salvarLembrete(View view){

            lembrete = obterValoresInformados();
            lembreteDao = new LembreteDao(this);
            return lembreteDao.inserirLembrete(lembrete);
        }

        private Lembrete obterValoresInformados(){
            lembrete = new Lembrete();
            lembrete.setTitulo(tituloLembrete.getText().toString());
            lembrete.setDescricao(descricaoLembrete.getText().toString());
            return lembrete;
        }

    }