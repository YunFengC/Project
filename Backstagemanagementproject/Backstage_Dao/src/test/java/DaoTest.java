import com.backstage.damain.*;
import com.backstage.dao.OrdersDao;
import com.backstage.dao.ProductDao;
import com.backstage.dao.RoleDao;
import com.backstage.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_dao.xml")
public class DaoTest {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private OrdersDao ordersDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Test
    public void TestProduct(){
        List<Product> all = productDao.getAll();
        for (Product product : all){
            System.out.println(product);
        }
    }
    @Test
    public void TestUUID(){
        for (int i = 1;i<10;i++){
            System.out.println(UUID.randomUUID().toString().replace("-", "").toUpperCase());
        };
    }
    @Test
    public void TestOrders(){
        System.out.println(ordersDao.getAll());
    }
    @Test
    public void TestOrdersFindById(){
        Orders byId = ordersDao.findById("0E7231DC797C486290E8713CA3C6ECCC");
        System.out.println(byId.getProduct());
        System.out.println( byId.getMember());
        List<Traveller> travellers = byId.getTravellers();
        for (Traveller traveller : travellers){
            System.out.println(traveller);
        }
    }
    @Test
    public void TestUserDao(){
        UserInfo userInfo = userDao.findByUsername("张三");

    }

    @Test
    public void findById(){
        UserInfo byId = userDao.findByRid("1");
            System.out.println("userInfo--------------------"+byId);
    }
    @Test
    public void findById2(){
        Role role = roleDao.findByPeId("111-101");
        System.out.println("userInfo--------------------"+role);
    }
}
