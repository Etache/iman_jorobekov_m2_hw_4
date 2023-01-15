import java.util.*;

public class Main {
    public static void main(String[] args) {
        stringList();
    }

    public static void stringList() {
        List<String> listA = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String listWords = scan.nextLine();
            listA.add(listWords);
        }
        System.out.println(listA);


        List<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String listWords = scan.nextLine();
            listB.add(listWords);
        }
        System.out.println(listB);


        List<String> listC = new ArrayList<>(listA.size() + listB.size());

        for (int i = 0; i < listC.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(listB.size() - 1));

//            while (listB.size() != 0) {
//                int j = listB.size();
//                j--;
//                break;
//            }
        }
        System.out.println(listC);
    }
}