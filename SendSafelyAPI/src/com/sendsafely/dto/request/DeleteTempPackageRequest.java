package com.sendsafely.dto.request;

import com.sendsafely.enums.GetParam;
import com.sendsafely.enums.HTTPMethod;
import com.sendsafely.json.JsonManager;

public class DeleteTempPackageRequest extends BaseRequest 
{	
	
	private HTTPMethod method = HTTPMethod.DELETE;
	private String path = "/package/" + GetParam.PACKAGE_ID + "/temp/";
	
	public DeleteTempPackageRequest(JsonManager jsonManager) {
		initialize(jsonManager, method, path);
	}
	
	public void setPackageId(String packageId)
	{
		super.setGetParam(GetParam.PACKAGE_ID, packageId);
	}
}
