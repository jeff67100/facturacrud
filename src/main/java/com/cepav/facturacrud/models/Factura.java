package com.cepav.facturacrud.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(schema = "setFactura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private Float valor;
    @Column
    private LocalDateTime fechaCreacion;


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    public void setFechacreacion(LocalDateTime fechacreacion) {
        this.fechaCreacion = fechacreacion;
    }
}
