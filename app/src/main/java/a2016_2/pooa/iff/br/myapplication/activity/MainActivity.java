package a2016_2.pooa.iff.br.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import a2016_2.pooa.iff.br.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chamaTelaProprietario(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(MainActivity.this, LIsta_proprietario.class);
        startActivity(intent);
    }

    public static class Cadastro_Veiculo extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cadastro__veiculo);
        }
    }
}
