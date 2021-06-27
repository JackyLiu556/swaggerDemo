package com.example.swaggerDemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All details about the User ")
public class UserRequestDto {

	@ApiModelProperty(notes = "The database generated User name",position=1,value = "username",example="jacky")
    public String userName;
    @ApiModelProperty(notes = "The database generated User age",position=2,value = "age",example="30")
    public Integer age;
    @ApiModelProperty(notes = "The database generated User phone",position=3,value = "phone",example="0911222333")
    public String phone;
    
//	 @ApiOperation(value = "API info", notes = "API detailed info")
//     @ApiResponses(value = {@ApiResponse(code = 200, message = "http status info2")})
//     @PostMapping("/api/v2")
//     public UserRequestDto get(
//             @ApiParam(required = true,value = "請傳入UserRequestDto的格式") @RequestBody UserRequestDto dto) {
//         return dto;
//     }
}
