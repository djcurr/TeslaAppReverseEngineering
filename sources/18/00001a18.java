package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class e implements sf.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<sf.b> f12521a;

    private e(List<sf.b> list) {
        this.f12521a = new LinkedList(list);
    }

    public static sf.b d(List<sf.b> list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return new e(list);
            }
            return list.get(0);
        }
        return null;
    }

    @Override // sf.b
    public gd.d a() {
        LinkedList linkedList = new LinkedList();
        for (sf.b bVar : this.f12521a) {
            linkedList.push(bVar.a());
        }
        return new gd.f(linkedList);
    }

    @Override // sf.b
    public qd.a<Bitmap> b(Bitmap bitmap, gf.f fVar) {
        qd.a<Bitmap> aVar = null;
        try {
            qd.a<Bitmap> aVar2 = null;
            for (sf.b bVar : this.f12521a) {
                aVar = bVar.b(aVar2 != null ? aVar2.J() : bitmap, fVar);
                qd.a.C(aVar2);
                aVar2 = aVar.clone();
            }
            return aVar.clone();
        } finally {
            qd.a.C(aVar);
        }
    }

    @Override // sf.b
    public String getName() {
        StringBuilder sb2 = new StringBuilder();
        for (sf.b bVar : this.f12521a) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(bVar.getName());
        }
        sb2.insert(0, "MultiPostProcessor (");
        sb2.append(")");
        return sb2.toString();
    }
}