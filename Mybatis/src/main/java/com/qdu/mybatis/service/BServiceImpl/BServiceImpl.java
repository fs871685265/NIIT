package com.qdu.mybatis.service.BServiceImpl;


import com.qdu.mybatis.dao.BDao;
import com.qdu.mybatis.pojo.B;
import com.qdu.mybatis.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BServiceImpl implements BService {

    @Autowired
    private BDao bDao;

    @Override
    public B selBInfo(int i) {
        return bDao.selB(i);
    }
}
