package com.leroy.practice.stream;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private String name;
    private Integer age;
    private String height;
    private String hobby;


    public static void main(String[] args) {

        List<Student> studentList = Lists.newArrayList();

        studentList.add(Student.builder().name("leroy").age(10).height("110").build());
       // studentList.add(Student.builder().name("leroy").age(11).height("120").build());


       // Map<String, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(Student::getName,Student::getAge));

    }


}
