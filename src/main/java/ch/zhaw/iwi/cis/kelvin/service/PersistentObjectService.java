package ch.zhaw.iwi.cis.kelvin.service;

import ch.zhaw.iwi.cis.kelvin.model.ObjectID;
import ch.zhaw.iwi.cis.kelvin.model.PersistentObject;

public interface PersistentObjectService extends Service
{
	public < T extends PersistentObject > void persist( T object );
	public < T extends PersistentObject > void remove( T object );
	public < T extends PersistentObject > T findByID( ObjectID id );
}
