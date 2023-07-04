package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class t0 implements z.c {

    /* renamed from: a  reason: collision with root package name */
    private int f2362a;

    public t0(int i11) {
        this.f2362a = i11;
    }

    @Override // z.c
    public List<z.d> a(List<z.d> list) {
        ArrayList arrayList = new ArrayList();
        for (z.d dVar : list) {
            v3.h.b(dVar instanceof r, "The camera info doesn't contain internal implementation.");
            Integer c11 = ((r) dVar).c();
            if (c11 != null && c11.intValue() == this.f2362a) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public int b() {
        return this.f2362a;
    }
}