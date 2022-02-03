package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;


import static org.junit.Assert.assertEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)


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
            Job job8Test = new Job();
            Job job9Test = new Job();

            assertEquals(1, job9Test.getId()-job8Test.getId());

            assertTrue(job8Test.getId()!= job9Test.getId());
            assertFalse(job8Test.getId()== job9Test.getId());

        }
        @Test
        public void testJobConstructorSetsAllFields(){

            Job job7Test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertTrue(job7Test.getName() instanceof String);
            assertTrue(job7Test.getEmployer() instanceof Employer);
            assertTrue(job7Test.getLocation() instanceof Location);
            assertTrue(job7Test.getPositionType() instanceof PositionType);
            assertTrue(job7Test.getCoreCompetency() instanceof CoreCompetency);
            assertEquals("Product tester", job7Test.getName());
            assertEquals( "ACME",job7Test.getEmployer().toString());
            assertEquals( "Desert",job7Test.getLocation().toString());
            assertEquals("Quality control", job7Test.getPositionType().toString());
            assertEquals( "Persistence", job7Test.getCoreCompetency().toString());
        }


        @Test
        public void testJobsForEquality(){
            Job job4Test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            Job job5Test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertEquals(false, job4Test.equals(job5Test));
            assertFalse(job5Test.equals(job4Test));
            // Assert.assertEquals(job1Test.hashCode(), job4Test.hashCode());
        }

        @Test
        public void testToStringStartsAndEndsWithNewLine() {
            char firstChar = job1Test.toString().charAt(0);
            char lastChar = job1Test.toString().charAt(job1Test.toString().length() - 1);
            assertEquals( firstChar,'\n' );
            assertEquals( lastChar,'\n');
        }
        @Test

        public void testToStringHandlesEmptyField(){
            Job job10Test = new Job("",new Employer (""),new Location( " "),new PositionType( ""), new CoreCompetency(""));

            assertEquals("",job10Test.getName().toString() );
        }
        @Test
        public void testToStringContainsCorrectLabelsAndData() {
        //String one = job.toString(job1Test);

            //assertTrue("ID:1",job1Test.toString());
        assertTrue(("\nID: 1\n" +
               "Name: Product tester\n" +
               "Employer: ACME\n" +
               "Location: Desert\n" +
                "Position Type: Quality control\n" +
               "Core Competency: Persistence\n").equals( job1Test.toString() ));
        }

    }



