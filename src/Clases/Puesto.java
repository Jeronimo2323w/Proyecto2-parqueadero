/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Jeronimo
 */
public class Puesto {
    private int piso;
    private String Lugar;
    private String codigo;

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPiso() {
        return piso;
    }

    public String getLugar() {
        return Lugar;
    }

    public String getCodigo() {
        return codigo;
    }

    public Puesto(int piso, String Lugar, String codigo) {
        this.piso = piso;
        this.Lugar = Lugar;
        this.codigo = codigo;
    }
    @Override
    public String toString(){
        return '\n'+"{" + "piso=" + piso + "Lugar=" + Lugar + "codigo =" + codigo +'}'; }
}
