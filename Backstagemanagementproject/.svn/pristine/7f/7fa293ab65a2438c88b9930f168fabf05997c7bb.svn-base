import com.backstage.damain.Orders;
import com.backstage.damain.Product;
import com.backstage.service.OrdersService;
import com.backstage.service.ProductService;
import com.backstage.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_service.xml")
public class ServiceTest {

    @Autowired
    private ProductService productService;
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private UserService userService;
    @Test
    public void testProduct(){
        List<Product> all = productService.getAll(1, 2);
        for (Product product : all)
            System.out.println(product);
    }
    @Test
    public void testOrders(){
        List<Orders> all = ordersService.getAll(1, 4);
        for (Orders orders : all)
            System.out.println(orders);
    }
    @Test
    public void testOn(){
        String[] rid = {"1","2","3"};
        if (rid[0].equals("on")){
            for (int i=1;i<rid.length;i++) {
                System.out.println("========================="+rid[i]);
            }
        }else{
            for (int i=1;i<rid.length;i++) {
                System.out.println("========================="+rid[i]);
            }
        }
    }


}
