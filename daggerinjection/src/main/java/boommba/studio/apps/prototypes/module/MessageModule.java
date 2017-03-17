package boommba.studio.apps.prototypes.module;
import javax.inject.Singleton;
import boommba.studio.apps.prototypes.model.ErrorMessage;
import boommba.studio.apps.prototypes.model.ToastMessage;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Yuvraaz on 3/16/2017.
 */

@Module
public class MessageModule {

    @Provides
    @Singleton
    ToastMessage provideToast() {
        return new ToastMessage();
    }

    @Provides
    @Singleton
    ErrorMessage provideErrorMessage() {
        return new ErrorMessage();
    }

}
