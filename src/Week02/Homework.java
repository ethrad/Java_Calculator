package Week02;

import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String collectionName = sc.nextLine();

        String recipeTitle = sc.nextLine();

        switch (collectionName) {
            case "List":
                List<String> list = new ArrayList<>();
                while (true){
                    String input = sc.nextLine();
                    if (Objects.equals(input, "끝")) break;
                    list.add(input);
                }

                System.out.println("[ " + collectionName + " 으로 저장된" + recipeTitle + " ]");
                for (int i = 0; i < list.size(); i++){
                    System.out.println(i+1 + "." + list.get(i));
                }

                break;
            case "Set":
                Set<String> set = new LinkedHashSet<>();

                while (true){
                    String input = sc.nextLine();
                    if (Objects.equals(input, "끝")) break;
                    set.add(input);
                }
                System.out.println("[ " + collectionName + " 으로 저장된 " + recipeTitle + " ]");

                int i = 0;
                for (String s : set){
                    System.out.println(++i + "." + s);
                }

                break;
            case "Queue":
                Queue<String> queue = new LinkedList<>();
                while (true){
                    String input = sc.nextLine();
                    if (Objects.equals(input, "끝")) break;
                    queue.add(input);
                }
                System.out.println("[ " + collectionName + " 으로 저장된" + recipeTitle + " ]");

                int j = 0;
                for (String s : queue){
                    System.out.println(++j + "." + s);
                }

                break;
        }
    }
}
