package com.delapi.microserviceapp;

import com.delapi.microserviceapp.config.LoggingRequestInterceptor;
import com.delapi.microserviceapp.model.delhivery.DelhResp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.client.ClientHttpRequestInterceptor;

@CrossOrigin
@RestController
public class DelhiveryController {

//    @Autowired
//    private RestTemplate restTemplate;

	@GetMapping(value = "/deltrack")
    public ResponseEntity<?> callThirdPartyGetApi(
            @RequestParam(required = false) String waybill,
            @RequestParam(required = false) String ref_ids,
            @RequestHeader("Authorization") String authToken) {
    	
    	System.out.println("GET-REST-CONTROLLER  "+waybill);
    	System.out.println("GET-REST-CONTROLLER  "+ref_ids);
        
        // Define the third-party API URL with query parameters
        String thirdPartyUrl = "https://track.delhivery.com/api/v1/packages/json/?"; 

        if(waybill!=null) {
        	thirdPartyUrl = thirdPartyUrl +"waybill=" + waybill;
        }
        if(ref_ids!= null) {
        	thirdPartyUrl = thirdPartyUrl +"ref_ids=" + ref_ids;
        }
        
        System.out.println("GET-REST-CONTROLLER  "+authToken);
        System.out.println("GET-REST-CONTROLLER  "+thirdPartyUrl);

        
        // Set custom headers (Authorization, etc.)
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", authToken);  // Pass the Authorization token from the request

        // Create an HttpEntity with headers
        HttpEntity<String> entity = new HttpEntity<>(headers);
        
        
        
        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
        interceptors.add(new LoggingRequestInterceptor());
        restTemplate.setInterceptors(interceptors);

        // Call the third-party API with a GET request and pass the headers
        try{
        ResponseEntity<DelhResp> responseEntity = restTemplate.exchange(
                thirdPartyUrl,
                HttpMethod.GET,
                entity,
                DelhResp.class);

        // Get the response body from the third-party API
        DelhResp thirdPartyResponse = responseEntity.getBody();

        // Create a custom user object for the response
//        User user = new User();
//        user.setName("John Doe");
//        user.setEmail("john.doe@example.com");
//
//        // Create a custom response
//        CustomResponse customResponse = new CustomResponse();
//        customResponse.setUser(user);
//        customResponse.setThirdPartyResponse(thirdPartyResponse);

        // Return the custom response object
        return ResponseEntity.ok(thirdPartyResponse);
        }catch(Exception e) {
        	e.printStackTrace();
        	return ResponseEntity.status(500).body("Error fetching data from third-party API: " + e.getMessage());
        }
    }
}
