package br.com.bcb.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.bcb.response.Sms;


@FeignClient(name = "bcb-sms-service")
public interface SmsProxy {
	
	@PostMapping(value="sms-service")
	public Sms createSms(@RequestBody Sms sms);
	
	@GetMapping(value="/sms-service/byClient/{id}")
	public Sms findByClientId(@PathVariable("id") Long client_id);
}
