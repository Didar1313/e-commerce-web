package com.sheryians.major.global;

import java.util.ArrayList;
import java.util.List;

import com.sheryians.major.model.Product;

public class GlobalData {
	public static List<Product>cart;
	static {
		cart = new ArrayList<Product>();
	}
}
