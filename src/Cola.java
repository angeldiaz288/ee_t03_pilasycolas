public class Cola <T>{
    T[] cola;
    Integer frente=-1;
    Integer fin=-1;
    Integer max;
    public void Insertar(T dato){
        if(fin<max-1){
            fin++;
           cola[fin]=dato;
           if(fin==0){
               frente=0;
           }
        }else{
            System.out.println("Error de desbordamiento");
        }
    }
    public T Quitar(){
        T resultado=null;
        if(frente!=-1){
            resultado=cola[frente];
            cola[frente]=null;
            if(frente==fin){
                frente=-1;
                fin=-1;
            }else{
                frente++;
            }
        }else{
            System.out.println("Error de subdesbordamiento");
        }
        return resultado;
    }
}
