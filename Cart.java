package com.tap.utility;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	int restaurantId;
	
	public int getRestaurantId() {
		return restaurantId;
	}





	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}




	private Map<Integer,CartItem> items; 
	
	public Cart(){
		this.items = new HashMap<>();
		
	}
	
	
	
	

	public void addItem(CartItem item) {
		int itemId=item.getItemId();
		if(items.containsKey(itemId))
		{
			CartItem existingItem=items.get(itemId);
			existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
		}
		else
		{
			items.put(itemId, item);
		}
		
	}
	
	
	

	public void updateItem(int itemId, int quantity) {
		
		if(items.containsKey(itemId)) {
			
			if(quantity<=0) {
				items.remove(itemId);
			}else {
				items.get(itemId).setQuantity(quantity);
			}
		}
		
	}
	
	

	public void removeItem(int itemId) {
		
		items.remove(itemId);
		
	}

	
	public Map<Integer,CartItem> getItems(){
		return items;
		
	}
	
	
	
	public double getTotalPrice() {
		
		return items.values().stream().mapToDouble(item->item.getPrice() * item.getQuantity()).sum();
	}
	
	
	
	
	public void clear() {
		items.clear();
	}
	

}
