import java.util.*;

public class Rectangle
{
	private Range xRange;
	private Range yRange;

  public Rectangle ( double xLow, double yLow, double xHigh, double yHigh )
  {
  	xRange = new Range(xLow,xHigh);
  	yRange = new Range(yLow,yHigh);
  }

  public Range getXRange(){
  	return xRange;
  }

  public Range getYRange(){
  	return yRange;
  }

  public boolean disjoint( Rectangle o ){
  	return (o.getXRange().disjoint(xRange)) || (o.getYRange().disjoint(yRange));
  }

  public boolean isIn( double x, double y ){
  	return xRange.isIn(x) && yRange.isIn(y);
  }

  public double distance( double x, double y ){
  	if (isIn(x,y)){
  		return 0;
  	}
  	else{
  		return Math.sqrt(Math.pow(xRange.distance(x),2))+Math.sqrt(Math.pow(yRange.distance(y),2));}
  }

}