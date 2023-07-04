package com.google.mlkit.vision.text.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbm;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.vision.text.internal.k;
import java.util.List;
import ul.q;

@KeepForSdk
/* loaded from: classes2.dex */
public class TextRegistrar implements ul.i {
    @Override // ul.i
    public final List getComponents() {
        return zzbm.zzk(ul.d.c(k.class).b(q.j(com.google.mlkit.common.sdkinternal.i.class)).f(new ul.h() { // from class: po.e
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new k((i) eVar.a(i.class));
            }
        }).d(), ul.d.c(j.class).b(q.j(k.class)).b(q.j(com.google.mlkit.common.sdkinternal.d.class)).f(new ul.h() { // from class: com.google.mlkit.vision.text.internal.n
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new j((k) eVar.a(k.class), (com.google.mlkit.common.sdkinternal.d) eVar.a(com.google.mlkit.common.sdkinternal.d.class));
            }
        }).d());
    }
}