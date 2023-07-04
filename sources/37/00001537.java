package com.bumptech.glide.load.engine;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<DataType> f10618a;

    /* renamed from: b  reason: collision with root package name */
    private final List<? extends ha.f<DataType, ResourceType>> f10619b;

    /* renamed from: c  reason: collision with root package name */
    private final ua.e<ResourceType, Transcode> f10620c;

    /* renamed from: d  reason: collision with root package name */
    private final v3.f<List<Throwable>> f10621d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10622e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a<ResourceType> {
        ja.c<ResourceType> a(ja.c<ResourceType> cVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ha.f<DataType, ResourceType>> list, ua.e<ResourceType, Transcode> eVar, v3.f<List<Throwable>> fVar) {
        this.f10618a = cls;
        this.f10619b = list;
        this.f10620c = eVar;
        this.f10621d = fVar;
        this.f10622e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private ja.c<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, ha.e eVar2) {
        List<Throwable> list = (List) bb.j.d(this.f10621d.b());
        try {
            return c(eVar, i11, i12, eVar2, list);
        } finally {
            this.f10621d.a(list);
        }
    }

    private ja.c<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, ha.e eVar2, List<Throwable> list) {
        int size = this.f10619b.size();
        ja.c<ResourceType> cVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            ha.f<DataType, ResourceType> fVar = this.f10619b.get(i13);
            try {
                if (fVar.a(eVar.a(), eVar2)) {
                    cVar = fVar.b(eVar.a(), i11, i12, eVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e11) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + fVar, e11);
                }
                list.add(e11);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f10622e, new ArrayList(list));
    }

    public ja.c<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, ha.e eVar2, a<ResourceType> aVar) {
        return this.f10620c.a(aVar.a(b(eVar, i11, i12, eVar2)), eVar2);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f10618a + ", decoders=" + this.f10619b + ", transcoder=" + this.f10620c + CoreConstants.CURLY_RIGHT;
    }
}