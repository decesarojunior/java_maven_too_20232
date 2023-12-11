
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author telmo
 */
public class Pesagem {
    
    private Date data;
    private Float peso;
    private Bovino bovino;

    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }
    private SimpleDateFormat sdf = null;


    
    
    public Pesagem(String data, Float peso) {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            this.data = sdf.parse(data);
        } catch (ParseException ex) {
            this.data = null;
        }
        this.peso = peso;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
   
    
    
}
