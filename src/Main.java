import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("요리 제목을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String recipeTitle = sc.nextLine();

        System.out.print("요리 별점을 입력하세요 : ");
        float recipeRating = sc.nextFloat();
        sc.nextLine();

        System.out.print("요리 레시피를 입력하세요 (10문장) : ");
        String[] recipeDetails = new String[10];
        for (int i = 0; i < 10; i++) {
            recipeDetails[i] = sc.nextLine();
        }

        System.out.println("[ " + recipeTitle + " ]");
        System.out.println("별점 : " + (int) recipeRating + " (" + (int) recipeRating / 5.0 * 100 + "%)");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + recipeDetails[i]);
        }
    }
}
