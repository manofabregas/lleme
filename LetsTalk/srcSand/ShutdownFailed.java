/**
 * ShutdownFailed.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from scs.idl Friday, December 9, 2005 9:35:21 PM GMT
 */

public final class ShutdownFailed extends org.omg.CORBA.UserException {

	public ShutdownFailed() {
		super(ShutdownFailedHelper.id());
	} // ctor

	public ShutdownFailed(String $reason) {
		super(ShutdownFailedHelper.id() + "  " + $reason);
	} // ctor

} // class ShutdownFailed
