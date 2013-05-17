<<<<<<< HEAD
import java.util.*;

public class PC1 extends Veiculo
{
    
    private static final int cld=6000;
    private static final double fiabilidade= 0.85;
    
    public PC1()
    {
        super();
    }

    /** Construtor por partes */
    public PC1(String marca, String modelo, int cilindrada, int cv,
			Piloto p1, Piloto p2)
	{
		super(marca,modelo,cld,cv,p1,p2);
=======
public class PC1 extends Veiculo {

	private static final int cld = 6000;
	private static final double fiabilidade = 0.85;

	public PC1() {
		super();
	}

	/** Construtor por partes */
	public PC1(String marca, String modelo, int cilindrada, int cv, Piloto p1, Piloto p2, boolean h) {
		super(marca, modelo, cld, cv, p1, p2, h);
>>>>>>> a06623bf16d972951d0f186c2a574c640a73c161
	}
			
	/** Construtor de cópia */
	public PC1 (PC1 pc) {
	    
        super(pc);
        this.setCilindrada(cld);
        
    }
    
    public void setCilindrada(int cl){
    
    super.setCilindrada(cl);
    }
      /** Metodo que devolve um clone de um pc1 */
    @Override
    public PC1 clone() {
        return new PC1(this);
    }

        /** Método que represente um pc1 sob forma de string */
    @Override
    public String toString () {
        StringBuilder s = new StringBuilder ();
        s.append("PC1");
        s.append(super.toString());
        
        return s.toString();
    }
    
     /** Método que compara dois pc1 */ 
    @Override
    public boolean equals (Object o) {
        return (super.equals(o));
    }
}
