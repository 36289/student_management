package student.com.enums;

import java.util.Arrays;
import java.util.Optional;

public enum Gender {
    BOY("boy", "1"),
    GIRL("girl", "2");

    private String detail;
    private String dbValue;

    // 构造函数
    Gender(String detail, String dbValue) {
        this.detail = detail;
        this.dbValue = dbValue;
    }

    // Getter 方法
    public String getDetail() {
        return detail;
    }

    public String getDbValue() {
        return dbValue;
    }

    // 根据 dbValue 获取 Gender
    public static Optional<Gender> getGenderByValue(String dbValue) {
        return Arrays.stream(Gender.values()).filter(g -> g.dbValue.equals(dbValue)).findFirst();
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setDbValue(String dbValue) {
        this.dbValue = dbValue;
    }
}
