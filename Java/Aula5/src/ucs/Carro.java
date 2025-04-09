package ucs;

public class Carro {
	
	private String nome;
	private int capacidade;
	private int pesoMax;
	private Pessoa[] passageiros;
	
	public Carro(String nome, int capacidade, int pesoMax) {
		this.nome = nome;
		this.capacidade = capacidade;
		this.pesoMax = pesoMax;
		this.passageiros = new Pessoa[this.capacidade];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}
	
	public boolean embarcar(Pessoa p) {
		int pos = this.getPosicaoVaga();
		boolean suporta = (this.getPesoMax() - this.getPesoTotal() >= p.getPeso());
		
		if (pos >= 0 && suporta) {
			p.setCarro(this);
			this.passageiros[pos] = p;
			return true;
		}
		return false;
	}
	
	public boolean desembarcar(String nome) {
		int pos = this.getPosicaoPessoa(nome);
		
		if(pos >= 0) {
			this.passageiros[pos] = null;
			return true;
		}
		
		return false;
	}
	
	private int getPosicaoPessoa(String nome) {
		for(int i = 0; i < this.passageiros.length; i++) {
			if(this.passageiros[i] != null && nome.equals(this.passageiros[i].getNome())) {
				return i;
			}
		}
		return -1;
	}
	
	private int getPosicaoVaga() {
		for(int i = 0; i<this.passageiros.length ; i++) {
			if(this.passageiros[i] == null) {
				return i;
			}
		}

		return -1;
	}
	
	public int getPesoTotal() {
		int peso = 0;
		for(Pessoa p : this.passageiros) {
			if(p != null) {
				peso += p.getPeso();
			}
		}
		return peso;
	}
	
	public int getQuantPassageiros() {
		int cont = 0;
		for(Pessoa p : this.passageiros) {
			if(p != null) {
				cont ++;
			}
		}
		return cont;
	}
	
	public String getSituacao() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("---------------------------------------------------------------------\n");
		sb.append("Carro : " +this.getNome() +"\n");
		sb.append("Capacidade : " +this.getCapacidade()+ "\n");
		sb.append("Peso Maximo: " +this.getPesoMax()+ "\n");
		sb.append("Passageiros : \n");
		for(Pessoa p : this.passageiros ) {
			if(p != null) {
				sb.append("Nome : " +p.getNome()+ ", peso : " +p.getPeso()+ "\n");
			}
		}
		sb.append("Peso total: " +this.getPesoTotal()+ "\n");
		sb.append("Quantidade Passageiros : " +this.getQuantPassageiros()+ "\n");
		sb.append("---------------------------------------------------------------------\n");
		
		return sb.toString();
	}
	
	
	
}

