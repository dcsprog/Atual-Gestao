
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Reparar {
    
    public Reparar(){
        
        
    }

    public Reparar(int idReparacao, Carro Automovel, Peca pecasTirada, Peca pecasIntroduzida, Date dataInicio, Date dataFim, double custoMaoObra) {
        this.idReparacao = idReparacao;
        this.Automovel = Automovel;
        this.pecasTirada = pecasTirada;
        this.pecasIntroduzida = pecasIntroduzida;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.custoMaoObra = custoMaoObra;
    }
    
    
    
    int idReparacao;
    Carro Automovel;
    Peca pecasTirada;
    Peca pecasIntroduzida;
    Date dataInicio;
    Date dataFim;
    double custoMaoObra;

    public void setIdReparacao(int idReparacao) {
        this.idReparacao = idReparacao;
    }

    public void setAutomaovel(Carro Automaovel) {
        this.Automovel = Automaovel;
    }

    public void setPecasTirada(Peca pecasTirada) {
        this.pecasTirada = pecasTirada;
    }

    public void setPecasIntroduzida(Peca pecasIntroduzida) {
        this.pecasIntroduzida = pecasIntroduzida;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setCustoMaoObra(double custoMaoObra) {
        this.custoMaoObra = custoMaoObra;
    }

    public int getIdReparacao() {
        return idReparacao;
    }

    public Carro getAutomaovel() {
        return Automovel;
    }

    public Peca getPecasTirada() {
        return pecasTirada;
    }

    public Peca getPecasIntroduzida() {
        return pecasIntroduzida;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public double getCustoMaoObra() {
        return custoMaoObra;
    }
    
    
    
}
