package krnlk.spring_playground.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@CrossOrigin(origins = "http://localhost:4200") // not intended for internet access
public class AuthController {
    private final AuthRepository authRepository;

    public AuthController(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @PostMapping("/register")
    public boolean registerUser(@RequestBody User user) {
        authRepository.save(user);
		return true;
	}
}
