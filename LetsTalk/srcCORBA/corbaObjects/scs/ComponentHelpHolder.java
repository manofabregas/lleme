package corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentHelpHolder.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

public final class ComponentHelpHolder implements
		org.omg.CORBA.portable.Streamable {
	public corbaObjects.scs.ComponentHelp value = null;

	public ComponentHelpHolder() {
	}

	public ComponentHelpHolder(corbaObjects.scs.ComponentHelp initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = corbaObjects.scs.ComponentHelpHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		corbaObjects.scs.ComponentHelpHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return corbaObjects.scs.ComponentHelpHelper.type();
	}

}
