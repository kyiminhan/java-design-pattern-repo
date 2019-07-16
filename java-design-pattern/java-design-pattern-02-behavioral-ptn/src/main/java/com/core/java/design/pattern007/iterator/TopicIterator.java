package com.core.java.design.pattern007.iterator;

/**
 * The Class TopicIterator.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 16, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern007.iterator <BR>
 *        TopicIterator.java <BR>
 */
public class TopicIterator implements Iterator<Topic> {

	/** The topics. */
	private final Topic[] topics;

	/** The position. */
	private int position;

	/**
	 * Instantiates a new topic iterator.
	 *
	 * @param topics the topics
	 */
	public TopicIterator(final Topic[] topics) {
		this.topics = topics;
		this.position = 0;
	}

	@Override
	public void reset() {
		this.position = 0;
	}

	@Override
	public Topic next() {
		return this.topics[this.position++];
	}

	@Override
	public Topic currentItem() {
		return this.topics[this.position];
	}

	@Override
	public boolean hasNext() {
		if (this.position >= this.topics.length) {
			return false;
		}
		return true;
	}
}