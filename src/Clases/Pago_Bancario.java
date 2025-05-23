package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Jeronimo
 */
public class Pago_Bancario {
    private String Numero_de_cuenta;
    private String Banco;
    private int Numero_hora;

    public Pago_Bancario(String Numero_de_cuenta, String Banco, int Numero_hora) {
        this.Numero_de_cuenta = Numero_de_cuenta;
        this.Banco = Banco;
        this.Numero_hora = Numero_hora;
    }

    public String getNumero_de_cuenta() {
        return Numero_de_cuenta;
    }

    public String getBanco() {
        return Banco;
    }

    public int getNumero_hora() {
        return Numero_hora;
    }

    public void setNumero_de_cuenta(String Numero_de_cuenta) {
        this.Numero_de_cuenta = Numero_de_cuenta;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public void setNumero_hora(int Numero_hora) {
        this.Numero_hora = Numero_hora;
    }
    

    
     @Override
    public String toString(){
        return '\n'+"{" + "Numero de cuenta=" + Numero_de_cuenta + "Banco=" + Banco + +'}';}
}
