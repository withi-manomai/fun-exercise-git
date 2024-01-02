public class Main {
	    public static void main(String[] args) {
        // Feature toggle configuration
        FeatureToggle featureToggle = new FeatureToggle();
        featureToggle.setEmailNotificationEnabled(false);

        // Initialize the NotificationService with feature toggle
        NotificationService notificationService = new NotificationService(featureToggle);

        // Send a notification
        notificationService.sendNotification("Hello, Java!", "kbtg@kampus.com");
    }
}