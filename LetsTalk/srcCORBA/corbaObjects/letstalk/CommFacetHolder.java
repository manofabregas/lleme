package corbaObjects.letstalk;

/**
 * corbaObjects/letstalk/CommFacetHolder.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from letstalk.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min29s BRST
 */

public final class CommFacetHolder implements org.omg.CORBA.portable.Streamable {
	public corbaObjects.letstalk.CommFacet value = null;

	public CommFacetHolder() {
	}

	public CommFacetHolder(corbaObjects.letstalk.CommFacet initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = corbaObjects.letstalk.CommFacetHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		corbaObjects.letstalk.CommFacetHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return corbaObjects.letstalk.CommFacetHelper.type();
	}

}
