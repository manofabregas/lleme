package corbaObjects.scs;

/**
 * corbaObjects/scs/IComponentOperations.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de
 * 2005 18h26min27s BRST
 */

public interface IComponentOperations {
	org.omg.CORBA.Object getFacet(String facet_interface)
			throws corbaObjects.scs.InvalidName;

	org.omg.CORBA.Object getFacetByName(String facet)
			throws corbaObjects.scs.InvalidName;

	void startup() throws corbaObjects.scs.StartupFailed;

	void shutdown() throws corbaObjects.scs.ShutdownFailed;

	// Receptacle
	int connect(String receptacle, org.omg.CORBA.Object obj)
			throws corbaObjects.scs.InvalidName,
			corbaObjects.scs.InvalidConnection,
			corbaObjects.scs.AlreadyConnected,
			corbaObjects.scs.ExceededConnectionLimit;

	void disconnect(int id) throws corbaObjects.scs.InvalidConnection,
			corbaObjects.scs.NoConnection;

	corbaObjects.scs.ConnectionDescription getConnection(int id)
			throws corbaObjects.scs.InvalidConnection;

	corbaObjects.scs.ConnectionDescription[] getConnections(String receptacle)
			throws corbaObjects.scs.InvalidName;

	// MetaInterface
	corbaObjects.scs.FacetDescription[] getFacets();

	corbaObjects.scs.FacetDescription[] getFacetsByName(String[] names)
			throws corbaObjects.scs.InvalidName;

	corbaObjects.scs.ReceptacleDescription[] getReceptacles();

	corbaObjects.scs.ConnectionDescription[] getReceptacleConnections(
			String receptacle_interface) throws corbaObjects.scs.InvalidName,
			corbaObjects.scs.InvalidConnection,
			corbaObjects.scs.AlreadyConnected,
			corbaObjects.scs.ExceededConnectionLimit,
			corbaObjects.scs.InternalError;

	corbaObjects.scs.ReceptacleDescription[] getReceptaclesByName(String[] names)
			throws corbaObjects.scs.InvalidName;
} // interface IComponentOperations
