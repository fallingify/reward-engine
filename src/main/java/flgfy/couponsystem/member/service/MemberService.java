package flgfy.couponsystem.member.service;

import flgfy.couponsystem.member.dto.MemberJoinReq;
import org.springframework.validation.Errors;

import java.util.Map;


public interface MemberService {

    Long join(MemberJoinReq dto);

    /**
     * 회원가입 시, 유효성 및 중복 검사
     * @param errors
     * @return
     */
    Map<String, String> validateHandling(Errors errors);

}
