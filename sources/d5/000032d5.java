package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.k;
import com.android.volley.toolbox.k;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdc extends k {
    final /* synthetic */ Map zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdc(zzdd zzddVar, String str, k.b bVar, int i11, int i12, ImageView.ScaleType scaleType, Bitmap.Config config, k.a aVar, Map map) {
        super(str, bVar, 0, 0, scaleType, config, aVar);
        this.zza = map;
    }

    @Override // com.android.volley.i
    public final Map getHeaders() {
        return this.zza;
    }
}