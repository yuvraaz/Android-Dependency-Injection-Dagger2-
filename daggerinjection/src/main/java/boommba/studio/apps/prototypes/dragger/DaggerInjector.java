package boommba.studio.apps.prototypes.dragger;
import boommba.studio.apps.prototypes.component.AppComponent;
import boommba.studio.apps.prototypes.component.DaggerAppComponent;
import boommba.studio.apps.prototypes.module.MessageModule;

/**
 * Created by Yuvraaz on 3/17/2017.
 */

public class DaggerInjector {
    private static AppComponent appComponent = DaggerAppComponent.builder().messageModule(new MessageModule()).build();
    public static AppComponent get() {
        return appComponent;
    }
}
