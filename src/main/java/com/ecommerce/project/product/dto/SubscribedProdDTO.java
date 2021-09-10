package com.ecommerce.project.product.dto;

import com.ecommerce.project.product.entity.SubscribedProd;

public class SubscribedProdDTO {

	String buyerid;
	String prodid;
	Integer quantity;

	public String getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(String buyerid) {
		this.buyerid = buyerid;
	}

	public String getProdid() {
		return prodid;
	}

	public void setProdid(String prodid) {
		this.prodid = prodid;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public SubscribedProdDTO() {
		super();

	}

	public SubscribedProdDTO(String buyerid, String prodid, Integer quantity) {
		this();
		this.buyerid = buyerid;
		this.prodid = prodid;
		this.quantity = quantity;
	}

	// Converts Entity into DTO
	public static SubscribedProdDTO valueOf(SubscribedProd subscribedprod) {
		SubscribedProdDTO subscribedprodDTO = new SubscribedProdDTO();
		subscribedprodDTO.setBuyerid(subscribedprod.getBuyerid());
		subscribedprodDTO.setProdid(subscribedprod.getProdid());
		subscribedprodDTO.setQuantity(subscribedprod.getQuantity());
		return subscribedprodDTO;
	}
	
	public SubscribedProd createEntity() {
		SubscribedProd subscribe = new SubscribedProd();
		subscribe.setBuyerid(this.getBuyerid());
		subscribe.setProdid(this.getProdid());
		subscribe.setQuantity(this.quantity);
		return subscribe;
		
	}

	@Override
	public String toString() {
		return "SubscribedProdDTO [buyerid=" + buyerid + ", prodid=" + prodid + ", quantity=" + quantity + "]";
	}

}
