package ch.zhaw.iwi.cis.kelvin.framework.service;

import java.util.Set;

import org.reflections.Reflections;

@ServiceRegistryAgent
public class BasicServiceRegistryAgent implements ServiceRegistryAgentInterface
{
	@Override
	public void registerServiceFactories( ServiceRegistry registry )
	{
		Reflections reflections = new Reflections( ".*" );
		Set< Class< ? > > serviceClasses = reflections.getTypesAnnotatedWith( Service.class );
		
		for ( Class< ? > serviceClass : serviceClasses )
		{
			Service service = serviceClass.getAnnotation( Service.class );
			String serviceName = ( service.name().isEmpty() ? serviceClass.getSimpleName() : service.name() );
			registry.registerServiceFactory( serviceName, new BasicServiceFactory( serviceClass ) );
		}
	}
}
