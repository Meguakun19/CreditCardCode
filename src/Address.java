public class Address {
    /**
     * This class defines an address using a street,city, state, and zipcode.
     */

    // The street number and name
    String street;
    // The city in which the address is located
    String city;
    // The state in which the address is located
    String state;
    // The zip code associated with the city and street
    String zip;


    /**
     Constructor
     @param road    Describes the street number and name.
     @param town    Describes the city.
     @param st      Describes the state.
     @param zipCode Describes the zip code.
     */

    public Address(String road, String town, String st, String zipCode) {
        String street = road;
        String city = town;
        String state = st;
        String zip = zipCode;
    }


    /**
     The toString method
     @return Information about the address.
     */
    public String toString()
    {
        return (street + ", " + city + ", " + state + " " + zip);
    }

}