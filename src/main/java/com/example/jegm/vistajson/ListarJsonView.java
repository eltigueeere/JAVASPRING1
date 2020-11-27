package com.example.jegm.vistajson;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


@Component("listar")
public class ListarJsonView extends MappingJackson2JsonView {

	@Override
	protected Object filterModel(Map<String, Object> model) {
		// TODO Auto-generated method stub
		
		//System.out.println( super.filterModel(model));
		return super.filterModel(model);
	}
	
	

}
