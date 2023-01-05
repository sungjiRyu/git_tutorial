package com.greenart.spring_test.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserVO {
    private String id;
    private String pwd;
    private String name;
}
