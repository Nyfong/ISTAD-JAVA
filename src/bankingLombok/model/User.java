package bankingLombok.model;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class User {
    public Integer id;
    public String uuid;
    public String userName;
    public String email;
    public String password;
    public Boolean isDeleted;
    public Boolean isVerified;
    public LocalDateTime createdDate;

    public void inputUserInfo() {
        this.id = 1; // Fixed ID
        this.uuid = UUID.randomUUID().toString(); // Auto-generated UUID
        this.userName = "Ny Fong"; // Fixed Username
        this.email = "NyFong@example.com"; // Fixed Email
        this.password = "12345"; // Fixed Password
        this.isDeleted = false; // Fixed Deleted status
        this.isVerified = false; // Fixed Verified status
        this.createdDate = LocalDateTime.now(); // Fixed to current date/time
    }
}
