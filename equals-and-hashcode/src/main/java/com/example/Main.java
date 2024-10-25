package com.example;

import com.example.immutable.lombok.ImmutableEmployeeLombok;
import com.example.detailed.lombok.DetailedEmployeeLombok;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Builder kullanımı
        DetailedEmployeeLombok employee = DetailedEmployeeLombok.builder()
                .id("1")
                .email("john@example.com")
                .name("John Doe")
                .department("IT")
                .salary(50000.0)
                .build();

        // toString() otomatik oluşturuldu
        System.out.println(employee);

        // Immutable örnek
        ImmutableEmployeeLombok immutable = ImmutableEmployeeLombok.builder()
                .id("2")
                .email("jane@example.com")
                .name("Jane Doe")
                .department("HR")
                .build();

        // equals() ve hashCode() kullanımı
        Map<DetailedEmployeeLombok, String> employeeMap = new HashMap<>();
        employeeMap.put(employee, "Senior Developer");

        DetailedEmployeeLombok sameEmployee = DetailedEmployeeLombok.builder()
                .id("1")
                .email("john@example.com")
                .name("John Smith")  // farklı isim
                .department("Dev")   // farklı departman
                .build();

        // true - çünkü equals() sadece id ve email kullanıyor
        System.out.println(employeeMap.containsKey(sameEmployee));
    }
}