package entities;

public class TMB {
	
	public boolean genero;
	public double peso;
	public double altura;
	public int idade;
	public boolean f;

//	public double calculoBasalMasc() {
//		return (int) 66.5 + (13.75 * peso) + (5.0 * altura) - (6.8 * idade);
//	}
//
//	public double calculoBasalFem() {
//		return (int) 665.1 + (9.56 * peso) + (1.8 * altura) - (4.7 * idade);
//	}

	public double calculoBasal() {
		if(genero != f) {
			return (int) 66.5 + (13.75 * peso) + (5.0 * altura) - (6.8 * idade);
		}else {
			return (int) 665.1 + (9.56 * peso) + (1.8 * altura) - (4.7 * idade);
		}
		
		
	}
}
