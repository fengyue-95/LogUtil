package com.github.autolog.methodParamLog.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author fengyue
 * @date 2021/5/21
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodParamLog {

    /**
     * 统计方法耗时
     * @return
     */
    boolean countExecuteTime() default false;
}
