package com.cortes.spring.flipkart.model;

public class ProductDetails {
	private String Style_Code,Closure,Pockets,Fabric,Pattern,Color;

	public String getStyle_Code() {
		return Style_Code;
	}

	public void setStyle_Code(String style_Code) {
		Style_Code = style_Code;
	}

	public String getClosure() {
		return Closure;
	}

	public void setClosure(String closure) {
		Closure = closure;
	}

	public String getPockets() {
		return Pockets;
	}

	public void setPockets(String pockets) {
		Pockets = pockets;
	}

	public String getFabric() {
		return Fabric;
	}

	public void setFabric(String fabric) {
		Fabric = fabric;
	}

	public String getPattern() {
		return Pattern;
	}

	public void setPattern(String pattern) {
		Pattern = pattern;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "ProductDetails [Style_Code=" + Style_Code + ", Closure=" + Closure + ", Pockets=" + Pockets
				+ ", Fabric=" + Fabric + ", Pattern=" + Pattern + ", Color=" + Color + "]";
	}
	
}
