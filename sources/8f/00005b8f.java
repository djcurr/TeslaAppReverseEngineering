package com.stripe.android.ui.core.elements;

import c30.b;
import com.stripe.android.ui.core.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public enum TranslationId {
    IdealBank(R.string.ideal_bank),
    P24Bank(R.string.p24_bank),
    EpsBank(R.string.eps_bank),
    AddressName(R.string.address_label_name),
    AuBecsAccountName(R.string.au_becs_account_name);
    
    public static final Companion Companion = new Companion(null);
    private final int resourceId;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<TranslationId> serializer() {
            return TranslationId$$serializer.INSTANCE;
        }
    }

    TranslationId(int i11) {
        this.resourceId = i11;
    }

    public final int getResourceId() {
        return this.resourceId;
    }
}