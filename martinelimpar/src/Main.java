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
        MisAlgoritmos alg = new MisAlgoritmos();
        int buscar1 = 4;
        int rltd1 = alg.binarySearch(numeros2, buscar1);
        System.out.println();
    }
}
