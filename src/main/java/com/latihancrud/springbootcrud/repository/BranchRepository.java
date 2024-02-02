package com.latihancrud.springbootcrud.repository;

import com.latihancrud.springbootcrud.entity.Branch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

    Branch findByName(String name);

    
}
