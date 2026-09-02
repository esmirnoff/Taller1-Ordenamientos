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