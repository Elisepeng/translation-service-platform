package com.translation.translation.platform.mapper;

import com.translation.translation.platform.entity.TranslatorUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

@Mapper
public interface TranslatorUserMapper {

    @Select("select * from translator_user")
    List<TranslatorUser> findAll();

    @Select("""
    select *
    from translator_user
    where username=#{username}
    and password=#{password}
    """)
    TranslatorUser login(
            String username,
            String password
    );

    @Delete("""
delete from translator_user
where id=#{id}
""")
    int delete(Integer id);

    @Insert("""
insert into translator_user
(username,password,role)
values
(#{username},#{password},#{role})
""")
    int add(TranslatorUser user);
}