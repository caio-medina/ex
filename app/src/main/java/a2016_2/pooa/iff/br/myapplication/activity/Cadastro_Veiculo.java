package a2016_2.pooa.iff.br.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import a2016_2.pooa.iff.br.myapplication.R;
import a2016_2.pooa.iff.br.myapplication.model.Proprietario;
import a2016_2.pooa.iff.br.myapplication.model.Veiculo;

public class Cadastro_Veiculo extends AppCompatActivity {

    Button btsalvar,btalterar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro__veiculo);

        final Intent intent    = getIntent();
        int id = (int) intent.getSerializableExtra("id");

        String nomep     = (String) intent.getSerializableExtra("nome");
        String enderecop = (String) intent.getSerializableExtra("endereco");
        String datap     = (String) intent.getSerializableExtra("data");
        String telefonep  = (String)  intent.getSerializableExtra("telefone");

        EditText nome = (EditText) findViewById(R.id.etPlaca);
        nome.setText(nomep);

        EditText endereco = (EditText) findViewById(R.id.etModelo);
        endereco.setText(enderecop);


        EditText telefone = (EditText) findViewById(R.id.etAno);
        telefone.setText(telefonep);


        btsalvar = (Button) findViewById(R.id.btOKveiculo);
        btalterar = (Button) findViewById(R.id.btAlterarveiculo);

        if (id != 0) {
            btsalvar.setEnabled(false);
            btsalvar.setClickable(false);
            btsalvar.setVisibility(View.INVISIBLE);
        } else {
            btalterar.setEnabled(false);
            btalterar.setClickable(false);
            btalterar.setVisibility(View.INVISIBLE);
        }

        btsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastro_Veiculo.this, Lista_Veiculo.class);
                salvar();
                startActivity(intent);

            }
        });

        btalterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastro_Veiculo.this, Lista_Veiculo.class);
                alterar();
                startActivity(intent);

            }
        });

    public void alterar(){
        Veiculo veiculo = Veiculo.findById(Veiculo.class, id);

        EditText placa = (EditText) findViewById(R.id.etNome);

        EditText endereco = (EditText) findViewById(R.id.etEndereco);

        EditText data = (EditText) findViewById(R.id.etData);

        EditText telefone = (EditText) findViewById(R.id.etTelefone);

        prop.setNome(nome.getText().toString());
        prop.setEndereco(endereco.getText().toString());
        prop.setTelefone(telefone.getText().toString());
        prop.setData_nascimento(data.getText().toString());

        prop.save();
        finish();
    }




    public void salvar() {

        EditText nome = (EditText) findViewById(R.id.etPlaca);

        EditText endereco = (EditText) findViewById(R.id.etModelo);

        EditText telefone = (EditText) findViewById(R.id.etAno);
        Veiculo p = new Veiculo(null, nome.getText().toString(), endereco.getText().toString(), telefone.getText().toString());

        p.save();
    }



}
