package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1Test;
    Job job2Test;
    Job job6Test;

    @Before
    public void setUp() {
        job1Test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2Test = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job6Test = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
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
        Job job4Test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //Assert.assertEquals(job1Test.getEmployer(),job4Test.getEmployer());
        Assert.assertFalse(job1Test.equals(job4Test));
        Assert.assertEquals(job1Test.hashCode(), job4Test.hashCode());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        char firstChar = job1Test.toString().charAt(0);
        char lastChar = job1Test.toString().charAt(job1Test.toString().length() - 1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job jobss = new Job("",new Employer (""),new Location( " "),new PositionType( ""), new CoreCompetency(""));
        //String jobString = job.getId(jobss);
        //assertEquals(jobString, jobss.toString());
    }


    }

