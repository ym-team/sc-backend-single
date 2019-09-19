package com.cloud.business.count;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

import com.cloud.business.bussinessSum.BussinessSumBOQ;
import com.cloud.business.bussinessSum.IBussinessSumService;
import com.cloud.util.LogAnnotation;
import com.cloud.util.ratelimiter.ExtRateLimiter;

public class CountController {

	//调用各个count
	
	@Autowired
	private IBussinessSumService bussinessSumService;
	
	/**
	  * 查询总数
	  * @param BussinessSumBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:total:queryCount')")
	@ExtRateLimiter(permitsPerSecond=20,timeout=5)
	@GetMapping("/api-business/total/queryCount")
	public Long queryCount(BussinessSumBOQ bussinessSumBOQ)throws Exception{
		return this.bussinessSumService.queryCount(bussinessSumBOQ);
	}
	
	
}
