package com.core.java.design.pattern009.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The Class ArticleMemento.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 17, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern009.memento <BR>
 *        ArticleMemento.java <BR>
 */
@Getter
@Setter

/**
 * Instantiates a new article memento.
 *
 * @param id      the id
 * @param title   the title
 * @param content the content
 */
@AllArgsConstructor
public final class ArticleMemento {

	/** The id. */
	private final long id;
	
	/** The title. */
	private final String title;
	
	/** The content. */
	private final String content;

}