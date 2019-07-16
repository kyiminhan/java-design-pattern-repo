package com.core.java.design.pattern007.iterator;

/**
 * The Class App.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 16, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern007.iterator <BR>
 *        App.java <BR>
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final Topic[] topics = new Topic[5];
		topics[0] = new Topic("topic1");
		topics[1] = new Topic("topic2");
		topics[2] = new Topic("topic3");
		topics[3] = new Topic("topic4");
		topics[4] = new Topic("topic5");

		final List<Topic> list = new TopicList(topics);

		final Iterator<Topic> iterator = list.iterator();

		while (iterator.hasNext()) {
			final Topic currentTopic = iterator.next();
			System.out.println(currentTopic.getName());
		}
	}
}