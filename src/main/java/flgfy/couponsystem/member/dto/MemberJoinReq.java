package flgfy.couponsystem.member.dto;

import flgfy.couponsystem.member.entity.Member;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberJoinReq {
    private String email;
    private String username;
    private String password;

}
