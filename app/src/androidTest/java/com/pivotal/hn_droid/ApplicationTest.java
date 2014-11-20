package com.pivotal.hn_droid;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@Config(manifest = "./src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class ApplicationTest {

    @Test
    public void doSomeTesting() throws Exception {
        int i = 4;
        int j = 3;

        assertEquals(i + j, 7);
    }
}