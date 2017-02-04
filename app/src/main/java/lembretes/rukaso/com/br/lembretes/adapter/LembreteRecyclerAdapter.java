package lembretes.rukaso.com.br.lembretes.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import lembretes.rukaso.com.br.lembretes.R;
import lembretes.rukaso.com.br.lembretes.holder.LembreteHolder;
import lembretes.rukaso.com.br.lembretes.model.Lembrete;

/**
 * Created by lucas on 22/01/17.
 */

public class LembreteRecyclerAdapter extends RecyclerView.Adapter<LembreteHolder> {


    List<Lembrete> listaDeLembretes = Collections.emptyList();
    Context context;

    public LembreteRecyclerAdapter(List<Lembrete> listaDeLembretes , Context context){
        this.listaDeLembretes = listaDeLembretes;
        this.context = context;
    }


    @Override
    public LembreteHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lembrete, parent, false);
        LembreteHolder lembreteHolder = new LembreteHolder(view);
        return lembreteHolder;
    }

    @Override
    public void onBindViewHolder(LembreteHolder holder, int position) {
                holder.getTitulo().setText(listaDeLembretes.get(position).getTitulo());
                holder.getDescricao().setText(listaDeLembretes.get(position).getDescricao());
    }

    @Override
    public int getItemCount() {
        return listaDeLembretes.size();
    }
}
