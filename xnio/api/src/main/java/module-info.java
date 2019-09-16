module xnio.api {
	exports org.xnio;
	exports org.xnio.management;
	exports org.xnio.channels;
	exports org.xnio.fc;
	exports org.xnio.conduits;


	requires java.management;
	requires java.security.sasl;
	requires org.jboss.logging;

	requires java.logging;
	requires java.compiler;

	uses org.xnio.XnioProvider;
}