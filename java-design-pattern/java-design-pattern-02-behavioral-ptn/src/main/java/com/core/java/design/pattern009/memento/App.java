package com.core.java.design.pattern009.memento;

/**
 * The Class App.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 17, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern009.memento <BR>
 *        App.java <BR>
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		final Article article = new Article(1L, "My Article");
		article.setContent("ABC"); // original content
		System.out.println(article);

		final ArticleMemento memento = article.createMemento(); // created immutable memento

		article.setContent("123"); // changed content
		System.out.println(article);

		article.restore(memento); // UNDO change
		System.out.println(article); // original content
	}
}