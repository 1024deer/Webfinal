package service.impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ICatalogDAO;
import service.ICatalogService;
import vo.Catalog;
@Service
public class CatalogServiceimpl implements ICatalogService{
	@Autowired
	private ICatalogDAO CatalogDAO;
	
	@Override
	public ArrayList<Catalog> queryCatalog() {
		
		return CatalogDAO.queryCatalog();
	}

	
}
