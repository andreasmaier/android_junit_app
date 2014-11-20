android_junit_app
=================

A small contained example of junit 4 tests in an android app with android studio

# How to

This is basically just one way to setup an android app in android studio.

## Getting the tests to run

- After syncing all the dependencies via gradle, right click on the java folder in android test
- Run all the tests
- You should see something like

    !!! JUnit version 3.8 or later expected:
    java.lang.RuntimeException: Stub!

- From within the android studio run console copy the first (possibly collapsed) line (the line before !!!JUnit version 3.8 ...), it contains all the run command parameters, we need the classpath
- go into an editor of your choice and search for junit4.x in that string
- move the junit 4.x section to the beginning of the -classpath string
- take a look into the app/build (not the one in root!) folder, if there is a test-classes folder you are good, else run the gradle task 'compileTestDebugJava'
- append the absolute path of the build/test-classes folder to the end of the classpath string in the editor, we are done with string editing. Copy it into the paste buffer and go back to android studio
- open the run configuration for "all tests"
- add the -classpath "..." string that we just edited to the end of the vm options after the -ea parameter (or whatever already is in that textfield)
- run "all tests" it should work by now

## Automate test class building

- Go to the edit run configuration window
- Add a new gradle task
- give it a name, for example 'PreTestClassGeneration'
- the project is 'HN_droid:app'
- the task is 'compileTestDebugJava'
- save the changes
- go to the all tests configuration in the run configuration window
- as a pre build step add the gradle task we just created
- Et voila, now our class files are automatically generated prior to running the all tests