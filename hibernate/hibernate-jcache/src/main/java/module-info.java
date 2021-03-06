module org.hibernate.orm.jcache {
	requires org.hibernate.orm.core;
	requires org.hibernate.commons.annotations;
	requires cache.api;


	provides org.hibernate.boot.registry.selector.StrategyRegistrationProvider with org.hibernate.cache.jcache.internal.StrategyRegistrationProviderImpl;
}