package io.codelex.custom.randompersongenerator;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    @Getter @JsonProperty("first_name")
    private String firstName;
    @Getter @JsonProperty("last_name")
    private String lastName;
    @Getter
    private String username;
    @Getter
    private String email;
    @Getter @JsonProperty("social_insurance_number")
    private String id;
    @Getter @JsonProperty("phone_number")
    private String phoneNumber;
    @Getter @JsonProperty("date_of_birth")
    private String dateOfBirth;
    @Getter
    private Address address;
}
