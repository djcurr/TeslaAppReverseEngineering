package com.plaid.link;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.plaid.link.configuration.LinkPublicKeyConfiguration;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PlaidHandler {
    private final LinkPublicKeyConfiguration linkConfiguration;

    public PlaidHandler(LinkPublicKeyConfiguration linkConfiguration) {
        s.g(linkConfiguration, "linkConfiguration");
        this.linkConfiguration = linkConfiguration;
    }

    public final boolean open(Activity activity) {
        s.g(activity, "activity");
        return Plaid.INSTANCE.openLinkInternal$link_sdk_release(activity, this.linkConfiguration);
    }

    public final boolean open(Fragment fragment) {
        s.g(fragment, "fragment");
        return Plaid.INSTANCE.openLinkInternal$link_sdk_release(fragment, this.linkConfiguration);
    }
}