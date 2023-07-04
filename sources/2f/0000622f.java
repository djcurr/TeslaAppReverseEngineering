package com.th3rdwave.safeareacontext;

/* loaded from: classes6.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    float f22269a;

    /* renamed from: b  reason: collision with root package name */
    float f22270b;

    /* renamed from: c  reason: collision with root package name */
    float f22271c;

    /* renamed from: d  reason: collision with root package name */
    float f22272d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(float f11, float f12, float f13, float f14) {
        this.f22269a = f11;
        this.f22270b = f12;
        this.f22271c = f13;
        this.f22272d = f14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(c cVar) {
        if (this == cVar) {
            return true;
        }
        return this.f22269a == cVar.f22269a && this.f22270b == cVar.f22270b && this.f22271c == cVar.f22271c && this.f22272d == cVar.f22272d;
    }
}