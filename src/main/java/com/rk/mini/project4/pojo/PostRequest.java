package com.rk.mini.project4.pojo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class PostRequest {
    @NotNull(message = "client name can't null")
    private String clientname;
    @NotNull(message = "client product can't null")
    private String product;
    @NotNull(message = "client amount can't null")
    private double billamount;
    @NotNull(message = "client date can't null")
    private Date billdate;

}
