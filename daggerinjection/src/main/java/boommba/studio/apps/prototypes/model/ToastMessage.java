package boommba.studio.apps.prototypes.model;
import javax.inject.Inject;
import dagger.Module;
/**
 * Created by Yuvraaz on 3/17/2017.
 */
public class ToastMessage {
    @Inject
     public ToastMessage() {
    }

    public String getMessage() {
        return "Hello Toast message";
    }
}
