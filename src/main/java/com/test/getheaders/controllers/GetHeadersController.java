package com.test.getheaders.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHeadersController {

	@GetMapping("/getAllHeaders")
	public ResponseEntity<Map<String, List<String>>> getAllHeaders(@RequestHeader(required = false) Map<String, String> headers) {
		
		Map<String, List<String>> results = new HashMap<>();

		headers.forEach((key, value) -> {
			results.put(key, Arrays.asList(value));
		});
		
		return new ResponseEntity<>(results, HttpStatus.OK);
	}

	@GetMapping("/getHeadersByKey")
	public ResponseEntity<Map<String, List<String>>> getHeadersByKey(HttpServletRequest request,
			@RequestParam List<String> headerNames) {
		Map<String, List<String>> results = new HashMap<>();

		for (String headerName : headerNames) {
			if (request.getHeader(headerName) != null) {
				results.put(headerName, Arrays.asList(request.getHeader(headerName)));
			}
		}
		return new ResponseEntity<>(results, HttpStatus.OK);
	}
}
