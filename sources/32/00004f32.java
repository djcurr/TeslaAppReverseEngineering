package com.stripe.android.link.injection;

import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkRepository;
import java.util.Locale;
import r3.g;

/* loaded from: classes6.dex */
public interface LinkPaymentLauncherModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
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

    LinkRepository bindLinkRepository(LinkApiRepository linkApiRepository);
}