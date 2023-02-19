package com.xiaoliu.support.builderPattern;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@RequiredArgsConstructor(staticName = "of")
public class User3 {
    @NonNull
    private String name;

    private String job;
}