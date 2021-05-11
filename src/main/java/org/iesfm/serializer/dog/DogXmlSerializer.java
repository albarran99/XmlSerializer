package org.iesfm.serializer.dog;

import org.iesfm.serializer.XmlSerializer;

public class DogXmlSerializer implements XmlSerializer<Dog> {

    final static String NAME_FIELD = "name";
    final static String AGE_FIELD = "age";
    final static String COLOR_FIELD = "color";

    @Override
    public String toXml(Dog object) {
        String dogNameField = "<name>" + object.getName() + "</name>";
        String dogAgeField = "<age>" + object.getAge() + "</age>";
        String dogColorField = "<color>" + object.getColor() + "</color>";

        String dogElemnet = "<dog>" + dogNameField + dogAgeField + dogColorField + "</dog>";

        return dogElemnet;
    }
}
