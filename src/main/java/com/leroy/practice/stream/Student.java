package com.leroy.practice.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2020年03月09日 10:03
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private String name;
    private Integer age;
    private String height;
    private String hobby;


}
