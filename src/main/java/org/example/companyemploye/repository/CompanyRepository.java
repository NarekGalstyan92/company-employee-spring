package org.example.companyemploye.repository;

import org.example.companyemploye.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository <Company, Integer>{

}
