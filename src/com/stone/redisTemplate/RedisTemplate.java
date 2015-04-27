package com.stone.redisTemplate;

public interface RedisTemplate {
	
	public <T> T excute(RedisCallBack<T> redisCallBack);
	
}
