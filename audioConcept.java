import javax.media.Player;
import javax.media.Manager;
import java.io.File;
import java.io.IOException;
class AudioConcept
{
	static public void main(String... arf)throws Exception
	{
		Player play=Manager.createRealizedPlayer(new File("F:/hp/local_share/recording.wav").toURI().toURL());
		play.start();
		// play.stop();
		System.out.println(""+System.getProperty("user.dir"));
	}
}
