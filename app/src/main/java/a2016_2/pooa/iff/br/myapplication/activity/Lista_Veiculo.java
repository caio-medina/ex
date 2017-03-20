package a2016_2.pooa.iff.br.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import a2016_2.pooa.iff.br.myapplication.R;
import a2016_2.pooa.iff.br.myapplication.adapter.Proprietario_adapter;
import a2016_2.pooa.iff.br.myapplication.adapter.Veiculo_Adapter;
import a2016_2.pooa.iff.br.myapplication.model.Proprietario;
import a2016_2.pooa.iff.br.myapplication.model.Veiculo;

public class Lista_Veiculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__veiculo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lista_Veiculo.this, Cadastro_Veiculo.class);
                intent.putExtra("id",0);
                startActivity(intent);
            }
        });
    }

    protected void onResume()
    {
        super.onResume();
        ListView lista = (ListView) findViewById(R.id.lvVeiculo);

        final ArrayList<Veiculo> veiculos = (ArrayList<Veiculo>)
                Veiculo.listAll(Veiculo.class);

        ArrayAdapter adapter = new Veiculo_Adapter(this, veiculos);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Lista_Veiculo.this, Cadastro_Veiculo.class);
                intent.putExtra("id", veiculos.get(i).getId().intValue());
                intent.putExtra("nome", veiculos.get(i).getPlaca());
                intent.putExtra("endereco", veiculos.get(i).getModelo());
                intent.putExtra("telefone", veiculos.get(i).getAno());

                startActivity(intent);

            }
        });


    }

}
