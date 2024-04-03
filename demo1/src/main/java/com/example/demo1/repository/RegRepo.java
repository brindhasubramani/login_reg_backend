package com.example.demo1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo1.model.Reg;
public interface RegRepo extends JpaRepository<Reg,Integer>{
    
}

