package com.learning.trees.treenode;

import org.junit.platform.suite.api.*;

import static com.learning.trees.TestConstants.CUCUMBER;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines(CUCUMBER)
@SelectClasspathResource("features/treeNode")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.learning.trees.treenode")
public class TreeNodeBddRun {
}
