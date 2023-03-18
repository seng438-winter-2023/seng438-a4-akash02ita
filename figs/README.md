
# Description of figures
This is the mutation testing with **our test cases** from assignment 3.

Figures 1.x is the part to setup our initial test cases and apply any modifications to ensure 100% green test output from Junit.

Figures 2.x is the part of mutation testing BEFORE we add any new test cases to improve mutation coverage.

## Figures 1.x
These are performing `junit` test to the `src` folder as before we run PIT mutation test to `org.jfree.data` it is best to ensure entire source folder has green tests.
Note, how we needed to fix a few things throught the steps, to achieve 100% green test results. We ended up fixing `Range.java` bug for the **intersect** method. Also since the source code from assignment 3 was different we had to delete some of out test cases since they were not needed anymore and were interfering in achievin 100% green test output. Please the figures as they are already in chronological order.

## Figure 2.x
These figures describe the PIT mutation testing performed on the **sample tests** provided and the test is run only in `org.jfree.data` package since `Range.java` and `DataUtilities.java` are inside that package.

You may also visit the path for [mutation_test_results/before](../mutation_test_results/before/) to see a more detailed output of the Console and Mutation summary.


## Figure 3.x
These figure describe the result summary of the PIT mutation test after adding new or improving existing test cases. The coverage for `Range.java` is a significant improvement thanks to new added methods. Whereas the `DataUtilities.java` mainly involved adding new test case of existing methods to make the test suite more robust and effective against mutants.
You may also the path for [mutation_test_results/after](../mutation_test_results/after/) to see a more detailed ouptut of the Console and Mutation summary.
