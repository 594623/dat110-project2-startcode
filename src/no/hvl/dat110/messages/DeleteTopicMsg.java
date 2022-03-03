package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	String topicName;
	
	public DeleteTopicMsg(String topicName, String user) {
		super(MessageType.DELETETOPIC, user);
		this.topicName=topicName;
	}
	
	public String getTopic() {
		return topicName;
	}
	
	public void setTopic(String topicName) {
		this.topicName=topicName;
	}
	
	public String toString() {
		return "Topic: " + topicName + ", Type: " + getType() + ", User: " + getUser();
	}

}
