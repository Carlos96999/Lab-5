package BackingBean;

import java.util.ArrayList;
import java.util.HashMap;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.*;
/**
*
* @autores Carlos Amorocho, Jonathan paez
*/
@ManagedBean(name = "calculadoraBean")
@ApplicationScoped

@SessionScoped
public class calculadoraBean {
	private ArrayList<Float> data;
	static String cadenaEntrada = "";
	static double resultadoMean = 0;
	static double resultadoVariance = 0;
	static double resultadoStandardDeviation = 0;
	static double resultadoMode = 0;
	static double cantidadNumero = 0;


	public calculadoraBean(){
    	
    }
	/**
	 *Este metodo elimina el punto y coma de una cadena
	 * 
	 */
	private static double[] convierteCadena() {
		String[] valores = cadenaEntrada.split(";");
		double[] resultadoValores = new double[valores.length];
		for (int i = 0; i<valores.length;i++) {
			resultadoValores[i]=Double.parseDouble(valores[i]);			
		}
		cantidadNumero = resultadoValores.length;
		return resultadoValores;
	}
	
	/**
	 *
	 * Este metodo calcula el promedio
	 */
	public static double calculateMean() {
		double[] Mean = convierteCadena();
        double con = 0;
        for (int i = 0; i < Mean.length; i++) {
            con += Mean[i];
        }
        resultadoMean = con / Mean.length;
        return resultadoMean ;

    }
	/**
	 *
	 * Este metodo calcula la varianza
	 */
    public static double calculateVariance(){
		double[] variance= convierteCadena();
        
		double promedio=calculateMean();
		double con=0;
		for(int i=0; i<variance.length; i++)
		{
			con += Math.pow(variance[i]-promedio, 2);
		}
		con /= variance.length;
		resultadoVariance=con;
		return resultadoVariance;
    }
    /**
    *
    * Este metodo calcula la desviacion estandar
    */
    public static double calculateStandardDeviation(){    	
        resultadoStandardDeviation = Math.sqrt(calculateVariance());
        return resultadoStandardDeviation;
        
    }
    /**
    *
    * Este metodo calcula la moda
    */
    public static double calculateMode() {
        double maxCount = 0;
        double resultadoMode=0;
        double m[] = convierteCadena();
        double n = m.length;
        for (int i = 0; i < n; ++i) {
           double count = 0;
           for (int j = 0; j < n; ++j) {
              if (m[j] == m[i])
              ++count;
           }
           if (count > maxCount) {
              maxCount = count;
              resultadoMode = m[i];
           }
        }
        return resultadoMode;
     }
    /**
    *
    * Este metodo reestablece los valores
    */
    public static void restart(){
    	cadenaEntrada = "";
    	resultadoMean = 0;
    	resultadoVariance = 0;
    	resultadoStandardDeviation = 0;
    	resultadoMode = 0;
    	cantidadNumero = 0;
    }
         
    /**
    *
    * Este metodo entrega la cadena de entrada digitada por el usuario
    */
    public String getCadenaEntrada() {
		return cadenaEntrada;
	}
    /**
    *
    * Este metodo establece la cadena de entrada
    */
	public void setCadenaEntrada(String cadenaEntrada) {
		this.cadenaEntrada = cadenaEntrada;
	}
	/**
	 *
	 * Este metodo calcula el promedio
	 */
	public double getResultadoMean() {
		return resultadoMean;
	}
	/**
	 *
	 * Este metodo inicializa el valor del promedio
	 */
	public void setResultadoMean(double resultadoMean) {
		this.resultadoMean = resultadoMean;
	}
	/**
	 *
	 * Este metodo obtiene el valor de la varianza
	 */
	public double getResultadoVariance() {
		return resultadoVariance;
	}
	/**
	 *
	 * Este metodo inicializa el valor de la varianza
	 */
	public void setResultadoVariance(double resultadoVariance) {
		this.resultadoVariance = resultadoVariance;
	}
	/**
	 *
	 * Este metodo obtiene el valor de la desviacion estandar
	 */
	public double getResultadoStandardDeviation() {
		return resultadoStandardDeviation;
	}
	/**
	 *
	 * Este metodo inicializa el valor de la desviacion estandar
	 */
	public void setResultadoStandardDeviation(double resultadoStandardDeviation) {
		this.resultadoStandardDeviation = resultadoStandardDeviation;
	}
	/**
	 *
	 * Este metodo obtiene el valor de la moda
	 */
	public double getResultadoMode() {
		return resultadoMode;
	}
	/**
	 *
	 * Este metodo inicializa el valor el valor de la moda
	 */
	public void setResultadoMode(double resultadoMode) {
		this.resultadoMode = resultadoMode;
	}
	/**
	 *
	 * Este metodo inicializa el valor del promedio
	 */
	public double getCantidadNumero() {
		return cantidadNumero;
	}

	public void setCantidadNumero(int cantidadNumero) {
		this.cantidadNumero = cantidadNumero;
	}
	


}
