package utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class utils {
	
	static NumberFormat formatandoValores = new DecimalFormat("Rs #,##0.00");
	
	public static String doubleToString(Double valor) {
		return formatandoValores.format(valor);
	}
	}
