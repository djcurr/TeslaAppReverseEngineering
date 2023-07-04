package com.stripe.android.ui.core.elements;

import c30.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public enum DisplayField {
    Country;
    
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<DisplayField> serializer() {
            return DisplayField$$serializer.INSTANCE;
        }
    }
}