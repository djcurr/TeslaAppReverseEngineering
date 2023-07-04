package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i0 implements g1 {

    /* renamed from: b  reason: collision with root package name */
    private static final p0 f16289b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final p0 f16290a;

    /* loaded from: classes3.dex */
    class a implements p0 {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0
        public o0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements p0 {

        /* renamed from: a  reason: collision with root package name */
        private p0[] f16291a;

        b(p0... p0VarArr) {
            this.f16291a = p0VarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0
        public boolean isSupported(Class<?> cls) {
            for (p0 p0Var : this.f16291a) {
                if (p0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0
        public o0 messageInfoFor(Class<?> cls) {
            p0[] p0VarArr;
            for (p0 p0Var : this.f16291a) {
                if (p0Var.isSupported(cls)) {
                    return p0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public i0() {
        this(a());
    }

    private static p0 a() {
        return new b(x.a(), b());
    }

    private static p0 b() {
        try {
            return (p0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f16289b;
        }
    }

    private static boolean c(o0 o0Var) {
        return o0Var.getSyntax() == a1.PROTO2;
    }

    private static <T> f1<T> d(Class<T> cls, o0 o0Var) {
        if (y.class.isAssignableFrom(cls)) {
            if (c(o0Var)) {
                return t0.J(cls, o0Var, x0.b(), g0.b(), h1.M(), s.b(), n0.b());
            }
            return t0.J(cls, o0Var, x0.b(), g0.b(), h1.M(), null, n0.b());
        } else if (c(o0Var)) {
            return t0.J(cls, o0Var, x0.a(), g0.a(), h1.H(), s.a(), n0.a());
        } else {
            return t0.J(cls, o0Var, x0.a(), g0.a(), h1.I(), null, n0.a());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> f1<T> createSchema(Class<T> cls) {
        h1.J(cls);
        o0 messageInfoFor = this.f16290a.messageInfoFor(cls);
        if (messageInfoFor.isMessageSetWireFormat()) {
            if (y.class.isAssignableFrom(cls)) {
                return u0.f(h1.M(), s.b(), messageInfoFor.getDefaultInstance());
            }
            return u0.f(h1.H(), s.a(), messageInfoFor.getDefaultInstance());
        }
        return d(cls, messageInfoFor);
    }

    private i0(p0 p0Var) {
        this.f16290a = (p0) a0.b(p0Var, "messageInfoFactory");
    }
}