package com.ust.rest.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddStepDef {
	@Given("two numbers {int} and {int}")
	public void two_numbers_and(Integer int1, Integer int2) {
		System.out.println("Two Numbers");
	}

	@Then("add and result is {int}")
	public void add_and_result_is(Integer int1) {
		System.out.println("Results");
	}
}
