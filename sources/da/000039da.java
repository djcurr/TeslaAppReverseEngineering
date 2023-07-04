package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class PerfSession extends GeneratedMessageLite<PerfSession, c> implements e {
    private static final PerfSession DEFAULT_INSTANCE;
    private static volatile Parser<PerfSession> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, f> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private Internal.IntList sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    /* loaded from: classes2.dex */
    class a implements Internal.ListAdapter.Converter<Integer, f> {
        a() {
        }

        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        /* renamed from: a */
        public f convert(Integer num) {
            f forNumber = f.forNumber(num.intValue());
            return forNumber == null ? f.SESSION_VERBOSITY_NONE : forNumber;
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f17055a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17055a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17055a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17055a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17055a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17055a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17055a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17055a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends GeneratedMessageLite.Builder<PerfSession, c> implements e {
        /* synthetic */ c(a aVar) {
            this();
        }

        public c a(f fVar) {
            copyOnWrite();
            ((PerfSession) this.instance).addSessionVerbosity(fVar);
            return this;
        }

        public c k(String str) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionId(str);
            return this;
        }

        private c() {
            super(PerfSession.DEFAULT_INSTANCE);
        }
    }

    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        GeneratedMessageLite.registerDefaultInstance(PerfSession.class, perfSession);
    }

    private PerfSession() {
    }

    public void addAllSessionVerbosity(Iterable<? extends f> iterable) {
        ensureSessionVerbosityIsMutable();
        for (f fVar : iterable) {
            this.sessionVerbosity_.addInt(fVar.getNumber());
        }
    }

    public void addSessionVerbosity(f fVar) {
        fVar.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.addInt(fVar.getNumber());
    }

    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureSessionVerbosityIsMutable() {
        Internal.IntList intList = this.sessionVerbosity_;
        if (intList.isModifiable()) {
            return;
        }
        this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static PerfSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PerfSession> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public void setSessionIdBytes(ByteString byteString) {
        this.sessionId_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    public void setSessionVerbosity(int i11, f fVar) {
        fVar.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.setInt(i11, fVar.getNumber());
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (b.f17055a[methodToInvoke.ordinal()]) {
            case 1:
                return new PerfSession();
            case 2:
                return new c(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", f.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PerfSession> parser = PARSER;
                if (parser == null) {
                    synchronized (PerfSession.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    public f getSessionVerbosity(int i11) {
        return sessionVerbosity_converter_.convert(Integer.valueOf(this.sessionVerbosity_.getInt(i11)));
    }

    public int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    public List<f> getSessionVerbosityList() {
        return new Internal.ListAdapter(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c newBuilder(PerfSession perfSession) {
        return DEFAULT_INSTANCE.createBuilder(perfSession);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PerfSession parseFrom(ByteString byteString) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PerfSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PerfSession parseFrom(byte[] bArr) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PerfSession parseFrom(InputStream inputStream) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}