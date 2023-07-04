package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;
import ul.e;
import ul.h;
import ul.i;
import ul.q;

@KeepForSdk
/* loaded from: classes2.dex */
public class VisionCommonRegistrar implements i {
    @Override // ul.i
    public final List getComponents() {
        return zzp.zzi(ul.d.c(a.class).b(q.l(a.C0313a.class)).f(new h() { // from class: com.google.mlkit.vision.common.internal.d
            @Override // ul.h
            public final Object a(e eVar) {
                return new a(eVar.c(a.C0313a.class));
            }
        }).d());
    }
}