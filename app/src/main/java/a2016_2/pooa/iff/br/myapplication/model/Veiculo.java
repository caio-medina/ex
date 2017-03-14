package a2016_2.pooa.iff.br.myapplication.model;

import com.orm.SugarRecord;

/**
 * Created by user on 13/03/17.
 */
public class Veiculo extends SugarRecord {

    String placa, modelo, ano;
    Proprietario proprietario = new Proprietario();

    public Veiculo(Proprietario proprietario, String ano, String modelo, String placa) {
        this.proprietario = proprietario;
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Veiculo(){

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
