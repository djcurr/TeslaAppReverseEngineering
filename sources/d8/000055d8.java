package com.stripe.android.paymentsheet.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.core.injection.IOContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.d;
import v20.i;
import vz.k;
import vz.m;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultDeviceIdRepository implements DeviceIdRepository {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String KEY_DEVICE_ID = "device_id";
    @Deprecated
    private static final String PREF_FILE = "DefaultDeviceIdRepository";
    private final Context context;
    private final b mutex;
    private final k prefs$delegate;
    private final g workContext;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultDeviceIdRepository(Context context, @IOContext g workContext) {
        k a11;
        s.g(context, "context");
        s.g(workContext, "workContext");
        this.context = context;
        this.workContext = workContext;
        a11 = m.a(new DefaultDeviceIdRepository$prefs$2(this));
        this.prefs$delegate = a11;
        this.mutex = d.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceId createDeviceId() {
        DeviceId deviceId = new DeviceId();
        SharedPreferences.Editor editor = getPrefs().edit();
        s.f(editor, "editor");
        editor.putString("device_id", deviceId.getValue());
        editor.commit();
        return deviceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        Object value = this.prefs$delegate.getValue();
        s.f(value, "<get-prefs>(...)");
        return (SharedPreferences) value;
    }

    @Override // com.stripe.android.paymentsheet.analytics.DeviceIdRepository
    public Object get(zz.d<? super DeviceId> dVar) {
        return i.g(this.workContext, new DefaultDeviceIdRepository$get$2(this, null), dVar);
    }
}