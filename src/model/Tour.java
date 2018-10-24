package model;

import java.util.ArrayList;
import java.util.List;

public class Tour {
	
	private List <Step> steps;
	private List <Delivery> deliveryPoints;
	private int deliveryMan;
	
	public Tour (List <Step> steps, List <Delivery> deliveryPoints, int deliveryMan){
		this.steps = new ArrayList<>(steps);
		this.deliveryPoints = new ArrayList<>(deliveryPoints);
		this.deliveryMan = deliveryMan; 
	}
	
}
