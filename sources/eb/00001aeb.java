package com.facebook.yoga;

/* loaded from: classes3.dex */
public abstract class e extends c {

    /* renamed from: a  reason: collision with root package name */
    long f12953a;

    private e(long j11) {
        if (j11 != 0) {
            this.f12953a = j11;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    @Override // com.facebook.yoga.c
    public void a(float f11) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f12953a, f11);
    }

    @Override // com.facebook.yoga.c
    public void b(boolean z11) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.f12953a, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}