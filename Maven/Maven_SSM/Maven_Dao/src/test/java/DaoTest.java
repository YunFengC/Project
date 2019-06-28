import com.maven.dao.DaoMapper;
import com.maven.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-dao.xml")
public class DaoTest {

    @Autowired
    private DaoMapper daoMapper;

    @Test
    public void Test01(){
        List<Account> all = daoMapper.getAll();
        System.out.println(all);
    }
}
