/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Clases.Reserva;
import java.time.LocalTime;


/**
 *
 * @author Jeronimo
 */
public class Multa {
    private float Precio_por_hora_excedida;
    private float Valor_total_de_Multa;
    private Reserva reserva;

    public Multa(float Precio_por_hora_excedida, float Valor_total_de_Multa, Reserva reserva) {
        this.Precio_por_hora_excedida = Precio_por_hora_excedida;
        this.Valor_total_de_Multa = Valor_total_de_Multa;
        this.reserva = reserva;
    }

    public void setPrecio_por_hora_excedida(float Precio_por_hora_excedida) {
        this.Precio_por_hora_excedida = Precio_por_hora_excedida;
    }

    public void setValor_total_de_Multa(float Valor_total_de_Multa) {
        this.Valor_total_de_Multa = Valor_total_de_Multa;
    }

    public float getPrecio_por_hora_excedida() {
        return Precio_por_hora_excedida;
    }

    public float getValor_total_de_Multa() {
        return Valor_total_de_Multa;
    }


    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    public void calcularMulta(LocalTime horaRealSalida) {
    LocalTime horaSalidaReserva = reserva.getHora_de_salida();
    int minutosExcedidos = (int) java.time.Duration.between(horaSalidaReserva, horaRealSalida).toMinutes();

    if (minutosExcedidos > 0) {
        float horasExcedidas = (float) minutosExcedidos / 60;
        this.Valor_total_de_Multa = horasExcedidas * this.Precio_por_hora_excedida;
    } else {
        this.Valor_total_de_Multa = 0;
    }
}

    
     @Override
    public String toString(){
        return '\n'+"{" + "Precio por hora excedida=" + Precio_por_hora_excedida + "Valor total de multa=" + Valor_total_de_Multa +"reserva = "+reserva+'}';}
}
