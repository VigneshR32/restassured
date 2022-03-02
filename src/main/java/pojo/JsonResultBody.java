package pojo;

import pojo.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@lombok.Data
public class JsonResultBody {
    @NonNull private String status;
    @NonNull private Data data;
}
