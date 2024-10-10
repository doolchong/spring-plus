package org.example.expert.domain.common.dto;

import lombok.Getter;
import org.example.expert.domain.user.enums.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;

@Getter
public class AuthUser {

    private final Long id;
    private final String email;
    private final String nickname;
    private final Collection<? extends GrantedAuthority> authorities;
    // 스프링 시큐리티가 내부적으로 권한을 여러개 갖고 있을 수 있다. (확장성 때문에)
    // 남자, 여자, 학생, 교사, 어린이, 학부모
    // 남자이면서 학생일 수 있고
    // 여자이면서 어린이면서 학생일 수도 있다
    // 따라서 권한을 여러개 갖고 있을 수 있기 때문에 authorities가 있는 것이다.

    public AuthUser(Long id, String email, UserRole userRole, String nickname) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.authorities = List.of(new SimpleGrantedAuthority(userRole.name()));
    }
}
