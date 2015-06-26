package com.train.common;

import java.io.IOException;
import java.util.Properties;

/**
 * 媒资系统配置文件参数获取工具
 *
 */

public final class SysParamsToolkit {
	private static Properties prop;

	private SysParamsToolkit() {
	}

	static {
		reload();
	}

	public static boolean reload() {
		boolean flag = true;
		prop = new Properties();
		try {
			prop.load(SysParamsToolkit.class
					.getResourceAsStream("/wscfg.properties"));
			flag = false;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static Properties getSysProperties() {
		return prop;
	}

	/**
	 * 获取指定的系统属性值
	 *
	 * @param key
	 *            指定的属性名称
	 * @return 指定的系统属性值
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

	/**
	 * 获取指定的系统属性值
	 *
	 * @param key
	 *            指定的属性名称
	 * @param defaultVal
	 *            默认值
	 * @return 指定的系统属性值
	 */
	public static String getProperty(String key, String defaultVal) {
		return prop.getProperty(key, defaultVal);
	}

	public static void main(String[] args) {
		Properties prop = getSysProperties();
	}
}