package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.QuadrantIsPresent;
import junit.QuadrantIsUnique;

@RunWith(Suite.class)
@SuiteClasses({ 
	QuadrantIsPresent.class,
	QuadrantIsUnique.class
	
	})

public class AllTests {

}