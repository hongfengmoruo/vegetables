package com.system.vegetables.mapper;

import com.system.vegetables.entity.Comments;
import java.util.List;

public interface CommentsMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Comments record);

    Comments selectByPrimaryKey(Integer commentId);

    List<Comments> selectAll();

    int updateByPrimaryKey(Comments record);
}