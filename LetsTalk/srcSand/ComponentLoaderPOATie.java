/**
 * ComponentLoaderPOATie.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from deployment.idl Saturday, December 10, 2005
 * 1:24:06 AM GMT
 */

public class ComponentLoaderPOATie extends ComponentLoaderPOA {

	// Constructors

	public ComponentLoaderPOATie(ComponentLoaderOperations delegate) {
		this._impl = delegate;
	}

	public ComponentLoaderPOATie(ComponentLoaderOperations delegate,
			org.omg.PortableServer.POA poa) {
		this._impl = delegate;
		this._poa = poa;
	}

	public ComponentLoaderOperations _delegate() {
		return this._impl;
	}

	public void _delegate(ComponentLoaderOperations delegate) {
		this._impl = delegate;
	}

	public org.omg.PortableServer.POA _default_POA() {
		if (_poa != null) {
			return _poa;
		} else {
			return super._default_POA();
		}
	}

	public void load(ComponentHandle handle) {
		_impl.load(handle);
	} // load

	public void unload(ComponentHandle handle) {
		_impl.unload(handle);
	} // unload

	private ComponentLoaderOperations _impl;

	private org.omg.PortableServer.POA _poa;

} // class ComponentLoaderPOATie