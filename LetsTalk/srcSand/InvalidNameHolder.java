/**
 * InvalidNameHolder.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from scs.idl Friday, December 9, 2005 9:35:21 PM GMT
 */

public final class InvalidNameHolder implements
		org.omg.CORBA.portable.Streamable {
	public InvalidName value = null;

	public InvalidNameHolder() {
	}

	public InvalidNameHolder(InvalidName initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = InvalidNameHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		InvalidNameHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return InvalidNameHelper.type();
	}

}
