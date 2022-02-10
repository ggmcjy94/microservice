package com.example.userservice.jpa;

import com.example.userservice.dto.UserDto;
import lombok.Data;
import lombok.Getter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = false, unique = true)
    private String encryptedPwd;

    public void UpdateUser(UserDto userDto, BCryptPasswordEncoder passwordEncoder) {
        name = userDto.getName();
        encryptedPwd = passwordEncoder.encode(userDto.getPwd());
    }
}
