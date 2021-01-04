package com.hassanmir.Graphs;

import java.util.*;

public class BuildOrder {
    public static List<Character> buildOrder(List<Character> projects, List<Character[]> dependencies) throws Exception {

        HashMap<Character, HashSet<Character>> adjacencyList = new HashMap<>();
        for(Character c:projects){
            adjacencyList.put(c, new HashSet<Character>());
        }

        for(Character[] c:dependencies){
            adjacencyList.get(c[0]).add(c[1]);
        }

        ArrayList<Character> ans = new ArrayList<>();
        Set<Character> preScope = new HashSet<>();
        while(!adjacencyList.isEmpty()){

            Set<Character> scope = new HashSet<>(adjacencyList.keySet());
            if(preScope.equals(scope))
                throw new Exception();
            preScope = new HashSet<>(scope);
            for(HashSet<Character> dependants:adjacencyList.values()) {
                for (Character c : dependants)
                    scope.remove(c);
            }

            for(Character c:scope){
                ans.add(c);
                adjacencyList.remove(c);
            }
        }

        return ans;
    }
}
