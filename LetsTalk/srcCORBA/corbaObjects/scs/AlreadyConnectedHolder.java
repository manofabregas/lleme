package corbaObjects.scs;

/**
 * corbaObjects/scs/AlreadyConnectedHolder.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de
 * 2005 18h26min26s BRST
 */

public final class AlreadyConnectedHolder implements
		org.omg.CORBA.portable.Streamable {
	public corbaObjects.scs.AlreadyConnected value = null;

	public AlreadyConnectedHolder() {
	}

	public AlreadyConnectedHolder(corbaObjects.scs.AlreadyConnected initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = corbaObjects.scs.AlreadyConnectedHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		corbaObjects.scs.AlreadyConnectedHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return corbaObjects.scs.AlreadyConnectedHelper.type();
	}

}
