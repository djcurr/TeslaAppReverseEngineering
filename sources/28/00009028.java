package ol;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y0;

/* loaded from: classes3.dex */
public final class y extends com.google.crypto.tink.shaded.protobuf.y<y, b> implements r0 {
    private static final y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile y0<y> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.i value_ = com.google.crypto.tink.shaded.protobuf.i.f16278b;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42744a;

        static {
            int[] iArr = new int[y.f.values().length];
            f42744a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42744a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42744a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42744a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42744a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42744a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42744a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends y.a<y, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b n(c cVar) {
            h();
            ((y) this.f16422b).L(cVar);
            return this;
        }

        public b o(String str) {
            h();
            ((y) this.f16422b).M(str);
            return this;
        }

        public b p(com.google.crypto.tink.shaded.protobuf.i iVar) {
            h();
            ((y) this.f16422b).N(iVar);
            return this;
        }

        private b() {
            super(y.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes3.dex */
    public enum c implements a0.c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final int REMOTE_VALUE = 4;
        public static final int SYMMETRIC_VALUE = 1;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
        private static final a0.d<c> internalValueMap = new a();
        private final int value;

        /* loaded from: classes3.dex */
        class a implements a0.d<c> {
            a() {
            }

            @Override // com.google.crypto.tink.shaded.protobuf.a0.d
            /* renamed from: a */
            public c findValueByNumber(int i11) {
                return c.forNumber(i11);
            }
        }

        /* loaded from: classes3.dex */
        private static final class b implements a0.e {

            /* renamed from: a  reason: collision with root package name */
            static final a0.e f42745a = new b();

            private b() {
            }

            @Override // com.google.crypto.tink.shaded.protobuf.a0.e
            public boolean isInRange(int i11) {
                return c.forNumber(i11) != null;
            }
        }

        c(int i11) {
            this.value = i11;
        }

        public static c forNumber(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        public static a0.d<c> internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return b.f42745a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static c valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        com.google.crypto.tink.shaded.protobuf.y.A(y.class, yVar);
    }

    private y() {
    }

    public static y G() {
        return DEFAULT_INSTANCE;
    }

    public static b K() {
        return DEFAULT_INSTANCE.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(c cVar) {
        this.keyMaterialType_ = cVar.getNumber();
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

    public c H() {
        c forNumber = c.forNumber(this.keyMaterialType_);
        return forNumber == null ? c.UNRECOGNIZED : forNumber;
    }

    public String I() {
        return this.typeUrl_;
    }

    public com.google.crypto.tink.shaded.protobuf.i J() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object l(y.f fVar, Object obj, Object obj2) {
        switch (a.f42744a[fVar.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<y> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (y.class) {
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