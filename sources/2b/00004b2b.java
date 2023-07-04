package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.i;
import vz.k;
import vz.m;
import zz.g;

/* loaded from: classes2.dex */
public final class DefaultFraudDetectionDataStore implements FraudDetectionDataStore {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String KEY_DATA = "key_fraud_detection_data";
    @Deprecated
    private static final String PREF_FILE = "FraudDetectionDataStore";
    private final k prefs$delegate;
    private final g workContext;

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultFraudDetectionDataStore(Context context, g workContext) {
        k a11;
        s.g(context, "context");
        s.g(workContext, "workContext");
        this.workContext = workContext;
        a11 = m.a(new DefaultFraudDetectionDataStore$prefs$2(context));
        this.prefs$delegate = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    @Override // com.stripe.android.FraudDetectionDataStore
    public Object get(zz.d<? super FraudDetectionData> dVar) {
        return i.g(this.workContext, new DefaultFraudDetectionDataStore$get$2(this, null), dVar);
    }

    @Override // com.stripe.android.FraudDetectionDataStore
    public void save(FraudDetectionData fraudDetectionData) {
        s.g(fraudDetectionData, "fraudDetectionData");
        SharedPreferences prefs = getPrefs();
        s.f(prefs, "prefs");
        SharedPreferences.Editor editor = prefs.edit();
        s.f(editor, "editor");
        editor.putString(KEY_DATA, fraudDetectionData.toJson().toString());
        editor.apply();
    }

    public /* synthetic */ DefaultFraudDetectionDataStore(Context context, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? e1.b() : gVar);
    }
}