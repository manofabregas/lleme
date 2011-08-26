package corbaObjects.scs;

/**
 * corbaObjects/scs/NodeRegisterHelper.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

abstract public class NodeRegisterHelper {
	private static String _id = "IDL:corbaObjects/scs/NodeRegister:1.0";

	public static void insert(org.omg.CORBA.Any a,
			corbaObjects.scs.NodeRegister that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static corbaObjects.scs.NodeRegister extract(org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			__typeCode = org.omg.CORBA.ORB.init().create_interface_tc(
					corbaObjects.scs.NodeRegisterHelper.id(), "NodeRegister");
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static corbaObjects.scs.NodeRegister read(
			org.omg.CORBA.portable.InputStream istream) {
		return narrow(istream.read_Object(_NodeRegisterStub.class));
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			corbaObjects.scs.NodeRegister value) {
		ostream.write_Object(value);
	}

	public static corbaObjects.scs.NodeRegister narrow(org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof corbaObjects.scs.NodeRegister)
			return (corbaObjects.scs.NodeRegister) obj;
		else if (!obj._is_a(id()))
			throw new org.omg.CORBA.BAD_PARAM();
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			corbaObjects.scs._NodeRegisterStub stub = new corbaObjects.scs._NodeRegisterStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

	public static corbaObjects.scs.NodeRegister unchecked_narrow(
			org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof corbaObjects.scs.NodeRegister)
			return (corbaObjects.scs.NodeRegister) obj;
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			corbaObjects.scs._NodeRegisterStub stub = new corbaObjects.scs._NodeRegisterStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

}
