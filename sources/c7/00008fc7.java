package ol;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class c0 extends com.google.crypto.tink.shaded.protobuf.y<c0, b> implements r0 {
    private static final c0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile y0<c0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private a0.i<c> key_ = com.google.crypto.tink.shaded.protobuf.y.m();
    private int primaryKeyId_;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f42713a;

        static {
            int[] iArr = new int[y.f.values().length];
            f42713a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42713a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42713a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42713a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42713a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42713a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42713a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends y.a<c0, b> implements r0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b n(c cVar) {
            h();
            ((c0) this.f16422b).F(cVar);
            return this;
        }

        public c o(int i11) {
            return ((c0) this.f16422b).H(i11);
        }

        public int p() {
            return ((c0) this.f16422b).I();
        }

        public List<c> q() {
            return Collections.unmodifiableList(((c0) this.f16422b).J());
        }

        public b r(int i11) {
            h();
            ((c0) this.f16422b).N(i11);
            return this;
        }

        private b() {
            super(c0.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends com.google.crypto.tink.shaded.protobuf.y<c, a> implements r0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile y0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* loaded from: classes3.dex */
        public static final class a extends y.a<c, a> implements r0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a n(y yVar) {
                h();
                ((c) this.f16422b).N(yVar);
                return this;
            }

            public a o(int i11) {
                h();
                ((c) this.f16422b).O(i11);
                return this;
            }

            public a p(i0 i0Var) {
                h();
                ((c) this.f16422b).P(i0Var);
                return this;
            }

            public a q(z zVar) {
                h();
                ((c) this.f16422b).Q(zVar);
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

        public static a M() {
            return DEFAULT_INSTANCE.i();
        }

        public void N(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        public void O(int i11) {
            this.keyId_ = i11;
        }

        public void P(i0 i0Var) {
            this.outputPrefixType_ = i0Var.getNumber();
        }

        public void Q(z zVar) {
            this.status_ = zVar.getNumber();
        }

        public y H() {
            y yVar = this.keyData_;
            return yVar == null ? y.G() : yVar;
        }

        public int I() {
            return this.keyId_;
        }

        public i0 J() {
            i0 forNumber = i0.forNumber(this.outputPrefixType_);
            return forNumber == null ? i0.UNRECOGNIZED : forNumber;
        }

        public z K() {
            z forNumber = z.forNumber(this.status_);
            return forNumber == null ? z.UNRECOGNIZED : forNumber;
        }

        public boolean L() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y
        protected final Object l(y.f fVar, Object obj, Object obj2) {
            switch (a.f42713a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        com.google.crypto.tink.shaded.protobuf.y.A(c0.class, c0Var);
    }

    private c0() {
    }

    public void F(c cVar) {
        cVar.getClass();
        G();
        this.key_.add(cVar);
    }

    private void G() {
        if (this.key_.isModifiable()) {
            return;
        }
        this.key_ = com.google.crypto.tink.shaded.protobuf.y.s(this.key_);
    }

    public static b L() {
        return DEFAULT_INSTANCE.i();
    }

    public static c0 M(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (c0) com.google.crypto.tink.shaded.protobuf.y.w(DEFAULT_INSTANCE, bArr, pVar);
    }

    public void N(int i11) {
        this.primaryKeyId_ = i11;
    }

    public c H(int i11) {
        return this.key_.get(i11);
    }

    public int I() {
        return this.key_.size();
    }

    public List<c> J() {
        return this.key_;
    }

    public int K() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object l(y.f fVar, Object obj, Object obj2) {
        switch (a.f42713a[fVar.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<c0> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (c0.class) {
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