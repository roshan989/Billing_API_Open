package com.rk.mini.project4.services;

import com.rk.mini.project4.dao.BillDao;
import com.rk.mini.project4.dao.UserDao;
import com.rk.mini.project4.entity.Bill;
import com.rk.mini.project4.entity.Users;
import com.rk.mini.project4.pojo.PostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class BillService {

    @Autowired
    private BillDao dao;



    public int methodPost(@Valid PostRequest postreq) {
        
        Bill bill=new Bill();
        bill.setBillDate(postreq.getBilldate());
        bill.setClientname(postreq.getClientname());
        bill.setBillAmount(postreq.getBillamount());
        bill.setProduct(postreq.getProduct());
        bill.setFid(1);
        dao.save(bill);
        return 0;
    }


    public List<Bill> getBill() {
        return dao.allData();

    }

    public void deleteBill(Integer id) {
        dao.deleteById(id);
    }
}
