package br.com.alinelopes.shiftcloud.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import br.com.alinelopes.shiftcloud.R;
import br.com.alinelopes.shiftcloud.model.Carro;

public class CarroViewHolder extends RecyclerView.ViewHolder {

    public TextView tvFabricante;
    public TextView tvModelo;
    public Button btApagar;
    private List<Carro> carros;


    public CarroViewHolder(View itemView, final List<Carro> carros) {
        super(itemView);
        this.tvFabricante = (TextView) itemView.findViewById(R.id.tvFabricante);
        this.tvModelo= (TextView) itemView.findViewById(R.id.tvModelo);
        this.btApagar=(Button) itemView.findViewById(R.id.btApagar);

        this.carros= carros;
    }
}
