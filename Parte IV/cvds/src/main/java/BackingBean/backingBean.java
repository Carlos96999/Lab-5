package BackingBean;

import java.util.ArrayList;
import java.util.HashMap;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "calculadoraBean")
@ApplicationScoped
public class backingBean
{
	private ArrayList<Float> data;
	private double average;
	private double desviation;
	private double variance;
	private double mode;

	public backingBean()
	{
		average = 0.0;
		desviation = 0.0;
		variance = 0.0;
		mode = 0.0;
	}
	
	public double calculateMean(ArrayList<Float> Mean)
	{
		for(int i=0; i<Mean.size(); i++)
		{
			average += Mean.get(i);
		}
		average = average/2;
		return average;
	}
	
	public double calculateVariance(ArrayList<Float> variance)
	{
		calculateMean(variance);
		
		for(int i=0; i<variance.size(); i++)
		{
			this.variance += Math.pow(variance.get(i)-average, 2);
		}
		this.variance /= variance.size();
		return this.variance;
	}
	
	public double calculateStandardDeviation(ArrayList<Float> standardDeviation)
	{
		desviation = calculateVariance(standardDeviation);
		desviation = Math.sqrt(desviation);
		return desviation;
	}
	
	public double calculateMode(ArrayList<String> mode)
	{
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i<mode.size(); i++) 
		{
			//Float number = mode.get(i);
			String number = mode.get(i);
			
			if (map.containsKey(number)) 
			{
				map.put(number, map.get(number) + 1);
			} 
			else 
			{
				map.put(number, 1);
			}
		}
		
		String moda = "";
		int mayor = 0;
		
		for (HashMap.Entry<String, Integer> entry : map.entrySet())
		{
			if (entry.getValue() > mayor) 
			{
				mayor = entry.getValue();
				moda = entry.getKey();
			}
		}
		return 1.0;
	}
	
	public void restart()
	{
		average = 0.0;
		desviation = 0.0;
		variance = 0.0;
		mode = 0.0;
	}
	
	/*
	 * Conjunto de Get's
	 */
	public ArrayList<Float> getData()
	{
		return data;
	}
	
	public double getMean()
	{
		return average;
	}
	
	public double getDesviation()
	{
		return desviation;
	}
	
	public double getVariance()
	{
		return variance;
	}
	
	public double getMode()
	{
		return mode;
	}
	
	public int getCount()
	{
		return data.size();
	}
	
	/*
	 * Conjunto de Set's
	 */
	public void setData(ArrayList<Float> data)
	{
		this.data = data;
	}
	
	/*public void setMean(double average)
	{
		this.average = average;
	}
	
	public void setDesviation(double standardDeviation)
	{
		desviation = standardDeviation;
	}
	
	public void setVariance(double variance)
	{
		this.variance = variance;
	}
	
	public void setMode(double mode)
	{
		this.mode = mode;
	}*/
}
