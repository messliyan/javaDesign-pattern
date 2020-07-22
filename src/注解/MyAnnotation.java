package 注解;

import java.lang.annotation.*;

/**
 * 自定义注解
 * @author Le
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String msg() default "this is myAnnotation"; //default 默认值
}