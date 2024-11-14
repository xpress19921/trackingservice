package com.delapi.microserviceapp.controller;

import com.delapi.microserviceapp.config.LoggingRequestInterceptor;
import com.delapi.microserviceapp.model.atalantis.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.client.ClientHttpRequestInterceptor;

@CrossOrigin
@RestController
public class AtlantisApiController {

	/*
	 * @Autowired private RestTemplate restTemplate;
	 */

    @PostMapping("/atlantis-tracking")
    public ResponseEntity<?> callThirdPartyApi(@RequestBody AtlanticReq myRequest) {
        // Define the third-party API URL
        String thirdPartyUrl = "http://live.tccs.in/api/v1/Tracking/Tracking";
        
        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
        interceptors.add(new LoggingRequestInterceptor());
        restTemplate.setInterceptors(interceptors);

        try {
            // Call the third-party API with a POST request and get the response;
            ResponseEntity<AtlantisResp> responseEntity = restTemplate.postForEntity(
                thirdPartyUrl,
                myRequest,
                AtlantisResp.class
            );

            // Check for non-null body
            AtlantisResp thirdPartyResponse = responseEntity.getBody();
            
            System.out.println("Third-party API response: " + responseEntity.getBody());


            if (thirdPartyResponse != null && thirdPartyResponse.getResponse() != null) {
                return ResponseEntity.ok(thirdPartyResponse);
            } else {
                return ResponseEntity.status(502).body("Third-party response is null");
            }

        } catch (Exception e) {
            // Handle any errors that occur during the API call
            return ResponseEntity.status(500).body("Error fetching data from third-party API: " + e.getMessage());
        }
    }
}
