package Relaciones;

import java.util.List;

public class Auto {
    private int id;
    private String marca;
    private String modelo;
    // Relación 1 a N --> Un auto tiene una lista de propietarios.
    private List<Propietario> listaPropietarios;

    public Auto() {
    }

    public Auto(int id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    @Override
    public String toString() {
        return "Auto Marca: " + marca + ", Modelo=" + modelo + ", listaPropietarios: " + listaPropietarios;
    }
}
