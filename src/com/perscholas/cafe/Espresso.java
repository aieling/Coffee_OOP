package com.perscholas.cafe;

public class Espresso extends Product {

	private boolean extraShot;
	private boolean macchiato;

	public Espresso() {
		super();
	}

	public Espresso(String name, int price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

	@Override
	int calculateProductTotal(int price, int quantity) {
		// TODO Auto-generated method stub
		if (extraShot && macchiato) {
			return price * quantity + 2 * quantity + 1*quantity;
		}
		if (extraShot && !macchiato) {
			return price * quantity + 2 * quantity;
		} if(!extraShot && macchiato) {
			return price * quantity + 1 * quantity;
		} else {
			return price * quantity;
		}
	}

}
