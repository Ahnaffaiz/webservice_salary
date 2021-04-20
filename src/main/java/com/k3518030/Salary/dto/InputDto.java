package com.k3518030.Salary.dto;

public class InputDto {
    private int family;
    private int overtime;

    public int getFamily() {
        return family;
    }

    public InputDto(int family, int overtime) {
        this.family = family;
        this.overtime = overtime;
    }

    public void setFamily(int family) {
        this.family = family;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }
}
