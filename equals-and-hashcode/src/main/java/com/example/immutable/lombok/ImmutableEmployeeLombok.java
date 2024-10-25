package com.example.immutable.lombok;

import lombok.Builder;
import lombok.Value;

@Value(staticConstructor = "of")
@Builder
public class ImmutableEmployeeLombok {
    String id;
    String email;
    String name;
    String department;
}