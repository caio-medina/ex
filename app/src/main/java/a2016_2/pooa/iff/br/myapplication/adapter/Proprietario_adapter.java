package a2016_2.pooa.iff.br.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import a2016_2.pooa.iff.br.myapplication.R;
import a2016_2.pooa.iff.br.myapplication.model.Proprietario;

/**
 * Created by user on 09/03/17.
 */
public class Proprietario_adapter extends ArrayAdapter<Proprietario> {

    private final Context context;
    private final ArrayList<Proprietario> proprietarios;

    public Proprietario_adapter(Context context, ArrayList<Proprietario> proprietarios) {
        super(context, R.layout.linha_proprietario, proprietarios);
        this.context = context;
        this.proprietarios = proprietarios;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linha_proprietario, parent, false);

        TextView nome = (TextView) rowView.findViewById(R.id.tvllvNome);
        TextView endereco = (TextView) rowView.findViewById(R.id.tvllvEndereco);
        TextView telefone = (TextView) rowView.findViewById(R.id.tvllvTelefone);
        TextView data = (TextView) rowView.findViewById(R.id.tvllvData);

        nome.setText(proprietarios.get(position).getNome());
        endereco.setText(proprietarios.get(position).getEndereco());
        telefone.setText(proprietarios.get(position).getTelefone());
        data.setText(proprietarios.get(position).getData_nascimento());
        return rowView;
    }




}
