package org.iesfm.serializer;

public interface XmlSerializer<T> {
    String toXml(T object);
}
