package com.example.usuario_api.Controller;

import com.example.usuario_api.Entities.Usuario;
import com.example.usuario_api.Repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
@RestController:
marca esta clase como un controlador REST,
lo que significa que los métodos devolverán directamente JSON como respuesta.

@RequestMapping("/usuarios"):
 todas las rutas que definás en esta clase van a empezar con /usuarios.
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    /*
    @GetMapping: responde a GET /usuarios.
    usuarioRepository.findAll(): devuelve una lista con todos los usuarios de la base de datos.
    Retorna automáticamente en formato JSON gracias a @RestController
     */
    @GetMapping
    public List<Usuario>GetAll(){
        return usuarioRepository.findAll();
    }

    /*
    @PostMapping: responde a POST /usuarios.
    @RequestBody: le dice a Spring que el JSON que llega en el body se convierta en un objeto Usuario.
    usuarioRepository.save(usuario): guarda el objeto en la base de datos.
    Devuelve el usuario guardado, incluyendo el id generado (si lo tenés configurado así).
     */

    @PostMapping
    public Usuario PostUser(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    /*
    @GetMapping("/{id}"): responde a GET /usuarios/1, por ejemplo.
    @PathVariable Long id: toma el valor dinámico de la URL ({id}) y lo convierte en parámetro.
    findById(id).orElse(null): busca el usuario. Si no existe, devuelve null (esto puede mejorarse
    con un manejo de errores más adecuado como 404)
     */

    @GetMapping("/{id}")
    public Usuario GetById(@PathVariable Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    /*
    @DeleteMapping("/{id}"): responde a DELETE /usuarios/1.
    deleteById(id): elimina el usuario por su ID. Si no existe,
    lanza una excepción (que deberías manejar en una versión más robusta).
     */

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}
