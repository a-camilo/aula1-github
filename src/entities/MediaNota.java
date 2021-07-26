package entities;

public class MediaNota {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double media() {
		return nota1 + nota2 + nota3;
	}

	public double missingPoints() {
		if (media() < 60.0) {
			return 60.0 - media();
		} else {

			return 0.0;
		}
	}
}
