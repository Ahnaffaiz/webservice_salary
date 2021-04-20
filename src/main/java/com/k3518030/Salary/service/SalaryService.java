package com.k3518030.Salary.service;

import com.k3518030.Salary.dto.InputDto;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {
    private int gaji = 4500;

    public int getGajiCeo() {
        return this.gaji*8;
    }

    public int getGajiManajer(){
        return this.gaji * 3;
    }

    public int getGajiKarySenior(){
        return this.gaji * 2;
    }

    public int getGajiKary(){
        return this.gaji;
    }
}
