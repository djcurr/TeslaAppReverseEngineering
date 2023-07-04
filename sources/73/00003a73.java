package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.mlkit.common.sdkinternal.i;
import java.util.List;
import ul.e;
import ul.q;

@KeepForSdk
/* loaded from: classes2.dex */
public class BarcodeRegistrar implements ul.i {
    @Override // ul.i
    public final List getComponents() {
        return zzcc.zzi(ul.d.c(e.class).b(q.j(com.google.mlkit.common.sdkinternal.i.class)).f(new ul.h() { // from class: jo.a
            @Override // ul.h
            public final Object a(e eVar) {
                return new com.google.mlkit.vision.barcode.internal.e((i) eVar.a(i.class));
            }
        }).d(), ul.d.c(d.class).b(q.j(e.class)).b(q.j(com.google.mlkit.common.sdkinternal.d.class)).f(new ul.h() { // from class: com.google.mlkit.vision.barcode.internal.c
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new d((e) eVar.a(e.class), (com.google.mlkit.common.sdkinternal.d) eVar.a(com.google.mlkit.common.sdkinternal.d.class));
            }
        }).d());
    }
}