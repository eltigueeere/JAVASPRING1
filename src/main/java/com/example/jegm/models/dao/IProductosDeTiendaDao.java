package com.example.jegm.models.dao;

import java.util.List;

import com.example.jegm.models.entity.ProductosDeTienda;

public interface IProductosDeTiendaDao  {
	
	public List<ProductosDeTienda> findAll();
	
	public void save(ProductosDeTienda productosdetienda);

}
