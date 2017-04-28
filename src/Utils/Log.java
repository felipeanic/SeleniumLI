package Utils;

import org.apache.log4j.Logger;

public class Log {
	
	// Initialize Log4j logs	 
	public static Logger Log = Logger.getLogger(Log.class.getName());
	 
	// This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
	
	/**
	 * Imprime en el log una etiqueta para identificar el comienzo de un caso de prueba
	 *
	 */
	public static void startTestCase() throws Throwable  {	 		
		Log.info("*************************************************************************************************");	 
		Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+ "Scenario" + "                 $$$$$$$$$$$$$$$$$$$$$$$$$");	  
		Log.info("*************************************************************************************************");	 
	}
	 
	/**
	 * Imprime en el log una etiqueta para identificar el fin de un caso de prueba
	 *
	 */
	 public static void endTestCase() throws Throwable  {	 
		Log.info("XXXXXXXXXXXXXXXXXXXXXXX                 "+ "--END--" + "                 XXXXXXXXXXXXXXXXXXXXXXX");	 
		Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		Log.info("");
	 }
	 
	/**
	* Imprime en el log un texto como tipo Info
	*
	*/
	public static void info(String message) throws Throwable  {	 
		Log.info(message);	 
	}
	
	/**
	* Imprime en el log un texto como tipo Warn
	*
	*/
	public static void warn(String message) throws Throwable  {	 
		Log.warn(message);	 
	}
	
	/**
	* Imprime en el log un texto como tipo Error
	*
	*/
	public static void error(String message) throws Throwable  {	 
		Log.error(message);
	}
	
	/**
	* Imprime en el log un texto como tipo Fatal
	*
	*/
	public static void fatal(String message) throws Throwable  {	 
		Log.fatal(message);	 
	}
	
	/**
	* Imprime en el log un texto como tipo Debug
	*
	*/
	public static void debug(String message) throws Throwable  {	 
		Log.debug(message);	 
	}
}
