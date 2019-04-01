package com.gmail.cactus.cata;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();

		ArmorStand as = new ArmorStand();
		as.setRotation((float) arrondi(random.nextFloat() * 360),
				(float) arrondi(-35.0f + (35.0f - -35.0f) * random.nextFloat()),
				(float) arrondi(-60.0f + (60.0f - -60.0f) * random.nextFloat()),
				(float) arrondi(-60.0f + (60.0f - -60.0f) * random.nextFloat()),
				(float) arrondi(-30.0f + (30.0f - -30.0f) * random.nextFloat()),
				(float) arrondi(-60.0f + (60.0f - -60.0f) * random.nextFloat()),
				(float) arrondi(-30.0f + (30.0f - -30.0f) * random.nextFloat()),
				(float) arrondi(-145.0f + (30.0f - -145.0f) * random.nextFloat()),
				(float) arrondi(-80.0f + (45.0f - -80.0f) * random.nextFloat()),
				(float) arrondi(-145.0f + (30.0f - -145.0f) * random.nextFloat()),
				(float) arrondi(-80.0f + (45.0f - -80.0f) * random.nextFloat()));
		as.show();

	}

	public static double arrondi(double A) {

		return (double) ((int) (A * Math.pow(10, 1) + .5)) / Math.pow(10, 1);

	}
}
