package corbaObjects.scs;

/**
 * corbaObjects/scs/NodeRegisterHolder.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

public final class NodeRegisterHolder implements
		org.omg.CORBA.portable.Streamable {
	public corbaObjects.scs.NodeRegister value = null;

	public NodeRegisterHolder() {
	}

	public NodeRegisterHolder(corbaObjects.scs.NodeRegister initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = corbaObjects.scs.NodeRegisterHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		corbaObjects.scs.NodeRegisterHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return corbaObjects.scs.NodeRegisterHelper.type();
	}

}
