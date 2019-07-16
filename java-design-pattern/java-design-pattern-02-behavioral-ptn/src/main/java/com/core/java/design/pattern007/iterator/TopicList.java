package com.core.java.design.pattern007.iterator;

import lombok.AllArgsConstructor;

/**
 * Instantiates a new topic list.
 *
 * @param topics the topics
 */
@AllArgsConstructor
public class TopicList implements List<Topic> {

	/** The topics. */
	private final Topic[] topics;

	@Override
	public Iterator<Topic> iterator() {
		return new TopicIterator(this.topics);
	}
}