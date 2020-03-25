package com.wpg;

import com.wpg.entity.User;
import com.wpg.mapper.UserMapper;
import com.wpg.service.impl.UserServiceImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)
@ComponentScan("com.wpg.service.impl")
public class SpringbootmpmvcApplicationTests {
    @Autowired
    UserMapper userMapper;
//    @Autowired
//    SqlSessionFactory sqlSessionFactory;
    @Resource
    UserServiceImpl userServiceImpl;

    @Test
    public void contextLoads() {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            User user = new User().setAge(i)
                    .setName("zs" + i)
                    .setScore("99" + i)
                    .setSex("man");
            userMapper.insert(user);
        }
        System.out.println(System.currentTimeMillis() - l);
    }

    @Test
    public void contextLoads1() {
        ArrayList<User> users = new ArrayList<>(10000);
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            User user = new User().setAge(i)
                    .setName("zs" + i)
                    .setScore("99" + i)
                    .setSex("man");
            users.add(user);
        }
        userMapper.insertTest(users);
        System.out.println(System.currentTimeMillis() - l);
    }

    @Test
    public void contextLoads3() {
        ArrayList<User> users = new ArrayList<>(10000);
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            User user = new User().setAge(i)
                    .setName("zs" + i)
                    .setScore("99" + i)
                    .setSex("man");
            users.add(user);
        }
        userServiceImpl.saveBatch(users,10000);
        System.out.println(System.currentTimeMillis() - l);
    }

//    @Test
//    public void contextLoads2() {
////        SqlSession session = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
////        User mapper = session.getMapper(User.class);
//        long l = System.currentTimeMillis();
//        for (int i = 0; i < 100; i++) {
//            User user = new User().setAge(i)
//                    .setName("zs" + i)
//                    .setScore("99" + i)
//                    .setSex("man");
////            userMapper.insert()
//
//        }
////        session.commit();
//        System.out.println(System.currentTimeMillis() - l);
//        //SimpleTableMapper mapper = session.getMapper(User.class);
//
//    }


}
