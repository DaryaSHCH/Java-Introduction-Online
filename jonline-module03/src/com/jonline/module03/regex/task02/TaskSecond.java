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
public class TaskSecond {
	public static void main(String[] args) {
		
		String xmlDoc = "<notes>\n" + "<note id = \"1\">\n" + "<to>Вася</to>\n" + "<from>Света</from>\n"
				+ "<from>Света</from>\n" + "<heading>Напоминание</heading>\n" + "<body>Позвони мне завтра!</body>\n"
				+ "</note>\n" + "<note id = \"2\">\n" + "<to>Петя</to>\n" + "<from>Маша</from>\n"
				+ "<heading>Важное напоминание</heading>\n" + "<body/>\n" + "</note>\n" + "</notes>\n";

		final Pattern tagPattern = Pattern.compile("<(.[^(><.)]+)>");
		final Matcher testMatcher = tagPattern.matcher(xmlDoc);

		final Pattern tagTypePattern = Pattern.compile("(^/.*)|(^.*/)");

		while (testMatcher.find()) {
			final String tagNameWithAttributes = testMatcher.group(1);
			final int tagNameEndIndex = tagNameWithAttributes.indexOf(" ");

			final String tagName;
			if (tagNameEndIndex == -1) {
				tagName = tagNameWithAttributes;
			} else {
				tagName = tagNameWithAttributes.substring(0, tagNameEndIndex);
			}

			System.out.println(testMatcher.group(0) + "; name = " + tagName);

			final Matcher tagTypeMatcher = tagTypePattern.matcher(tagName);

			if (tagTypeMatcher.find()) {
				if (tagTypeMatcher.group(1) != null) {
					System.out.println("closing");
				} else if (tagTypeMatcher.group(2) != null) {
					System.out.println("empty");
				}
			} else {
				System.out.println("opening");

				final int tagEndIndex = testMatcher.end();
				final int contentEndIndex = xmlDoc.indexOf("</" + tagName + ">", tagEndIndex);

				System.out.println(xmlDoc.substring(tagEndIndex, contentEndIndex));
			}

			System.out.println("--------------------------------");
		}

	}

}
