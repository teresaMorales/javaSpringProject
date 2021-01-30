import java.util.ArrayList;

class Calculator {
    ArrayList<String> operadores = new ArrayList<String>();
    ArrayList<Double> numeros = new ArrayList<Double>();
    Double resultados;
    
    public Calculator (){

    }
    
  public void performOperation(double doble){
	  numeros.add(doble);
    }
    public void performOperation(int doble){
    	numeros.add((double) doble);
    }
    public void performOperation(String cadena){
        if (cadena != "="){
        	operadores.add(cadena);
        }
        else {
            Double comienzo = numeros.get(numeros.size()-1);
            for(int i = operadores.size()-1; i >=0; i--){
                switch(operadores.get(i)){
                    case "+": comienzo = comienzo + numeros.get(i); 
                    break;
                    case "-": comienzo = comienzo - numeros.get(i); 
                    break;
                    case "*": comienzo = comienzo * numeros.get(i); 
                    break;
                    case "/": comienzo = comienzo / numeros.get(i); 
                    break;
                 
                }
            }
            this.resultados = comienzo;
        }
    }
    public void getResults(){
        System.out.println(this.resultados);
    }
}