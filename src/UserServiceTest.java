import static org.junit.jupiter.api.Assertions.*;

import UserService.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test public void testRegisterUser () {
        assertTrue(userService.registerUser ("John Doe", "john@example.com", "password123"));
        assertFalse(userService.registerUser ("Jane Doe", "john@example.com", "password456"));
    }

    @Test public void testLoginUser () {
        userService.registerUser ("John Doe", "john@example.com", "password123");
        assertNotNull(userService.loginUser ("john@example.com", "password123"));
        assertNull(userService.loginUser ("john@example.com", "wrongpassword"));
    }
}
