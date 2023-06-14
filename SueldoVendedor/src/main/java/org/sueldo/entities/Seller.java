package org.sueldo.entities;

import java.util.Date;

public class Seller {
    private String name;
    private String lastName;
    private Integer dni;
    private double minimunWage;
    private double commission;
    private double monthlySalary;
    private Date dateOfAdmission;

    public Seller(String name, String lastName, Integer dni, double minimunWage, double commission, double monthlySalary, Date dateOfAdmission) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.minimunWage = minimunWage;
        this.commission = commission;
        this.monthlySalary = monthlySalary;
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public double getMinimunWage() {
        return minimunWage;
    }

    public void setMinimunWage(double minimunWage) {
        this.minimunWage = minimunWage;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni=" + dni +
                ", minimunWage=" + minimunWage +
                ", commission=" + commission +
                ", monthlySalary=" + monthlySalary +
                ", dateOfAdmission=" + dateOfAdmission +
                '}';
    }
}
