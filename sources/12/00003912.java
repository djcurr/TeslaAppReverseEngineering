package com.google.firebase.ktx;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import ln.h;
import ul.d;
import ul.i;
import wz.v;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lul/i;", "", "Lul/d;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common-ktx"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements i {
    @Override // ul.i
    public List<d<?>> getComponents() {
        List<d<?>> d11;
        d11 = v.d(h.b("fire-core-ktx", "20.1.0"));
        return d11;
    }
}