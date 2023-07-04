package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
abstract class b {

    /* renamed from: a  reason: collision with root package name */
    List<b> f11715a;

    /* renamed from: b  reason: collision with root package name */
    int f11716b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f11717c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f11718d = -1;

    public final void a(b bVar) {
        if (this.f11715a == null) {
            this.f11715a = new ArrayList(1);
        }
        ((List) wf.a.c(this.f11715a)).add(bVar);
        bVar.b(this);
    }

    public void b(b bVar) {
    }

    public void c(b bVar) {
    }

    public abstract String d();

    public String e() {
        String str;
        Iterator<b> it2;
        List<b> list = this.f11715a;
        String str2 = "";
        if (list == null || list.size() <= 0) {
            str = "";
        } else {
            str = "";
            while (this.f11715a.iterator().hasNext()) {
                str = str + " " + it2.next().f11718d;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d());
        if (str.length() > 0) {
            str2 = " children: " + str;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final void f(b bVar) {
        if (this.f11715a == null) {
            return;
        }
        bVar.c(this);
        this.f11715a.remove(bVar);
    }

    public void g() {
    }
}