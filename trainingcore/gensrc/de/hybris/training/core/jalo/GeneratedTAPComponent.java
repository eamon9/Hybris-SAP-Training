/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2023. gada 2. marts 12:34:42                ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.TAPComponent TAPComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTAPComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>TAPComponent.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>TAPComponent.brandName</code> attribute **/
	public static final String BRANDNAME = "brandName";
	/** Qualifier of the <code>TAPComponent.productImage</code> attribute **/
	public static final String PRODUCTIMAGE = "productImage";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(BRANDNAME, AttributeMode.INITIAL);
		tmp.put(PRODUCTIMAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.brandName</code> attribute.
	 * @return the brandName
	 */
	public String getBrandName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTAPComponent.getBrandName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, BRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.brandName</code> attribute.
	 * @return the brandName
	 */
	public String getBrandName()
	{
		return getBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.brandName</code> attribute. 
	 * @return the localized brandName
	 */
	public Map<Language,String> getAllBrandName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,BRANDNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.brandName</code> attribute. 
	 * @return the localized brandName
	 */
	public Map<Language,String> getAllBrandName()
	{
		return getAllBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setBrandName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTAPComponent.setBrandName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, BRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setBrandName(final String value)
	{
		setBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setAllBrandName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,BRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setAllBrandName(final Map<Language,String> value)
	{
		setAllBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.productImage</code> attribute.
	 * @return the productImage
	 */
	public Media getProductImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, PRODUCTIMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.productImage</code> attribute.
	 * @return the productImage
	 */
	public Media getProductImage()
	{
		return getProductImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.productImage</code> attribute. 
	 * @param value the productImage
	 */
	public void setProductImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, PRODUCTIMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.productImage</code> attribute. 
	 * @param value the productImage
	 */
	public void setProductImage(final Media value)
	{
		setProductImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTAPComponent.getProductName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.productName</code> attribute. 
	 * @return the localized productName
	 */
	public Map<Language,String> getAllProductName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PRODUCTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TAPComponent.productName</code> attribute. 
	 * @return the localized productName
	 */
	public Map<Language,String> getAllProductName()
	{
		return getAllProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTAPComponent.setProductName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final String value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setAllProductName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TAPComponent.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setAllProductName(final Map<Language,String> value)
	{
		setAllProductName( getSession().getSessionContext(), value );
	}
	
}
