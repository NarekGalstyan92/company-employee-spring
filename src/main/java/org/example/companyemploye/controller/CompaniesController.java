package org.example.companyemploye.controller;

import org.example.companyemploye.entity.Company;
import org.example.companyemploye.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CompaniesController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/companies")
    public String companiesPage(ModelMap modelMap) {
        List<Company> companies = companyRepository.findAll();
        modelMap.put("companies", companies);

        return "companies";
    }

    @GetMapping("/companies/add")
    public String addCompanyPage () {
        return "addCompany";
    }

    @PostMapping("/companies/add")
    public String AddCompany(@ModelAttribute Company company) {
        companyRepository.save(company);
        return "redirect:/companies";
    }

    //  reqParam deleting
//    @GetMapping("/companies/delete")
//    public String deleteCompany(@RequestParam int id) {
//        companyRepository.deleteById(id);
//        return "redirect:/companies";
//    }

    @GetMapping("/companies/delete/{id}")
    public String deleteCompany(@PathVariable("id") int id) {
        companyRepository.deleteById(id);
        return "redirect:/companies";
    }

}
