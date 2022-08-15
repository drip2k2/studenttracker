/**
 * @author Subheg Sidhu 100362765
 * @version Java Version 8
 * Date: May 24, 2022
 *
 */

/**
 * An address is a string of variables that can be inputted by the user
 *
 */
public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String province;
    private String postalCode;


    /**
     * Constructs an address object with the following parameters:
     * @param number
     * @param streetName
     * @param cityName
     * @param prov
     * @param postal
     */
    public Address(String number, String streetName, String cityName, String prov, String postal) {

        houseNumber = number;
        street = streetName;
        city = cityName;
        province = prov;
        postalCode = postal;



    }

    /**
     * Returns the address to the user
     * @return Address
     */
    public String getAddress(){

        String address = houseNumber + " " + street + " " + city + ", " + province + " " + postalCode;
        return address;


    }

}
