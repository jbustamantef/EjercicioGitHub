
package arreglo;


public class Arreglo {

    
    public static void main(String[] args) {
      
        int largo = 5;
        int [] arreglo = new int [largo];
        String[] arrString = new String[8];
        
        
    arrString [0] = largo+"";
    arrString [2] = "dos";
    arrString [4] = "cuatro";
    arrString [6] = "null";
    
    System.out.println("Arr : "+arrString[0]);
    
    for(int i=0; i<arrString.length; i++){
        if(arrString[i]!=null){
        System.out.println ("Arr["+i+"]: " + arrString[i]);
 
        }
    
    }
    
    }
} 
        
   

