/**
 * InternalError.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from scs.idl Friday, December 9, 2005 9:35:21 PM GMT
 */

public final class InternalError extends org.omg.CORBA.UserException {

	public InternalError() {
		super(InternalErrorHelper.id());
	} // ctor

	public InternalError(String $reason) {
		super(InternalErrorHelper.id() + "  " + $reason);
	} // ctor

} // class InternalError
