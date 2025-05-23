/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.controladores;

import Clases.Pago_Bancario;
import Clases.Precio;
import Clases.Puesto;
import Clases.Reserva;
import Clases.Vehiculo;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/**
 *
 * @author Jeronimo
 */
public class Controlador_reserva {

    private Puesto puesto;
    private Vehiculo vehiculo;
    private Pago_Bancario pago;
    private float valorTotal;

    private ArrayList<Reserva> reservas = new ArrayList<>();

    public void crearReserva(Vehiculo vehiculo, int piso, String lugar, String cuenta, String banco, int horas,
            float precioCarro, float precioMoto, LocalTime horaEntrada, LocalTime horaSalida) {

        String codigo = generarCodigoVerificacion();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo);

        float valorCarro = precioCarro * horas;
        float valorMoto = precioMoto * horas;

        Reserva reserva = new Reserva("Ocupado",horas,precioMoto,precioCarro,horaEntrada,horaSalida,valorCarro,valorMoto,precioMoto,precioCarro,vehiculos,cuenta,banco,horas,piso, lugar.toUpperCase(), codigo);

        reservas.add(reserva);
        System.out.println("Reserva creada exitosamente con código: " + codigo);
    }

    private String generarCodigoVerificacion() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public Reserva obtenerReservaPorPlaca(String placa) {
        for (Reserva reserva : reservas) {
            for (Vehiculo vehiculo : reserva.getVehiculo()) {
                if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                    return reserva;
                }
            }
        }
        return null;
    }

    public boolean estaPuestoOcupado(int piso, String lugar) {
        for (Reserva reserva : reservas) {
            Puesto puesto = reserva.getPuesto();
            if (puesto != null
                    && puesto.getPiso() == piso
                    && puesto.getLugar().equalsIgnoreCase(lugar)
                    && reserva.getOcupado().equalsIgnoreCase("Ocupado")) { // Corrige el estado
                return true;
            }
        }
        return false;
    }

    public boolean eliminarReservaPorCodigo(String codigo) {
        Iterator<Reserva> iterator = reservas.iterator();
        while (iterator.hasNext()) {
            Reserva r = iterator.next();
            if (r.getPuesto() != null
                    && r.getPuesto().getCodigo().equalsIgnoreCase(codigo)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean modificarReserva(String codigo, LocalTime nuevaEntrada, LocalTime nuevaSalida) {
        for (Reserva r : reservas) {
            if (r.getPuesto() != null
                    && r.getPuesto().getCodigo().equalsIgnoreCase(codigo)) {

                int nuevoTiempo = (int) Duration.between(nuevaEntrada, nuevaSalida).toHours();
                r.setHora_de_entrada(nuevaEntrada);
                r.setHora_de_salida(nuevaSalida);
                r.setTiempo(nuevoTiempo);
                r.setValor_Total_Carro(nuevoTiempo * r.getPrecio_Carro());
                r.setValor_Total_Moto(nuevoTiempo * r.getPrecio_Moto());
                return true;
            }
        }
        return false;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}
