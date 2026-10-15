package com.kdtechuniverse.api_pisos_direcciones.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "inmueble")
public class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 30, nullable = false)
    private String referenciaCatastral;

    private String clasificacionInmueble;
    private String codigoInmueble;
    private Instant fechaCreacion;
    private Instant fechaActualizacion;

    public Inmueble() {
    }

    public Inmueble(Long id, String referenciaCatastral, String clasificacionInmueble, String codigoInmueble, Instant fechaCreacion, Instant fechaActualizacion) {
        this.id = id;
        this.referenciaCatastral = referenciaCatastral;
        this.clasificacionInmueble = clasificacionInmueble;
        this.codigoInmueble = codigoInmueble;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferenciaCatastral() {
        return referenciaCatastral;
    }

    public void setReferenciaCatastral(String referenciaCatastral) {
        this.referenciaCatastral = referenciaCatastral;
    }

    public String getClasificacionInmueble() {
        return clasificacionInmueble;
    }

    public void setClasificacionInmueble(String clasificacionInmueble) {
        this.clasificacionInmueble = clasificacionInmueble;
    }

    public String getCodigoInmueble() {
        return codigoInmueble;
    }

    public void setCodigoInmueble(String codigoInmueble) {
        this.codigoInmueble = codigoInmueble;
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
        return "Inmueble{" +
                "id=" + id +
                ", referenciaCatastral='" + referenciaCatastral + '\'' +
                ", clasificacionInmueble='" + clasificacionInmueble + '\'' +
                ", codigoInmueble='" + codigoInmueble + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
