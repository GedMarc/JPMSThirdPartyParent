package org.checkerframework.framework.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that this class has been annotated for the given type system. For example,
 * {@code @AnnotatedFor({"nullness", "regex"})} indicates that the class has been annotated with
 * annotations such as {@code } and {@code @Regex}.
 *
 * <p>You should only use this annotation in a partially-annotated library. There is no point to
 * using it in a fully-annotated library nor in an application that does not export APIs for
 * clients.
 *
 * <p>This annotation has no effect unless the {@code -AuseDefaultsForUncheckedCode=source}
 * command-line argument is supplied. Ordinarily, the {@code -AuseDefaultsForUncheckedCode=source}
 * command-line argument causes unannotated locations to be defaulted using unchecked code defaults,
 * and it suppresses all warnings. However, a class with a relevant {@code @AnnotatedFor} annotation
 * is always defaulted normally (typically using the CLIMB-to-top rule), and typechecking warnings
 * are issued.
 *
 * @checker_framework.manual #compiling-libraries Compiling partially-annotated libraries
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PACKAGE})
@Retention(RetentionPolicy.SOURCE)
public @interface AnnotatedFor {
    /**
     * @return the type systems for which the class has been annotated. Legal arguments are any
     *     string that may be passed to the {@code -processor} command-line argument: the
     *     fully-qualified class name for the checker, or a shorthand for built-in checkers. Using
     *     the annotation with no arguments, as in {@code @AnnotatedFor({})}, has no effect.
     * @checker_framework.manual #shorthand-for-checkers Short names for built-in checkers
     */
    String[] value();
}
