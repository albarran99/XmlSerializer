package org.iesfm.serializer.address;

import org.iesfm.serializer.XmlSerializer;

public class AddressSerializer implements XmlSerializer<Address> {
    @Override
    public String toXml(Address object) {

        String streetElement = "<street>" + object.getStreet() + "</street>";
        String numbreElement = "<number>" + object.getNumber() + "</number>";
        String doorElement = "<door>" + object.getDoor() + "</door>";
        String cityElemnet = "<city>" + object.getCity() + "</city>";

        String addressElement = "<address>" + streetElement + numbreElement + doorElement + cityElemnet + "</address>";

        return addressElement;
    }
}
