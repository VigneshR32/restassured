package pojo;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class JsonBody {

    @NonNull private String name;
    @NonNull private String salary;
    @NonNull private String age;
}
