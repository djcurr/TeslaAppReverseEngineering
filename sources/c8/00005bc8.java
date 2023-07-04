package com.stripe.android.ui.core.forms.resources.injection;

import android.content.Context;
import android.content.res.Resources;
import com.stripe.android.ui.core.forms.resources.AsyncResourceRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class ResourceRepositoryModule {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Resources provideResources(Context context) {
            s.g(context, "context");
            Resources resources = context.getResources();
            s.f(resources, "context.resources");
            return resources;
        }
    }

    public abstract ResourceRepository bindsResourceRepository(AsyncResourceRepository asyncResourceRepository);
}