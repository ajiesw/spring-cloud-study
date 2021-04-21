package com.kuer.study.springcloud.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * /@Accessors(chain = true)开启链式写法
 * @author kuer
 */
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long id;

    private String dName;

    private String dbSource;
}
