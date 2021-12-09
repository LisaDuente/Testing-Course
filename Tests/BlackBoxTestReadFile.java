import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester: Niklas
 * What: readFile()
 * When: 2021-12-07
 *
 * suggestions:
 *  *      - argument for input is vague (do you mean the pathname?)
 *  *      - can't handle empty rows
 *  *      - Can't read java class
 *  *      - returns a string even if the file doesn't exist
 */

public class BlackBoxTestReadFile {
File testFile;

// Cant handle empty row
    @Test
    void shouldReturnStringFromFile() {

        //input
        testFile = new File("/Users/LAS/IdeaProjects/Testing-Course/Tests/Test.txt");

        //when
        String result = Iqh.readString("/Users/LAS/IdeaProjects/Testing-Course/Tests/Test.txt");

        //result
        assertEquals("Hejbest123456groupfemkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk :)", result);
    }

    @Test
    void testWithEmptyFile(){
        //input
        testFile = new File("/Users/LAS/IdeaProjects/Testing-Course/Tests/Test2.txt");

        //when
        String result = Iqh.readString("/Users/LAS/IdeaProjects/Testing-Course/Tests/Test2.txt");

        //result
        assertEquals("", result);

    }

    @Test
    void testWithJavaClassFile(){
        //input
        testFile = new File("/Users/LAS/IdeaProjects/Testing-Course/src/BackEndTestAddScore");

        //when
        String result = Iqh.readString("/Users/LAS/IdeaProjects/Testing-Course/src/BackEndTestAddScore");

        //result
        assertEquals("", result);
    }

    @Test
    void testWithImaginedFile(){
        //input
        testFile = new File("/Users/LAS/IdeaProjects/Testing-Course/Tests/Bla");

        //when
        String result = Iqh.readString("/Users/LAS/IdeaProjects/Testing-Course/Tests/Bla");

        //result
        assertEquals(null, result);
    }



}
