package singleton;

public class ServerConfiguration {
	private static ServerConfiguration serverConfig = new ServerConfiguration();
	
	/**
	 *  Private constructor
	 */
	private ServerConfiguration(){
		System.out.println("Read the configuration files and populate the configuration object");
	}
	
	/**
	 *	Returns the single instance of the class
	 */
	public static ServerConfiguration getServerConfig() {
		return serverConfig;
	}
}
