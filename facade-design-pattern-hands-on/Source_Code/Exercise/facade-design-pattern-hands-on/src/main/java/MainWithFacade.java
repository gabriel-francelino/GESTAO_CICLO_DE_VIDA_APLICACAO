import xyz.pagliares.facade.media.library.Facade;

public class MainWithFacade {
    public static void main(String[] args) {
        System.out.println("Video conversion program");
        String fileName = "youtubevideo.ogg";
        String format = "mp4";
        System.out.println("Conversion started.");

        Facade facade = new Facade(fileName, format);
        facade.videoConversionProgram();

        System.out.println("Conversion completed.");
    }
}
