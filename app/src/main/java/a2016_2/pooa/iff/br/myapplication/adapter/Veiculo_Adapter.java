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
import a2016_2.pooa.iff.br.myapplication.model.Veiculo;

/**
 * Created by user on 13/03/17.
 */

    public class Veiculo_Adapter extends ArrayAdapter<Veiculo> {

        private final Context context;
        private final ArrayList<Veiculo> carros;

        public Veiculo_Adapter(Context context, ArrayList<Veiculo> carros) {
            super(context, R.layout.linha_veiculo, carros);
            this.context = context;
            this.carros = carros;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View rowView = inflater.inflate(R.layout.linha_veiculo, parent, false);

            TextView nome = (TextView) rowView.findViewById(R.id.tvllvPlaca);
            TextView endereco = (TextView) rowView.findViewById(R.id.tvllvModelo);
            TextView telefone = (TextView) rowView.findViewById(R.id.tvllvAno);
            TextView prop = (TextView) rowView.findViewById(R.id.tvllvProprietario);

            nome.setText(carros.get(position).getPlaca());
            endereco.setText(carros.get(position).getModelo());
            telefone.setText(carros.get(position).getAno());
            //prop.setText(carros.get(position).getProprietario().getNome());
            return rowView;
        }
}
