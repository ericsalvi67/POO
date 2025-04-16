package ucs;

public class Principal {
	
	public static void main(String[] args) {
		
		Veiculo v = new Carro("ABC1234");
		
		v.acelerar(10);
		v.acelerar(20);
		v.frear(5);
	
		System.out.println(v);
		
		Onibus o = new Onibus("XYZ6543", 50);
		
		//o.setPlaca("XYZ6543");
		//o.setNroPassageiros(50);
		o.acelerar(-100);

		System.out.println(o);
		
		Caminhao c = new Caminhao("KEK1234", 15000);
		c.acelerar(67);
		
		System.out.println(c);
		
		OnibusEletrico oe = new OnibusEletrico("ELE2424",47,660);
		oe.acelerar(83);
		
		Marca m = new Marca();
		m.setNome("VW");
		oe.setMarca(m);
		
		System.out.println(oe);
	}
}
