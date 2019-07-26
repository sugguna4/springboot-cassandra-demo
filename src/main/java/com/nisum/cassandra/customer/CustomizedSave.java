package com.nisum.cassandra.customer;

public interface CustomizedSave<T> {
	<S extends T> S save(S entity, int ttl);
}
