package annotation.dao;
import org.springframework.stereotype.Repository;
@Repository("testDaoImp1")
public class TestDaoImp1 implements TestDao{
    @Override
    public void save(){
        System.out.println("testDao save");
    }
}
