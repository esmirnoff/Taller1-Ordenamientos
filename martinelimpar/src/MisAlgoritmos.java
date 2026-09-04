import java.lang.reflect.Array;
import java.util.Arrays;

public class MisAlgoritmos implements Busquedas, Ordenamientos{

 @Override
 public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
  for(int i = 0; i < arrayPorExplorar.length; i++){
 if(arrayPorExplorar[i]==elementoABuscar){return i;
 }
  }return -1;
 }


 @Override
 public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
     int inicio = 0;
     int fin = arrayPorExplorar.length - 1;
     while (inicio <= fin) {
         int medio = (inicio + fin) / 2;
         if (arrayPorExplorar[medio] == elementoABuscar) {
             return medio;
         }
             if (arrayPorExplorar[medio] < elementoABuscar) {
                 inicio = medio + 1;
             } else {
                 fin = medio - 1;
             }
     }
     return -1;
 }

 @Override
 public int[] bubbleSort(int[] arrayDesordenado) {
  for (int i = 0; i < arrayDesordenado.length - 1; i++) {
      for (int j = 0; j < arrayDesordenado.length - i - 1; j++) {
          if (arrayDesordenado[j] > arrayDesordenado[j + 1]) {
              int aux = arrayDesordenado[j];
              arrayDesordenado[j] = arrayDesordenado[j + 1];
              arrayDesordenado[j + 1] = aux;
          }
      }
  }
 return arrayDesordenado;}

 @Override
 public int[] selectionSort(int[] arrayDesordenado) {
     for (int i = 0; i < arrayDesordenado.length - 1; i++) {
         int minIndice = i;
         for (int j = i; j < arrayDesordenado.length - i - 1; j++) {
             if (arrayDesordenado[j] < arrayDesordenado[minIndice]) {
                 minIndice = j;
             }
         }
         int aux = arrayDesordenado[i];
         arrayDesordenado[i] = arrayDesordenado[minIndice];
         arrayDesordenado[minIndice] = aux;
     }
     return arrayDesordenado;
 }

 @Override
 public int[] insertionSort(int[] arrayDesordenado) {
  for (int i = 1; i < arrayDesordenado.length; i++) {
      int key = arrayDesordenado[i];
      int j = i - 1;
      while (j >= 0 && arrayDesordenado[j] > key) {
          arrayDesordenado[j + 1] = arrayDesordenado[j];
          j--;
      }
      arrayDesordenado[j + 1] = key;
  }
  return arrayDesordenado;
 }

 @Override
 public int[] mergeSort(int[] arrayDesordenado) {
  if  (arrayDesordenado.length <= 1 ) {
      return arrayDesordenado;
  }
  int mid = (arrayDesordenado.length / 2);
  int left = Arrays.copyOfRange(arrayDesordenado, 0, mid);
  int right = Arrays.copyOfRange(arrayDesordenado, mid, arrayDesordenado.length);
  return merge(mergeSort(left), mergeSort(right));
 }
 private int[] merge(int[] left, int[] right) {
     int[] resultado = new int[left.length + right.length];
     int i = 0, j = 0, k = 0;
     while (i < left.length && j < right.length) {
         if (left[i] <= right[j]) {
             resultado[k++] = left[i++];
         }else{
             resultado[k++] = right[j++];
     }
 }
     while (i < left.length) {
     resultado[k++] = left[i++];}
     while (j < right.length) {
         resultado[k++] = right[j++];
     }
     return resultado;
 }

 @Override
 public int[] quickSort(int[] arrayDesordenado) {
  return new int[0];
 }
}
