package gr.upatras.rest.example;

public class Message {
	
	private String mytext;
	
	public Message(String mytext) {
		super();
		this.mytext = mytext;
	}
	
	public String getText() {
		return mytext;
	}
	

	public void publish() {
		SimpleMqttClient client = new SimpleMqttClient();
		client.runClient(this);
	}
}
