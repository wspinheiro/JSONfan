package com.i9fan.jsonfan.jseImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.i9fan.jsonfan.interfaces.JSONArray;
import com.i9fan.jsonfan.interfaces.JSONBoolean;
import com.i9fan.jsonfan.interfaces.JSONNumber;
import com.i9fan.jsonfan.interfaces.JSONObject;
import com.i9fan.jsonfan.interfaces.JSONString;
import com.i9fan.jsonfan.interfaces.JSONValue;

@SuppressWarnings("rawtypes")
public class JSONObjectImpl extends HashMap implements JSONValue, JSONObject, Map {
	
	@Override
	public JSONObject isObject() {
		return this;
	}

	@Override
	public boolean containsKey(String key) {
		return this.containsKey((Object)key);
	}

	@Override
	public JSONArray isArray() {
		return null;
	}

	@Override
	public JSONBoolean isBoolean() {
		return null;
	}

	@Override
	public JSONString isString() {
		return null;
	}

	@Override
	public JSONNumber isNumber() {
		return null;
	}

	@Override
	public JSONValue get(String key) {
		Object obj = get((Object)key);
		if (obj instanceof JSONValue) return (JSONValue) obj;
		return null;
	}

	

}