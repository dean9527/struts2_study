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
		System.out.println("action类名："+invocation.getAction().getClass().getName());
		System.out.println("action中被执行到的方法名字:"+invocation.getProxy().getMethod());
		Map<String, Object> map = invocation.getInvocationContext().getParameters();
		for(Map.Entry<String, Object> entry : map.entrySet()){
			System.out.println(entry.getKey() + ":" + ((String[])entry.getValue())[0]);
		}
		//invocation的invoke会调用action类下的execute或login方法
		result = invocation.invoke();
		System.out.println("-------after--------");
		return result;
	}

}
