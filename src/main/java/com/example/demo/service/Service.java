package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.Repository;
import com.example.demo.model.Model;

@org.springframework.stereotype.Service

public class Service {
	@Autowired
     Repository sr;
	//POST
     public Model saveinfo(Model ss) {
    	 return sr.save(ss);
     }
     //to retrieve records
     public List<Model> showinfo(){
    	 return sr.findAll();
     }
     //update
     public Model changeinfo(Model ss) {
    	 return sr.saveAndFlush(ss);
     }
     //delete
     public void deleteinfo(Model ss) {
    	 sr.delete(ss);
     }
     public void deleteById(int id) {
    	 sr.deleteById(id);
     }
     //POST
     public List<Model> addinfo(List<Model> ss)
     {
    	 return (List<Model>)sr.saveAll(ss);
     }
     //PUT
     public Optional<Model> showbyid(int id){
    	 return sr.findById(id);
     }
     //UPDATE BY ID
     public String updateinfobyid(int id,Model ss) {
    	 sr.saveAndFlush(ss);
    	 if(sr.existsById(id)) {
    		 return "UPDATED";
    	 }else {
    		 return "ENTER VALID CUST_ID";
    	 }
     }
}
