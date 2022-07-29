package com.el.poli.ces3.Usuarios.dao;

import com.el.poli.ces3.Usuarios.model.IUsuarios;

import java.util.List;

public interface InfoUsuariosDAO {
    List<IUsuarios> getUsuarios();
    IUsuarios getInfoUsuario(int id);
    IUsuarios createInfoUsuario(IUsuarios info_usuario);
    IUsuarios updateInfoUsuario(int id, IUsuarios info_usuario);

    IUsuarios deleteInfoUsuario(int id);
}
