package com.khy.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "peoples")
public class Peoples {
//    peoples:
//    myname: "khy"
//    myage: 22

    private String myname;
    private Integer myage;


}
