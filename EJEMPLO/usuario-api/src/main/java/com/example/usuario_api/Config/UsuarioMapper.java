package com.example.usuario_api.Config;

import com.example.usuario_api.Dto.UsuarioDto;
import com.example.usuario_api.Entities.Usuario;

public class UsuarioMapper {

    public static Usuario toEntity(UsuarioDto dto) {
        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setEmail(dto.getEmail());
        return usuario;
    }

    public static UsuarioDto toDto(Usuario entity) {
        UsuarioDto dto = new UsuarioDto();
        dto.setNombre(entity.getNombre());
        dto.setEmail(entity.getEmail());
        return dto;
    }
}
