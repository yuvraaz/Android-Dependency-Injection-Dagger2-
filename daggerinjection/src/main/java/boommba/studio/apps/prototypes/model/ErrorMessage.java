package boommba.studio.apps.prototypes.model;
import javax.inject.Inject;
/**
 * Created by Yuvraaz on 3/17/2017.
 */

public class ErrorMessage {

    @Inject
    public ErrorMessage(){

    }
    public String getValue(){
        return "hello Error Message";
    }
}
