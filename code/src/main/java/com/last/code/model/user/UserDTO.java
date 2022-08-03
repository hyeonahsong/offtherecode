package com.last.code.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private int user_pno;
    private String user_email;
    private String user_pw;
    private String user_nick;
    private String token;

}
