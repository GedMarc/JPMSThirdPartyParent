module org.hibernate.commons.annotations {

	requires org.jboss.logging;
	requires java.compiler;

	exports org.hibernate.annotations.common;
	exports org.hibernate.annotations.common.annotationfactory;
	exports org.hibernate.annotations.common.reflection;
	exports org.hibernate.annotations.common.reflection.java;
	exports org.hibernate.annotations.common.util;
	exports org.hibernate.annotations.common.util.impl;


}