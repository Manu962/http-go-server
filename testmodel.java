package com.demo.extrnldb.model;
import java.sql.Timestamp;
import.java.util.Date;

public class TestModel {
 Private String status;
 Private String version;
 Private Timestamo uptime;
 
 public TestModel(){
 
 }
 public TestModel (string status, String versio, Timestamp uptime){
 
       this.status = status;
       this.version = version;
       this.uptime =uptime;
       }
       
       public String getstatus()          {
       return status;
       }
       public void setStatus(String status) {
       this.status = status;
       }
       
       public String getVersion()       {
       return version;
       }
       
       
       public void setVersion(String version) {
       this.status = status;
       }
       
       public Timestamp getUptime() {
       return uptime;
       }
       public void setUptime(Timestamp uptime) {
       this.uptime = uptime;
       }
 
