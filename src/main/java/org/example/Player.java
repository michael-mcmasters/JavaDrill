package org.example;

import org.example.exceptions.MissedShotException;

import java.math.BigDecimal;

public class Player {

    private String name;
    private Integer number;
    private String position;
    private Double height;
    private Double shootingAverage;
    private BigDecimal salary;

    public void shoot() throws MissedShotException {
        //throw new MissedShotException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getShootingAverage() {
        return shootingAverage;
    }

    public void setShootingAverage(Double shootingAverage) {
        this.shootingAverage = shootingAverage;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
