public class Tipo <T>{
    T[] pila;
    Integer tope=-1;
    Integer tam;
    public void Push(T dato){
        if(tope<tam){
            pila[tope]=dato;
            tope++;
        }else{
            System.out.println("Error de desbordamiento");
        }
    }
    public T Pop(){
        T resultado=null;
        if(tope>-1){
            resultado=pila[tope];
            pila[tope]=null;
            tope--;
        }else{
            System.out.println("Error de subdesbordamiento");
        }
        return resultado;
    }
    public T Peek(){
        T resultado=null;
        if(tope>-1){
            resultado=pila[tope];
        }else{
            System.out.println("Pila vacía");
        }
        return resultado;
    }
}

