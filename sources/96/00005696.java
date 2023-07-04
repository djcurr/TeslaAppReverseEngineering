package com.stripe.android.paymentsheet.injection;

import com.stripe.android.ui.core.forms.resources.AsyncResourceRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r3.g;

/* loaded from: classes6.dex */
public abstract class FormViewModelModule {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Locale provideLocale() {
            g d11 = g.d();
            if (d11.e()) {
                d11 = null;
            }
            if (d11 == null) {
                return null;
            }
            return d11.c(0);
        }
    }

    public abstract ResourceRepository bindsResourceRepository(AsyncResourceRepository asyncResourceRepository);
}