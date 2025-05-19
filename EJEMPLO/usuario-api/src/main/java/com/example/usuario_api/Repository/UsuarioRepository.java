package com.example.usuario_api.Repository;

import com.example.usuario_api.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Al extender JpaRepository<Usuario, Long>, se le indica a
Spring que esta interfaz trabajará con la entidad Usuario y que la clave
primaria de esa entidad es de tipo Long. Esta herencia le otorga al repositorio un
conjunto completo de métodos ya implementados para realizar operaciones
CRUD (crear, leer, actualizar y eliminar). Por ejemplo:

findAll() permite obtener todos los usuarios registrados.

findById(id) permite buscar un usuario por su identificador.

save(usuario) guarda un nuevo usuario o actualiza uno existente.

deleteById(id) elimina un usuario de la base de datos.

Gracias a esto, no es necesario escribir consultas SQL
para estas operaciones básicas. Spring se encarga de generar
tod automáticamente, simplificando muchísimo el acceso a la base de datos.

Además, Spring Data JPA permite extender esta funcionalidad mediante
el uso de métodos personalizados definidos por convención. Por ejemplo, si se agrega un
métod como findByEmail(String email), Spring entenderá que debe generar una consulta SQL
que busque usuarios por su dirección de correo electrónico. Esto se conoce como query method
naming y es una característica muy poderosa de Spring.

En resumen, UsuarioRepository es el componente que se comunica con la base de datos
y permite acceder a los datos de los usuarios de forma sencilla, segura y eficiente,
sin necesidad de escribir código SQL manual.
 */
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
