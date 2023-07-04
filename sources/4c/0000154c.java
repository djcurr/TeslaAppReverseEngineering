package com.bumptech.glide.load.engine;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class q<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final v3.f<List<Throwable>> f10696a;

    /* renamed from: b  reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f10697b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10698c;

    public q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, v3.f<List<Throwable>> fVar) {
        this.f10696a = fVar;
        this.f10697b = (List) bb.j.c(list);
        this.f10698c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private ja.c<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, ha.e eVar2, int i11, int i12, i.a<ResourceType> aVar, List<Throwable> list) {
        int size = this.f10697b.size();
        ja.c<Transcode> cVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            try {
                cVar = this.f10697b.get(i13).a(eVar, i11, i12, eVar2, aVar);
            } catch (GlideException e11) {
                list.add(e11);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f10698c, new ArrayList(list));
    }

    public ja.c<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, ha.e eVar2, int i11, int i12, i.a<ResourceType> aVar) {
        List<Throwable> list = (List) bb.j.d(this.f10696a.b());
        try {
            return b(eVar, eVar2, i11, i12, aVar, list);
        } finally {
            this.f10696a.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f10697b.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}