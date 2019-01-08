package com.lee.springboot.jpa.reposity;

import com.lee.springboot.jpa.entity.BizTags;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BizTagsReposityTest {
    @Test
    public void findByBizTagsNameEquals() throws Exception {
        BizTags bizTags = bizTagsReposity.findByName("java");
        System.out.println(bizTags.getDescription()+"======"+bizTags.getId());
    }


    @Test
    public void findById() throws Exception {
        bizTagsReposity.findById(2l);
    }

    @Autowired
    private BizTagsReposity bizTagsReposity;
    @Test
    public void findAll() throws Exception {
        System.out.println(bizTagsReposity);
        System.out.println(bizTagsReposity.findAll().size()+"=======");
    }

}