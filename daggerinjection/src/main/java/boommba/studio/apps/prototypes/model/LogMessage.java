package boommba.studio.apps.prototypes.model;
import javax.inject.Inject;
import dagger.Module;
/**
 * Created by Yuvraaz on 3/17/2017.
 */
@Module
public class LogMessage {
    @Inject
    public LogMessage(){

    }
    public String getValue(){
        return "Hello Log message";
    }
}
