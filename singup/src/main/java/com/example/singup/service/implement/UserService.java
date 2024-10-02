package com.example.singup.service.implement;
import com.example.singup.dtos.UserDTO;
import com.example.singup.model.User;
import com.example.singup.repository.UserRepository;
import com.example.singup.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements RegisterService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registernew(UserDTO userDTO) throws Exception {
        if (userRepository.findByUsername(userDTO.getUsername()) != null) {
            throw new Exception("Username already exists");
        }

        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setpassword(userDTO.getpassword());
       
         String firstNamePart = userDTO.getUsername().substring(0, Math.min(userDTO.getUsername().length(), 3));
         String lastNamePart = userDTO.getpassword().substring(Math.max(userDTO.getpassword().length() - 2, 0));
 
         user.setUsername("P29"+firstNamePart + lastNamePart);

        return userRepository.save(user);
    }
}
