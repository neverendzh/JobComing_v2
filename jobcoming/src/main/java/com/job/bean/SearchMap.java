package com.job.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class SearchMap {

	private String userName;
	private String cityName;
	private int weekTime;
	private String jobKindName;
	
	
	public int getWeekTime() {
		return weekTime;
	}
	public void setWeekTime(int weekTime) {
		this.weekTime = weekTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getJobKindName() {
		return jobKindName;
	}
	public void setJobKindName(String jobKindName) {
		this.jobKindName = jobKindName;
	}
	public Map<String,Object> getMap(){
		
		Map<String,Object> map = new HashMap<String,Object>();
		if(this.userName!=null&&!this.userName.equals("")){
			map.put("userName", "%" + this.userName + "%");
		}else{
			map.put("userName", null);
		}
			
		
		if(this.cityName!=null&&!this.cityName.equals("")){
			map.put("cityName", "%" + this.cityName + "%");
		} 
		if("-1".equals(this.cityName)){
			map.put("cityName", null);
		}
			
		if(this.weekTime!=0){
			map.put("weekTime", this.weekTime);
		}
		if(-1==this.weekTime){
			map.put("weekTime", null);
		}
			
		if(this.jobKindName!=null&&!this.jobKindName.equals("")){
			map.put("jobKindName","%" + this.jobKindName + "%");
		}
		if("-1".equals(this.jobKindName)){
			map.put("jobKindName",null);
		}
			
		
		return map;	
	}
	
	
	
}
