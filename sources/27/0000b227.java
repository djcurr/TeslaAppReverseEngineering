package s7;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import com.adyen.checkout.components.model.payments.response.RedirectAction;
import com.adyen.checkout.core.exception.ComponentException;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a {
    public final void a(Activity activity, RedirectAction redirectAction) {
        s.g(activity, "activity");
        s.g(redirectAction, "redirectAction");
        b(activity, redirectAction.getUrl());
    }

    public final void b(Activity activity, String str) {
        String str2;
        s.g(activity, "activity");
        str2 = b.f50304a;
        o7.b.a(str2, s.p("makeRedirect - ", str));
        if (!(str == null || str.length() == 0)) {
            Uri redirectUri = Uri.parse(str);
            s.f(redirectUri, "redirectUri");
            try {
                activity.startActivity(c.b(activity, redirectUri));
                return;
            } catch (ActivityNotFoundException e11) {
                throw new ComponentException("Redirect to app failed.", e11);
            }
        }
        throw new ComponentException("Redirect URL is empty.");
    }
}