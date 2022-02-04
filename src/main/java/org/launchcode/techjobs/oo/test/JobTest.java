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
            Job job12Test = new Job("",new Employer (""),new Location( " "),new PositionType( ""), new CoreCompetency(""));

            assertEquals("",job12Test.getName() );assertEquals("",job12Test.getCoreCompetency().toString() );
            assertEquals("",job12Test.getEmployer().toString() );
            assertEquals("",job12Test.getLocation().toString() );
            assertEquals("",job12Test.getPositionType().toString() );

        }
        @Test
        public void testToStringContainsCorrectLabelsAndData() {
//            assertEquals(("\n" + "ID: " + "" + job1Test.getId() + "" + "\n" + "Name: " + "" + job1Test.getName() + "" + "\n" + "Employer: " + "" + job1Test.getEmployer()+ "" + "\n" + "Location: " + "" + job1Test.getLocation()+ "" + "\n" + "Position Type: " + "" +job1Test.getPositionType() + "" + "\n" + "Core Competency: " + "" +
//                    "" + job1Test.getCoreCompetency() + "\n"), job1Test.toString());
        //String one = job.toString(job1Test);
            Job job10Test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            String tester2 = ("\nID: 4\n" +
               "Name: Product tester\n" +
               "Employer: ACME\n" +
               "Location: Desert\n" +
                "Position Type: Quality control\n" +
               "Core Competency: Persistence\n");
            Assert.assertEquals(tester2, job10Test.toString());
        }

    }



