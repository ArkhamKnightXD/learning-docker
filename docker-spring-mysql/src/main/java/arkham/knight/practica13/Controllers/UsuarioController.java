package arkham.knight.practica13.Controllers;

import arkham.knight.practica13.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
}
