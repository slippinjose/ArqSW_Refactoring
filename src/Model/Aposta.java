package Model;

/**
 * Class which represents a bet.
 * @author José Cortez
 */
public class Aposta {

	private Apostador apostador;
	private float valor;
	private Evento.Resultado resultado;
	private Odd odd_fixada;


        /**
         * Empty constructor.
         */
	public Aposta(){
		this.apostador = null;
		this.valor = 0;
		this.resultado = null;
		this.odd_fixada = null;
	}

        /**
         * Param constructor.
         * @param apostador Punter who made the bet.
         * @param valor Value of the bet.
         * @param resultado The option chosen by the punter.
         * @param odd_actual The fixed odds of the bet.
         */
	public Aposta(Apostador apostador, float valor, Evento.Resultado resultado, Odd odd_actual) {
		this.apostador = apostador;
		this.valor = valor;
                this.resultado = resultado;
		this.odd_fixada = odd_actual.clone();
	}

	// getter and setters
        /** Getters**/
	public Apostador getApostador() {return apostador;}
        public Evento.Resultado getResultado() {return resultado;}
        public float getValor() {return valor;}
        public Odd getOdd_fixada() {return odd_fixada;}
        /**Setters*/
	public void setOdd_fixada(Odd odd_fixada) { this.odd_fixada = odd_fixada.clone();}
        public void setValor(float valor) { this.valor = valor;}
        public void setApostador(Apostador apostador) { this.apostador = apostador; }
        public void setResultado(Evento.Resultado resultado) { this.resultado = resultado;}

        
        
        
        /**Equals**/
        @Override
        public boolean equals (Object o) {
            if (this==o) return true;
            if (o==null || o.getClass()!=this.getClass()) return false;
            Aposta a = (Aposta)o;
            return (this.apostador.equals(a.getApostador()) && this.valor==a.getValor() && this.odd_fixada.equals(a.getOdd_fixada())
                    && this.resultado.equals(a.getResultado()));
        }

}