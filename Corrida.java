import java.util.HashSet;
import java.util.HashMap;

public class Corrida {

	private HashSet<Veiculo> conjveiculos;
	private Circuito crt;
	private boolean piso;
	
	public Corrida() {
		this.conjveiculos = new HashSet<Veiculo> ();
		this.crt = new Circuito();
		this.piso = false;
	}
	
	public Corrida(HashSet<Veiculo> v, Circuito c, boolean p) {
	    this.conjveiculos = new HashSet<Veiculo>();
		for(Veiculo vc : v)
			this.conjveiculos.add(vc);
		this.crt = c;
		this.piso = p;
	}
	
	public Corrida(Corrida c) {
		this.conjveiculos = c.getConjuntoVeiculos();
		this.crt = c.getCircuito();
		this.piso = c.getPiso();
	}
	
	public HashSet<Veiculo> getConjuntoVeiculos() {
		HashSet<Veiculo> aux = new HashSet<Veiculo> ();
		
		for(Veiculo vc : this.conjveiculos)
			aux.add(vc.clone());
		
		return aux;
	}
	
	public Circuito getCircuito() {
		return this.crt;
	}
	
	public boolean getPiso() {
		return this.piso;
	}
	
	public void setConjuntoVeiculos(HashSet<Veiculo> vc) {
		this.conjveiculos = vc;
	}
	
	public void setCircuito(Circuito c) {
		this.crt = c;
	}
	
	public void setPiso(boolean p) {
		this.piso = p;
	}
	
	public String toString() {
        StringBuilder s = new StringBuilder();
        
        s.append("-----------------Corrida-------------------\n");
        s.append("N��mero de Veiculos: "+ this.conjveiculos.size() + "\n");
        s.append("Circuito: " + this.crt.toString() + "\n");
        s.append("Piso Molhado: " + this.piso + "\n");
        s.append("-------------------------------------------\n");
       
        return s.toString();
	}
	
	public boolean equals(Object o) {
        if(o==this) return true;
        if(o==null || (o.getClass()!=this.getClass()))
            return false;
        Corrida v = (Corrida) o;
        return this.conjveiculos.equals(v.getConjuntoVeiculos()) &&
        		this.crt.equals(v.getCircuito()) &&
        		this.piso == (v.getPiso()) ;      
	}
	
	public Corrida clone() {
		return new Corrida(this);
	}
	
	public HashMap<Veiculo,Integer>  fazVolta(){ 
	    HashMap<Veiculo,Integer>  aux = new HashMap<Veiculo,Integer>();
	   for(Veiculo v : conjveiculos){ aux.put(v,v.tempoProximaVolta(crt,piso));
	   
	   }
	   return aux;
	   }
	   
	   public HashMap<Veiculo,Integer>fazCircuito(){HashMap<Veiculo,Integer>  aux = new HashMap<Veiculo,Integer> ();
	        HashMap<Veiculo,Integer>  aux2 = new HashMap<Veiculo,Integer>();
	        
	        
	         aux2 = this.fazVolta(); 
	          
	         for( Veiculo v : aux2.keySet()){ aux.put(v,aux2.get(v));}
	       for(int i = 1; i < crt.getNvoltas(); i++){  
	           aux2 = this.fazVolta(); 
	           for( Veiculo v : aux2.keySet()){ aux.put(v,aux2.get(v)+aux.get(v));}
	       
	       
	       
	       
	       
	       }
	   
	   return aux;
	   }
}
