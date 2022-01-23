package com.rk.mini.project4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@Table(name = "bill")
public class Bill {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;
  @Column(name = "clientname")
  private String clientname;
  @Column(name = "product")
  private String product;

  @Column(name = "fid")
  private int fid;
  @Column(name = "billamount")
  private double billAmount;
  @Column(name = "billdate")
  private Date billDate;

}
