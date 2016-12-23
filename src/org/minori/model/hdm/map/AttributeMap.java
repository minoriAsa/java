package org.minori.model.hdm.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class AttributeMap implements java.util.Map<String, String> {
	/**
	 * @author Minori
	 * @version 1.0.0
	 * @since 1.0.0
	 */
	public class AttributeEntry implements java.util.Map.Entry<String, String> {

		private String key;
		private String value;

		/*
		 * (non-Javadoc)
		 * @see java.util.Map.Entry#getKey()
		 */
		@Override
		public synchronized String getKey() {

			return null;
		}

		/*
		 * (non-Javadoc)
		 * @see java.util.Map.Entry#getValue()
		 */
		@Override
		public synchronized String getValue() {
			// TODO Auto-generated method stub
			return null;
		}

		/*
		 * (non-Javadoc)
		 * @see java.util.Map.Entry#setValue(java.lang.Object)
		 */
		@Override
		public synchronized String setValue(String value) {
			return null;
		}

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String put(String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends String, ? extends String> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public String remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<String> values() {
		// TODO Auto-generated method stub
		return null;
	}

}
