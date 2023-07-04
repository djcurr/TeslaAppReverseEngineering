package ol;

import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y0;

/* loaded from: classes3.dex */
public final class a extends com.google.crypto.tink.shaded.protobuf.y<a, b> implements r0 {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile y0<a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.f16278b;
    private c params_;
    private int version_;

    /* renamed from: ol.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C0850a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42708a;

        static {
            int[] iArr = new int[y.f.values().length];
            f42708a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42708a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42708a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42708a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42708a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42708a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42708a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends y.a<a, b> implements r0 {
        /* synthetic */ b(C0850a c0850a) {
            this();
        }

        public b n(com.google.crypto.tink.shaded.protobuf.i iVar) {
            h();
            ((a) this.f16422b).L(iVar);
            return this;
        }

        public b o(c cVar) {
            h();
            ((a) this.f16422b).M(cVar);
            return this;
        }

        public b p(int i11) {
            h();
            ((a) this.f16422b).N(i11);
            return this;
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        com.google.crypto.tink.shaded.protobuf.y.A(a.class, aVar);
    }

    private a() {
    }

    public static b J() {
        return DEFAULT_INSTANCE.i();
    }

    public static a K(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (a) com.google.crypto.tink.shaded.protobuf.y.v(DEFAULT_INSTANCE, iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(com.google.crypto.tink.shaded.protobuf.i iVar) {
        iVar.getClass();
        this.keyValue_ = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(c cVar) {
        cVar.getClass();
        this.params_ = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i11) {
        this.version_ = i11;
    }

    public com.google.crypto.tink.shaded.protobuf.i G() {
        return this.keyValue_;
    }

    public c H() {
        c cVar = this.params_;
        return cVar == null ? c.D() : cVar;
    }

    public int I() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object l(y.f fVar, Object obj, Object obj2) {
        switch (C0850a.f42708a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<a> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (a.class) {
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