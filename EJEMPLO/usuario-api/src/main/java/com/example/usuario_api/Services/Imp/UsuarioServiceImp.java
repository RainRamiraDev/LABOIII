package com.example.usuario_api.Services.Imp;

import com.example.usuario_api.Config.UsuarioMapper;
import com.example.usuario_api.Dto.UsuarioDto;
import com.example.usuario_api.Entities.Usuario;
import com.example.usuario_api.Repository.UsuarioRepository;
import com.example.usuario_api.Services.UsuarioService;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioServiceImp implements UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioServiceImp(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<UsuarioDto> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(UsuarioMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioDto obtenerPorId(Long id) {
        return repository.findById(id)
                .map(UsuarioMapper::toDto)
                .orElse(null);
    }

    @Override
    public UsuarioDto crear(UsuarioDto dto) {
        Usuario usuario = UsuarioMapper.toEntity(dto);
        Usuario guardado = repository.save(usuario);
        return UsuarioMapper.toDto(guardado);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
