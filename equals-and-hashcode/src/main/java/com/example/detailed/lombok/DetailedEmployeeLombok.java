package com.example.detailed.lombok;

import lombok.*;

// Daha detaylı örnek
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class DetailedEmployeeLombok {
    @EqualsAndHashCode.Include
    private final String id;

    @EqualsAndHashCode.Include
    private final String email;

    private String name;
    private String department;
    private Double salary;

    @ToString.Exclude
    private String sensitiveData;
}