package org.iesfm.xml;

import java.util.Objects;

public class TextualElement extends XmlElement{
    private String value;

    public TextualElement(String tag, String value) {
        super(tag);
        this.value = value;
    }

    @Override
    public String asString() {
        return "<" + getTagName() + ">" + value + "</" + getTagName() + ">";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextualElement that = (TextualElement) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "TextElement{" +
                "text='" + value + '\'' +
                '}';
    }
}
