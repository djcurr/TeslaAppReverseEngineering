package ol;

import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y0;

/* loaded from: classes3.dex */
public final class d extends com.google.crypto.tink.shaded.protobuf.y<d, b> implements r0 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile y0<d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private f aesCtrKey_;
    private v hmacKey_;
    private int version_;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42714a;

        static {
            int[] iArr = new int[y.f.values().length];
            f42714a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42714a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42714a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42714a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42714a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42714a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42714a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends y.a<d, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b n(f fVar) {
            h();
            ((d) this.f16422b).L(fVar);
            return this;
        }

        public b o(v vVar) {
            h();
            ((d) this.f16422b).M(vVar);
            return this;
        }

        public b p(int i11) {
            h();
            ((d) this.f16422b).N(i11);
            return this;
        }

        private b() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        com.google.crypto.tink.shaded.protobuf.y.A(d.class, dVar);
    }

    private d() {
    }

    public static b J() {
        return DEFAULT_INSTANCE.i();
    }

    public static d K(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (d) com.google.crypto.tink.shaded.protobuf.y.v(DEFAULT_INSTANCE, iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(f fVar) {
        fVar.getClass();
        this.aesCtrKey_ = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(v vVar) {
        vVar.getClass();
        this.hmacKey_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i11) {
        this.version_ = i11;
    }

    public f G() {
        f fVar = this.aesCtrKey_;
        return fVar == null ? f.G() : fVar;
    }

    public v H() {
        v vVar = this.hmacKey_;
        return vVar == null ? v.G() : vVar;
    }

    public int I() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object l(y.f fVar, Object obj, Object obj2) {
        switch (a.f42714a[fVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<d> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (d.class) {
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