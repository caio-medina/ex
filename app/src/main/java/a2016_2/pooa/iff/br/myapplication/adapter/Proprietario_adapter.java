package a2016_2.pooa.iff.br.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import a2016_2.pooa.iff.br.myapplication.R;
import a2016_2.pooa.iff.br.myapplication.model.Proprietario;

/**
 * Created by user on 09/03/17.
 */
public class Proprietario_adapter extends ArrayList<Proprietario>{

    private Context context = null;
    private ArrayList<Proprietario> eventos = null;

    public Proprietario_adapter(Context context, ArrayList<Proprietario> eventos) {
        super(context, R.layout.Linha_Proprietario, eventos);
        this.context = context;
        this.eventos = eventos;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.Linha_Proprietario, parent, false);

        TextView nome = (TextView) rowView.findViewById(R.id.tvllvNome);
        TextView endereco = (TextView) rowView.findViewById(R.id.tvllvEndereco);
        TextView telefone = (TextView) rowView.findViewById(R.id.tvllvTelefone);
        TextView data = (TextView) rowView.findViewById(R.id.tvllvData);

        nome.setText(eventos.get(position).getNome());
        endereco.setText(eventos.get(position).getEndereco());
        telefone.setText(eventos.get(position).getTelefone());
        data.setText(eventos.get(position).getData_nascimento());
        return rowView;
    }




}
