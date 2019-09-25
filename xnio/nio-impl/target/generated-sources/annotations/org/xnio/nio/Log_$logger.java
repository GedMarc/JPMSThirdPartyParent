package org.xnio.nio;

import java.util.Locale;
import java.io.InterruptedIOException;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.xnio.channels.ReadTimeoutException;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import java.util.concurrent.RejectedExecutionException;
import org.xnio.channels.WriteTimeoutException;
import java.nio.channels.spi.SelectorProvider;
import org.jboss.logging.BasicLogger;
import java.lang.Runnable;
import java.lang.Throwable;
import org.xnio.ClosedWorkerException;
import java.lang.Object;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;


import static org.jboss.logging.Logger.Level.TRACE;
import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2019-09-23T20:29:30+0200")
public class Log_$logger extends DelegatingBasicLogger implements Log, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = Log_$logger.class.getName();
    public Log_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void greeting(final String version) {
        super.log.logf(FQCN, INFO, null, greeting$str(), version);
    }
    protected String greeting$str() {
        return "XNIO NIO Implementation Version %s";
    }
    @Override
    public final void taskFailed(final Runnable command, final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, taskFailed$str(), command);
    }
    protected String taskFailed$str() {
        return "XNIO000011: Task %s failed with an exception";
    }
    protected String parameterOutOfRange$str() {
        return "XNIO000015: Parameter '%s' is out of range";
    }
    @Override
    public final IllegalArgumentException parameterOutOfRange(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), parameterOutOfRange$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String optionOutOfRange$str() {
        return "XNIO000039: Value for option '%s' is out of range";
    }
    @Override
    public final IllegalArgumentException optionOutOfRange(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), optionOutOfRange$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String readTimeout$str() {
        return "XNIO000800: Read timed out";
    }
    @Override
    public final ReadTimeoutException readTimeout() {
        final ReadTimeoutException result = new ReadTimeoutException(String.format(getLoggingLocale(), readTimeout$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String writeTimeout$str() {
        return "XNIO000801: Write timed out";
    }
    @Override
    public final WriteTimeoutException writeTimeout() {
        final WriteTimeoutException result = new WriteTimeoutException(String.format(getLoggingLocale(), writeTimeout$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String interruptedIO$str() {
        return "XNIO000808: I/O operation was interrupted";
    }
    @Override
    public final InterruptedIOException interruptedIO() {
        final InterruptedIOException result = new InterruptedIOException(String.format(getLoggingLocale(), interruptedIO$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final InterruptedIOException interruptedIO(final int bytesTransferred) {
        final InterruptedIOException result = new InterruptedIOException(String.format(getLoggingLocale(), interruptedIO$str()));
        _copyStackTraceMinusOne(result);
        result.bytesTransferred = bytesTransferred;
        return result;
    }
    protected String workerShutDown$str() {
        return "XNIO000815: Worker is shut down";
    }
    @Override
    public final ClosedWorkerException workerShutDown() {
        final ClosedWorkerException result = new ClosedWorkerException(String.format(getLoggingLocale(), workerShutDown$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupported$str() {
        return "XNIO000900: Method '%s' is not supported on this implementation";
    }
    @Override
    public final UnsupportedOperationException unsupported(final String methodName) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), unsupported$str(), methodName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToInvokeFileWatchCallback(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, failedToInvokeFileWatchCallback$str());
    }
    protected String failedToInvokeFileWatchCallback$str() {
        return "XNIO001006: Failed to invoke file watch callback";
    }
    protected String noThreads$str() {
        return "XNIO007000: No threads configured";
    }
    @Override
    public final IllegalArgumentException noThreads() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noThreads$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String balancingTokens$str() {
        return "XNIO007001: Balancing token count must be greater than zero and less than thread count";
    }
    @Override
    public final IllegalArgumentException balancingTokens() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), balancingTokens$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String balancingConnectionCount$str() {
        return "XNIO007002: Balancing connection count must be greater than zero when tokens are used";
    }
    @Override
    public final IllegalArgumentException balancingConnectionCount() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), balancingConnectionCount$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bufferTooLarge$str() {
        return "XNIO007003: Buffer is too large";
    }
    @Override
    public final IllegalArgumentException bufferTooLarge() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), bufferTooLarge$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSelectorProvider$str() {
        return "XNIO007004: No functional selector provider is available";
    }
    @Override
    public final IllegalStateException noSelectorProvider() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noSelectorProvider$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedSelectorOpenProblem$str() {
        return "XNIO007005: Unexpected exception opening a selector";
    }
    @Override
    public final IllegalStateException unexpectedSelectorOpenProblem(final Throwable cause) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedSelectorOpenProblem$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notNioProvider$str() {
        return "XNIO007006: XNIO IO factory is from the wrong provider";
    }
    @Override
    public final IllegalArgumentException notNioProvider() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notNioProvider$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String threadExiting$str() {
        return "XNIO007007: Thread is terminating";
    }
    @Override
    public final RejectedExecutionException threadExiting() {
        final RejectedExecutionException result = new RejectedExecutionException(String.format(getLoggingLocale(), threadExiting$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void selectionError(final IOException e) {
        super.log.logf(FQCN, WARN, null, selectionError$str(), e);
    }
    protected String selectionError$str() {
        return "XNIO008000: Received an I/O error on selection: %s";
    }
    @Override
    public final void selectorProvider(final SelectorProvider provider) {
        if (super.log.isEnabled(TRACE)) {
            final Class<?> providerClass;
            if (provider == null) {
                providerClass = null;
            } else providerClass = provider.getClass();
            super.log.logf(FQCN, TRACE, null, selectorProvider$str(), providerClass);
        }
    }
    protected String selectorProvider$str() {
        return "Starting up with selector provider %s";
    }
    @Override
    public final void selectors(final Object mainSelectorCreator, final Object tempSelectorCreator) {
        super.log.logf(FQCN, TRACE, null, selectors$str(), mainSelectorCreator, tempSelectorCreator);
    }
    protected String selectors$str() {
        return "Using %s for main selectors and %s for temp selectors";
    }
}
