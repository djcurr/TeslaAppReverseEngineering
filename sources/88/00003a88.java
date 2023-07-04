package com.google.mlkit.vision.face.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.vision.face.internal.d;
import java.util.List;
import ul.e;
import ul.q;

@KeepForSdk
/* loaded from: classes2.dex */
public class FaceRegistrar implements ul.i {
    @Override // ul.i
    public final List getComponents() {
        return zzbn.zzi(ul.d.c(d.class).b(q.j(com.google.mlkit.common.sdkinternal.i.class)).f(new ul.h() { // from class: no.c
            @Override // ul.h
            public final Object a(e eVar) {
                return new d((i) eVar.a(i.class));
            }
        }).d(), ul.d.c(c.class).b(q.j(d.class)).b(q.j(com.google.mlkit.common.sdkinternal.d.class)).f(new ul.h() { // from class: com.google.mlkit.vision.face.internal.i
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new c((d) eVar.a(d.class), (com.google.mlkit.common.sdkinternal.d) eVar.a(com.google.mlkit.common.sdkinternal.d.class));
            }
        }).d());
    }
}