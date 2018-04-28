package com.jrb.assignment2;

import java.util.List;

public interface PurchaseDao {
	public void insert(Purchase purchase);
    public void update(Purchase purchase);
    public void delete(String pid);
    public Purchase find(String pid);
    public Purchase findByQuery(String pid);
    public List<Purchase> findByStatus(String memid);
}
