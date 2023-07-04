package com.plaid.internal;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hb<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f18714a;

    /* renamed from: b  reason: collision with root package name */
    public int f18715b;

    /* renamed from: c  reason: collision with root package name */
    public int f18716c;

    /* renamed from: d  reason: collision with root package name */
    public int f18717d;

    public hb(int i11) {
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (i12 < i11) {
            i12++;
            arrayList.add(null);
        }
        this.f18714a = arrayList;
    }

    public final List<T> a() {
        ArrayList arrayList = new ArrayList();
        int i11 = this.f18716c;
        int i12 = this.f18715b;
        int i13 = 0;
        if (!(i11 > i12)) {
            int size = this.f18714a.size();
            while (i12 < size) {
                int i14 = i12 + 1;
                T t11 = this.f18714a.get(i12);
                if (t11 != null) {
                    arrayList.add(t11);
                }
                i12 = i14;
            }
            int i15 = this.f18716c;
            while (i13 < i15) {
                int i16 = i13 + 1;
                T t12 = this.f18714a.get(i13);
                if (t12 != null) {
                    arrayList.add(t12);
                }
                i13 = i16;
            }
        } else if (i12 <= i11) {
            while (true) {
                int i17 = i12 + 1;
                T t13 = this.f18714a.get(i12);
                if (t13 != null) {
                    arrayList.add(t13);
                }
                if (i12 == i11) {
                    break;
                }
                i12 = i17;
            }
        }
        return arrayList;
    }

    public String toString() {
        String l02;
        StringBuilder sb2 = new StringBuilder();
        l02 = wz.e0.l0(a(), ", ", "{", "}", 0, null, null, 56, null);
        sb2.append(l02);
        sb2.append(" [capacity=" + this.f18717d + ", H=" + this.f18715b + ", T=" + this.f18716c + ']');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply {\n…T=$tail]\")\n  }.toString()");
        return sb3;
    }
}