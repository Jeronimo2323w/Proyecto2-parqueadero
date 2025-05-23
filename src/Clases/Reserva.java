/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Clases.Pago_Bancario;
import Clases.Vehiculo;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Jeronimo
 */
public class Reserva {

    private String ocupado;
    private int Tiempo;
    private LocalTime Hora_de_entrada;
    private LocalTime Hora_de_salida;
    private float Valor_Total_Carro;
    private float Valor_Total_Moto;
    private float Precio_Carro;
    private float Precio_Moto;
    private final Precio precio;
    ArrayList<Vehiculo> vehiculo;
    private Pago_Bancario pago_bancario;
    private Puesto puesto;

    public Reserva(String ocupado, int Tiempo,float PrecioMoto,float PrecioCarro , LocalTime Hora_de_entrada, LocalTime Hora_de_salida, float Valor_Total_Carro, float Valor_Total_Moto, float Precio_por_hora_moto, float Precio_por_hora_carro, ArrayList<Vehiculo> vehiculo, String Numero_de_cuenta, String Banco, int Numero_hora, int piso, String lugar, String codigo) {
        this.ocupado = ocupado;
        this.Tiempo = Tiempo;
        this.Hora_de_entrada = Hora_de_entrada;
        this.Hora_de_salida = Hora_de_salida;
        this.Valor_Total_Carro = Valor_Total_Carro;
        this.Valor_Total_Moto = Valor_Total_Moto;
        this.precio = new Precio(Precio_por_hora_carro, Precio_por_hora_moto);
        this.vehiculo = vehiculo;
        this.pago_bancario = new Pago_Bancario(Numero_de_cuenta, Banco, Numero_hora);
        this.puesto = new Puesto(piso, lugar, codigo);
        this.Precio_Carro = PrecioCarro;
        this.Precio_Moto = PrecioMoto;
    }

    public float getPrecio_Carro() {
        return Precio_Carro;
    }

    public float getPrecio_Moto() {
        return Precio_Moto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public String getOcupado() {
        return ocupado;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public LocalTime getHora_de_entrada() {
        return Hora_de_entrada;
    }

    public LocalTime getHora_de_salida() {
        return Hora_de_salida;
    }

    public float getValor_Total_Carro() {
        return Valor_Total_Carro;
    }

    public float getValor_Total_Moto() {
        return Valor_Total_Moto;
    }

    public Precio getPrecio() {
        return precio;
    }

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public Pago_Bancario getPago_bancario() {
        return pago_bancario;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void setHora_de_entrada(LocalTime Hora_de_entrada) {
        this.Hora_de_entrada = Hora_de_entrada;
    }

    public void setHora_de_salida(LocalTime Hora_de_salida) {
        this.Hora_de_salida = Hora_de_salida;
    }

    public void setValor_Total_Carro(float Valor_Total_Carro) {
        this.Valor_Total_Carro = Valor_Total_Carro;
    }

    public void setValor_Total_Moto(float Valor_Total_Moto) {
        this.Valor_Total_Moto = Valor_Total_Moto;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setPago_bancario(Pago_Bancario pago_bancario) {
        this.pago_bancario = pago_bancario;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public void Agreagarvehiculo(Vehiculo vehiculos) {
        vehiculo.add(vehiculos);
    }

}
