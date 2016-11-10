package ua.kiev.prog;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.kiev.prog.entity.CustomUser;
import ua.kiev.prog.entity.UserRole;
import ua.kiev.prog.service.UserService;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(final UserService userService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                userService.addUser(new CustomUser("admin", "password", UserRole.ADMIN));
                userService.addUser(new CustomUser("user1", "password", UserRole.MANAGER));
                userService.addUser(new CustomUser("user2", "password", UserRole.COURIER));
//admin, password
//                userService.addUser(new CustomUser("admin", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", UserRole.ADMIN));
//                userService.addUser(new CustomUser("user", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", UserRole.USER));
            }
        };
    }
}