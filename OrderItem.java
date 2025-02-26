package com.tap.model;

public class OrderItem 
{
	
		private int orderItemId;
		private int orderId;
		private int menuId;
		private int quantity;
		private int totalPrice;
		
		public OrderItem() {

		}

		public OrderItem(int orderItemId, int orderId, int menuId, int quantity, int totalPrice) {
			super();
			this.orderItemId = orderItemId;
			this.orderId = orderId;
			this.menuId = menuId;
			this.quantity = quantity;
			this.totalPrice = totalPrice;
		}

		public OrderItem(int orderId, int itemId, int quantity, int totalPrice) {
			this.orderId = orderId;
			this.menuId = itemId;
			this.quantity = quantity;
			this.totalPrice = totalPrice;		}

		public int getOrderItemId() {
			return orderItemId;
		}

		public void setOrderItemId(int orderItemId) {
			this.orderItemId = orderItemId;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public int getMenuId() {
			return menuId;
		}

		public void setMenuId(int menuId) {
			this.menuId = menuId;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}



}
