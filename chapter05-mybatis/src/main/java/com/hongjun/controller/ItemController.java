package com.hongjun.controller;

import com.hongjun.mapper.ItemDOMapper;
import com.hongjun.pojo.ItemDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongjun500
 * @date 2020/6/10 21:49
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@RestController
public class ItemController {
    @Autowired
    ItemDOMapper itemDOMapper;

    @GetMapping(value = "/getItemById/{id}")
    public ItemDO getItem(@PathVariable(value = "id") Integer id){
        ItemDO itemDO = itemDOMapper.selectByPrimaryKey(id);
        return itemDO;
    }

    @GetMapping(value = "/save")
    public int insetItemDO(ItemDO itemDO){
        int insert = itemDOMapper.insert(itemDO);
        return insert;
    }
}
