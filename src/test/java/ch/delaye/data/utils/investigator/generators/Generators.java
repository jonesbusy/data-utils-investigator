
package ch.delaye.data.utils.investigator.generators;

import ch.delaye.data.utils.investigator.generators.partial.FirstPartialGenerator;
import ch.delaye.data.utils.investigator.generators.partial.SecondPartialGenerator;
import io.probedock.junitee.annotations.EntityManagerName;
import io.probedock.junitee.annotations.InjectDataGenerator;
import io.probedock.junitee.generator.IDataGenerator;

/**
 *
 * @author Valentin Delaye <valentin.delaye@novaccess.ch>
 */
public class Generators {

	public static class DefaultGenerator implements IDataGenerator {

		@InjectDataGenerator
		private FirstPartialGenerator generator;
		
		public void generate() {
			generator.generate();
		}

		public void cleanup() {
			
		}
	
	
	}
	
	@EntityManagerName("DB02PU")
	public static class SecondGenerator implements IDataGenerator {

		@InjectDataGenerator
		private SecondPartialGenerator generator;
		
		public void generate() {
			generator.generate();
		}

		public void cleanup() {
			
		}
	
	
	}

	
}
