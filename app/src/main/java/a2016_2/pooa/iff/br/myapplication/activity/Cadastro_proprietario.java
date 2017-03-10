package a2016_2.pooa.iff.br.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import a2016_2.pooa.iff.br.myapplication.R;
import a2016_2.pooa.iff.br.myapplication.model.Proprietario;

public class Cadastro_proprietario extends AppCompatActivity {

    Button btsalvar,btalterar;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_proprietario);


        Intent intent    = getIntent();
        id = (int) intent.getSerializableExtra("id");

        String nomep     = (String) intent.getSerializableExtra("nome");
        String enderecop = (String) intent.getSerializableExtra("endereco");
        String datap     = (String) intent.getSerializableExtra("data");
        String telefonep  = (String)  intent.getSerializableExtra("telefone");

        EditText nome = (EditText) findViewById(R.id.etNome);
        nome.setText(nomep);

        EditText endereco = (EditText) findViewById(R.id.etEndereco);
        endereco.setText(enderecop);

        EditText data = (EditText) findViewById(R.id.etData);
        data.setText(datap);

        EditText telefone = (EditText) findViewById(R.id.etTelefone);
        telefone.setText(telefonep);


        btsalvar = (Button) findViewById(R.id.btOK);


    }
    public void salvar() {

        EditText nome = (EditText) findViewById(R.id.etNome);

        EditText endereco = (EditText) findViewById(R.id.etEndereco);

        EditText data = (EditText) findViewById(R.id.etData);

        EditText telefone = (EditText) findViewById(R.id.etTelefone);

        Proprietario p = new Proprietario(nome.getText().toString(), endereco.getText().toString(), telefone.getText().toString(), data.getText().toString());

        p.save();
    }
}
