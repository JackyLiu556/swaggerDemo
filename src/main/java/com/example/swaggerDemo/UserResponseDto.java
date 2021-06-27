package com.example.swaggerDemo;

import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All details about the User ")
@ResponseBody
public class UserResponseDto {

	@ApiModelProperty(notes = "The database generated User name",position=1,value = "resultCode",example="00001")
    public String resultCode;
    @ApiModelProperty(notes = "The database generated User phone",position=3,value = "resultMsg",example="回傳成功")
    public String resultMsg;
    
	public UserResponseDto(String resultCode, String resultMsg) {
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}
}
