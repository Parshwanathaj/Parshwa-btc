package com.btc.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitAndSumOddEven {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> odd = num.stream().filter(R -> R % 2 != 0).map(R -> R * R).collect(Collectors.toList());

		System.out.println(odd);
	}
}