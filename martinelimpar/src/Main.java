import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] numeros = {10, 20, 30, 40, 50};
        MisAlgoritmos alg = new MisAlgoritmos();
        int search1 = 30;
        int result1 = alg.linearSearch(numeros, search1);
        System.out.println("Buscando " + search1 + ": indice = " + result1);
        int search2 = 99;
        int result2 = alg.linearSearch(numeros, search2);
        System.out.println("Buscando " + search2 + ": indice = " + result2);


        int[] numeros2 = {2, 4, 6, 8, 10};
        int buscar1 = 4;
        int rltd1 = alg.binarySearch(numeros2, buscar1);
        System.out.println("Buscando " + buscar1 + ": indice = " + rltd1);
        int buscar2 = 5;
        int rltd2 = alg.binarySearch(numeros2, buscar2);
        System.out.println("Buscando " + buscar2 + ": indice = " + rltd2);

        int[] ordenado1 = {5,8,6,7};
        int[] copia = ordenado1.clone();
        int[] resultado = alg.bubbleSort(ordenado1);
        System.out.println("Ordenando " + Arrays.toString(copia) + ": resultado = " + Arrays.toString(resultado));

        int[] selSort = {4,2,8,9};
        int[] copia2 = selSort.clone();
        int[] resultSort = alg.selectionSort(selSort);
        System.out.println("Ordenando " + Arrays.toString(copia2) + ": resultado = " + Arrays.toString(resultSort));

        int[] insSort = {2,5,1,6,9,3};
        int[] copia3 = insSort.clone();
        int[] resultInsert = alg.insertionSort(copia3);
        System.out.println("Ordenando " + Arrays.toString(insSort) + ": resultado = " + Arrays.toString(resultInsert));

        int[] merSort = {2,5,1,6,9,3};
        int[] copia4 = merSort.clone();
        int[] resMerg = alg.mergeSort(copia4);
        System.out.println("Ordenando "+ Arrays.toString(merSort)+ ": resultado = " + Arrays.toString(resMerg));
    }
}
