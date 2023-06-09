package io.codelex.custom.randompersongenerator;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

    @Getter
    private String city;
    @Getter @JsonProperty("street_address")
    private String streetAddress;
    @Getter
    private String country;
    @Getter @JsonProperty("zip_code")
    private String zipcode;
}
