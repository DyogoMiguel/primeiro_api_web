package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepos;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepos repos;

    @GetMapping()
    public  List<Usuario> getUsuarios(){
        return repos.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repos.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable("id") Integer id){
        repos.deleteById(id);
    }
    
    @PostMapping()
    public void postUsuario(@RequestBody Usuario usuario){
        repos.save(usuario);
    }

    @PutMapping()
    public void putUsuario(@RequestBody Usuario usuario){
        repos.save(usuario);
    }
}
