package com.reactnativestripesdk.pushprovisioning;

import android.app.Activity;
import com.stripe.android.pushProvisioning.PushProvisioningActivityStarter;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class d {
    public final void a(Activity activity, String description, e provider) {
        s.g(activity, "activity");
        s.g(description, "description");
        s.g(provider, "provider");
        new PushProvisioningActivityStarter(activity, new PushProvisioningActivityStarter.Args(description, provider, false)).startForResult();
    }
}