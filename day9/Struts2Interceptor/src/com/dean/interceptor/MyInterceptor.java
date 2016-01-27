package com.dean.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String result = null;
		System.out.println("-------before--------");
		System.out.println("action������"+invocation.getAction().getClass().getName());
		System.out.println("action�б�ִ�е��ķ�������:"+invocation.getProxy().getMethod());
		Map<String, Object> map = invocation.getInvocationContext().getParameters();
		for(Map.Entry<String, Object> entry : map.entrySet()){
			System.out.println(entry.getKey() + ":" + ((String[])entry.getValue())[0]);
		}
		//invocation��invoke�����action���µ�execute��login����
		result = invocation.invoke();
		System.out.println("-------after--------");
		return result;
	}

}
