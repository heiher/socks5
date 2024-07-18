/*
 ============================================================================
 Name        : Perferences.java
 Author      : hev <r@hev.cc>
 Copyright   : Copyright (c) 2024 hev
 Description : Perferences
 ============================================================================
 */

package hev.socks5;

import java.util.Set;
import java.util.HashSet;
import android.content.Context;
import android.content.SharedPreferences;

public class Preferences
{
	public static final String PREFS_NAME = "SocksPrefs";
	public static final String WORKERS = "Workers";
	public static final String LISTEN_ADDR = "ListenAddr";
	public static final String LISTEN_PORT = "ListenPort";
	public static final String UDP_LISTEN_ADDR = "UDPListenAddr";
	public static final String UDP_LISTEN_PORT = "UDPListenPort";
	public static final String BIND_ADDR = "BindAddr";
	public static final String BIND_IFACE = "BindIface";
	public static final String AUTH_USER = "AuthUser";
	public static final String AUTH_PASS = "AuthPass";
	public static final String LISTEN_IPV6_ONLY = "ListenIPv6Only";
	public static final String ENABLE = "Enable";

	private SharedPreferences prefs;

	public Preferences(Context context) {
		prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_MULTI_PROCESS);
	}

	public int getWorkers() {
		return prefs.getInt(WORKERS, 4);
	}

	public void setWorkers(int workers) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putInt(WORKERS, workers);
		editor.commit();
	}

	public String getListenAddress() {
		return prefs.getString(LISTEN_ADDR, "::");
	}

	public void setListenAddress(String addr) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(LISTEN_ADDR, addr);
		editor.commit();
	}

	public int getListenPort() {
		return prefs.getInt(LISTEN_PORT, 1080);
	}

	public void setListenPort(int port) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putInt(LISTEN_PORT, port);
		editor.commit();
	}

	public String getUDPListenAddress() {
		return prefs.getString(UDP_LISTEN_ADDR, "");
	}

	public void setUDPListenAddress(String addr) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(UDP_LISTEN_ADDR, addr);
		editor.commit();
	}

	public int getUDPListenPort() {
		return prefs.getInt(UDP_LISTEN_PORT, 1080);
	}

	public void setUDPListenPort(int port) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putInt(UDP_LISTEN_PORT, port);
		editor.commit();
	}

	public String getBindAddress() {
		return prefs.getString(BIND_ADDR, "::");
	}

	public void setBindAddress(String addr) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(BIND_ADDR, addr);
		editor.commit();
	}

	public String getBindInterface() {
		return prefs.getString(BIND_IFACE, "");
	}

	public void setBindInterface(String name) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(BIND_IFACE, name);
		editor.commit();
	}

	public String getAuthUsername() {
		return prefs.getString(AUTH_USER, "");
	}

	public void setAuthUsername(String user) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(AUTH_USER, user);
		editor.commit();
	}

	public String getAuthPassword() {
		return prefs.getString(AUTH_PASS, "");
	}

	public void setAuthPassword(String pass) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(AUTH_PASS, pass);
		editor.commit();
	}

	public boolean getListenIPv6Only() {
		return prefs.getBoolean(LISTEN_IPV6_ONLY, false);
	}

	public void setListenIPv6Only(boolean enable) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putBoolean(LISTEN_IPV6_ONLY, enable);
		editor.commit();
	}

	public boolean getEnable() {
		return prefs.getBoolean(ENABLE, false);
	}

	public void setEnable(boolean enable) {
		SharedPreferences.Editor editor = prefs.edit();
		editor.putBoolean(ENABLE, enable);
		editor.commit();
	}

	public int getTaskStackSize() {
		return 8192;
	}
}
