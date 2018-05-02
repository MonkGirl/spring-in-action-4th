package com.springinaction.chapter9.config;

import java.util.Map;

import org.springframework.web.reactive.result.view.RequestDataValueProcessor;
import org.springframework.web.server.ServerWebExchange;

public class MyRequestDataValueProcessor implements RequestDataValueProcessor {

	@Override
	public Map<String, String> getExtraHiddenFields(ServerWebExchange arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String processAction(ServerWebExchange arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String processFormFieldValue(ServerWebExchange arg0, String arg1, String arg2, String arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String processUrl(ServerWebExchange arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
