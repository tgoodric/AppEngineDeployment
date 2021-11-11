package com.revature.services;

import com.revature.daos.RequestDaoH2;
import com.revature.models.CompareRequest;
import org.hibernate.HibernateException;

import java.util.List;

public class RequestService {
    RequestDaoH2 rDao = new RequestDaoH2();

    private final int HTTP_OK = 200;
    private final int HTTP_CREATED = 201;
    private final int HTTP_NO_CONTENT = 204;
    private final int HTTP_BAD_REQUEST = 400;

    public int addRequest(CompareRequest request){
        try {
            rDao.addRequest(request);
        }
        catch(HibernateException e){
            return HTTP_BAD_REQUEST;
        }
        return HTTP_CREATED;
    }

    public int confirm(CompareRequest request) {
        try{
            if (rDao.confirm(request)) {
                return HTTP_OK;
            }
            return HTTP_NO_CONTENT;
        }
        catch (HibernateException e){
            return HTTP_BAD_REQUEST;
        }

    }

    public List<CompareRequest> getAll() { //only for testing purposes
        try{
            return rDao.getAll();
        }
        catch (HibernateException e){
            return null;
        }
    }
}
