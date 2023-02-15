/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2023. gada 15. febr. 10:38:31               ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob TrainingOldCartRemovalJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingOldCartRemovalJob extends CronJob
{
	/** Qualifier of the <code>TrainingOldCartRemovalJob.hours</code> attribute **/
	public static final String HOURS = "hours";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HOURS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingOldCartRemovalJob.hours</code> attribute.
	 * @return the hours
	 */
	public Integer getHours(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, HOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingOldCartRemovalJob.hours</code> attribute.
	 * @return the hours
	 */
	public Integer getHours()
	{
		return getHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingOldCartRemovalJob.hours</code> attribute. 
	 * @return the hours
	 */
	public int getHoursAsPrimitive(final SessionContext ctx)
	{
		Integer value = getHours( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingOldCartRemovalJob.hours</code> attribute. 
	 * @return the hours
	 */
	public int getHoursAsPrimitive()
	{
		return getHoursAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingOldCartRemovalJob.hours</code> attribute. 
	 * @param value the hours
	 */
	public void setHours(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, HOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingOldCartRemovalJob.hours</code> attribute. 
	 * @param value the hours
	 */
	public void setHours(final Integer value)
	{
		setHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingOldCartRemovalJob.hours</code> attribute. 
	 * @param value the hours
	 */
	public void setHours(final SessionContext ctx, final int value)
	{
		setHours( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingOldCartRemovalJob.hours</code> attribute. 
	 * @param value the hours
	 */
	public void setHours(final int value)
	{
		setHours( getSession().getSessionContext(), value );
	}
	
}
