package com.stripe.android.googlepaylauncher;

/* loaded from: classes6.dex */
public interface GooglePayRepository {

    /* loaded from: classes6.dex */
    public static final class Disabled implements GooglePayRepository {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayRepository
        public kotlinx.coroutines.flow.e<Boolean> isReady() {
            return kotlinx.coroutines.flow.g.x(Boolean.FALSE);
        }
    }

    kotlinx.coroutines.flow.e<Boolean> isReady();
}