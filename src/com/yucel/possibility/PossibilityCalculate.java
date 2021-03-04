package com.yucel.possibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PossibilityCalculate {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");

		List<String> sizes = new ArrayList<>();
		sizes.add("s");
		sizes.add("m");
		sizes.add("l");
		sizes.add("xl");

		List<String> patterns = new ArrayList<>();
		patterns.add("cotton");
		patterns.add("leather");

		List<List<String>> newList = new ArrayList<>();

		newList.add(colors);
		newList.add(sizes);
		newList.add(patterns);

		func(newList);

	}

	public static void func(List<List<String>> inputs) {
		// red-s-cotton
		// red-s-leather
		// ...
		// green-xl-leather
		if (inputs.size() > 2) {
			List<String> temp = new ArrayList<>();
			temp = inputs.get(0);
			List<String> list = null;
			for (int i = 1; i < inputs.size(); i++) {
				list = calculate(temp, inputs.get(i));
				temp = list;
			}

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} else {
			for (int i = 0; i < inputs.get(0).size(); i++) {
				System.out.println(inputs.get(0).get(i));
			}
		}

	}

	public static List<String> calculate(List<String> list, List<String> list2) {
		List<String> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				newList.add(list.get(i) + " " + list2.get(j));
			}

		}
		return newList;
	}

}
