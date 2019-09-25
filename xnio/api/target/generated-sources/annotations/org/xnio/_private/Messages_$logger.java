package org.xnio._private;

import java.util.Locale;
import java.nio.ReadOnlyBufferException;
import java.lang.IllegalStateException;
import java.io.InterruptedIOException;
import java.io.Serializable;
import org.xnio.channels.ConcurrentStreamChannelAccessException;
import org.jboss.logging.DelegatingBasicLogger;
import org.xnio.channels.ReadTimeoutException;
import java.lang.String;
import org.jboss.logging.Logger;
import javax.security.sasl.SaslException;
import org.xnio.channels.WriteTimeoutException;
import org.jboss.logging.BasicLogger;
import java.io.EOFException;
import java.lang.ClassLoader;
import java.nio.BufferOverflowException;
import org.xnio.channels.FixedLengthUnderflowException;
import java.lang.ClassNotFoundException;
import java.lang.IllegalArgumentException;
import java.nio.BufferUnderflowException;
import org.xnio.channels.FixedLengthOverflowException;
import java.lang.UnsupportedOperationException;
import org.xnio.IoFuture.Notifier;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLEngineResult.Status;
import javax.annotation.processing.Generated;
import java.nio.channels.Channel;
import java.lang.SecurityException;
import java.io.IOException;
import java.io.CharConversionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.CancellationException;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import java.util.Arrays;
import org.xnio.channels.AcceptingChannel;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;


import static org.jboss.logging.Logger.Level.TRACE;
import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2019-09-25T02:26:06+0200")
public class Messages_$logger extends DelegatingBasicLogger implements Messages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = Messages_$logger.class.getName();
    public Messages_$logger(final Logger log) {
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
        return "XNIO version %s";
    }
    protected String nullParameter$str() {
        return "Method parameter '%s' cannot be null";
    }
    @Override
    public final IllegalArgumentException nullParameter(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullParameter$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String minRange$str() {
        return "XNIO000001: Method parameter '%s' must be greater than %d";
    }
    @Override
    public final IllegalArgumentException minRange(final String paramName, final int minimumValue) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), minRange$str(), paramName, minimumValue));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badSockType$str() {
        return "XNIO000002: Unsupported socket address %s";
    }
    @Override
    public final IllegalArgumentException badSockType(final Class<? extends java.net.SocketAddress> type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), badSockType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullArrayIndex$str() {
        return "XNIO000003: Method parameter '%s' contains disallowed null value at index %d";
    }
    @Override
    public final IllegalArgumentException nullArrayIndex(final String paramName, final int index) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullArrayIndex$str(), paramName, index));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mismatchSockType$str() {
        return "XNIO000004: Bind address %s is not the same type as destination address %s";
    }
    @Override
    public final IllegalArgumentException mismatchSockType(final Class<? extends java.net.SocketAddress> bindType, final Class<? extends java.net.SocketAddress> destType) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), mismatchSockType$str(), bindType, destType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noField$str() {
        return "XNIO000005: No such field named \"%s\" in %s";
    }
    @Override
    public final IllegalArgumentException noField(final String fieldName, final Class<?> clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noField$str(), fieldName, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String optionClassNotFound$str() {
        return "XNIO000006: Class \"%s\" not found in %s";
    }
    @Override
    public final IllegalArgumentException optionClassNotFound(final String className, final ClassLoader classLoader) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), optionClassNotFound$str(), className, classLoader));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fieldNotAccessible$str() {
        return "XNIO000007: Field named \"%s\" is not accessible (public) in %s";
    }
    @Override
    public final IllegalArgumentException fieldNotAccessible(final String fieldName, final Class<?> clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), fieldNotAccessible$str(), fieldName, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fieldNotStatic$str() {
        return "XNIO000008: Field named \"%s\" is not static in %s";
    }
    @Override
    public final IllegalArgumentException fieldNotStatic(final String fieldName, final Class<?> clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), fieldNotStatic$str(), fieldName, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String copyNegative$str() {
        return "XNIO000009: Copy with negative count is not supported";
    }
    @Override
    public final UnsupportedOperationException copyNegative() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), copyNegative$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void invalidOptionInProperty(final String optionName, final String name, final Throwable problem) {
        super.log.logf(FQCN, WARN, null, invalidOptionInProperty$str(), optionName, name, problem);
    }
    protected String invalidOptionInProperty$str() {
        return "XNIO000010: Invalid option '%s' in property '%s': %s";
    }
    protected String readOnlyBuffer$str() {
        return "XNIO000012: Attempt to write to a read-only buffer";
    }
    @Override
    public final ReadOnlyBufferException readOnlyBuffer() {
        final ReadOnlyBufferException result = new ReadOnlyBufferException();
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bufferUnderflow$str() {
        return "XNIO000013: Buffer underflow";
    }
    @Override
    public final BufferUnderflowException bufferUnderflow() {
        final BufferUnderflowException result = new BufferUnderflowException();
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bufferOverflow$str() {
        return "XNIO000014: Buffer overflow";
    }
    @Override
    public final BufferOverflowException bufferOverflow() {
        final BufferOverflowException result = new BufferOverflowException();
        _copyStackTraceMinusOne(result);
        return result;
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
    protected String mixedDirectAndHeap$str() {
        return "XNIO000016: Mixed direct and heap buffers not allowed";
    }
    @Override
    public final IllegalArgumentException mixedDirectAndHeap() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), mixedDirectAndHeap$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bufferFreed$str() {
        return "XNIO000017: Buffer was already freed";
    }
    @Override
    public final IllegalStateException bufferFreed() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), bufferFreed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String randomWrongThread$str() {
        return "XNIO000018: Access a thread-local random from the wrong thread";
    }
    @Override
    public final IllegalStateException randomWrongThread() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), randomWrongThread$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String channelNotAvailable$str() {
        return "XNIO000019: Channel not available from connection";
    }
    @Override
    public final IllegalStateException channelNotAvailable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), channelNotAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noOptionParser$str() {
        return "XNIO000020: No parser for this option value type";
    }
    @Override
    public final IllegalArgumentException noOptionParser() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noOptionParser$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidOptionPropertyFormat$str() {
        return "XNIO000021: Invalid format for property value '%s'";
    }
    @Override
    public final IllegalArgumentException invalidOptionPropertyFormat(final String value) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidOptionPropertyFormat$str(), value));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String classNotFound$str() {
        return "XNIO000022: Class %s not found";
    }
    @Override
    public final IllegalArgumentException classNotFound(final String name, final ClassNotFoundException cause) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), classNotFound$str(), name), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String classNotInstance$str() {
        return "XNIO000023: Class %s is not an instance of %s";
    }
    @Override
    public final IllegalArgumentException classNotInstance(final String name, final Class<?> expectedType) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), classNotInstance$str(), name, expectedType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidOptionName$str() {
        return "XNIO000024: Invalid option name '%s'";
    }
    @Override
    public final IllegalArgumentException invalidOptionName(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidOptionName$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidNullOption$str() {
        return "XNIO000025: Invalid null option '%s'";
    }
    @Override
    public final IllegalArgumentException invalidNullOption(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidNullOption$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String readAppendNotSupported$str() {
        return "XNIO000026: Read with append is not supported";
    }
    @Override
    public final IOException readAppendNotSupported() {
        final IOException result = new IOException(String.format(getLoggingLocale(), readAppendNotSupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String openModeRequires7$str() {
        return "XNIO000027: Requested file open mode requires Java 7 or higher";
    }
    @Override
    public final IOException openModeRequires7() {
        final IOException result = new IOException(String.format(getLoggingLocale(), openModeRequires7$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String xnioThreadRequired$str() {
        return "XNIO000028: Current thread is not an XNIO I/O thread";
    }
    @Override
    public final IllegalStateException xnioThreadRequired() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), xnioThreadRequired$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badCompressionFormat$str() {
        return "XNIO000029: Compression format not supported";
    }
    @Override
    public final IllegalArgumentException badCompressionFormat() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), badCompressionFormat$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String differentWorkers$str() {
        return "XNIO000030: Both channels must come from the same worker";
    }
    @Override
    public final IllegalArgumentException differentWorkers() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), differentWorkers$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String oneChannelMustBeConnection$str() {
        return "XNIO000031: At least one channel must have a connection";
    }
    @Override
    public final IllegalArgumentException oneChannelMustBeConnection() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), oneChannelMustBeConnection$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String oneChannelMustBeSSL$str() {
        return "XNIO000032: At least one channel must be an SSL channel";
    }
    @Override
    public final IllegalArgumentException oneChannelMustBeSSL() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), oneChannelMustBeSSL$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidQop$str() {
        return "XNIO000033: '%s' is not a valid QOP value";
    }
    @Override
    public final IllegalArgumentException invalidQop(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidQop$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cantInstantiate$str() {
        return "XNIO000034: Failed to instantiate %s";
    }
    @Override
    public final IllegalArgumentException cantInstantiate(final Class<?> clazz, final Throwable cause) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cantInstantiate$str(), clazz), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String concurrentAccess$str() {
        return "XNIO000035: Stream channel was accessed concurrently";
    }
    @Override
    public final ConcurrentStreamChannelAccessException concurrentAccess() {
        final ConcurrentStreamChannelAccessException result = new ConcurrentStreamChannelAccessException(String.format(getLoggingLocale(), concurrentAccess$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String malformedInput$str() {
        return "XNIO000036: Malformed input";
    }
    @Override
    public final CharConversionException malformedInput() {
        final CharConversionException result = new CharConversionException(String.format(getLoggingLocale(), malformedInput$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unmappableCharacter$str() {
        return "XNIO000037: Unmappable character";
    }
    @Override
    public final CharConversionException unmappableCharacter() {
        final CharConversionException result = new CharConversionException(String.format(getLoggingLocale(), unmappableCharacter$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String characterDecodingProblem$str() {
        return "XNIO000038: Character decoding problem";
    }
    @Override
    public final CharConversionException characterDecodingProblem() {
        final CharConversionException result = new CharConversionException(String.format(getLoggingLocale(), characterDecodingProblem$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingSslProvider$str() {
        return "XNIO000100: 'https' URL scheme chosen but no SSL provider given";
    }
    @Override
    public final IllegalArgumentException missingSslProvider() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), missingSslProvider$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidURLScheme$str() {
        return "XNIO000101: Unknown URL scheme '%s' given; must be one of 'http' or 'https'";
    }
    @Override
    public final IllegalArgumentException invalidURLScheme(final String scheme) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidURLScheme$str(), scheme));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String extraChallenge$str() {
        return "XNIO000200: Unexpected extra SASL challenge data received";
    }
    @Override
    public final SaslException extraChallenge() {
        final SaslException result = new SaslException(String.format(getLoggingLocale(), extraChallenge$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String extraResponse$str() {
        return "XNIO000201: Unexpected extra SASL response data received";
    }
    @Override
    public final SaslException extraResponse() {
        final SaslException result = new SaslException(String.format(getLoggingLocale(), extraResponse$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String socketBufferTooSmall$str() {
        return "XNIO000300: Socket buffer is too small";
    }
    @Override
    public final IllegalArgumentException socketBufferTooSmall() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), socketBufferTooSmall$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String appBufferTooSmall$str() {
        return "XNIO000301: Application buffer is too small";
    }
    @Override
    public final IllegalArgumentException appBufferTooSmall() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), appBufferTooSmall$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wrongBufferExpansion$str() {
        return "XNIO000302: SSLEngine required a bigger send buffer but our buffer was already big enough";
    }
    @Override
    public final IOException wrongBufferExpansion() {
        final IOException result = new IOException(String.format(getLoggingLocale(), wrongBufferExpansion$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedWrapResult$str() {
        return "XNIO000303: Unexpected wrap result status: %s";
    }
    @Override
    public final IOException unexpectedWrapResult(final Status status) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unexpectedWrapResult$str(), status));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedHandshakeStatus$str() {
        return "XNIO000304: Unexpected handshake status: %s";
    }
    @Override
    public final IOException unexpectedHandshakeStatus(final HandshakeStatus status) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unexpectedHandshakeStatus$str(), status));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedUnwrapResult$str() {
        return "XNIO000305: Unexpected unwrap result status: %s";
    }
    @Override
    public final IOException unexpectedUnwrapResult(final Status status) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unexpectedUnwrapResult$str(), status));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notFromThisProvider$str() {
        return "XNIO000306: SSL connection is not from this provider";
    }
    @Override
    public final IllegalArgumentException notFromThisProvider() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notFromThisProvider$str()));
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
    protected String fixedOverflow$str() {
        return "XNIO000802: Write past the end of a fixed-length channel";
    }
    @Override
    public final FixedLengthOverflowException fixedOverflow() {
        final FixedLengthOverflowException result = new FixedLengthOverflowException(String.format(getLoggingLocale(), fixedOverflow$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fixedUnderflow$str() {
        return "XNIO000803: Close before all bytes were written to a fixed-length channel (%d bytes remaining)";
    }
    @Override
    public final FixedLengthUnderflowException fixedUnderflow(final long remaining) {
        final FixedLengthUnderflowException result = new FixedLengthUnderflowException(String.format(getLoggingLocale(), fixedUnderflow$str(), remaining));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String recvInvalidMsgLength$str() {
        return "XNIO000804: Received an invalid message length of %d";
    }
    @Override
    public final IOException recvInvalidMsgLength(final int length) {
        final IOException result = new IOException(String.format(getLoggingLocale(), recvInvalidMsgLength$str(), length));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String writeShutDown$str() {
        return "XNIO000805: Writes have been shut down";
    }
    @Override
    public final EOFException writeShutDown() {
        final EOFException result = new EOFException(String.format(getLoggingLocale(), writeShutDown$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String txMsgTooLarge$str() {
        return "XNIO000806: Transmitted message is too large";
    }
    @Override
    public final IOException txMsgTooLarge() {
        final IOException result = new IOException(String.format(getLoggingLocale(), txMsgTooLarge$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unflushedData$str() {
        return "XNIO000807: Unflushed data truncated";
    }
    @Override
    public final IOException unflushedData() {
        final IOException result = new IOException(String.format(getLoggingLocale(), unflushedData$str()));
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
    protected String flushSmallBuffer$str() {
        return "XNIO000809: Cannot flush due to insufficient buffer space";
    }
    @Override
    public final IOException flushSmallBuffer() {
        final IOException result = new IOException(String.format(getLoggingLocale(), flushSmallBuffer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deflaterState$str() {
        return "XNIO000810: Deflater doesn't need input, but won't produce output";
    }
    @Override
    public final IOException deflaterState() {
        final IOException result = new IOException(String.format(getLoggingLocale(), deflaterState$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String inflaterNeedsDictionary$str() {
        return "XNIO000811: Inflater needs dictionary";
    }
    @Override
    public final IOException inflaterNeedsDictionary() {
        final IOException result = new IOException(String.format(getLoggingLocale(), inflaterNeedsDictionary$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String connectionClosedEarly$str() {
        return "XNIO000812: Connection closed unexpectedly";
    }
    @Override
    public final EOFException connectionClosedEarly() {
        final EOFException result = new EOFException(String.format(getLoggingLocale(), connectionClosedEarly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String streamClosed$str() {
        return "XNIO000813: The stream is closed";
    }
    @Override
    public final IOException streamClosed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), streamClosed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String markNotSet$str() {
        return "XNIO000814: Mark not set";
    }
    @Override
    public final IOException markNotSet() {
        final IOException result = new IOException(String.format(getLoggingLocale(), markNotSet$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String redirect$str() {
        return "XNIO000816: Redirect encountered establishing connection";
    }
    @Override
    public final String redirect() {
        return String.format(getLoggingLocale(), redirect$str());
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
    protected String blockingNotAllowed$str() {
        return "XNIO001000: Blocking I/O is not allowed on the current thread";
    }
    @Override
    public final IllegalStateException blockingNotAllowed() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), blockingNotAllowed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noProviderFound$str() {
        return "XNIO001001: No XNIO provider found";
    }
    @Override
    public final IllegalArgumentException noProviderFound() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noProviderFound$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String opCancelled$str() {
        return "XNIO001002: Operation was cancelled";
    }
    @Override
    public final CancellationException opCancelled() {
        final CancellationException result = new CancellationException(String.format(getLoggingLocale(), opCancelled$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void notifierFailed(final Throwable cause, final Notifier<?, ?> notifier) {
        super.log.logf(FQCN, WARN, cause, notifierFailed$str(), notifier);
    }
    protected String notifierFailed$str() {
        return "XNIO001003: Running IoFuture notifier %s failed";
    }
    protected String opTimedOut$str() {
        return "XNIO001004: Operation timed out";
    }
    @Override
    public final TimeoutException opTimedOut() {
        final TimeoutException result = new TimeoutException(String.format(getLoggingLocale(), opTimedOut$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propReadForbidden$str() {
        return "XNIO001005: Not allowed to read non-XNIO properties";
    }
    @Override
    public final SecurityException propReadForbidden() {
        final SecurityException result = new SecurityException(String.format(getLoggingLocale(), propReadForbidden$str()));
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
    @Override
    public final void listenerException(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, listenerException$str());
    }
    protected String listenerException$str() {
        return "XNIO001007: A channel event listener threw an exception";
    }
    @Override
    public final void exceptionHandlerException(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, exceptionHandlerException$str());
    }
    protected String exceptionHandlerException$str() {
        return "XNIO001008: A channel exception handler threw an exception";
    }
    @Override
    public final void acceptFailed(final AcceptingChannel<? extends org.xnio.channels.ConnectedChannel> channel, final IOException reason) {
        super.log.logf(FQCN, ERROR, null, acceptFailed$str(), channel, reason);
    }
    protected String acceptFailed$str() {
        return "XNIO001009: Failed to accept a connection on %s: %s";
    }
    @Override
    public final void executorSubmitFailed(final RejectedExecutionException cause, final Channel channel) {
        super.log.logf(FQCN, ERROR, null, executorSubmitFailed$str(), cause, channel);
    }
    protected String executorSubmitFailed$str() {
        return "XNIO001010: Failed to submit task to executor: %s (closing %s)";
    }
    @Override
    public final void closingResource(final Object resource) {
        super.log.logf(FQCN, TRACE, null, closingResource$str(), resource);
    }
    protected String closingResource$str() {
        return "Closing resource %s";
    }
    @Override
    public final void resourceCloseFailed(final Throwable cause, final Object resource) {
        super.log.logf(FQCN, TRACE, cause, resourceCloseFailed$str(), resource);
    }
    protected String resourceCloseFailed$str() {
        return "Closing resource %s failed";
    }
    @Override
    public final void resourceReadShutdownFailed(final Throwable cause, final Object resource) {
        super.log.logf(FQCN, TRACE, cause, resourceReadShutdownFailed$str(), resource);
    }
    protected String resourceReadShutdownFailed$str() {
        return "Shutting down reads on %s failed";
    }
}
