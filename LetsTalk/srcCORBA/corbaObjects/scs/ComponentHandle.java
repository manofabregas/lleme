package corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentHandle.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from deployment.idl Sexta-feira, 9 de Dezembro de
 * 2005 18h26min28s BRST
 */

@SuppressWarnings("serial")
public final class ComponentHandle implements org.omg.CORBA.portable.IDLEntity {
	public corbaObjects.scs.IComponent cmp = null;

	public corbaObjects.scs.ComponentId id = null;

	public int instance_id = 0;

	public ComponentHandle() {
	} // ctor

	public ComponentHandle(corbaObjects.scs.IComponent _cmp,
			corbaObjects.scs.ComponentId _id, int _instance_id) {
		cmp = _cmp;
		id = _id;
		instance_id = _instance_id;
	} // ctor

} // class ComponentHandle