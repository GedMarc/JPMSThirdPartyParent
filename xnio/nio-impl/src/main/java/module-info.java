module xnio {
	requires xnio.api;
	requires org.jboss.logging;
	requires java.compiler;

	provides org.xnio.XnioProvider with org.xnio.nio.NioXnioProvider;
}