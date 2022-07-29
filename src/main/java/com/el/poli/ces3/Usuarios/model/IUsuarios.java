package com.el.poli.ces3.Usuarios.model;

import javax.persistence.*;

@Entity
@Table(name = "info_usuarios")
public class IUsuarios {
    @Column(name = "info_usuarios_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id_usuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "edad")
    private String edad;
    @Column(name = "identificacion")
    private String identificacion;
    @Column(name = "fk_tipo_usuarios_id")
    private int fk_tipo_usuarios_id;
    @Column(name = "fk_generos_id")
    private int fk_generos_id;
    @Column(name = "fk_tipo_identificaciones_id")
    private int fk_tipo_identificaciones_id;

    public IUsuarios() {
    }

    public IUsuarios(int id_usuario, String nombre, String apellido, String edad, String identificacion, int fk_tipo_usuarios_id, int fk_generos_id, int fk_tipo_identificaciones_id) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
        this.fk_tipo_usuarios_id = fk_tipo_usuarios_id;
        this.fk_generos_id = fk_generos_id;
        this.fk_tipo_identificaciones_id = fk_tipo_identificaciones_id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getFk_tipo_usuarios_id() {
        return fk_tipo_usuarios_id;
    }

    public void setFk_tipo_usuarios_id(int fk_tipo_usuarios_id) {
        this.fk_tipo_usuarios_id = fk_tipo_usuarios_id;
    }

    public int getFk_generos_id() {
        return fk_generos_id;
    }

    public void setFk_generos_id(int fk_generos_id) {
        this.fk_generos_id = fk_generos_id;
    }

    public int getFk_tipo_identificaciones_id() {
        return fk_tipo_identificaciones_id;
    }

    public void setFk_tipo_identificaciones_id(int fk_tipo_identificaciones_id) {
        this.fk_tipo_identificaciones_id = fk_tipo_identificaciones_id;
    }
}
