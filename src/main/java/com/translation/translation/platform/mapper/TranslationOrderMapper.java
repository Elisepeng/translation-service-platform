package com.translation.translation.platform.mapper;

import com.translation.translation.platform.entity.TranslationOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

@Mapper
public interface TranslationOrderMapper {

    @Insert("""
        insert into translation_order
        (
            title,
            content,
            source_language,
            target_language,
            price,
            status,
            user_id,
            create_time
        )
        values
        (
            #{title},
            #{content},
            #{sourceLanguage},
            #{targetLanguage},
            #{price},
            #{status},
            #{userId},
            #{createTime}
        )
        """)
    int add(TranslationOrder order);

    @Select("""
        select *
        from translation_order
        order by id desc
        """)
    List<TranslationOrder> findAll();

    @Update("""
update translation_order
set status='翻译中'
where id=#{id}
""")
    int accept(Integer id);

    @Update("""
update translation_order
set status='已完成'
where id=#{id}
""")
    int finish(Integer id);

    @Select("select count(*) from translation_order")
    Integer totalOrders();

    @Select("""
select count(*)
from translation_order
where status='已完成'
""")
    Integer finishedOrders();

    @Select("""
select ifnull(sum(price),0)
from translation_order
where status='已完成'
""")
    Double totalAmount();

    @Select("""
select *
from translation_order
where title like concat('%',#{keyword},'%')
order by id desc
""")
    List<TranslationOrder> search(String keyword);

    @Delete("""
delete from translation_order
where id=#{id}
""")
    int delete(Integer id);
}