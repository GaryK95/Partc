/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.softwareengineering.assignment1.Course;
import com.mycompany.softwareengineering.assignment1.Module;
import com.mycompany.softwareengineering.assignment1.Student;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.LocalDate;


/**
 *
 * @author 14493172
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test    
    public void testClassesAndUsername(){}{    
        List<Module> comSci = new ArrayList<>();
        List<Student> students = new ArrayList<>();



        Student Gary = new Student("Gary Kelly", 23, "1995-09-08", 14493172, comSci);
        students.add(Gary);
        Module softEng = new Module("Software Engineering","CT417", students); 
        comSci.add(softEng);
        LocalDate start = new LocalDate(2015,9,01);
        LocalDate end = new LocalDate(2019,6,30);
        Course computerScience = new Course("Computer Science",start, end, comSci);

        String testUsername = Gary.getUsername();

        assertEquals("GaryKelly23",testUsername);
           }
}
