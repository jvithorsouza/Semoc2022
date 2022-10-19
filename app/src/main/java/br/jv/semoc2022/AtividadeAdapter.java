package br.jv.semoc2022;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AtividadeAdapter extends RecyclerView.Adapter<AtividadeAdapter.AtividadeVH>{
    private static final String TAG = "MovieAdapter";
    List<Atividade> AtivList;

    public AtividadeAdapter(List<Atividade> AtivList) {
        this.AtivList = AtivList;
    }

    @NonNull
    @Override
    public AtividadeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.atividade_row, parent, false);
        return new AtividadeVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AtividadeVH holder, int position) {

        Atividade atividade = AtivList.get(position);
        holder.titleTextView.setText(atividade.getTitle());
        holder.plotTextView.setText(atividade.getDescricao());

        boolean isExpanded = AtivList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return AtivList.size();
    }

    class AtividadeVH extends RecyclerView.ViewHolder {

        private static final String TAG = "AtividadeVH";

        ConstraintLayout expandableLayout;
        TextView titleTextView, plotTextView;

        public AtividadeVH(@NonNull final View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextView);
            plotTextView = itemView.findViewById(R.id.plotTextView);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);


            titleTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Atividade movie =AtivList.get(getAdapterPosition());
                    movie.setExpanded(!movie.isExpanded());
                    notifyItemChanged(getAdapterPosition());

                }
            });
        }
    }
}
