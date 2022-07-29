package com.el.poli.ces3.Usuarios.dao;

import com.el.poli.ces3.Usuarios.model.IUsuarios;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioImpl implements InfoUsuariosDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<IUsuarios> getUsuarios() {
        //Envio de nombre del Modelo
        String query = "FROM InfoUsuarios";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public IUsuarios getInfoUsuario(int id){
        return entityManager.find(IUsuarios.class, id);
    }

    
    @Override
    public IUsuarios createInfoUsuario(IUsuarios info_usuario){
        return entityManager.merge(info_usuario);
    }

    @Override
    public IUsuarios updateInfoUsuario(int id, IUsuarios info_usuario){
        info_usuario.setId_usuario(id);
        return entityManager.merge(info_usuario);
    }

    @Override
    public IUsuarios deleteInfoUsuario(int id){
        IUsuarios info_usuario = entityManager.find(IUsuarios.class, id);
        entityManager.remove(info_usuario);
        return info_usuario;
    }
}
