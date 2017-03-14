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
import a2016_2.pooa.iff.br.myapplication.model.Proprietario;

public class LIsta_proprietario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_proprietario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LIsta_proprietario.this, Cadastro_proprietario.class);
                intent.putExtra("id",0);
                intent.putExtra("nome","");
                intent.putExtra("endereco","");
                intent.putExtra("data","");
                intent.putExtra("telefone","");
                startActivity(intent);


            }
        });

    }

    protected void onResume()
    {
        super.onResume();
        ListView lista = (ListView) findViewById(R.id.tlvProp);

        final ArrayList<Proprietario> prop = (ArrayList<Proprietario>)
                Proprietario.listAll(Proprietario.class);

        ArrayAdapter adapter = new Proprietario_adapter(this, prop);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(LIsta_proprietario.this, Cadastro_proprietario.class);
                intent.putExtra("id", prop.get(i).getId().intValue());
                intent.putExtra("nome", prop.get(i).getNome());
                intent.putExtra("endereco", prop.get(i).getEndereco());
                intent.putExtra("telefone", prop.get(i).getTelefone());
                intent.putExtra("data", prop.get(i).getData_nascimento());

                startActivity(intent);

            }
        });


    }

}
