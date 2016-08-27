package com.cfsoap.ws.service;

import java.util.UUID;

import javax.jws.WebService;

@WebService(endpointInterface="com.cfsoap.ws.service.AddEmployeePortType")
public class AddEmployeePortTypeImpl implements AddEmployeePortType {

	@Override
	public EmployeeResponse addEmployee(Employee employee) {
		EmployeeResponse empResp = null;
		if(employee!=null){
			empResp = new EmployeeResponse();
			empResp.setEmpId(UUID.randomUUID().toString());
			empResp.setType(employee.getType());
		}
		return empResp;
	}

}
