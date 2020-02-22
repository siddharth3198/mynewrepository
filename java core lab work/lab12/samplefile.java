/**
 * 
 */
/**
 * @author siddh
 *
 */
package lab12;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class samplefile {

	static final Logger log= LogManager.getLogger(samplefile.class.getName());
	
	public static void main(String[] args) throws IOException, SQLException
	
	{
	log.debug("Hello this is a debug message");
	log.info("Hello this is a info meesage");
	log.warn("Sample warn Message");
	log.error("Sample error message");
	log.fatal("Sample fatal message");

	}

}
