package com.backstage.service.Impl;

import com.backstage.damain.SysLog;
import com.backstage.dao.SysLogDao;
import com.backstage.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogDao sysLogDao;

    public void save(SysLog sysLog) {
        sysLogDao.save(sysLog);
    }

    public List<SysLog> findAll() {
        return sysLogDao.findAll();
    }

}
