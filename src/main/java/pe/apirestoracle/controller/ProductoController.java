package pe.apirestoracle.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.apirestoracle.entity.Producto;
import pe.apirestoracle.service.ProductoService;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	@GetMapping("/all")

	public List<Map<String, Object>> readAll(){
	    return productoService.readAll();
	}
	@PostMapping("/add")
	public int create(@RequestBody Producto p) {
		return productoService.create(p)
;	}
	@PutMapping("/update/{id}")
	//este metodo permite modificar una persona
    public int update(@RequestBody Producto producto,@PathVariable int id) {
		producto.setIdproducto(id);;
		
	return productoService.update(producto);
	}
}