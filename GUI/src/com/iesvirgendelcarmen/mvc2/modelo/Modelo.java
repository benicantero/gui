package com.iesvirgendelcarmen.mvc2.modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Modelo {

	private String operacion;
	private int operando1;
	private int operando2;
	
	String regex = "^(\\d+)\\s*([\\+\\-\\*/])\\s*([0-9]+)$";
	Pattern pattern = Pattern.compile(regex);
	
	
	public Modelo(String operacion) throws ModeloOperacionException {  // operacion 25-9
		/*if (operacion.matches(regex)) {
		System.out.println("operacion válida");
		}else throw new ModeloOperacionException("operacion no permitda");
	}*/
		Matcher matcher = pattern.matcher(operacion);
		if(matcher.find()) {
			this.operacion = matcher.group(2);
			this.operando1 = Integer.parseInt(matcher.group(1));
			this.operando2 = Integer.parseInt(matcher.group(3));
			//System.out.println(operacion);
			//System.out.println(operando1);
			//System.out.println(operando2);

		}else throw new ModeloOperacionException("Operacion no permitida");
	}
	
	
	public int devolverResultado() {
		switch (operacion) {
		case "+":
			return operando1 + operando2;
		case "*":
			return operando1 * operando2;
		case "/":
			return operando1 / operando2;
		default:
			return operando1 - operando2;
		}
		
	}
	
	
	/*public static void main(String[] args) {
		try {
			Modelo m = new Modelo("3+3");
			System.out.println(m.devolverResultado());
		} catch (ModeloOperacionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
