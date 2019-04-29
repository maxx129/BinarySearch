public class BinarySearch {

    private static int goal = 98;
    private static int[] arr = {0, 30, 49, 55, 58, 59, 65, 75, 84, 98, 101, 114, 125, 150, 205, 300, 458, 500};

    //private static int arr[] = {0, 1, 2};
    private static void checkForOrdered() { //Проверим, если массив "плохой", нет смысла дальше что-то делать
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                System.out.println("Array is not sorted");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        checkForOrdered();
        int start = 0, finish = arr.length - 1, middle = 0, i = 0;

        do {
            if(goal == arr[start]) { System.out.println("Найдено " + arr[start] + " в первом элементе"); break; }
            if(goal == arr[finish]) { System.out.println("Найдено " + arr[finish] + " в последнем элементе"); break; }

            middle = (start + finish) / 2;

            if (goal == arr[middle]) {
                System.out.println("Найдено " + arr[middle] + " на итерации " + i);
                break;
            }

            if (goal < arr[middle]) {
                finish = middle;
            } else {
                start = middle;
            }
            //System.out.println("start" + start + " finish" + finish + " middle" + middle + " arr[middle]" + arr[middle] + " arr[i]" + arr[i] + " goal" + goal + " Итерация" + i);
            i++;

            if(finish - start == 1) {
                System.out.println("Goal isn`t exists in array");
                break;
            }

        }
        while (i < arr.length);




    }
}