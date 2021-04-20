package com.k3518030.Salary.controller;

import com.k3518030.Salary.dto.InputDto;
import com.k3518030.Salary.dto.ResultDto;
import com.k3518030.Salary.service.AllowanceService;
import com.k3518030.Salary.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payrollinfo")
public class SalaryController {
    @Autowired
    private AllowanceService allowanceService;
    @Autowired
    private SalaryService salaryService;

    @PostMapping("/ceo")
    public ResponseEntity<ResultDto> getCeoSalary(@RequestBody InputDto inputDto){
        int basicSalary = salaryService.getGajiCeo();
        InputDto allowance = allowanceService.getAllowCeo(inputDto);
        ResultDto resultDto = new ResultDto(inputDto, allowance , basicSalary);
        return ResponseEntity.ok().body(resultDto);
    }
    @PostMapping("/manager")
    public ResponseEntity<ResultDto> getManagerSalary(@RequestBody InputDto inputDto){
        int basicSalary = salaryService.getGajiManajer();
        InputDto allowance = allowanceService.getAllManajer(inputDto);
        ResultDto resultDto = new ResultDto(inputDto, allowance , basicSalary);
        return ResponseEntity.ok().body(resultDto);
    }
    @GetMapping("senioremp/{family}/{overtime}")
    public ResponseEntity<ResultDto> getSeniorEmp(@PathVariable("family") int family, @PathVariable("overtime") int overtime){
        InputDto inputDto = new InputDto(family, overtime);
        int basicSalary = salaryService.getGajiKarySenior();
        InputDto allowance = allowanceService.getAllKarySenior(inputDto);
        ResultDto resultDto = new ResultDto(inputDto, allowance , basicSalary);
        return ResponseEntity.ok().body(resultDto);
    }
    @GetMapping("defaultemp/{family}/{overtime}")
    public ResponseEntity<ResultDto> getDefaultEmp(@PathVariable("family") int family, @PathVariable("overtime") int overtime){
        InputDto inputDto = new InputDto(family, overtime);
        int basicSalary = salaryService.getGajiKary();
        InputDto allowance = allowanceService.getAllKary(inputDto);
        ResultDto resultDto = new ResultDto(inputDto, allowance , basicSalary);
        return ResponseEntity.ok().body(resultDto);
    }
}
