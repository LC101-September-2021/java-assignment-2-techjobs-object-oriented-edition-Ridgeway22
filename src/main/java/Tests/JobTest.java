package Tests;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1Test;
    Job job2Test;

    @Before
    public void setUp() {
        job1Test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2Test = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
    }

    @Test
    public void testSettingJobId() {

        assertTrue(job1Test.getId() == 1);
        assertTrue(job2Test.getId() == 2);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        //assertTrue(job1Test.Job() instanceof Job);
        assertTrue(job1Test.getEmployer() instanceof Employer);
        assertTrue(job1Test.getLocation() instanceof Location);
        assertTrue(job1Test.getPositionType() instanceof PositionType);
        assertTrue(job1Test.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(job1Test.equals(job2Test));
    }
}