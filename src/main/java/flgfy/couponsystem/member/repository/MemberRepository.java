package flgfy.couponsystem.member.repository;

import flgfy.couponsystem.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    //중복이메일검사(회원가입시)
    boolean existsByEmail(String email);
}
