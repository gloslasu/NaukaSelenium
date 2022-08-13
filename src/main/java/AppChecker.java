public class AppChecker {

    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("SocialNetwork");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Flutter");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();



    }

}
