class SocialMedia {
	String userName;
	String eMail;
	boolean isPublic;
	boolean isVerified;
	String countryOrigin;
	int noOfPost;
	int like;
	int noOfComments;
	int impression;
	
	SocialMedia() {
		this.userName = "shamal_14";
		this.eMail = "shamaldandekar1010@gmail.com";
		this.isPublic = false;
		this.isVerified = false;
		this.countryOrigin = "India";
		this.noOfPost = 3;
		this.like = 200;
		this.noOfComments = 5;
		this.impression = 1000;
	}
	
	SocialMedia(String userName, String eMail, boolean isPublic, boolean isVerified, String countryOrigin, int noOfPost, int like, int noOfComments, int impression) {
		this.userName = userName;
		this.eMail = eMail;
		this.isPublic = isPublic;
		this.isVerified = isVerified;
		this.countryOrigin = countryOrigin;
		this.noOfPost = noOfPost;
		this.like = like;
		this.noOfComments = noOfComments;
		this.impression = impression;
	}
	
	String getUserName() { return userName; }
	void setUserName(String userName) { this.userName = userName; }
	
	String geteMail() { return eMail; }
	void seteMail(String eMail) { this.eMail = eMail; }
	
	boolean isPublic() { return isPublic; }
	void setPublic(boolean isPublic) { this.isPublic = isPublic; }
	
	boolean isVerified() { return isVerified; }
	void setVerified(boolean isVerified) { this.isVerified = isVerified; }
	
	String getCountryOrigin() { return countryOrigin; }
	void setCountryOrigin(String countryOrigin) { this.countryOrigin = countryOrigin; }
	
	int getNoOfPost() { return noOfPost; }
	void setNoOfPost(int noOfPost) { this.noOfPost = noOfPost; }
	
	int getLike() { return like; }
	void setLike(int like) { this.like = like; }
	
	int getNoOfComments() { return noOfComments; }
	void setNoOfComments(int noOfComments) { this.noOfComments = noOfComments; }
	
	int getImpression() { return impression; }
	void setImpression(int impression) { this.impression = impression; }
	
	void display() {
		System.out.println("User Name : " + this.userName);
		System.out.println("E-Mail ID : " + this.eMail);
		System.out.println("Is Public : " + this.isPublic);
		System.out.println("Is Verified : " + this.isVerified);
		System.out.println("Country Origin : " + this.countryOrigin);
		System.out.println("No of Post : " + this.noOfPost);
		System.out.println("Likes : " + this.like);
		System.out.println("No of Comments : " + this.noOfComments);
		System.out.println("Impression : " + this.impression);
	}
}



class InstagramAccount extends SocialMedia {
	int noOfFollowers;
	int noOfFollowing;
	int noOfHighlights;
	int noOfPostsAchieved;
	int noOfStoriesAchieved;
	
	InstagramAccount() {
		super();
		this.noOfFollowers = 500;
		this.noOfFollowing = 200;
		this.noOfHighlights = 5;
		this.noOfPostsAchieved = 2;
		this.noOfStoriesAchieved = 3;
	}
	
	InstagramAccount(String userName, String eMail, boolean isPublic, boolean isVerified, String countryOrigin,
			int noOfPost, int like, int noOfComments, int impression,
			int noOfFollowers, int noOfFollowing, int noOfHighlights, int noOfPostsAchieved, int noOfStoriesAchieved) {
		super(userName, eMail, isPublic, isVerified, countryOrigin, noOfPost, like, noOfComments, impression);
		this.noOfFollowers = noOfFollowers;
		this.noOfFollowing = noOfFollowing;
		this.noOfHighlights = noOfHighlights;
		this.noOfPostsAchieved = noOfPostsAchieved;
		this.noOfStoriesAchieved = noOfStoriesAchieved;
	}
	
	int getNoOfFollowers() { return noOfFollowers; }
	void setNoOfFollowers(int noOfFollowers) { this.noOfFollowers = noOfFollowers; }
	
	int getNoOfFollowing() { return noOfFollowing; }
	void setNoOfFollowing(int noOfFollowing) { this.noOfFollowing = noOfFollowing; }
	
	int getNoOfHighlights() { return noOfHighlights; }
	void setNoOfHighlights(int noOfHighlights) { this.noOfHighlights = noOfHighlights; }
	
	int getNoOfPostsAchieved() { return noOfPostsAchieved; }
	void setNoOfPostsAchieved(int noOfPostsAchieved) { this.noOfPostsAchieved = noOfPostsAchieved; }
	
	int getNoOfStoriesAchieved() { return noOfStoriesAchieved; }
	void setNoOfStoriesAchieved(int noOfStoriesAchieved) { this.noOfStoriesAchieved = noOfStoriesAchieved; }
	
	void display() {
		super.display();
		System.out.println("Followers : " + this.noOfFollowers);
		System.out.println("Following : " + this.noOfFollowing);
		System.out.println("Highlights : " + this.noOfHighlights);
		System.out.println("Posts Achieved : " + this.noOfPostsAchieved);
		System.out.println("Stories Achieved : " + this.noOfStoriesAchieved);
	}
}



class LinkedInAccount extends SocialMedia {
	int noOfConnections;
	int noOfProfileViews;
	int noOfJobApplied;
	
	LinkedInAccount() {
		super();
		this.noOfConnections = 300;
		this.noOfProfileViews = 150;
		this.noOfJobApplied = 5;
	}
	
	LinkedInAccount(String userName, String eMail, boolean isPublic, boolean isVerified, String countryOrigin,
			int noOfPost, int like, int noOfComments, int impression,
			int noOfConnections, int noOfProfileViews, int noOfJobApplied) {
		super(userName, eMail, isPublic, isVerified, countryOrigin, noOfPost, like, noOfComments, impression);
		this.noOfConnections = noOfConnections;
		this.noOfProfileViews = noOfProfileViews;
		this.noOfJobApplied = noOfJobApplied;
	}
	
	int getNoOfConnections() { return noOfConnections; }
	void setNoOfConnections(int noOfConnections) { this.noOfConnections = noOfConnections; }
	
	int getNoOfProfileViews() { return noOfProfileViews; }
	void setNoOfProfileViews(int noOfProfileViews) { this.noOfProfileViews = noOfProfileViews; }
	
	int getNoOfJobApplied() { return noOfJobApplied; }
	void setNoOfJobApplied(int noOfJobApplied) { this.noOfJobApplied = noOfJobApplied; }
	
	void display() {
		super.display();
		System.out.println("Connections : " + this.noOfConnections);
		System.out.println("Profile Views : " + this.noOfProfileViews);
		System.out.println("Job Applied : " + this.noOfJobApplied);
	}
}



class YouTubeAccount extends SocialMedia {
	int noOfSubscribers;
	int watchTime;
	boolean isMonetized;
	double estimatedRevenue;
	
	YouTubeAccount() {
		super();
		this.noOfSubscribers = 1000;
		this.watchTime = 4000;
		this.isMonetized = true;
		this.estimatedRevenue = 2500.75;
	}
	
	YouTubeAccount(String userName, String eMail, boolean isPublic, boolean isVerified, String countryOrigin,
			int noOfPost, int like, int noOfComments, int impression,
			int noOfSubscribers, int watchTime, boolean isMonetized, double estimatedRevenue) {
		super(userName, eMail, isPublic, isVerified, countryOrigin, noOfPost, like, noOfComments, impression);
		this.noOfSubscribers = noOfSubscribers;
		this.watchTime = watchTime;
		this.isMonetized = isMonetized;
		this.estimatedRevenue = estimatedRevenue;
	}
	
	int getNoOfSubscribers() { return noOfSubscribers; }
	void setNoOfSubscribers(int noOfSubscribers) { this.noOfSubscribers = noOfSubscribers; }
	
	int getWatchTime() { return watchTime; }
	void setWatchTime(int watchTime) { this.watchTime = watchTime; }
	
	boolean isMonetized() { return isMonetized; }
	void setMonetized(boolean isMonetized) { this.isMonetized = isMonetized; }
	
	double getEstimatedRevenue() { return estimatedRevenue; }
	void setEstimatedRevenue(double estimatedRevenue) { this.estimatedRevenue = estimatedRevenue; }
	
	void display() {
		super.display();
		System.out.println("Subscribers : " + this.noOfSubscribers);
		System.out.println("Watch Time (hours): " + this.watchTime);
		System.out.println("Is Monetized : " + this.isMonetized);
		System.out.println("Estimated Revenue : " + this.estimatedRevenue);
	}
}



class SocialMediaMain {
	public static void main(String[] args) {
		
		InstagramAccount insta = new InstagramAccount();
		insta.display();
		
		
		LinkedInAccount linkedin = new LinkedInAccount();
		linkedin.display();
		
		
		YouTubeAccount youtube = new YouTubeAccount();
		youtube.display();
	}
}
