package ol;

import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y0;

/* loaded from: classes3.dex */
public final class f extends com.google.crypto.tink.shaded.protobuf.y<f, b> implements r0 {
    private static final f DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile y0<f> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.f16278b;
    private h params_;
    private int version_;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42718a;

        static {
            int[] iArr = new int[y.f.values().length];
            f42718a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42718a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42718a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42718a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42718a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42718a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42718a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends y.a<f, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b n(com.google.crypto.tink.shaded.protobuf.i iVar) {
            h();
            ((f) this.f16422b).M(iVar);
            return this;
        }

        public b o(h hVar) {
            h();
            ((f) this.f16422b).N(hVar);
            return this;
        }

        public b p(int i11) {
            h();
            ((f) this.f16422b).O(i11);
            return this;
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.google.crypto.tink.shaded.protobuf.y.A(f.class, fVar);
    }

    private f() {
    }

    public static f G() {
        return DEFAULT_INSTANCE;
    }

    public static b K() {
        return DEFAULT_INSTANCE.i();
    }

    public static f L(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (f) com.google.crypto.tink.shaded.protobuf.y.v(DEFAULT_INSTANCE, iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(com.google.crypto.tink.shaded.protobuf.i iVar) {
        iVar.getClass();
        this.keyValue_ = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(h hVar) {
        hVar.getClass();
        this.params_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(int i11) {
        this.version_ = i11;
    }

    public com.google.crypto.tink.shaded.protobuf.i H() {
        return this.keyValue_;
    }

    public h I() {
        h hVar = this.params_;
        return hVar == null ? h.D() : hVar;
    }

    public int J() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object l(y.f fVar, Object obj, Object obj2) {
        switch (a.f42718a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<f> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (f.class) {
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