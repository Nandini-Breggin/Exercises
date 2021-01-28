import java.util.*;

public class Exercises {
    public static void main(String [] args) {
        
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apples","mango","strawberry","orange","raspberry","cherry","tomato","lemon","plum","kumquat"));
        ArrayList<String> veggies = new ArrayList<>(Arrays.asList("beet root","potato","onion","broccoli","avocado","ginger","bell pepper","spinach","mushroom","cauliflower"));
        ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("bapples","mangos","melon","orange","lime","banana","cherry","lychee","kiwi","kumquat"));
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("puppy", "ardvark", "ant", "elephant", "lion", "lion", "tiger", "cheetah", "puppy", "ants"));

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15));
        ArrayList<Points> points = pairs2(number);

        // 0. Given two lists of 10 items each: one of fruits, one of vegetables, combine the two lists into a third master list. Sort it.
        System.out.println("\nFruits: " + fruits);
        System.out.println("\nVeggies: " + veggies);
        System.out.println("\nSorted List: ");
        System.out.println(foodList(fruits,veggies)); // sorted list
        System.out.println("\n");
        // 1. Given two lists of fruits with at least 10 items each, with some items in both lists, return a new list that only contains the items found in both lists
        System.out.println("\nFruits: " + fruits);
        System.out.println("\nFruits 2: " + fruits2);
        System.out.println("\nSame Fruits: ");
        System.out.println(duplicatedFruit(fruits, fruits2));
        System.out.println("\n");
        // 2. Given a list of at least 10 animals, with some repeated, remove all duplicates from the list. Do not create a new list to solve this problem.
        System.out.println("\nAnimals: " + animals);
        System.out.println("\nNon-Duplicated Animals: ");
        System.out.println(duplicatedAnimals(animals));
        System.out.println("\n");
        // 3. Given a sorted list of integers, and a new number to add to the list, write an efficient algorithm to insert the new number in a place that keeps the list sorted.
        System.out.println("\nOriginal List: " + number);
        System.out.println("\nSorted List: ");
        System.out.println(addNumber(number, 5)); // 3, 5, 6, 9, 12, 15
        System.out.println("\n");
        // 4. Given a list of integers, reverse the list. Do not create a second list to solve this problem.
        System.out.println("\nOriginal List: " + number);
        System.out.println("\nSorted List: ");
        System.out.println(reverseOrder(number)); // 15, 12, 9, 6, 3
        System.out.println("\n");
        // 5. Design a new class that represents a point in 2d space.
        System.out.println("\n2d space point: ");
        System.out.println(pairs1(number));
        System.out.println(pairs2(number));
        // 6. Given a list of points, in between each pair of points insert the midpoint of those two points
        System.out.println("\nMidpoints: ");
        System.out.println(midPoint(points));
        // 7. Given a list of points, sort them by proximity to the origin
        System.out.println("\nOrigin Proximity: ");
        System.out.println(orderPoints(points));

    }

    public static ArrayList<String> foodList(ArrayList<String> fruits, ArrayList<String> veggies) {
        ArrayList<String> combination = new ArrayList<String>(fruits);
        combination.addAll(veggies);
        Collections.sort(combination);
        return combination;
    }

    public static ArrayList<String> duplicatedFruit(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> combination = new ArrayList<String>(list1);;
        combination.retainAll(list2);
        Collections.sort(combination);
        return combination;
    }

    public static ArrayList<String> duplicatedAnimals(ArrayList<String> list1) {
        int listSize = list1.size();

        for (int i = 0; i < listSize; i++) {

            for (int x = i+1; x < listSize; x++) {

                if (list1.get(i).equals(list1.get(x))) {

                    list1.remove(x);
                    listSize--;
                    x--;   
                }
            }
        }
        Collections.sort(list1);
        return list1;
    }

    public static ArrayList<Integer> addNumber(ArrayList<Integer> nums, int num) {
        
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) < num && nums.get(i + 1) > num) {
                newList.add(nums.get(i));
                newList.add(num);
            } else {
                newList.add(nums.get(i));
            }
        }
        
        return newList;
    }

    public static ArrayList<Integer> reverseOrder(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size()/2; i++) {
            int temp = nums.get(i);
            nums.set(i, nums.get(nums.size()-(i+1)));
            nums.set(nums.size()-(i+1), temp);
        }
        return nums;
    }

    public static List<List<Integer>> pairs1(ArrayList<Integer> nums) {
        List<List<Integer>> pairs = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.size()-1; i++){
            List<Integer> temp = new ArrayList<>(Arrays.asList(nums.get(i), nums.get(i+1)));
            pairs.add(temp);
            i++;
        }
        return pairs;
    }

    public static ArrayList<Points> pairs2(ArrayList<Integer> nums) {
        ArrayList<Points> pairs = new ArrayList<Points>();
        for(int i = 0; i < nums.size()-1; i++){
            pairs.add(new Points(nums.get(i), nums.get(i+1)));
            i++;
        }
        return pairs;
    }

    public static ArrayList<Points> midPoint(ArrayList<Points> nums) {
        ArrayList<Points> pairs = new ArrayList<Points>();
        for(int i = 0; i < nums.size()-1; i++){
            pairs.add((nums.get(i)));
            // if(i < nums.size()) {
                pairs.add(nums.get(i).MidPoint(nums.get(i+1)));
            // }
        }
        pairs.add(nums.get(nums.size()-1));
        return pairs;
    }


    public static ArrayList<Points> orderPoints(ArrayList<Points> points) {
        for(int i = 0; i < points.size(); i++){
            int minI = i;
            for(int p = i+1; p < points.size(); p++){
                if(points.get(p).OriginDistance() < points.get(minI).OriginDistance()) minI = p;
            }
            Points bruh = points.get(minI);
            points.set(minI, points.get(i));
            points.set(i, bruh);
        }
        return points;
    }

}