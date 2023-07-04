package ol;

import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y0;

/* loaded from: classes3.dex */
public final class e0 extends com.google.crypto.tink.shaded.protobuf.y<e0, b> implements r0 {
    private static final e0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile y0<e0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private f0 params_;
    private int version_;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42717a;

        static {
            int[] iArr = new int[y.f.values().length];
            f42717a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42717a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42717a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42717a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42717a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42717a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42717a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends y.a<e0, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b n(f0 f0Var) {
            h();
            ((e0) this.f16422b).J(f0Var);
            return this;
        }

        public b o(int i11) {
            h();
            ((e0) this.f16422b).K(i11);
            return this;
        }

        private b() {
            super(e0.DEFAULT_INSTANCE);
        }
    }

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        com.google.crypto.tink.shaded.protobuf.y.A(e0.class, e0Var);
    }

    private e0() {
    }

    public static b H() {
        return DEFAULT_INSTANCE.i();
    }

    public static e0 I(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (e0) com.google.crypto.tink.shaded.protobuf.y.v(DEFAULT_INSTANCE, iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(f0 f0Var) {
        f0Var.getClass();
        this.params_ = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int i11) {
        this.version_ = i11;
    }

    public f0 F() {
        f0 f0Var = this.params_;
        return f0Var == null ? f0.D() : f0Var;
    }

    public int G() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object l(y.f fVar, Object obj, Object obj2) {
        switch (a.f42717a[fVar.ordinal()]) {
            case 1:
                return new e0();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<e0> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (e0.class) {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new y.b<>(DEFAULT_INSTANCE);
                            PARSER = y0Var;
                        }
                    }
                }
                return y0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}