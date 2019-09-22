package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.PolymorphicQualifier;

/**
 * A polymorphic qualifier for the Map Key (@KeyFor) type system.
 *
 * <p>Any method written using {@code @PolyKeyFor} conceptually has an arbitrary number of versions:
 * one in which every instance of {@code @PolyKeyFor} has been replaced by {@code @}{@link
 * org.checkerframework.checker.nullness.qual.UnknownKeyFor}, one in which every instance of {@code @}{@link org.checkerframework.checker.nullness.qual.PolyKeyFor} has been replaced by
 * {@code @}{@link org.checkerframework.checker.nullness.qual.KeyForBottom}, and ones in which every instance of {@code @PolyKeyFor} has been
 * replaced by {@code @}{@code KeyFor}, for every possible combination of map arguments.
 *
 * @checker_framework.manual #nullness-checker Nullness Checker
 * @checker_framework.manual #qualifier-polymorphism Qualifier polymorphism
 */
@Documented
@PolymorphicQualifier(UnknownKeyFor.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface PolyKeyFor {}
