package a2016_2.pooa.iff.br.myapplication.model;

import com.orm.SugarRecord;

/**
 * Created by user on 09/03/17.
 */
public class Proprietario extends SugarRecord {

    private String nome, endereco, telefone, data_nascimento;

    public Proprietario (){}
    public Proprietario(String nome, String endereco, String telefone, String data_nascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
