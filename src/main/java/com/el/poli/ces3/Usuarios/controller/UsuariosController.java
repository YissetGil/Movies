package com.el.poli.ces3.Usuarios.controller;

import com.el.poli.ces3.Usuarios.dao.InfoUsuariosDAO;
import com.el.poli.ces3.Usuarios.model.IUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuariosController {
    @Autowired
    private InfoUsuariosDAO info_usuario_dao;

    @RequestMapping(value = "test")
    public String test(){
        return "Hola el Spring";
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<IUsuarios>getInfoUsuarios(){
        return info_usuario_dao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public IUsuarios getInfoUsuario(@PathVariable("id") int id){
        return info_usuario_dao.getInfoUsuario(id);
    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public IUsuarios createInfoUsuario(@RequestBody IUsuarios e){
        return info_usuario_dao.createInfoUsuario(e);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.PUT)
    public IUsuarios updateInfoUsuario(@PathVariable("id") int id, @RequestBody IUsuarios e){
        return info_usuario_dao.updateInfoUsuario(id, e);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public IUsuarios deleteInfoUsuario(@PathVariable("id") int id){
        return info_usuario_dao.deleteInfoUsuario(id);
    }
}
