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

        final Intent intent = getIntent();
        final int id = (int) intent.getSerializableExtra("id");

        String nomep = (String) intent.getSerializableExtra("nome");
        String enderecop = (String) intent.getSerializableExtra("endereco");
        String telefonep = (String) intent.getSerializableExtra("telefone");

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

                EditText placa = (EditText) findViewById(R.id.etPlaca);

                EditText modelo = (EditText) findViewById(R.id.etModelo);

                EditText ano = (EditText) findViewById(R.id.etAno);

                Veiculo veiculo = new Veiculo(null, placa.getText().toString(), modelo.getText().toString(), ano.getText().toString());

                Intent intent = new Intent(Cadastro_Veiculo.this, Lista_Veiculo.class);
                startActivity(intent);
                finish();
                veiculo.save();
            }
        });

        btalterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Veiculo veiculo = Veiculo.findById(Veiculo.class, id);

                EditText placa = (EditText) findViewById(R.id.etPlaca);

                EditText modelo = (EditText) findViewById(R.id.etModelo);

                EditText ano = (EditText) findViewById(R.id.etAno);

                veiculo.setPlaca(placa.getText().toString());
                veiculo.setModelo(modelo.getText().toString());
                veiculo.setAno(ano.getText().toString());


                veiculo.save();
                finish();
            }
        });



    }

}
