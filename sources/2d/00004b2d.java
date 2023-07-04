package com.stripe.android;

import android.content.SharedPreferences;
import com.stripe.android.model.parsers.FraudDetectionDataJsonParser;
import com.stripe.android.networking.FraudDetectionData;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONObject;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;

@f(c = "com.stripe.android.DefaultFraudDetectionDataStore$get$2", f = "FraudDetectionDataStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultFraudDetectionDataStore$get$2 extends l implements p<o0, zz.d<? super FraudDetectionData>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultFraudDetectionDataStore this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataStore$get$2(DefaultFraudDetectionDataStore defaultFraudDetectionDataStore, zz.d<? super DefaultFraudDetectionDataStore$get$2> dVar) {
        super(2, dVar);
        this.this$0 = defaultFraudDetectionDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        DefaultFraudDetectionDataStore$get$2 defaultFraudDetectionDataStore$get$2 = new DefaultFraudDetectionDataStore$get$2(this.this$0, dVar);
        defaultFraudDetectionDataStore$get$2.L$0 = obj;
        return defaultFraudDetectionDataStore$get$2;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super FraudDetectionData> dVar) {
        return ((DefaultFraudDetectionDataStore$get$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b11;
        SharedPreferences prefs;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            o0 o0Var = (o0) this.L$0;
            DefaultFraudDetectionDataStore defaultFraudDetectionDataStore = this.this$0;
            try {
                q.a aVar = q.f54772b;
                prefs = defaultFraudDetectionDataStore.getPrefs();
                String string = prefs.getString("key_fraud_detection_data", null);
                if (string == null) {
                    string = "";
                }
                JSONObject jSONObject = new JSONObject(string);
                b11 = q.b(new FraudDetectionDataJsonParser(new DefaultFraudDetectionDataStore$get$2$1$timestampSupplier$1(jSONObject)).parse(jSONObject));
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            if (q.g(b11)) {
                return null;
            }
            return b11;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}