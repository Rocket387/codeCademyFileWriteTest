package org.example;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    static File file;
    static FileWriter w;
    static Scanner s;

    @Before
    public void beforeEachTest() throws IOException {
        file = new File("test.txt");
        w = new FileWriter("test.txt");

        s = new Scanner(file);
    }

    @Test
    public void test1() throws IOException {

        w.write("Testing testing 1 2 3!");
        w.close();

        assertThat(s.nextLine(), equalTo("Testing testing 1 2 3!"));
        s.close();
    }

    @After
    public void afterEachTest() throws IOException {
        s.close();
    }
}
