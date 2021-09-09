package com.test.service;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.test.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: chenandong
 * @date: Created in 2021/8/30 11:17
 */
@Service
public class HelloService {
    @Autowired
    private HelloDao helloDao;

    @Cached(name = "getMsg", expire = 3600, cacheType = CacheType.LOCAL)
    public String getMsg(Integer id) {
        System.out.println("查询 service -》"+ id);
        return helloDao.get(id);
    }
}
