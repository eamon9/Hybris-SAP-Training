/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2023. gada 21. febr. 12:09:56               ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Customer MyFirstCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyFirstCustomer extends Customer
{
	/** Qualifier of the <code>MyFirstCustomer.marketingEmailFlag</code> attribute **/
	public static final String MARKETINGEMAILFLAG = "marketingEmailFlag";
	/** Qualifier of the <code>MyFirstCustomer.panNumber</code> attribute **/
	public static final String PANNUMBER = "panNumber";
	/** Qualifier of the <code>MyFirstCustomer.loyaltyCardNumber</code> attribute **/
	public static final String LOYALTYCARDNUMBER = "loyaltyCardNumber";
	/** Qualifier of the <code>MyFirstCustomer.secondaryEmail</code> attribute **/
	public static final String SECONDARYEMAIL = "secondaryEmail";
	/** Qualifier of the <code>MyFirstCustomer.vehicleNumber</code> attribute **/
	public static final String VEHICLENUMBER = "vehicleNumber";
	/** Qualifier of the <code>MyFirstCustomer.channel</code> attribute **/
	public static final String CHANNEL = "channel";
	/** Qualifier of the <code>MyFirstCustomer.vehicleType</code> attribute **/
	public static final String VEHICLETYPE = "vehicleType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MARKETINGEMAILFLAG, AttributeMode.INITIAL);
		tmp.put(PANNUMBER, AttributeMode.INITIAL);
		tmp.put(LOYALTYCARDNUMBER, AttributeMode.INITIAL);
		tmp.put(SECONDARYEMAIL, AttributeMode.INITIAL);
		tmp.put(VEHICLENUMBER, AttributeMode.INITIAL);
		tmp.put(CHANNEL, AttributeMode.INITIAL);
		tmp.put(VEHICLETYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.channel</code> attribute.
	 * @return the channel
	 */
	public EnumerationValue getChannel(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.channel</code> attribute.
	 * @return the channel
	 */
	public EnumerationValue getChannel()
	{
		return getChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.channel</code> attribute. 
	 * @param value the channel
	 */
	public void setChannel(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.channel</code> attribute. 
	 * @param value the channel
	 */
	public void setChannel(final EnumerationValue value)
	{
		setChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.loyaltyCardNumber</code> attribute.
	 * @return the loyaltyCardNumber
	 */
	public Integer getLoyaltyCardNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LOYALTYCARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.loyaltyCardNumber</code> attribute.
	 * @return the loyaltyCardNumber
	 */
	public Integer getLoyaltyCardNumber()
	{
		return getLoyaltyCardNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.loyaltyCardNumber</code> attribute. 
	 * @return the loyaltyCardNumber
	 */
	public int getLoyaltyCardNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLoyaltyCardNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.loyaltyCardNumber</code> attribute. 
	 * @return the loyaltyCardNumber
	 */
	public int getLoyaltyCardNumberAsPrimitive()
	{
		return getLoyaltyCardNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.loyaltyCardNumber</code> attribute. 
	 * @param value the loyaltyCardNumber
	 */
	public void setLoyaltyCardNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LOYALTYCARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.loyaltyCardNumber</code> attribute. 
	 * @param value the loyaltyCardNumber
	 */
	public void setLoyaltyCardNumber(final Integer value)
	{
		setLoyaltyCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.loyaltyCardNumber</code> attribute. 
	 * @param value the loyaltyCardNumber
	 */
	public void setLoyaltyCardNumber(final SessionContext ctx, final int value)
	{
		setLoyaltyCardNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.loyaltyCardNumber</code> attribute. 
	 * @param value the loyaltyCardNumber
	 */
	public void setLoyaltyCardNumber(final int value)
	{
		setLoyaltyCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.marketingEmailFlag</code> attribute.
	 * @return the marketingEmailFlag
	 */
	public Boolean isMarketingEmailFlag(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MARKETINGEMAILFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.marketingEmailFlag</code> attribute.
	 * @return the marketingEmailFlag
	 */
	public Boolean isMarketingEmailFlag()
	{
		return isMarketingEmailFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.marketingEmailFlag</code> attribute. 
	 * @return the marketingEmailFlag
	 */
	public boolean isMarketingEmailFlagAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMarketingEmailFlag( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.marketingEmailFlag</code> attribute. 
	 * @return the marketingEmailFlag
	 */
	public boolean isMarketingEmailFlagAsPrimitive()
	{
		return isMarketingEmailFlagAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.marketingEmailFlag</code> attribute. 
	 * @param value the marketingEmailFlag
	 */
	public void setMarketingEmailFlag(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MARKETINGEMAILFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.marketingEmailFlag</code> attribute. 
	 * @param value the marketingEmailFlag
	 */
	public void setMarketingEmailFlag(final Boolean value)
	{
		setMarketingEmailFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.marketingEmailFlag</code> attribute. 
	 * @param value the marketingEmailFlag
	 */
	public void setMarketingEmailFlag(final SessionContext ctx, final boolean value)
	{
		setMarketingEmailFlag( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.marketingEmailFlag</code> attribute. 
	 * @param value the marketingEmailFlag
	 */
	public void setMarketingEmailFlag(final boolean value)
	{
		setMarketingEmailFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.panNumber</code> attribute.
	 * @return the panNumber
	 */
	public Integer getPanNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PANNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.panNumber</code> attribute.
	 * @return the panNumber
	 */
	public Integer getPanNumber()
	{
		return getPanNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.panNumber</code> attribute. 
	 * @return the panNumber
	 */
	public int getPanNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPanNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.panNumber</code> attribute. 
	 * @return the panNumber
	 */
	public int getPanNumberAsPrimitive()
	{
		return getPanNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.panNumber</code> attribute. 
	 * @param value the panNumber
	 */
	public void setPanNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PANNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.panNumber</code> attribute. 
	 * @param value the panNumber
	 */
	public void setPanNumber(final Integer value)
	{
		setPanNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.panNumber</code> attribute. 
	 * @param value the panNumber
	 */
	public void setPanNumber(final SessionContext ctx, final int value)
	{
		setPanNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.panNumber</code> attribute. 
	 * @param value the panNumber
	 */
	public void setPanNumber(final int value)
	{
		setPanNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.secondaryEmail</code> attribute.
	 * @return the secondaryEmail
	 */
	public String getSecondaryEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SECONDARYEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.secondaryEmail</code> attribute.
	 * @return the secondaryEmail
	 */
	public String getSecondaryEmail()
	{
		return getSecondaryEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.secondaryEmail</code> attribute. 
	 * @param value the secondaryEmail
	 */
	public void setSecondaryEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SECONDARYEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.secondaryEmail</code> attribute. 
	 * @param value the secondaryEmail
	 */
	public void setSecondaryEmail(final String value)
	{
		setSecondaryEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.vehicleNumber</code> attribute.
	 * @return the vehicleNumber
	 */
	public String getVehicleNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VEHICLENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.vehicleNumber</code> attribute.
	 * @return the vehicleNumber
	 */
	public String getVehicleNumber()
	{
		return getVehicleNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.vehicleNumber</code> attribute. 
	 * @param value the vehicleNumber
	 */
	public void setVehicleNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VEHICLENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.vehicleNumber</code> attribute. 
	 * @param value the vehicleNumber
	 */
	public void setVehicleNumber(final String value)
	{
		setVehicleNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public Set<EnumerationValue> getVehicleType(final SessionContext ctx)
	{
		Set<EnumerationValue> coll = (Set<EnumerationValue>)getProperty( ctx, VEHICLETYPE);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyFirstCustomer.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public Set<EnumerationValue> getVehicleType()
	{
		return getVehicleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setProperty(ctx, VEHICLETYPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyFirstCustomer.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final Set<EnumerationValue> value)
	{
		setVehicleType( getSession().getSessionContext(), value );
	}
	
}
