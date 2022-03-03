package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required
	String topicName;

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public SubscribeMsg(String user, String topicName) {
		super(MessageType.SUBSCRIBE, user);
		this.topicName=topicName;
	}
	
	public String getTopic(){
		return topicName;
	}
	
	public void setTopic(String topicName) {
		this.topicName=topicName;
	}
	
	public String toString() {
		return "SubscribeMsg - Topic: " + topicName + ", Type: " + getType() + ", User: " + getUser();
	}
	
	
		
}
