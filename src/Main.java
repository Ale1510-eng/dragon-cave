import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                You are in a land full of dragons. In front of you,
                You see two caves. In one cave, the dragon is friendly
                and will share his treasure with you. The other dragon
                is greedy and hungry and will eat you on sight.
                Which cave will you go into? (1 or 2)
                """);

        int cave = sc.nextInt();
        String message = "";
        switch (cave){
            case 1:
                message = """
                    Gobbles you down in one bite!
                    """;
                break;
            case 2:
                message = """
                        Congratulations!
                        The dragon shares his treasure with you.
                        """;
            default:
                System.out.println("Unvalid option");
        }

        System.out.println("""
                You approach the cave…
                It is dark and spooky…
                A large dragon jumps out in front of you!
                He opens his jaws and…
                """ + message);

    }
}
