package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.g0;
import io.sentry.g3;
import rz.j;

/* loaded from: classes5.dex */
final class a implements g0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        g3 g3Var = (g3) j.a(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        NativeModuleListLoader nativeModuleListLoader2 = (NativeModuleListLoader) j.a(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}