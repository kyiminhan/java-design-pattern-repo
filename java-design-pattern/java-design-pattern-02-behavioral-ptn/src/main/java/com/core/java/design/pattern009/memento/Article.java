package com.core.java.design.pattern009.memento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Article.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 17, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern009.memento <BR>
 *        Article.java <BR>
 */
@Getter
@Setter

/**
 * Instantiates a new article.
 */
@NoArgsConstructor

/**
 * Instantiates a new article.
 *
 * @param id    the id
 * @param title the title
 */
@RequiredArgsConstructor
@ToString
public class Article {

	/** The id. */
	@NonNull
	private Long id;
	
	/** The title. */
	@NonNull
	private String title;
	
	/** The content. */
	private String content;

	/**
	 * Creates the memento.
	 *
	 * @return ArticleMemento
	 */
	public ArticleMemento createMemento() {
		final ArticleMemento m = new ArticleMemento(this.id, this.title, this.content);
		return m;
	}

	/**
	 * Restore.
	 *
	 * @param m the m
	 */
	public void restore(final ArticleMemento m) {
		this.id = m.getId();
		this.title = m.getTitle();
		this.content = m.getContent();
	}
}