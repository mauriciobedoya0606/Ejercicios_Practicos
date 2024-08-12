package punto1;

import java.util.Objects;

public class PersonaInmutable {

    private final String firstName;

    private final String lastName;

    private final String identificationNumber;

    public PersonaInmutable(String firstName, String lastname, String identificationNumber){
        this.firstName = firstName;
        this.lastName = lastname;
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof  PersonaInmutable)) return false;
        PersonaInmutable personaInmutable = (PersonaInmutable) o;
        return firstName.equals(personaInmutable.firstName) &&
                lastName.equals(personaInmutable.lastName) &&
                identificationNumber.equals(personaInmutable.identificationNumber);
    }

}
