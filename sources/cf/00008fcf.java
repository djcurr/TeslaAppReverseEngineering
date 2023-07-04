package ol;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y0;

/* loaded from: classes3.dex */
public final class d0 extends com.google.crypto.tink.shaded.protobuf.y<d0, b> implements r0 {
    private static final d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile y0<d0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private a0.i<c> keyInfo_ = com.google.crypto.tink.shaded.protobuf.y.m();
    private int primaryKeyId_;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42715a;

        static {
            int[] iArr = new int[y.f.values().length];
            f42715a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42715a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42715a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42715a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42715a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42715a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42715a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends y.a<d0, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b n(c cVar) {
            h();
            ((d0) this.f16422b).F(cVar);
            return this;
        }

        public b o(int i11) {
            h();
            ((d0) this.f16422b).J(i11);
            return this;
        }

        private b() {
            super(d0.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends com.google.crypto.tink.shaded.protobuf.y<c, a> implements r0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile y0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* loaded from: classes3.dex */
        public static final class a extends y.a<c, a> implements r0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a n(int i11) {
                h();
                ((c) this.f16422b).J(i11);
                return this;
            }

            public a o(i0 i0Var) {
                h();
                ((c) this.f16422b).K(i0Var);
                return this;
            }

            public a p(z zVar) {
                h();
                ((c) this.f16422b).L(zVar);
                return this;
            }

            public a q(String str) {
                h();
                ((c) this.f16422b).M(str);
                return this;
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.crypto.tink.shaded.protobuf.y.A(c.class, cVar);
        }

        private c() {
        }

        public static a I() {
            return DEFAULT_INSTANCE.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(int i11) {
            this.keyId_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K(i0 i0Var) {
            this.outputPrefixType_ = i0Var.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L(z zVar) {
            this.status_ = zVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int H() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y
        protected final Object l(y.f fVar, Object obj, Object obj2) {
            switch (a.f42715a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    y0<c> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (c.class) {
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

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        com.google.crypto.tink.shaded.protobuf.y.A(d0.class, d0Var);
    }

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(c cVar) {
        cVar.getClass();
        G();
        this.keyInfo_.add(cVar);
    }

    private void G() {
        if (this.keyInfo_.isModifiable()) {
            return;
        }
        this.keyInfo_ = com.google.crypto.tink.shaded.protobuf.y.s(this.keyInfo_);
    }

    public static b I() {
        return DEFAULT_INSTANCE.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i11) {
        this.primaryKeyId_ = i11;
    }

    public c H(int i11) {
        return this.keyInfo_.get(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object l(y.f fVar, Object obj, Object obj2) {
        switch (a.f42715a[fVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<d0> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (d0.class) {
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