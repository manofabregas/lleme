package corbaObjects.scs;

/**
 * corbaObjects/scs/IComponentSeqHolder.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min27s BRST
 */

public final class IComponentSeqHolder implements
		org.omg.CORBA.portable.Streamable {
	public corbaObjects.scs.IComponent value[] = null;

	public IComponentSeqHolder() {
	}

	public IComponentSeqHolder(corbaObjects.scs.IComponent[] initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = corbaObjects.scs.IComponentSeqHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		corbaObjects.scs.IComponentSeqHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return corbaObjects.scs.IComponentSeqHelper.type();
	}

}