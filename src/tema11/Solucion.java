package tema11;

public class Solucion {

	String texto = "texto class Solucion";
	private int valor = 100;

	void setTexto(String texto) {
		this.texto = texto;
	};

	void setValor(int valor) {
		this.valor = valor;
	};

	// Soluciones a partir de aqui
	class Sol {

		String getTexto() {
			return texto;
		}

		int getValor() {
			return valor;
		}

		void setValor(int nuevoValor) {
			valor = nuevoValor;
		}

	}

	static class SolEstatica {

	}

	// La solucion del ejericio 5 va aqui dentro
	void foo() {
		int numero = 12;

		// SOlucion aqui
		class ClaseLocal {
			void probar() {
				System.out.println(numero);
			}
		}

		ClaseLocal local = new ClaseLocal();
		local.probar();

	}


}
