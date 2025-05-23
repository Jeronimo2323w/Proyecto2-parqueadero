/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Jeronimo
 */
public class Precio {
    private float Precio_por_hora_moto;
    private float Precio_por_hora_carro;

    public void setPrecio_por_hora_moto(float Precio_por_hora_moto) {
        this.Precio_por_hora_moto = Precio_por_hora_moto;
    }

    public void setPrecio_por_hora_carro(float Precio_por_hora_carro) {
        this.Precio_por_hora_carro = Precio_por_hora_carro;
    }

    public float getPrecio_por_hora_moto() {
        return Precio_por_hora_moto;
    }

    public float getPrecio_por_hora_carro() {
        return Precio_por_hora_carro;
    }

    public Precio(float Precio_por_hora_moto, float Precio_por_hora_carro) {
        this.Precio_por_hora_moto = Precio_por_hora_moto;
        this.Precio_por_hora_carro = Precio_por_hora_carro;
    }
     @Override
    public String toString(){
        return '\n'+"{" + "Precio por hora moto" + Precio_por_hora_moto + "Precio por hora carro=" + Precio_por_hora_carro+ '}';}
}
