
public class Date {

	private static short dia;
	private static short mes;
	private static short a�o;
	private static short dias_mes;


	public short getDia () {
		return dia;
	}
	public short getMes () {
		return mes;
	}
	public short getA�o () {
		return a�o;
	}
	public short getDias_Mes () {
		return dias_mes;
	}



	public void setDia (short d) {
		if (getMes() == 2 && (d<=0 || d>getDias_Mes())) {
			System.out.println("El dia introducido no es v�lido.");
			System.exit(0);
		} else {
			System.out.println("El d�a introducido es v�lido.");
			dia = d;
		}
	}

public void setMes (short m) {
	if (m>12 || m<=0) {
		System.out.println("El mes introducido no es v�lido.");
		System.exit(0);
	} else {
		System.out.println("El mes introducido es v�lido.");
		mes = m;
	}
}

public void setA�o (short a) {
	if (a<0 || a>9999) {
		System.out.println("El a�o introducido no es v�lido.");
		System.exit(0);
	} else {
		System.out.println("El a�o introducido es v�lido.");
		a�o = a;
	}
	setDias_mes();
}

public void setDias_mes () {
	if ((double)getA�o()/4==(int)getA�o()/4) {
		if ((double)getA�o()/100==(int)getA�o()/100) {
			if ((double)getA�o()/400==(int)getA�o()/400) {
				dias_mes=29;
				System.out.println("El a�o introducido es bisiesto.");
				System.out.println("Febrero tiene 29 d�as.");
			} else {
				dias_mes=28;
				System.out.println("El a�o introducido no es bisiesto.");
				System.out.println("Febrero tiene 28 d�as.");
			}
		} else {
			dias_mes=29;
			System.out.println("El a�o introducido es bisiesto.");
			System.out.println("Febrero tiene 29 d�as.");
		}
	} else {
		dias_mes=28;
		System.out.println("El a�o introducido no es bisiesto.");
		System.out.println("Febrero tiene 28 d�as.");
	}
	
	// ERROR
	
	/* if (((double)getA�o()/4 == (int)getA�o()/4) && (((double) getA�o()/100 != (int)getA�o()/100) && ((double) getA�o()/400 == (int) getA�o()/400))) {
		dias_mes=29;
		System.out.println("El a�o introducido es bisiesto.");
		System.out.println("Febrero tiene 29 d�as.");
	} else {
		dias_mes=28;
		System.out.println("El a�o introducido no es bisiesto.");
		System.out.println("Febrero tiene 28 d�as.");
	} */
	
	//ERROR
}
}