package org.unipop.controller;

import org.apache.tinkerpop.gremlin.process.traversal.step.util.HasContainer;

import java.util.*;

public class Predicates {
    public ArrayList<HasContainer> hasContainers = new ArrayList<>();
    public long limitHigh = Long.MAX_VALUE;
    public Set<String> labels = new HashSet<>();
}
