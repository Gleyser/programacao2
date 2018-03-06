package sistema;

public enum Acoes {	
	 PORFAZER(1), FEITO(2), EMENTREGA(3), FINALIZADO(4);
	    
	    private final int valor;
	    Acoes(int valorOpcao){
	        valor = valorOpcao;
	    }
	    public int getValor(){
	        return valor;
	    }
}
