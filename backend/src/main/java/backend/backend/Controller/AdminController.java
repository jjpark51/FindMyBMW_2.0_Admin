package backend.backend.Controller;

import backend.backend.config.AdminConfig;
import backend.backend.model.User;
import backend.backend.repository.BmwRepository;
import backend.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
    @RequestMapping("/api")
    public class AdminController {

    @Autowired
    private BmwRepository bmwRepository;

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private AdminConfig adminUiConfig;

    @GetMapping("/admin-ui-config")
    public ResponseEntity<Map<String, Object>> getAdminUiConfig() {
        Map<String, Object> config = new HashMap<>();
        config.put("title", adminUiConfig.getTitle());
        config.put("sections", adminUiConfig.getSections());
        return ResponseEntity.ok(config);
    }


    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
