package com.kdtechuniverse.api_pisos_direcciones.entity;

import java.math.BigDecimal;
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

@Entity
@Table(name = "piso")
public class Piso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String planta;

    @Column(nullable = false, length = 20)
    private String puerta;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inmueble_id", nullable = false)
    private Inmueble inmueble;

    @Column (precision = 12, scale = 2, nullable= false)
    private BigDecimal metrosCuadrados;

    @Column (precision = 12, scale = 2, nullable= false)
    private BigDecimal precio;

    @Column (nullable= false)
    private String descripcion;

    @Column (nullable= false)
    private String estado;

    @Column  (nullable= false)
    private String tipoPiso;

    private Instant fechaCreacion;
    private Instant fechaActualizacion;
    private int numeroHabitaciones;
    private int numeroBanos;

    private String imagenUrl;

    public Piso() {
    }

    public Piso(Long id, String planta, String puerta, Inmueble inmueble, String descripcion, String estado, Instant fechaCreacion, Instant fechaActualizacion, int numeroHabitaciones, int numeroBanos, BigDecimal metrosCuadrados, BigDecimal precio, String tipoPiso, String imagenUrl) {
        this.id = id;
        this.planta = planta;
        this.puerta = puerta;
        this.inmueble = inmueble;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
        this.tipoPiso = tipoPiso;
        this.imagenUrl = imagenUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public BigDecimal getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(BigDecimal metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    @Override
    public String toString() {
        return "Piso{"
                + "id=" + id
                + ", planta=" + planta
                + ", puerta=" + puerta
                + ", inmueble=" + (inmueble != null ? inmueble.getId() : null)
                + ", descripcion='" + descripcion + '\''
                + ", estado='" + estado + '\''
                + ", fechaCreacion=" + fechaCreacion
                + ", fechaActualizacion=" + fechaActualizacion
                + ", numeroHabitaciones=" + numeroHabitaciones
                + ", numeroBanos=" + numeroBanos
                + ", metrosCuadrados=" + metrosCuadrados
                + ", precio=" + precio
                + ", tipoPiso='" + tipoPiso + '\''
                + ", imagenUrl='" + imagenUrl + '\''
                + '}';
    }

}
