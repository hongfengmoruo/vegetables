package com.system.vegetables.mapper;

import com.system.vegetables.entity.Addrs;
import java.util.List;

public interface AddrsMapper {
    int deleteByPrimaryKey(Integer addrId);

    int insert(Addrs record);

    Addrs selectByPrimaryKey(Integer addrId);

    List<Addrs> selectAll();

    int updateByPrimaryKey(Addrs record);
}