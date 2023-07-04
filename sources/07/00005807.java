package com.stripe.android.stripe3ds2.init;

import android.content.SharedPreferences;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$Store$Default$get$2", f = "DefaultAppInfoRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DefaultAppInfoRepository$Store$Default$get$2 extends l implements p<o0, d<? super AppInfo>, Object> {
    int label;
    final /* synthetic */ DefaultAppInfoRepository.Store.Default this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository$Store$Default$get$2(DefaultAppInfoRepository.Store.Default r12, d<? super DefaultAppInfoRepository$Store$Default$get$2> dVar) {
        super(2, dVar);
        this.this$0 = r12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultAppInfoRepository$Store$Default$get$2(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super AppInfo> dVar) {
        return ((DefaultAppInfoRepository$Store$Default$get$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPrefs;
        SharedPreferences sharedPrefs2;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            sharedPrefs = this.this$0.getSharedPrefs();
            int i11 = sharedPrefs.getInt(AnalyticsFields.APP_VERSION, 0);
            sharedPrefs2 = this.this$0.getSharedPrefs();
            String string = sharedPrefs2.getString("sdk_app_id", null);
            if (string == null) {
                return null;
            }
            return new AppInfo(string, i11);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}