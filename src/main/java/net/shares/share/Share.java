package net.shares.share;

public class Share {
	private String identifier;
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public Share(String identifier, String name) {
		this.identifier = identifier;
		this.name = name;
		
	}
}
