package com.jonline.module03.regex.task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 * <note id = "1">
 * <to>Вася</to>
 * <from>Света</from>
 * <heading>Напоминание</heading>
 * <body>Позвони мне завтра!</body>
 * </note>
 * <note id = "2">
 * <to>Петя</to>
 * <from>Маша</from>
 * <heading>Важное напоминание</heading>
 * <body/>
 * </note>
 * </notes>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
 * тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
 * нельзя.
 */
public class TaskSecondAnotherWay {
	public static void main(String[] args) {
		String resultXML;
		String xmlDoc = "<notes>\n" + "<note id = \"1\">\n" + "<to>Вася</to>\n" + "<from>Света</from>\n"
				+ "<from>Света</from>\n" + "<heading>Напоминание</heading>\n" + "<body>Позвони мне завтра!</body>\n"
				+ "</note>\n" + "<note id = \"2\">\n" + "<to>Петя</to>\n" + "<from>Маша</from>\n"
				+ "<heading>Важное напоминание</heading>\n" + "<body/>\n" + "</note>\n" + "</notes>\n";
		resultXML = analyzeXML(xmlDoc);
		System.out.println(resultXML);

	}

	public static String analyzeXML(String xml) {
		StringBuffer strBuff = new StringBuffer();

		Pattern openTagPattern = Pattern.compile("<\\w.+?>");
		Pattern closeTagPattern = Pattern.compile("</\\w.+>");
		Pattern bodyTagPattern = Pattern.compile(">.+?<");
		Pattern hollowTagPattern = Pattern.compile("<\\w.+?/>");

		String[] strings = xml.split("\n");

		for (String strElement : strings) {

			Matcher openTagMatcher = openTagPattern.matcher(strElement);
			Matcher closeTagMatcher = closeTagPattern.matcher(strElement);
			Matcher bodyTagMatcher = bodyTagPattern.matcher(strElement);
			Matcher hollowTagMatcher = hollowTagPattern.matcher(strElement);

			if (openTagMatcher.matches()) {
				strBuff.append(openTagMatcher.group());
				strBuff.append(" - OPENING TAG \n");
			}
			if (closeTagMatcher.matches()) {
				strBuff.append(closeTagMatcher.group());
				strBuff.append(" - CLOSING TAG \n");
			}
			if (bodyTagMatcher.matches()) {
				strBuff.append(bodyTagMatcher.group());
				strBuff.append(" - BODY TAG \n");
			}
			if (hollowTagMatcher.matches()) {
				strBuff.append(hollowTagMatcher.group());
				strBuff.append(" - TAG WITHOUT BODY \n");
			}
		}

		return strBuff.toString();

	}
}
