package org.checkerframework.dataflow.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@code Pure} is a method annotation that means both {@link org.checkerframework.dataflow.qual.SideEffectFree} and {@link
 * org.checkerframework.dataflow.qual.Deterministic}. The more important of these, when performing pluggable type-checking, is usually
 * {@link org.checkerframework.dataflow.qual.SideEffectFree}.
 *
 * @checker_framework.manual #type-refinement-purity Side effects, determinism, purity, and
 *     flow-sensitive analysis
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface Pure {
    /** The type of purity. */
    public static enum Kind {
        /** The method has no visible side effects. */
        SIDE_EFFECT_FREE,

        /** The method returns exactly the same value when called in the same environment. */
        DETERMINISTIC
    }
}
