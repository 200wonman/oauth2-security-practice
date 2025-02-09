package app.module.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findUserByRefreshToken(String refreshToken);

    Optional<Member> findUserByEmail(String email);
}
