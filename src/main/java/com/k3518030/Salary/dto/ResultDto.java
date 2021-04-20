package com.k3518030.Salary.dto;

public class ResultDto {
    private InputDto info;
    private InputDto allowance;
    private Integer basicSalary;

    public ResultDto() {
    }

    public ResultDto(InputDto inputDto, InputDto allowance, Integer result) {
        this.info = inputDto;
        this.allowance = allowance;
        this.basicSalary = result;
    }

    public InputDto getInfo() {
        return info;
    }

    public void setInfo(InputDto inputDto) {
        this.info = inputDto;
    }

    public InputDto getAllowance() {
        return allowance;
    }

    public void setAllowance(InputDto allowance) {
        this.allowance = allowance;
    }

    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Integer result) {
        this.basicSalary = result;
    }
}
