package com.schoolproject.school.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveUserDto {
     String name;
     String lastName;
     String emailAddress;
     Integer roleId;
}
