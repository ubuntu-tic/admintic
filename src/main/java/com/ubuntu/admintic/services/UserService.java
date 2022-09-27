package com.ubuntu.admintic.services;


import com.ubuntu.admintic.entity.User;
import com.ubuntu.admintic.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User createUser(User newUser){//crea usuario en caso de que no se encuentre
        return this.repository.save(newUser);
    }

    public User findUserByEmail(String email){//busca el usuario nuevo por email
        return this.repository.findByEmail(email);//El repositorio solo puede buscar por id. Sin embargo, se puede estender su funcionalidad con la funcion findByEmail
    }

    //Recibe del frontController.java y del metodo index() a getclaims() obtine la información que princpal puede capturar de la base de datos o crear el usuario en caso de que no exista
    public User getOrCreateUser(Map<String, Object> userData){ //en userData vienen los datos del usuario
    //se requiere enviar al Servicio el getclaims() para que encuentre a este usuario en la base de datos  y si no existe que lo crea
        String email = (String) userData.get("email"); //Permite buscar en la bd al usuario creado
        User user = findUserByEmail(email);
        if(user==null){//si no esta el usuario lo crea con estos datos  y lo devuelve
            String name = (String) userData.get("nickname");//elementos del Map que captua getcalims()
            String image = (String) userData.get("picture");
            String auth0Id = (String) userData.get("sub");

            User newUser = new User(email=email, image=image, auth0Id=auth0Id);
            return createUser(newUser);//se pasa el nuevo usuario al servicio para que lo cree
        }
        //System.out.println(user.getEmail());//probar que si consulta al usuario por email
        return user;//Si esta en el bd simplemente se devuelve
    }

}

