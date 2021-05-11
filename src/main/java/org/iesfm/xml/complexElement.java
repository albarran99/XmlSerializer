package org.iesfm.xml;

import java.util.List;
import java.util.Objects;

public class complexElement extends XmlElement {
    private List<XmlElement> Elements;

    public complexElement(String tag, List<XmlElement> Elements) {
        super(tag);
        this.Elements = Elements;
    }

    @Override
    public String asString() {
        return null;
    }

    public List<XmlElement> getElements() {
        return Elements;
    }

    public void setElements(List<XmlElement> elements) {
        this.Elements = elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        complexElement that = (complexElement) o;
        return Objects.equals(Elements, that.Elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Elements);
    }

    @Override
    public String toString() {
        return "complexElement{" +
                "listElement=" + Elements +
                '}';
    }
}
