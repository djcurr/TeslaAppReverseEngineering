package com.facebook.react.uimanager;

import java.util.Comparator;

/* loaded from: classes3.dex */
public class z0 {

    /* renamed from: c  reason: collision with root package name */
    public static Comparator<z0> f12508c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f12509a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12510b;

    /* loaded from: classes3.dex */
    class a implements Comparator<z0> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(z0 z0Var, z0 z0Var2) {
            return z0Var.f12510b - z0Var2.f12510b;
        }
    }

    public z0(int i11, int i12) {
        this.f12509a = i11;
        this.f12510b = i12;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != z0.class) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f12510b == z0Var.f12510b && this.f12509a == z0Var.f12509a;
    }

    public String toString() {
        return "[" + this.f12509a + ", " + this.f12510b + "]";
    }
}