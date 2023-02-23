/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2023. gada 23. febr. 15:41:51               ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Employee Interns}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedInterns extends Employee
{
	/** Qualifier of the <code>Interns.monthAtOrganization</code> attribute **/
	public static final String MONTHATORGANIZATION = "monthAtOrganization";
	/** Qualifier of the <code>Interns.collegeName</code> attribute **/
	public static final String COLLEGENAME = "collegeName";
	/** Qualifier of the <code>Interns.favoritJobPlace</code> attribute **/
	public static final String FAVORITJOBPLACE = "favoritJobPlace";
	/** Qualifier of the <code>Interns.laptopType</code> attribute **/
	public static final String LAPTOPTYPE = "laptopType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Employee.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MONTHATORGANIZATION, AttributeMode.INITIAL);
		tmp.put(COLLEGENAME, AttributeMode.INITIAL);
		tmp.put(FAVORITJOBPLACE, AttributeMode.INITIAL);
		tmp.put(LAPTOPTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.collegeName</code> attribute.
	 * @return the collegeName
	 */
	public String getCollegeName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COLLEGENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.collegeName</code> attribute.
	 * @return the collegeName
	 */
	public String getCollegeName()
	{
		return getCollegeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.collegeName</code> attribute. 
	 * @param value the collegeName
	 */
	public void setCollegeName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COLLEGENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.collegeName</code> attribute. 
	 * @param value the collegeName
	 */
	public void setCollegeName(final String value)
	{
		setCollegeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.favoritJobPlace</code> attribute.
	 * @return the favoritJobPlace
	 */
	public String getFavoritJobPlace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAVORITJOBPLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.favoritJobPlace</code> attribute.
	 * @return the favoritJobPlace
	 */
	public String getFavoritJobPlace()
	{
		return getFavoritJobPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.favoritJobPlace</code> attribute. 
	 * @param value the favoritJobPlace
	 */
	public void setFavoritJobPlace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAVORITJOBPLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.favoritJobPlace</code> attribute. 
	 * @param value the favoritJobPlace
	 */
	public void setFavoritJobPlace(final String value)
	{
		setFavoritJobPlace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.laptopType</code> attribute.
	 * @return the laptopType
	 */
	public String getLaptopType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LAPTOPTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.laptopType</code> attribute.
	 * @return the laptopType
	 */
	public String getLaptopType()
	{
		return getLaptopType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.laptopType</code> attribute. 
	 * @param value the laptopType
	 */
	public void setLaptopType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LAPTOPTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.laptopType</code> attribute. 
	 * @param value the laptopType
	 */
	public void setLaptopType(final String value)
	{
		setLaptopType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.monthAtOrganization</code> attribute.
	 * @return the monthAtOrganization
	 */
	public Integer getMonthAtOrganization(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MONTHATORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.monthAtOrganization</code> attribute.
	 * @return the monthAtOrganization
	 */
	public Integer getMonthAtOrganization()
	{
		return getMonthAtOrganization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.monthAtOrganization</code> attribute. 
	 * @return the monthAtOrganization
	 */
	public int getMonthAtOrganizationAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMonthAtOrganization( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interns.monthAtOrganization</code> attribute. 
	 * @return the monthAtOrganization
	 */
	public int getMonthAtOrganizationAsPrimitive()
	{
		return getMonthAtOrganizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.monthAtOrganization</code> attribute. 
	 * @param value the monthAtOrganization
	 */
	public void setMonthAtOrganization(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MONTHATORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.monthAtOrganization</code> attribute. 
	 * @param value the monthAtOrganization
	 */
	public void setMonthAtOrganization(final Integer value)
	{
		setMonthAtOrganization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.monthAtOrganization</code> attribute. 
	 * @param value the monthAtOrganization
	 */
	public void setMonthAtOrganization(final SessionContext ctx, final int value)
	{
		setMonthAtOrganization( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interns.monthAtOrganization</code> attribute. 
	 * @param value the monthAtOrganization
	 */
	public void setMonthAtOrganization(final int value)
	{
		setMonthAtOrganization( getSession().getSessionContext(), value );
	}
	
}
