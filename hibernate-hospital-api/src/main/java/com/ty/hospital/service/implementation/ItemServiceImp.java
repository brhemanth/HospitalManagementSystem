package com.ty.hospital.service.implementation;

import java.util.List;

import com.ty.hospital.dao.implematation.ItemDaoImp;
import com.ty.hospital.dto.Item;
import com.ty.hospital.service.ItemService;

public class ItemServiceImp implements ItemService {
	ItemDaoImp itemDaoImp = new ItemDaoImp();
	
	public Item saveItem(Item item, int mid) {
		return itemDaoImp.saveItem(item, mid);
	}

	public Item getItemById(int id) {
		return itemDaoImp.getItemById(id);
	}

	public List<Item> getItemByMedOrderId(int mid) {
		return itemDaoImp.getItemByMedOrderId(mid);
	}

	public Item updateItem(Item item, int id) {
		return itemDaoImp.updateItem(item, id);
	}

	public boolean deleteItemById(int id) {
		return itemDaoImp.deleteItemById(id);
	}
}
