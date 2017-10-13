package softeng3.StudentRegisrationSystem;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class StudentNameTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Student s1 = new Student("John", "Smith", 21, 13350761, new LocalDate(1995,04,12));
		assertEquals("JohnSmith21", s1.getUsername());
	}

}
