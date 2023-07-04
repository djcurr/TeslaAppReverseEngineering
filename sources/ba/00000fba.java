package c7;

import android.app.Application;
import androidx.lifecycle.u0;
import c7.a;
import com.adyen.checkout.components.model.payments.response.Action;
import e7.f;

/* loaded from: classes.dex */
public interface b<ComponentT extends a, ConfigurationT extends e7.f> {
    boolean a(Action action);

    <T extends androidx.savedstate.c & u0> ComponentT b(T t11, Application application, ConfigurationT configurationt);
}