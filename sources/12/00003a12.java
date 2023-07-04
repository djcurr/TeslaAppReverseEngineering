package com.google.firebase.remoteconfig.internal;

/* loaded from: classes2.dex */
public class o implements mn.e {

    /* renamed from: a  reason: collision with root package name */
    private final int f17157a;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f17158a;

        /* renamed from: b  reason: collision with root package name */
        private int f17159b;

        /* renamed from: c  reason: collision with root package name */
        private mn.f f17160c;

        public o a() {
            return new o(this.f17158a, this.f17159b, this.f17160c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b b(mn.f fVar) {
            this.f17160c = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(int i11) {
            this.f17159b = i11;
            return this;
        }

        public b d(long j11) {
            this.f17158a = j11;
            return this;
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b b() {
        return new b();
    }

    @Override // mn.e
    public int a() {
        return this.f17157a;
    }

    private o(long j11, int i11, mn.f fVar) {
        this.f17157a = i11;
    }
}