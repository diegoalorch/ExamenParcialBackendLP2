package pe.apirestoracle.service;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import pe.apirestoracle.entity.Producto;

public interface ProductoService {

	int create(Producto p);
    int update(Producto p);
    int update(int id);
    int delete(int id);
    List<Map<String, Object>> read(int id);
    List<Map<String, Object>> readAll();
    List<GrantedAuthority> buscarRolUser(int iduser);
    void convertitMap(Map<String, Object> map);
}
