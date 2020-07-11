package br.com.amsj.aws.lambda.dto;

import java.io.Serializable;

public class CarDtoOutput implements Serializable {
	
	private static final long serialVersionUID = 3298133020570677852L;

	public CarDtoOutput() { }
	
	public CarDtoOutput(CarDtoInput carDtoInput) {
		
		if(carDtoInput != null) {
			this.name = carDtoInput.getName();
			this.model = carDtoInput.getModel();
			this.color = carDtoInput.getColor();
		}
	}
	
	private String name;
	private String model;
	private String color;
	private String details;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return "CarDtoOutput [name=" + name + ", model=" + model + ", color=" + color + ", details=" + details + "]";
	}
}
