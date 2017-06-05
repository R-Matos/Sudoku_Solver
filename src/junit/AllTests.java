package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.QuadrantIsPresent;
import junit.QuadrantIsUnique;
import junit.ColumnIsPresent;
import junit.ColumnIsUnique;

@RunWith(Suite.class)
@SuiteClasses({ 
	QuadrantIsPresent.class,
	QuadrantIsUnique.class,
	ColumnIsPresent.class,
	ColumnIsUnique.class
	
	})

public class AllTests {

}