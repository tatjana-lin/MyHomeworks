package myProjects;

public class SearchLinear {
    public static void main(String[] args) {
        int[] myArray = {5, 5, 7, 3, 2};
        int x = 5;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == x) {
                System.out.println("Заданное значение находится в массиве под индексом " + i);
                break;
            }
            else if (i == myArray.length - 1 && myArray[i] != x) {
                System.out.println("Заданное значение отсутствует в массиве");
                break;
            }
        }
    }
}
