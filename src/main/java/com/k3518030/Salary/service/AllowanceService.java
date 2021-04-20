package com.k3518030.Salary.service;

import com.k3518030.Salary.dto.InputDto;
import org.springframework.stereotype.Service;

@Service
public class AllowanceService {
    private int alFamily = 30;
    private int overCeo = 20;
    private int overManajer = 10;
    private int overKarySenior = 5;
    private int overKary = 4;

    public InputDto getAllowCeo(InputDto inputDto) {
        InputDto resultAllowance = new InputDto(inputDto.getFamily() * this.alFamily, inputDto.getOvertime() * this.overCeo);
        return resultAllowance;
    }

    public InputDto getAllManajer(InputDto inputDto) {
        InputDto resultAllowance = new InputDto(inputDto.getFamily() * this.alFamily, inputDto.getOvertime() * this.overManajer);
        return resultAllowance;
    }

    public InputDto getAllKarySenior(InputDto inputDto) {
        InputDto resultAllowance = new InputDto(inputDto.getFamily() * this.alFamily, inputDto.getOvertime() * this.overKarySenior);
        return resultAllowance;
    }

    public InputDto getAllKary(InputDto inputDto) {
        InputDto resultAllowance = new InputDto(inputDto.getFamily() * this.alFamily, inputDto.getOvertime() * this.overKary);
        return resultAllowance;
    }
}
