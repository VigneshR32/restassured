package pojo;

import lombok.NoArgsConstructor;
import pojo.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@lombok.Data
public class JsonResultBody {
    @NonNull private String status;
    @NonNull private Data data;
}
