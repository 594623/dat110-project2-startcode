package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	String topicName;
	
	public UnsubscribeMsg(String user, String topicName) {
		super(MessageType.UNSUBSCRIBE, user);
		this.topicName=topicName;
	}
	
	public String getTopic(){
		return topicName;
	}
	
	public void setTopic(String topicName) {
		this.topicName=topicName;
	}
	
	public String toString() {
		return "UnsubscribeMsg - Topic: " + topicName + ", Type: " + getType() + ", User: " + getUser();
	}
	
	
}
