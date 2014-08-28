// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class TimeZone
{
	private final IMendixObject timeZoneMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "System.TimeZone";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Code("Code"),
		Description("Description"),
		RawOffset("RawOffset");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public TimeZone(IContext context)
	{
		this(context, Core.instantiate(context, "System.TimeZone"));
	}

	protected TimeZone(IContext context, IMendixObject timeZoneMendixObject)
	{
		if (timeZoneMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("System.TimeZone", timeZoneMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a System.TimeZone");

		this.timeZoneMendixObject = timeZoneMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new TimeZone(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static system.proxies.TimeZone create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "System.TimeZone");
		return new system.proxies.TimeZone(context, mendixObject);
	}

	/**
	 * @deprecated Use 'TimeZone.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static system.proxies.TimeZone initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return system.proxies.TimeZone.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static system.proxies.TimeZone initialize(IContext context, IMendixObject mendixObject)
	{
		return new system.proxies.TimeZone(context, mendixObject);
	}

	public static system.proxies.TimeZone load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return system.proxies.TimeZone.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.TimeZone> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<system.proxies.TimeZone> result = new java.util.ArrayList<system.proxies.TimeZone>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//System.TimeZone" + xpathConstraint))
			result.add(system.proxies.TimeZone.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Code
	 */
	public final String getCode()
	{
		return getCode(getContext());
	}

	/**
	 * @param context
	 * @return value of Code
	 */
	public final String getCode(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Code.toString());
	}

	/**
	 * Set value of Code
	 * @param code
	 */
	public final void setCode(String code)
	{
		setCode(getContext(), code);
	}

	/**
	 * Set value of Code
	 * @param context
	 * @param code
	 */
	public final void setCode(IContext context, String code)
	{
		getMendixObject().setValue(context, MemberNames.Code.toString(), code);
	}

	/**
	 * @return value of Description
	 */
	public final String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final String getDescription(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(IContext context, String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of RawOffset
	 */
	public final Integer getRawOffset()
	{
		return getRawOffset(getContext());
	}

	/**
	 * @param context
	 * @return value of RawOffset
	 */
	public final Integer getRawOffset(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.RawOffset.toString());
	}

	/**
	 * Set value of RawOffset
	 * @param rawoffset
	 */
	public final void setRawOffset(Integer rawoffset)
	{
		setRawOffset(getContext(), rawoffset);
	}

	/**
	 * Set value of RawOffset
	 * @param context
	 * @param rawoffset
	 */
	public final void setRawOffset(IContext context, Integer rawoffset)
	{
		getMendixObject().setValue(context, MemberNames.RawOffset.toString(), rawoffset);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return timeZoneMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.TimeZone that = (system.proxies.TimeZone) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "System.TimeZone";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
