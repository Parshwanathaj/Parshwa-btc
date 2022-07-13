package com.mobilephone;

import java.util.*;
import java.util.stream.Collectors;

public class MobileStore {
	List<Mobile> mobileList = new ArrayList<>();

	public MobileStore() {
		Mobile m1 = new Mobile("Samsung", "2020edi", 30.76, "large", "10hrs", "128gb", 48);
		Mobile m2 = new Mobile("mi", "2020edi", 16000.76, "medium", "10hrs", "64gb", 48);
		Mobile m3 = new Mobile("onePlus", "2020edi", 48000.76, "large", "24hrs", "128gb", 50);
		// Mobile m1 = new Mobile("Samsung", "2020edi", 30000.76,"large", "10hrs",
		// "128gb", 48);
		// Mobile m1 = new Mobile("Samsung", "2020edi", 30000.76,"large", "10hrs",
		// "128gb", 48);

		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
	}

	public List<Mobile> findPhoneByBrand(String brandName) {
		List<Mobile> brand = mobileList.stream().filter(v -> v.getBrandName().equals(brandName))
//				.map(v->v.getModelName())
				.collect(Collectors.toList());
//		System.out.println(brand);
		return brand;
	}

	// Find the phones whose cost is $500 and above.
	public List<Mobile> findPhoneCostMoreThan500$() {
		List<Mobile> price = mobileList.stream().filter(v -> v.getCost() > 1000).collect(Collectors.toList());

//    	System.out.println(price);
		return price;
	}

	// Enlist the phones which have camera specification as 12 MP and more
	public List<Mobile> findPhonePixelMoreThan12MP() {
		List<Mobile> pixcels = mobileList.parallelStream().filter(v -> v.getCameraPixels() > 12)
				.collect(Collectors.toList());
		return pixcels;
	}

	public static void main(String[] args) {
		MobileStore m5 = new MobileStore();

		System.out.println(m5.findPhoneByBrand("onePlus"));
		System.out.println(m5.findPhoneCostMoreThan500$());
		System.out.println(m5.findPhonePixelMoreThan12MP());
	}

}