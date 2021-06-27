package com.example.swaggerDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

//http://localhost:8080/swagger-ui.html

@Api(tags="UserController",description="類別檔案說明")
@RestController
public class UserController {
	
	  @ApiOperation(value="POST API", notes="API說明 : 測試POST API")
	  @ApiResponses({//
		    @ApiResponse(code = 200, message = "成功"), 
		    @ApiResponse(code = 400, message = "400說明", responseContainer = "Set"),
		})
	  @PostMapping("/api/post" )
	  public ResponseEntity Post(@RequestBody UserRequestDto dto){
		  System.out.println(dto);
	      return ResponseEntity.ok("send post success");
	  }
	  
	  
	  @ApiOperation(value="GET API", notes="API說明 : 測試GET API")
	  @ApiResponses({//
		    @ApiResponse(code = 200, message = "成功"), 
		    @ApiResponse(code = 400, message = "400說明", responseContainer = "Set"),
		})
	  @GetMapping("/api/get")
	  public UserResponseDto Get(){
	      return new UserResponseDto("0001","send success");
	  }
	  
	  
	  @ApiOperation(value="DELETE API", notes="API說明 : 測試DELETE API")
	  @ApiResponses({//
		    @ApiResponse(code = 200, message = "成功"), 
		    @ApiResponse(code = 400, message = "400說明", responseContainer = "Set"),
		})
	  @DeleteMapping("/api/delete")
	  public UserResponseDto Delete(){
	      return new UserResponseDto("0001","send success");
	  }
	  
	  
	  @ApiOperation(value="PUT API", notes="API說明 : 測試PUT API")
	  @ApiResponses({//
		    @ApiResponse(code = 200, message = "成功"), 
		    @ApiResponse(code = 400, message = "400說明", responseContainer = "Set"),
		})
	  @PutMapping("/api/put")
	  public UserResponseDto Put(){
	      return new UserResponseDto("0001","send success");
	  }
}
