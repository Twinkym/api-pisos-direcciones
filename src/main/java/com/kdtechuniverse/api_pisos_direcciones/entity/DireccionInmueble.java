package com.kdtechuniverse.api_pisos_direcciones.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "direccion_inmueble", uniqueConstraints = @UniqueConstraint( name = "uk_direccion_inmueble", columnNames = {"direccion_id", "inmueble_id"}))
public class DireccionInmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "direccion_id", nullable = false)
    private Direccion direccion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inmueble_id", nullable = false)
    private Inmueble inmueble;

    @Column (nullable = false)
    private boolean esPrincipal;

    private Instant fechaCreacion;
    private Instant fechaActualizacion;



    public DireccionInmueble() {
    }

    public DireccionInmueble(Long id, Direccion direccion, Inmueble inmueble, boolean esPrincipal, Instant fechaCreacion, Instant fechaActualizacion) {
        this.id = id;
        this.direccion = direccion;
        this.inmueble = inmueble;
        this.esPrincipal = esPrincipal;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public boolean isEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public Instant getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Instant fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Instant getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Instant fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "DireccionInmueble{" +
                "id=" + id +
                ", Direccion=" + direccion +
                ", Inmueble=" + inmueble +
                ", esPrincipal='" + esPrincipal + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", fechaActualizacion='" + fechaActualizacion + '\'' +
                '}';
    }
}
