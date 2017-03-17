package boommba.studio.apps.prototypes.component;
import javax.inject.Singleton;
import boommba.studio.apps.prototypes.DraggerExampleActivity;
import boommba.studio.apps.prototypes.model.LogMessage;
import boommba.studio.apps.prototypes.module.MessageModule;
import dagger.Component;

/**
 * Created by Yuvraaz on 3/16/2017.
 */

@Component(modules = {MessageModule.class, LogMessage.class})
@Singleton
public interface AppComponent {
    void inject(DraggerExampleActivity draggerExampleActivity);

}

