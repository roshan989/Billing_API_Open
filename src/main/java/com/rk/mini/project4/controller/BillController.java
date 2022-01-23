package com.rk.mini.project4.controller;

import com.rk.mini.project4.entity.Bill;
import com.rk.mini.project4.pojo.PostRequest;
import com.rk.mini.project4.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillService billService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED,reason = "created")
    public int postbill(@RequestBody PostRequest postreq){
        billService.methodPost(postreq);
        return 0;
    }

    @GetMapping
    public List<Bill> getBill(){
        return billService.getBill();
    }

    @DeleteMapping("{id}")
    public void deleteBill(@PathVariable Integer id ){
         billService.deleteBill(id);
    }

}
