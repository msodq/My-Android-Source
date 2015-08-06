package com.msodq.androutils.utils;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by mohamadsodiq on 3/2/15.
 */
public class JsonUtil {
    public static String getString(JSONObject jo, String key) {
        try {
            return jo.has(key) ? jo.getString(key) : "";
        } catch (Exception e) {
            return "";
        }
    }

    public static String getString(JSONObject jo, String key, String defaultValue) {
        try {
            return jo.has(key) ? jo.getString(key) : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static String getStringWithCheckStringNull(JSONObject jo, String key) {
        try {
            return jo.has(key) ? (!jo.getString(key).equalsIgnoreCase("null") ? jo.getString(key) : "") : "";
        } catch (Exception e) {
            return "";
        }
    }

    public static String getStringWithCheckStringNull(JSONObject jo, String key, String defaultValue) {
        try {
            return jo.has(key) ? (!jo.getString(key).equalsIgnoreCase("null") ? jo.getString(key) : defaultValue) : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static int getInt(JSONObject jo, String key) {
        try {
            return jo.has(key) ? jo.getInt(key) : 0;
        } catch (Exception e) {
            return 0;
        }
    }

    public static int getInt(JSONObject jo, String key, int defaultValue) {
        try {
            return jo.has(key) ? jo.getInt(key) : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static long getLong(JSONObject jo, String key) {
        try {
            return jo.has(key) ? jo.getLong(key) : 0l;
        } catch (Exception e) {
            return 0l;
        }
    }

    public static long getLong(JSONObject jo, String key, long defaultValue) {
        try {
            return jo.has(key) ? jo.getLong(key) : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static boolean getBoolean(JSONObject jo, String key) {
        try {
            return jo.has(key) && jo.getBoolean(key);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean getBoolean(JSONObject jo, String key, boolean defaultValue) {
        try {
            return jo.has(key) ? jo.getBoolean(key) : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static double getDouble(JSONObject jo, String key) {
        try {
            return jo.has(key) ? jo.getDouble(key) : 0d;
        } catch (Exception e) {
            return 0d;
        }
    }

    public static double getDouble(JSONObject jo, String key, double defaultValue) {
        try {
            return jo.has(key) ? jo.getDouble(key) : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static JSONObject getJSONObject(JSONObject jo, String key) {
        try {
            return jo.has(key) ? jo.getJSONObject(key) : null;
        } catch (Exception e) {
            return null;
        }
    }

    public static JSONObject getJSONArray(JSONObject jo, String key, JSONObject defaultValue) {
        try {
            return jo.has(key) ? jo.getJSONObject(key) : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static JSONArray getJSONArray(JSONObject jo, String key) {
        try {
            return jo.has(key) ? jo.getJSONArray(key) : null;
        } catch (Exception e) {
            return null;
        }
    }

    public static JSONArray getJSONArray(JSONObject jo, String key, JSONArray defaultValue) {
        try {
            return jo.has(key) ? jo.getJSONArray(key) : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
