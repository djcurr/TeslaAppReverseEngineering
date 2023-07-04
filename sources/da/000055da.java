package com.stripe.android.paymentsheet.analytics;

import android.content.SharedPreferences;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.sync.b;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository$get$2", f = "DefaultDeviceIdRepository.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DefaultDeviceIdRepository$get$2 extends l implements p<o0, d<? super DeviceId>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultDeviceIdRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDeviceIdRepository$get$2(DefaultDeviceIdRepository defaultDeviceIdRepository, d<? super DefaultDeviceIdRepository$get$2> dVar) {
        super(2, dVar);
        this.this$0 = defaultDeviceIdRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultDeviceIdRepository$get$2(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super DeviceId> dVar) {
        return ((DefaultDeviceIdRepository$get$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        b bVar;
        DefaultDeviceIdRepository defaultDeviceIdRepository;
        SharedPreferences prefs;
        DeviceId createDeviceId;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            bVar = this.this$0.mutex;
            DefaultDeviceIdRepository defaultDeviceIdRepository2 = this.this$0;
            this.L$0 = bVar;
            this.L$1 = defaultDeviceIdRepository2;
            this.label = 1;
            if (bVar.b(null, this) == d11) {
                return d11;
            }
            defaultDeviceIdRepository = defaultDeviceIdRepository2;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            defaultDeviceIdRepository = (DefaultDeviceIdRepository) this.L$1;
            bVar = (b) this.L$0;
            r.b(obj);
        }
        try {
            prefs = defaultDeviceIdRepository.getPrefs();
            String string = prefs.getString(DefaultEventReporter.FIELD_DEVICE_ID, null);
            if (string == null) {
                createDeviceId = defaultDeviceIdRepository.createDeviceId();
            } else {
                createDeviceId = new DeviceId(string);
            }
            return createDeviceId;
        } finally {
            bVar.c(null);
        }
    }
}