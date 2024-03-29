package corbaObjects.scs;

/**
 * corbaObjects/scs/_SCSStub.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de 2005
 * 18h26min27s BRST
 */

@SuppressWarnings("serial")
public class _SCSStub extends org.omg.CORBA.portable.ObjectImpl implements
		corbaObjects.scs.SCS {

	public corbaObjects.scs.IComponent getIComponent(String className)
			throws corbaObjects.scs.InternalError {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request(
					"getIComponent", true);
			$out.write_string(className);
			$in = _invoke($out);
			corbaObjects.scs.IComponent $result = corbaObjects.scs.IComponentHelper
					.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:corbaObjects/scs/InternalError:1.0"))
				throw corbaObjects.scs.InternalErrorHelper.read($in);
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return getIComponent(className);
		} finally {
			_releaseReply($in);
		}
	} // getIComponent

	public corbaObjects.scs.IComponent releaseIComponent(String className) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request(
					"releaseIComponent", true);
			$out.write_string(className);
			$in = _invoke($out);
			corbaObjects.scs.IComponent $result = corbaObjects.scs.IComponentHelper
					.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return releaseIComponent(className);
		} finally {
			_releaseReply($in);
		}
	} // releaseIComponent

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:corbaObjects/scs/SCS:1.0" };

	public String[] _ids() {
		return __ids.clone();
	}

	private void readObject(java.io.ObjectInputStream s)
			throws java.io.IOException {
		String str = s.readUTF();
		String[] args = null;
		java.util.Properties props = null;
		org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init(args, props)
				.string_to_object(str);
		org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
				._get_delegate();
		_set_delegate(delegate);
	}

	private void writeObject(java.io.ObjectOutputStream s)
			throws java.io.IOException {
		String[] args = null;
		java.util.Properties props = null;
		String str = org.omg.CORBA.ORB.init(args, props).object_to_string(this);
		s.writeUTF(str);
	}
} // class _SCSStub
