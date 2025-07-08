package kr.co.wikibook.gallery.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class AccountJoinReq {
    private String name;
    private String loginId;
    private String loginPw;
}
