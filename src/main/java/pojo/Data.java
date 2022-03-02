package pojo;

import lombok.NonNull;

@lombok.Data
public class Data {
    @NonNull private String name;
    @NonNull private String salary;
    @NonNull private int age;
    @NonNull private int id;
}
