package br.com.amsj.aws.lambda.dto;

import java.io.Serializable;

public class CarDtoInput implements Serializable {	
	
	private static final long serialVersionUID = 3160444876302732851L;

	private String name;
	private String model;
	private String color;

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
	@Override
	
	public String toString() {
		return "CarDtoInput [name=" + name + ", model=" + model + ", color=" + color + "]";
	}
}
