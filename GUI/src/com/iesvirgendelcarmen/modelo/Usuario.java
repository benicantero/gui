package com.iesvirgendelcarmen.modelo;

public class Usuario {

		private String nombre;
		private String apellido;
		private Sexo sexo ;
		private int edad;
		
		public Usuario() {};
		
		public Usuario(String nombre, String apellido, int edad, Sexo sexo) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.sexo = sexo;
			this.edad = edad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Sexo getSexo() {
			return sexo;
		}

		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		@Override
		public String toString() {
			return " " +nombre + " " + apellido + ", " + sexo + "de " + edad +" años";
		}

		
}
