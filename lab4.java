//Написать программу, удаляющую из целочисленного массива A размерности N элементы, равные целому числу X.
// В результате должен получиться массив не большей размерности. На экран должны выводиться как оригинальное
// состояние массива, так и итоговое.

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        int k = 2, N = 1,X,l,m,count = 0;
        int[] A = new int[N];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 0-й элемент массива: ");
        A[0] = in.nextInt();
        System.out.print("Введите 1-й элемент массива: ");
        while (!in.hasNext("quit")) {
            int[] Temp_A = new int [A.length+1];
            for (int i = 0; i < Temp_A.length-1; i++){
                Temp_A[i] = A[i];
            }
            System.out.print("Введите " + k + "-й элемент массива(чтобы закончить ввод чисел введите 'quit'): ");
            Temp_A[Temp_A.length-1] = in.nextInt();
            k = k + 1;
            A = new int[Temp_A.length];
            for (int i = 0; i < Temp_A.length; i++){
                A[i] = Temp_A[i];
            }
        }
        System.out.print("Введенный массив: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        Scanner z = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите число, которое нужно удалить из массива: ");
        X = z.nextInt();
        for (int i = 0; i < A.length; i++){
            if (A[i] == X){
                count = count + 1;
            }
        }
        for (int i = 0; i < count; i++){
            for (l = 0; l < A.length; l++){
                if (A[l] == X) {
                    for (m = l; m < A.length - 1; m++) {
                        A[m] = A[m + 1];
                    }
                    int[] Temp_A = new int[A.length - 1];
                    for (m = 0; m < Temp_A.length; m++) {
                        Temp_A[m] = A[m];
                    }
                    A = new int[Temp_A.length];
                    for (m = 0; m < A.length; m++) {
                        A[m] = Temp_A[m];
                    }
                }
            }
        }
        System.out.print("Итоговый массив: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        in.close();
        z.close();
    }
}
