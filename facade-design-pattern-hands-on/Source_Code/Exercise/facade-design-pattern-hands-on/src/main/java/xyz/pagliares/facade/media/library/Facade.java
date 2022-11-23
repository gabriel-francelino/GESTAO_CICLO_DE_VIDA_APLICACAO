package xyz.pagliares.facade.media.library;

public class Facade {
    private VideoFile file;
    private VideoFile buffer;
    private VideoFile intermediateResult;
    private Codec sourceCodec;
    private Codec destinationCodec;
    private AudioMixer audioMixer;

    public Facade(String fileName, String format) {
        this.file = new VideoFile(fileName);
        this.audioMixer = new AudioMixer();
        if (format.equals("mp4")) {
            this.destinationCodec = new MPEG4CompressionCodec();
        } else {
            this.destinationCodec = new OggCompressionCodec();
        }
    }

    public void videoConversionProgram(){
        sourceCodec = CodecFactory.createCodec(file);
        buffer = BitrateConverter.read(file, sourceCodec);
        intermediateResult = BitrateConverter.convert(buffer, destinationCodec);
        audioMixer.fix(intermediateResult);
    }
}
