module jboss.logging {
	requires java.logging;
	requires java.xml;
	requires java.desktop;
	requires java.json;
	exports org.jboss.logmanager;
	exports org.jboss.logmanager.config;
	exports org.jboss.logmanager.errormanager;
	exports org.jboss.logmanager.filters;
	exports org.jboss.logmanager.formatters;
	exports org.jboss.logmanager.handlers;
	exports org.jboss.logging;
	exports org.jboss.logging.annotations;

	provides java.util.logging.LogManager with org.jboss.logmanager.LogManager;
}