package tripulacionIKS;

import java.time.LocalDateTime;

public abstract class Tripulant {
	//atributos
	public static final String bandol = "Imperi Klingon";
	String ID;
	String nom;
	boolean actiu;// Si el metge el dona de baixa a llavors valdrà false.
	LocalDateTime dataAlta;
	int departament;// Departament al qual pertany: comandament (1), // armes (2), timó i navegació (3), enginyeria (4) i ciència (5).
	int llocDeServei;// Lloc en el qual serveix: pont (1), enginyeria (2), // cuina (3), infermeria (4) o sala d'armes (5).
	//metodos
	public abstract void ImprimirDadesTripulant();
}
