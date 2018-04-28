package com.jrb.assignment2;
import java.util.List;

public interface TransCdDao {
	public void insert(TransCd transCd);
    public void update(TransCd transCd);
    public void delete(String transcd);
    public TransCd find(String transcd);
    public TransCd findByQuery(String transcd);
    public List<TransCd> findByStatus(String status);
}
