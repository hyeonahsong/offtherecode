package com.last.code.repository;

import com.last.code.model.UserDTO;
import com.last.code.model.user.UserDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapperRepository {


    @Select("select * from tbl_user where user_email = #{user_email}")
    UserDTO signIn(String user_email);

    // wiki 쪽에서 필요함
    @Select("select * from tbl_user where user_pno=#{user_pno}")
    UserDTO userDetail(int user_pno);

}
