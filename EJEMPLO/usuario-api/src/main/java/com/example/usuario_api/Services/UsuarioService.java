package com.example.usuario_api.Services;

import com.example.usuario_api.Dto.UsuarioDto;

import java.util.List;

public interface UsuarioService {

    List<UsuarioDto> obtenerTodos();

    UsuarioDto obtenerPorId(Long id);

    UsuarioDto crear(UsuarioDto dto);

    void eliminar(Long id);
}
