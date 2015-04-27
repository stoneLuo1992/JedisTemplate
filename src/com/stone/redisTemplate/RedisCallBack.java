package com.stone.redisTemplate;

import redis.clients.jedis.Jedis;

public interface RedisCallBack<T> {

	public T doInRedis(Jedis jedis);
	
}
