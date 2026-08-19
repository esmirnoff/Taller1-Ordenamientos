public class MisAlgoritmos implements Busquedas, Ordenamientos{

 @Override
 public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
  for(int i = 0; i < arrayPorExplorar.length; i++){
 if(arrayPorExplorar[i]==elementoABuscar){return i;
 }
  }return -1;
 }
public static void main(String[] args) {
  int[] numeros = {10, 20, 30, 40, 50};
  MisAlgoritmos alg= new MisAlgoritmos();
  int search1 = 30;
  int result1 = alg.linearSearch(numeros, search1);
  System.out.println("Buscando "+search1+ ": indice = "+result1);
  int search2 = 99;
  int result2 = alg.linearSearch(numeros, search2);
  System.out.println("Buscando "+search2+ ": indice = "+result2);
}
 @Override
 public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
     int inicio = 0;
     int fin = arrayPorExplorar.length - 1;
  while (inicio <= fin){
      int medio = (inicio+fin)/2;
      if (arrayPorExplorar[medio] == elementoABuscar){
          return medio;
          else if (arrayPorExplorar[medio] < elementoABuscar) {
              inicio = medio + 1;
          }else{
                  fin = medio-1;}

      }
  }
 }

 @Override
 public int[] bubbleSort(int[] arrayDesordenado) {
  return new int[0];
 }

 @Override
 public int[] selectionSort(int[] arrayDesordenado) {
  return new int[0];
 }

 @Override
 public int[] insertionSort(int[] arrayDesordenado) {
  return new int[0];
 }

 @Override
 public int[] mergeSort(int[] arrayDesordenado) {
  return new int[0];
 }

 @Override
 public int[] quickSort(int[] arrayDesordenado) {
  return new int[0];
 }
}