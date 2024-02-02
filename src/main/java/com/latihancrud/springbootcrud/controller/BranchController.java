package com.latihancrud.springbootcrud.controller;

import java.util.List;

import com.latihancrud.springbootcrud.entity.Branch;
import com.latihancrud.springbootcrud.service.BranchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {
    
    @Autowired
    private BranchService service;

    @PostMapping("/addBranch")
    public Branch addBranch(@RequestBody Branch branch){
        return service.saveBranch(branch);
    }

    @PostMapping("/addBranches")
    public List<Branch> addBranches(@RequestBody List<Branch>branches){
        return service.saveBranches(branches);
    }

    @GetMapping("/showBranch")
    public List<Branch> findAllBranches(){
        return service.getBranches();
    }

    @GetMapping("/branch/{id}")
    public Branch findBranchById(@PathVariable int id){
        return service.getBranchById(id);
    }

    @GetMapping("/branch/{name}")
    public Branch findBranchByName(@PathVariable String name){
        return service.getBranchByName(name);
    }

    @PutMapping("/update")
    public Branch updateBranch(@RequestBody Branch branch){
        return service.updateBranch(branch);
    }

    @DeleteMapping("/delete/{id}")
    public String deletebranch(@PathVariable int id){
        return service.deleteBranch(id);
    }
}
