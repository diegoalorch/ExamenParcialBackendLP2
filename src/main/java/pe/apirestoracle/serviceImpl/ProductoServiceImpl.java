package pe.apirestoracle.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import pe.apirestoracle.dao.ProductoDao;
import pe.apirestoracle.entity.Producto;
import pe.apirestoracle.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDao productoDao;

	    @Override
	    public int create(Producto p) {
	        // TODO Auto-generated method stub
	        return productoDao.create(p);
	    }

	    @Override
	    public int update(Producto p) {
	        // TODO Auto-generated method stub
	        return productoDao.update(p);
	    }

	    @Override
	    public int update(int id) {
	        // TODO Auto-generated method stub
	        return productoDao.update(id);
	    }

	    @Override
	    public int delete(int id) {
	        // TODO Auto-generated method stub
	        return productoDao.delete(id);
	    }

	    @Override
	    public List<Map<String, Object>> read(int id) {
	        // TODO Auto-generated method stub
	        return productoDao.read(id);
	    }

	    @Override
	    public List<Map<String, Object>> readAll() {
	        // TODO Auto-generated method stub
	        return productoDao.readAll();
	    }

	    @Override
	    public List<GrantedAuthority> buscarRolUser(int iduser) {
	        // TODO Auto-generated method stub
	        return null;
	    }

	    @Override
	    public void convertitMap(Map<String, Object> map) {
	        // TODO Auto-generated method stub

	    }

	}