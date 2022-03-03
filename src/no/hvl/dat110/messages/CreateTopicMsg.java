package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	
	String topicName;
	

	
	// TODO: 
	// Implement object variables - a topic is required
	public CreateTopicMsg(String user, String topicName) {
		super(MessageType.CREATETOPIC, user);
		this.topicName=topicName;
	}
	
	public String getTopic(){
		return topicName;
	}
	
	public void setTopic(String topicName) {
		this.topicName=topicName;
	}
	
	public String toString() {
		return "Topic: " + topicName + ", Type: " + getType() + ", User: " + getUser();
	}
	// Constructor, get/set-methods, and toString method
    // as described in the project text	
}
