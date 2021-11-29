import java.util.*;

public class Range
{
	private double low,high;

	 public Range( double l, double h )
	 {
	 	 low = Math.min(l,h);
	 	 high = Math.max(l,h);
	 }

	 public double getLow()
	 {
	 	return low;
	 }

	 public double getHigh()
	 {
	 	return high;
	 }

	 public boolean disjoint( Range o )
	 {
	 	return high < o.getLow() || low > o.getHigh() ;
	 }

	 public boolean isIn( double p )
	 {

	 	if (p >= getLow() && p <= getHigh())
	 	{
	 		return true;
	 	}
	 	else{ return false;}

	 }

	 public double distance( double p ){
	 	if (isIn(p)==true){
	 		return 0;
	 	}
	 	else if (p > getHigh()){
	 		return p-getHigh();
	 	}
	 	else{
	 		return getLow()-p; 
	 	}
	 }
}