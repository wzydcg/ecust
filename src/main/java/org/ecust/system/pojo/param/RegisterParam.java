package org.ecust.system.pojo.param;

import lombok.Data;

@Data
public class RegisterParam {
    private Long userNumber;
    private String name;
    private String password;
    private Long classId;
    private String sex;
    private Long roleId;
}
