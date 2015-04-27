package com.stone.redisTemplate.impl;

import com.stone.redisTemplate.RedisCallBack;
import com.stone.redisTemplate.RedisTemplate;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisTemplateImpl implements RedisTemplate{
	
	JedisPool jedisPool;

	@Override
	public <T> T excute(RedisCallBack<T> redisCallBack) {
		Jedis jedis = jedisPool.getResource();
		T result = redisCallBack.doInRedis(jedis);
		jedisPool.returnResource(jedis);
		return result;
	}
	
	
}
