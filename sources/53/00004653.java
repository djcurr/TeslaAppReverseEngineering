package com.plaid.internal;

/* loaded from: classes2.dex */
public final class y2 implements y5 {

    /* renamed from: a  reason: collision with root package name */
    public final a6 f19877a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public a6 f19878a;

        public a a(a6 a6Var) {
            this.f19878a = (a6) tw.h.b(a6Var);
            return this;
        }

        public y5 a() {
            tw.h.a(this.f19878a, a6.class);
            return new y2(this.f19878a);
        }
    }

    public y2(a6 a6Var) {
        this.f19877a = a6Var;
    }

    public static a a() {
        return new a();
    }

    public void a(c6 c6Var) {
        c6Var.f18248a = (t8) tw.h.d(this.f19877a.a());
    }
}