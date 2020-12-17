package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ILunboimageDAO;
import service.ILunboimageService;
import vo.Lunboimage;
@Service
public class LunboimageServiceimpl implements ILunboimageService {
	@Autowired
	private ILunboimageDAO Lunboimage;
	
	@Override
	public List<Lunboimage> queryimages() {
		// TODO Auto-generated method stub
		return Lunboimage.queryimages();
	}

}
