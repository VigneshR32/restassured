package pojo;

import lombok.NoArgsConstructor;
import lombok.NonNull;
@NoArgsConstructor
@lombok.Data
public class Data {
    @NonNull private String name;
    @NonNull private String salary;
    @NonNull private int age;
    @NonNull private int id;
}
