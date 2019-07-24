package tech.aistar.dao;

import org.junit.Test;
import tech.aistar.dao.impl.UserDaoImpl;
import tech.aistar.entity.User;

/**
 * Created by Administrator on 2019/1/22 0022.
 */
public class TestUserDao {
    private IUserDao userDao = new UserDaoImpl();

    @Test
    public void testSave(){
        //模拟一些user对象
        User u1 = new User("lihan","lihan",0);
        User u2 = new User("guoyueqi","guoyueqi",1);
        User u3 = new User("yangjin","yangjin",1);
        User u4 = new User("wangjingjing","wangjingjing",1);
        User u5 = new User("zhaodongfang","zhaodongfang",1);


        userDao.save(u1);
        userDao.save(u2);
        userDao.save(u3);
        userDao.save(u4);
        userDao.save(u5);
    }

    @Test
    public void testFindByUserName(){
        System.out.println(userDao.findByUserName("admins"));
    }
}
