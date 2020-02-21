package me.weekbelt.community.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String name;
    private String password;
    private String email;

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    @Builder
    public User(String name, String password, String email,
                LocalDateTime createdDate, LocalDateTime updateDate) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }
}
