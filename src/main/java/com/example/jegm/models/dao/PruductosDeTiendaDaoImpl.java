package com.example.jegm.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.example.jegm.models.entity.ProductosDeTienda;


@Repository
public class PruductosDeTiendaDaoImpl implements IProductosDeTiendaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional()
	@Override
	public List<ProductosDeTienda> findAll() {
		// TODO Auto-generated method stub
		//System.out.println( "PruductosDeTiendaDaoImpl-->" + em.createQuery("from ProductosDeTienda").getResultList());
		return em.createQuery("from ProductosDeTienda").getResultList();
	}

	@Transactional()
	public void save(ProductosDeTienda productosdetienda) {
		// TODO Auto-generated method stub
		em.persist(productosdetienda);
	}


}
