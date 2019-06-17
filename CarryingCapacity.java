package carryingCapacity;

import java.lang.Math;
import java.math.BigInteger;
import java.util.Scanner;

public class CarryingCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Asks user for the population number they want to calculate.
		Scanner userPop = new Scanner(System.in);
		BigInteger uPop = new BigInteger("0");

		System.out.println(
				"This program calculates the Earth's carrying capacity, weighing in the factors of food, water, and fuel.");
		System.out.println("Please enter the population amount that you would like to calculate.");

		uPop = userPop.nextBigInteger();

		carryingCalc(uPop);

		userPop.close();
	}

	public static void carryingCalc(BigInteger uPop) {
		//Total Amounts of food and water in the Earth as of 2019.
		BigInteger foodAmount = new BigInteger("10000000000000000000");
		BigInteger waterAmount = new BigInteger("498960000000000000000");

		//Total Amounts needed per one person.
		BigInteger peopFed = new BigInteger("730000");
		BigInteger peopWater = new BigInteger("730");
		BigInteger houseWater = new BigInteger("124100");

		//Total Amounts that need to be produced based on Poulation Numbers.
		BigInteger waterYearly, foodYearly, houseYearly;

		waterYearly = uPop.multiply(peopWater);
		foodYearly = uPop.multiply(peopFed);
		houseYearly = uPop.multiply(houseWater);
		
		//Total Carrying Capacity based on population numbers and total amounts.
		BigInteger totalFood, totalWater, carryCap;

		totalFood = foodAmount.divide(uPop);
		totalWater = waterAmount.divide(uPop);

		carryCap = totalWater.subtract(totalFood);

		System.out.println("The Earth's total carrying capacity is: " + carryCap);

		System.out.println("To continue this number there must be: " + waterYearly + " gallons for human use. "
				+ foodYearly + " kilos of food. " + houseYearly + " gallons for house use.");

	}

}
