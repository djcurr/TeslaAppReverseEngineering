package com.facebook.imagepipeline.producers;

import java.util.Map;

/* loaded from: classes3.dex */
public class y implements r0 {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f11597a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f11598b;

    public y(s0 s0Var, r0 r0Var) {
        this.f11597a = s0Var;
        this.f11598b = r0Var;
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void b(p0 p0Var, String str, boolean z11) {
        s0 s0Var = this.f11597a;
        if (s0Var != null) {
            s0Var.h(p0Var.getId(), str, z11);
        }
        r0 r0Var = this.f11598b;
        if (r0Var != null) {
            r0Var.b(p0Var, str, z11);
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void c(p0 p0Var, String str, Map<String, String> map) {
        s0 s0Var = this.f11597a;
        if (s0Var != null) {
            s0Var.g(p0Var.getId(), str, map);
        }
        r0 r0Var = this.f11598b;
        if (r0Var != null) {
            r0Var.c(p0Var, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void d(p0 p0Var, String str) {
        s0 s0Var = this.f11597a;
        if (s0Var != null) {
            s0Var.b(p0Var.getId(), str);
        }
        r0 r0Var = this.f11598b;
        if (r0Var != null) {
            r0Var.d(p0Var, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public boolean f(p0 p0Var, String str) {
        r0 r0Var;
        s0 s0Var = this.f11597a;
        boolean d11 = s0Var != null ? s0Var.d(p0Var.getId()) : false;
        return (d11 || (r0Var = this.f11598b) == null) ? d11 : r0Var.f(p0Var, str);
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void h(p0 p0Var, String str, String str2) {
        s0 s0Var = this.f11597a;
        if (s0Var != null) {
            s0Var.j(p0Var.getId(), str, str2);
        }
        r0 r0Var = this.f11598b;
        if (r0Var != null) {
            r0Var.h(p0Var, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void j(p0 p0Var, String str, Map<String, String> map) {
        s0 s0Var = this.f11597a;
        if (s0Var != null) {
            s0Var.e(p0Var.getId(), str, map);
        }
        r0 r0Var = this.f11598b;
        if (r0Var != null) {
            r0Var.j(p0Var, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void k(p0 p0Var, String str, Throwable th2, Map<String, String> map) {
        s0 s0Var = this.f11597a;
        if (s0Var != null) {
            s0Var.f(p0Var.getId(), str, th2, map);
        }
        r0 r0Var = this.f11598b;
        if (r0Var != null) {
            r0Var.k(p0Var, str, th2, map);
        }
    }
}