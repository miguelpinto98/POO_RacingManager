import java.util.*;

public class TestaManagerGriffin {
	public static void main(String[] args) {

		Piloto p1 = new Piloto("Muito Fraco", "China", 0, 2, false);
		Piloto p2 = new Piloto("Fraco", "Portugal", 5, 4, false);
		Piloto p3 = new Piloto("Razoavel", "Espanha", 10, 6, false);
		Piloto p4 = new Piloto("Bom", "Reino Unido", 15, 8, false);
		Piloto p5 = new Piloto("Mt bom", "França", 20, 10, false);
		
		PC1 p11 = new PC1("Koenigsegg", "Agera R", 6000, 600, p1, p1, 0); 		//960cv
		PC1 p12 = new PC1("SSC", "Tuatara", 6000, 800, p2, p2, 0); 				//1350cv
		PC1 p13 = new PC1("SSC", "Ultimate Aero TT", 6000, 1000, p3, p3, 0);		//1280cv
		PC1 p14 = new PC1("Bugatti", "Veyron", 6000, 1200, p4, p4, 0);			//1200cv
		PC1 p15 = new PC1("Venom", "GT", 6000, 1350, p5, p5, 0);					//1261cv
		
		PC2 p21 = new PC2("Ferrari Enzo", "", 4000, 450, p1, p1, 0);
		PC2 p22 = new PC2("As Ascari A10", "", 4500, 650, p2, p2, 0);
		PC2 p23 = new PC2("Aston Martin ", "", 5000, 700, p3, p3, 0);
		PC2 p24 = new PC2("Edonis", "", 5500, 850, p4, p4, 0);
		PC2 p25 = new PC2("Mercedes-Benz", "", 6000, 1000, p5, p5, 0);
		
		
		GT v31 = new GT("Peugeot 908 Equipe Peugeot", "", 3000, 350, p1, p1, 0);
		GT v32 = new GT("Ferrari F10", "", 3300, 400, p2, p2, 0);
		GT v33 = new GT("Mazda 787B Race Car", "", 3600, 650, p3, p3, 0);
		GT v34 = new GT("Red Bull X2010 S.Vettel", "", 4200, 800, p4, p4, 0);
		GT v35 = new GT("Hennessey Venom GT", "", 4500, 950, p5, p5, 0);

		
		SC s1 = new SC("Ferrari FXX", "", 2500, 350, p1, p1, 0);
		SC s2 = new SC("Saleen S7", "", 2500, 550, p2, p1, 0);
		SC s3 = new SC("Koenigsegg Agera", "", 2500, 750, p3, p1, 0);
		SC s4 = new SC("SSC Ultimate Aero", "", 2500, 950, p4, p1, 0);
		SC s5 = new SC("Koenigsegg Agera R", "", 2500, 1050, p5, p1, 0);
        
        Circuito ct1 = new Circuito("ALGARVE", 4664, 16, 100908, 103345, 0, 0, 91464, 20000, 16000, p3);
		Circuito ct2 = new Circuito("Estoril",4182, 13, 84000, 0, 0, 0, 84000, 40000, 50000, p3);

		HashSet<Veiculo> v = new HashSet<Veiculo>();
		v.add(p11);
		v.add(p12);
		
		Corrida c2 = new Corrida (v, ct1 ,false);
		Corrida c3 = new Corrida( v, ct2,true);

		HashSet<Corrida> v96= new HashSet<Corrida>();
		v96.add(c2);
		v96.add(c3);
		Campeonato k1 = new Campeonato(v96);
        		
		
        for(Corrida r : k1.getCorridas()){ HashMap<Veiculo,Integer> batata = new HashMap<Veiculo,Integer>();
            for(Veiculo va : r.getConjuntoVeiculos()){ batata.put(va,0);}
        r.fazCorrida(batata);
        for(Veiculo ve : batata.keySet()){
        System.out.println(batata.get(ve )+ " ");
        }
        
        }
	}	
}