import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
@RunWith(SpringRunner.class)
public class testClass {
    @Autowired
    private TbBrandMapper mapper;

    @Test
    public  void testsss(){
        List<TbBrand> tbBrands = mapper.selectByExample(null);
        System.out.println(tbBrands.size());
    }
}
