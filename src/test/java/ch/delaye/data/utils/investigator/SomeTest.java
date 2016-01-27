package ch.delaye.data.utils.investigator;

import ch.delaye.data.utils.investigator.generators.Generators;
import io.probedock.junitee.annotations.DataGenerator;
import io.probedock.junitee.finder.FinderManager;
import io.probedock.junitee.generator.DataGeneratorManager;
import io.probedock.junitee.utils.EntityManagerHolder;
import javax.persistence.Persistence;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

/**
 *
 * @author Valentin Delaye <valentin.delaye@novaccess.ch>
 */
public class SomeTest {

	@Rule
	public RuleChain chain;

	/**
	 * Data Generator Rule
	 */
	public DataGeneratorManager dataGeneratorManager;
	/**
	 * Finder manager rule
	 */
	public FinderManager finderManager;

	public SomeTest() {
		EntityManagerHolder holder = new EntityManagerHolder(Persistence.createEntityManagerFactory("DB01PU"));
		
		// Add extension
		holder.addFactory("DB02PU", Persistence.createEntityManagerFactory("DB02PU"));
		
		dataGeneratorManager = new DataGeneratorManager(holder);
		finderManager = new FinderManager(holder);
		chain = RuleChain.emptyRuleChain().around(dataGeneratorManager).around(finderManager);
	}

	@Test
	@DataGenerator({Generators.DefaultGenerator.class, Generators.SecondGenerator.class})
	public void aDataGeneratorTest() {
		System.out.println("--- START ---");
		assert (true);
		System.out.println("--- STOP ---");
	}

}
