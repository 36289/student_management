package student.com.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import student.com.enums.Gender;

@Converter
public class GenderConverter implements AttributeConverter<Gender, String> {

    @Override
    public String convertToDatabaseColumn(Gender attribute) {
        return attribute.getDbValue();
    }

    @Override
    public Gender convertToEntityAttribute(String dbData) {
        return (Gender) Gender.getGenderByValue(dbData).orElse(Gender.BOY);
    }
}
