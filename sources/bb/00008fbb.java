package ol;

import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y0;

/* loaded from: classes3.dex */
public final class a0 extends com.google.crypto.tink.shaded.protobuf.y<a0, b> implements r0 {
    private static final a0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile y0<a0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.i value_ = com.google.crypto.tink.shaded.protobuf.i.f16278b;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42709a;

        static {
            int[] iArr = new int[y.f.values().length];
            f42709a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42709a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42709a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42709a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42709a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42709a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42709a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends y.a<a0, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b n(i0 i0Var) {
            h();
            ((a0) this.f16422b).L(i0Var);
            return this;
        }

        public b o(String str) {
            h();
            ((a0) this.f16422b).M(str);
            return this;
        }

        public b p(com.google.crypto.tink.shaded.protobuf.i iVar) {
            h();
            ((a0) this.f16422b).N(iVar);
            return this;
        }

        private b() {
            super(a0.DEFAULT_INSTANCE);
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        com.google.crypto.tink.shaded.protobuf.y.A(a0.class, a0Var);
    }

    private a0() {
    }

    public static a0 G() {
        return DEFAULT_INSTANCE;
    }

    public static b K() {
        return DEFAULT_INSTANCE.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(i0 i0Var) {
        this.outputPrefixType_ = i0Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(com.google.crypto.tink.shaded.protobuf.i iVar) {
        iVar.getClass();
        this.value_ = iVar;
    }

    public i0 H() {
        i0 forNumber = i0.forNumber(this.outputPrefixType_);
        return forNumber == null ? i0.UNRECOGNIZED : forNumber;
    }

    public String I() {
        return this.typeUrl_;
    }

    public com.google.crypto.tink.shaded.protobuf.i J() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object l(y.f fVar, Object obj, Object obj2) {
        switch (a.f42709a[fVar.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<a0> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (a0.class) {
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