package com.base.utils;

/**
 * 
 * @author Administrator
 *
 */
public class XmlConverUtil {
	/**
	 * map to xml xml <node><key label="key1">value1</key>
	 * <key label="key2">value2</key>......</node>
	 * 
	 * @param map
	 * @return
	 *//*
	public static String maptoXml(Map<String, Object> map) {
		Document document = DocumentHelper.createDocument();
		Element nodeElement = document.addElement("node");
		for (Object obj : map.keySet()) {
			Element keyElement = nodeElement.addElement("key");
			keyElement.addAttribute("label", String.valueOf(obj));
			keyElement.setText(String.valueOf(map.get(obj)));
		}
		return doc2String(document);
	}

	*//**
	 * xml to map xml <node><key label="key1">value1</key>
	 * <key label="key2">value2</key>......</node>
	 * 
	 * @param xml
	 * @return
	 *//*
	public static Map<String, String> xmltoMap(String xml0) {
		String xml = xml0;
		Map<String, String> map = new HashMap<String, String>();
		try {
			Document document = DocumentHelper.parseText(xml);
			Element nodeElement = document.getRootElement();
			List<Element> node = nodeElement.elements();
			Element elm = null;
			for (Iterator<Element> it = node.iterator(); it.hasNext();) {
				elm = it.next();
				map.put(elm.getName(), elm.getText());
			}
			node = null;
			nodeElement = null;
			document = null;
		} catch (Exception e) {
			DeveloperLogRecord record = new DeveloperLogRecord("XmlConverUtil", "xmltoMap()", "");
			PsLog.DEVELOPER.error(record, e);
		}
		return map;
	}

	*//**
	 * 
	 * @param document
	 * @return
	 *//*
	public static String doc2String(Document document) {
		String s = "";
		try {
			// 使用输出流来进行转化
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			// 使用UTF-8编码
			OutputFormat format = new OutputFormat("   ", true, "UTF-8");
			XMLWriter writer = new XMLWriter(out, format);
			writer.write(document);
			s = out.toString("UTF-8");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return s;
	}*/

}
