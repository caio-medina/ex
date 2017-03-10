package a2016_2.pooa.iff.br.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import a2016_2.pooa.iff.br.myapplication.R;

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

}
