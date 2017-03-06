package org.jnosql.book.demo.chapter4;

import org.jnosql.artemis.AttributeConverter;

public class MoneyConverter implements AttributeConverter<Money, String> {


    @Override
    public String convertToDatabaseColumn(Money attribute) {
        return attribute.toString();
    }

    @Override
    public Money convertToEntityAttribute(String dbData) {
        return Money.parse(dbData);
    }
}
