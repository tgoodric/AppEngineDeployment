package com.revature.daos;

import com.revature.models.CompareRequest;
import com.revature.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public class RequestDaoH2 {
    public void addRequest(CompareRequest request) throws HibernateException{

        try(Session ses = HibernateUtil.getSession()){
            ses.save(request);
            HibernateUtil.closeSession();
        }
    }

    public boolean confirm(CompareRequest request) throws HibernateException {
        boolean matched = false;
        int i = 0;
        String hql = "FROM CompareRequest cr";
        List<CompareRequest> result;
        try(Session ses = HibernateUtil.getSession()){
            result = ses.createQuery(hql).list();
            HibernateUtil.closeSession();
        }
        if(result != null && !result.isEmpty()){
            while(!matched && i < result.size()){
                matched = result.get(i).equals(request);
                i++;
            }
        }
        return matched;
    }


    public List<CompareRequest> getAll() throws HibernateException {
        String hql = "FROM CompareRequest cr";
        List<CompareRequest> result;
        try (Session ses = HibernateUtil.getSession()){
            result = ses.createQuery(hql).list();
            HibernateUtil.closeSession();
        }
        return result;
    }
}
