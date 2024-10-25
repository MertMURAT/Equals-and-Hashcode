package com.example.detailed.normal;

import com.example.detailed.lombok.DetailedEmployeeLombok;

import java.util.Objects;

public class DetailedEmployeeNormal {
    private final String id;
    private final String email;
    private String name;
    private String department;
    private Double salary;
    private String sensitiveData;

    public DetailedEmployeeNormal(String id, String email, String name, String department, Double salary, String sensitiveData) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.sensitiveData = sensitiveData;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setSensitiveData(String sensitiveData) {
        this.sensitiveData = sensitiveData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetailedEmployeeNormal that = (DetailedEmployeeNormal) o;
        return Objects.equals(id, that.id) && Objects.equals(email, that.email) && Objects.equals(name, that.name) && Objects.equals(department, that.department) && Objects.equals(salary, that.salary) && Objects.equals(sensitiveData, that.sensitiveData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, name, department, salary, sensitiveData);
    }

    @Override
    public String toString() {
        return "DetailedEmployeeNormal{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", sensitiveData='" + sensitiveData + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String email;
        private String name;
        private String department;
        private Double salary;
        private String sensitiveData;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder salary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Builder sensitiveData(String sensitiveData) {
            this.sensitiveData = sensitiveData;
            return this;
        }

        public DetailedEmployeeLombok build() {
            return new DetailedEmployeeLombok(id, email, name, department, salary, sensitiveData);
        }
    }
}