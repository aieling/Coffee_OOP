package com.perscholas.cafe;

public class Cappuccino extends Product{

	private boolean peppermint;
	private boolean whippedCream;
	
	public Cappuccino() {
		super();
	}
	
	public Cappuccino(String name, int price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}
	
	public boolean isPeppermint() {
		return peppermint;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public boolean isWhippedCream() {
		return whippedCream;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}

	@Override
	int calculateProductTotal(int price, int quantity) {
		// TODO Auto-generated method stub
		if (peppermint && whippedCream) {
			return price * quantity + 2 * quantity + 1*quantity;
		}
		if (peppermint && !whippedCream) {
			return price * quantity + 2 * quantity;
		} if(!peppermint && whippedCream) {
			return price * quantity + 1 * quantity;
		} else {
			return price * quantity;
		}
	}

}
