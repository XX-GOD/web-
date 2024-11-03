package annotation.service;

import annotation.dao.TestDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("testServiceImp1")
public class TestServiceImp1 implements TestService{
    @Resource(name="testDaoImp1")
    private TestDao testDao;
    @Override
    public void save(){
        testDao.save();
        System.out.println("testService save");
    }
}
