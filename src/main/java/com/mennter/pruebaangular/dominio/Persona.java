package com.mennter.pruebaangular.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * Persona
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    private Long id;

    @NotNull()
    @Size(min = 1, max = 12)
    @Column(columnDefinition = "char(12)")
    private String codigo;

    @NotNull()
    @Size(min = 2, max = 200)
    @Column(columnDefinition = "char(200)")
    private String nombre;

    @NotNull()
    @Size(min = 2, max = 200)
    @Column(columnDefinition = "char(200)")
    private String direccion;

    @NotNull()
    @Size(min = 2, max = 100)
    @Column(columnDefinition = "char(100)")
    private String poblacion;

    @NotNull()
    @Size(min = 2, max = 50)
    @Column(columnDefinition = "char(50)")
    private String codigoPostal;

    @NotNull()
    @Size(min = 2, max = 100)
    @Column(columnDefinition = "char(100)")
    private String ciudad;

    @NotNull()
    @Column(columnDefinition = "int")
    private Long telefono;

    @NotNull()
    @Size(min = 5, max = 100)
    @Email
    @Column(columnDefinition = "char(100)")
    private String email;


    public Persona() {
    }

    public Persona(Long id, String codigo, String nombre, String direccion, String poblacion, String codigoPostal, String ciudad, Long telefono, String email) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona id(Long id) {
        setId(id);
        return this;
    }

    public Persona codigo(String codigo) {
        setCodigo(codigo);
        return this;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Persona direccion(String direccion) {
        setDireccion(direccion);
        return this;
    }

    public Persona poblacion(String poblacion) {
        setPoblacion(poblacion);
        return this;
    }

    public Persona codigoPostal(String codigoPostal) {
        setCodigoPostal(codigoPostal);
        return this;
    }

    public Persona ciudad(String ciudad) {
        setCiudad(ciudad);
        return this;
    }

    public Persona telefono(Long telefono) {
        setTelefono(telefono);
        return this;
    }

    public Persona email(String email) {
        setEmail(email);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", poblacion='" + getPoblacion() + "'" +
            ", codigoPostal='" + getCodigoPostal() + "'" +
            ", ciudad='" + getCiudad() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }



}