import com.backstage.damain.UserInfo;
import com.backstage.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test01 {
    @Test
    public void TestUserService(){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("File:D:\\BaiduNetdiskDownload\\JavaIdeaProjects\\Backstagemanagementproject\\Backstage_Web\\src\\main\\resourse\\applicationContext.xml");
        UserService userService1 = (UserService) applicationContext.getBean("userService");
        List<UserInfo> all = userService1.findAll();
        System.out.println(all);
    }
}
