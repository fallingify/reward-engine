package flgfy.couponsystem.member.repository;

import flgfy.couponsystem.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    /**
     * 중복 이메일 검사
     * @param email
     * @return
     */
    boolean existsByEmail(String email);
}
