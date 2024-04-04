package com.distinctcombinations;

import java.util.ArrayList;
import java.util.List;

public class CombinationFinder {

	public static List<List<Integer>> findCombinations(int[] nums, int k) {
		List<List<Integer>> combinations = new ArrayList<>();
		backtrack(nums, k, 0, new ArrayList<>(), combinations);
		return combinations;
	}

	private static void backtrack(int[] nums, int k, int start, List<Integer> path, List<List<Integer>> combinations) {
		if (path.size() == k) {
			combinations.add(new ArrayList<>(path));
			return;
		}
		for (int i = start; i < nums.length; i++) {
			path.add(nums[i]);
			backtrack(nums, k, i + 1, path, combinations);
			path.remove(path.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int k = 2;
		List<List<Integer>> result = findCombinations(nums, k);
		for (List<Integer> combination : result) {
			System.out.println(combination);
		}
	}
}