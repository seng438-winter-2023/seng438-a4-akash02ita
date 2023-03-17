
# Description of figures
This is the mutation testing with **our test cases** from assignment 3.

Figures 1.x is the part to setup our initial test cases and apply any modifications to ensure 100% green test output from Junit.

Figures 2.x is the part of mutation testing BEFORE we add any new test cases to improve mutation coverage.

## Figures 1.x
These are performing `junit` test to the `src` folder as before we run PIT mutation test to `org.jfree.data` it is best to ensure entire source folder has green tests.
Note, how we needed to fix a few things throught the steps, to achieve 100% green test results. We ended up fixing `Range.java` bug for the **intersect** method. Also since the source code from assignment 3 was different we had to delete some of out test cases since they were not needed anymore and were interfering in achievin 100% green test output. Please the figures as they are already in chronological order.

## Figure 2.x
These figures describe the PIT mutation testing performed on the **sample tests** provided and the test is run only in `org.jfree.data` package since `Range.java` and `DataUtilities.java` are inside that package.

You may also visit the path for [mutation_test_results/before](../mutation_test_results/before/) to see a more detailed output of the Console and Mutation summary. Unfortunately, in eclipse we were not able to show the PIT mutations part as there was no way to find the source path. So, only a brief screenshot in figures [2.2.0](2.2.0.png) and [2.2.1](2.2.1.png) was taken, instead of expanding the whole thing and taking many screenshots.


