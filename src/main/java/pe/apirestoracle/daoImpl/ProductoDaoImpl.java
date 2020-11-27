package pe.apirestoracle.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import oracle.jdbc.internal.OracleTypes;
import pe.apirestoracle.dao.ProductoDao;
import pe.apirestoracle.entity.Producto;


@Component
public class ProductoDaoImpl implements ProductoDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PRODUCTO.SP_INS_PRODUCTO(?,?,?)", p.getNomprod(), p.getPrecio(), p.getStock());
	}

	@Override
	public int update(Producto p) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PKG_PRODUCTO.SP_UPD_PRODUCTO(?,?,?,?)", p.getIdproducto(), p.getNomprod(), p.getPrecio(), p.getStock());
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PRODUCTO.SP_DEL_PRODUCTO(?)", id);
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> producto = new ArrayList<>();
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_PRODUCTO") //nombre del paquete
				.withProcedureName("SP_LIS_PRODUCTO") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CURSOR_PRODUCTO", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));	
				Map<String, Object> map = simpleJdbcCall.execute();
				producto.add(map);
		return producto;
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

