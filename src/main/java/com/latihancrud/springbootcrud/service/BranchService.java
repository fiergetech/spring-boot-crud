package com.latihancrud.springbootcrud.service;

import java.util.List;

import com.latihancrud.springbootcrud.entity.Branch;
import com.latihancrud.springbootcrud.repository.BranchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {
    
    @Autowired
    private BranchRepository repository;

    public Branch saveBranch(Branch branch){
        return repository.save(branch);
    }

    public List<Branch> saveBranches(List<Branch> branches){
        return repository.saveAll(branches);
    }

    public List<Branch> getBranches(){
        return repository.findAll();
    }

    public Branch getBranchById(int id){
        return repository.findById(id).orElse(null);
    }

    public Branch getBranchByName(String name){
        return repository.findByName(name);
    }

    public String deleteBranch(int id){
        repository.deleteById(id);
        return "Cabang dengan id " +id + " berhasil dihapus";
    }

    public Branch updateBranch(Branch branch){
        Branch existingBranch=repository.findById(branch.getId()).orElse(null);
        existingBranch.setName(branch.getName());
        existingBranch.setBranchCode(branch.getBranchCode());
        existingBranch.setAddress(branch.getAddress());
        return repository.save(existingBranch);
    }
}
