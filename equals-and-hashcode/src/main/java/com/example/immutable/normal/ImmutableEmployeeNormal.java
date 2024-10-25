package com.example.immutable.normal;

import java.util.Objects;

public final class ImmutableEmployeeNormal {
    private final String id;
    private final String email;
    private final String name;
    private final String department;

    public ImmutableEmployeeNormal(String id, String email, String name, String department) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableEmployeeNormal that = (ImmutableEmployeeNormal) o;
        return Objects.equals(id, that.id) && Objects.equals(email, that.email) && Objects.equals(name, that.name) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, name, department);
    }

    @Override
    public String toString() {
        return "ImmutableEmployeeNormal{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}