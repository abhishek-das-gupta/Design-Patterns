package patterns.creational.builder;

//The concrete builder for UserWebDTO

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

public class UserWebDTOBuilder implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Address address;
    private UserDTO userWebDTO;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        this.birthDate = date;
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public UserDTO build() {
        String name = StringUtils.join(firstName, " ",  lastName);
        int age = LocalDate.now().getYear() - birthDate.getYear();
        this.userWebDTO = new UserWebDTO(name, address.toString(), Integer.toString(age));
        return this.userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return this.userWebDTO;
    }
}
