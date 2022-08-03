package com.last.code.service;

import com.last.code.model.UserDTO;
import com.last.code.repository.UserMapperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapperRepository userMapperRepository;

    public UserDTO signIn(UserDTO dto) {
        return userMapperRepository.signIn(dto.getUser_email());
    }

    // Nick 가져오는 메소드
    public String getUserNick(int user_pno) {
        UserDTO dto = userMapperRepository.userDetail(user_pno);
        return dto.getUser_nick();
    } // getUserNick

}
