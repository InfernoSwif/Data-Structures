package com.hassanmir;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.hassanmir.Graphs.BuildOrder.buildOrder;

public class BuildOrderTest {

    @Test
    public void testBuildOrder() throws Exception {
        //project list
        ArrayList<Character> projects = new ArrayList<>();
        projects.add('a');
        projects.add('b');
        projects.add('c');
        projects.add('d');
        projects.add('e');
        projects.add('f');

        //dependencies list
        ArrayList<Character[]> dependencies = new ArrayList<>();
        dependencies.add(new Character[]{'a','d'});
        dependencies.add(new Character[]{'f','b'});
        dependencies.add(new Character[]{'b','d'});
        dependencies.add(new Character[]{'f','a'});
        dependencies.add(new Character[]{'d','c'});

        List<Character> buildOrder = buildOrder(projects,dependencies);
        System.out.println(buildOrder);
        for(Character[] dependency:dependencies){
            Assert.assertTrue(buildOrder.indexOf(dependency[0])<buildOrder.indexOf(dependency[1]));
        }


        projects.add('g');
        dependencies.clear();
        dependencies.add(new Character[]{'f','c'});
        dependencies.add(new Character[]{'f','b'});
        dependencies.add(new Character[]{'c','a'});
        dependencies.add(new Character[]{'b','a'});
        dependencies.add(new Character[]{'a','e'});
        dependencies.add(new Character[]{'d','g'});

        buildOrder = buildOrder(projects,dependencies);
        System.out.println(buildOrder);
        for(Character[] dependency:dependencies){
            Assert.assertTrue(buildOrder.indexOf(dependency[0])<buildOrder.indexOf(dependency[1]));
        }
    }

    @Test(expected = Exception.class)
    public void testBuildOrderException() throws Exception {
        //project list
        ArrayList<Character> projects = new ArrayList<>();
        projects.add('a');
        projects.add('b');
        projects.add('c');
        projects.add('d');

        //cyclic graph, no build order exists, throws exception
        ArrayList<Character[]> dependencies = new ArrayList<>();
        dependencies.add(new Character[]{'a','b'});
        dependencies.add(new Character[]{'b','c'});
        dependencies.add(new Character[]{'c','d'});
        dependencies.add(new Character[]{'d','a'});

        List<Character> buildOrder = buildOrder(projects,dependencies);
        System.out.println(buildOrder);
    }
}
