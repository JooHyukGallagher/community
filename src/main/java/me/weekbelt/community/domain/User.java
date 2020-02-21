package me.weekbelt.community.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.weekbelt.community.domain.enums.SocialType;
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

    private String principal;
    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    @Builder
    public User(String name, String password, String email, String principal,
                SocialType socialType, LocalDateTime createdDate, LocalDateTime updateDate) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.principal = principal;
        this.socialType = socialType;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }
}
