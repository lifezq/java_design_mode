package com.yql.design.template;

import com.yql.design.template.impl.Student;
import com.yql.design.template.impl.Teacher;
import org.junit.jupiter.api.Test;

/**
 * @Package com.yql.design.template
 * @ClassName TemplateTest
 * @Description TODO
 * @Author lifez
 * @Date 2022/8/14
 */
public class TemplateTest {
    @Test
    public void testTemplate() {
        Student student = new Student();
        student.prepareGotoSchool();

        Teacher teacher = new Teacher();
        teacher.prepareGotoSchool();
    }
}
