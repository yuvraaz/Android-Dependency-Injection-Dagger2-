package boommba.studio.apps.prototypes;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import javax.inject.Inject;
import boommba.studio.apps.prototypes.dragger.DaggerInjector;
import boommba.studio.apps.prototypes.model.ErrorMessage;
import boommba.studio.apps.prototypes.model.LogMessage;
import boommba.studio.apps.prototypes.model.ToastMessage;

public class DraggerExampleActivity extends AppCompatActivity {

    @Inject
    ToastMessage toast;

    @Inject
    ErrorMessage error;

    @Inject
    LogMessage log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dagger_example_activity);
        DaggerInjector.get().inject(this);

        Toast.makeText(this, toast.getMessage(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, log.getValue(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, error.getValue(), Toast.LENGTH_SHORT).show();


    }
}
