package ch.zhaw.iwi.cis.kelvin.test.server;

import javax.persistence.Entity;

import ch.zhaw.iwi.cis.kelvin.model.PersistentObject;

@Entity
public class TestClassB extends PersistentObject
{
	private static final long	serialVersionUID	= 1L;

	private String				valueOfB;

	public TestClassB()
	{
	}

	public TestClassB( String valueOfB )
	{
		super();
		this.valueOfB = valueOfB;
	}

	public String getValueOfB()
	{
		return valueOfB;
	}

	public void setValueOfB( String valueOfB )
	{
		this.valueOfB = valueOfB;
	}
}
