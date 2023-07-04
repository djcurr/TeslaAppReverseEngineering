package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.n1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Common$URLBehaviorConfiguration extends GeneratedMessageLite<Common$URLBehaviorConfiguration, a> implements c {
    public static final int BEHAVIOR_FIELD_NUMBER = 2;
    private static final Common$URLBehaviorConfiguration DEFAULT_INSTANCE;
    public static final int MATCHER_FIELD_NUMBER = 1;
    private static volatile Parser<Common$URLBehaviorConfiguration> PARSER;
    private int behavior_;
    private Matcher matcher_;

    /* loaded from: classes2.dex */
    public static final class Matcher extends GeneratedMessageLite<Matcher, a> implements MessageLiteOrBuilder {
        private static final Matcher DEFAULT_INSTANCE;
        public static final int EXPECTED_QUERY_PARAMETERS_FIELD_NUMBER = 4;
        public static final int HOST_FIELD_NUMBER = 2;
        private static volatile Parser<Matcher> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 3;
        public static final int SCHEME_FIELD_NUMBER = 1;
        private String scheme_ = "";
        private String host_ = "";
        private String path_ = "";
        private Internal.ProtobufList<String> expectedQueryParameters_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Matcher, a> implements MessageLiteOrBuilder {
            public a() {
                super(Matcher.DEFAULT_INSTANCE);
            }
        }

        static {
            Matcher matcher = new Matcher();
            DEFAULT_INSTANCE = matcher;
            GeneratedMessageLite.registerDefaultInstance(Matcher.class, matcher);
        }

        private Matcher() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExpectedQueryParameters(Iterable<String> iterable) {
            ensureExpectedQueryParametersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.expectedQueryParameters_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExpectedQueryParameters(String str) {
            str.getClass();
            ensureExpectedQueryParametersIsMutable();
            this.expectedQueryParameters_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExpectedQueryParametersBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureExpectedQueryParametersIsMutable();
            this.expectedQueryParameters_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpectedQueryParameters() {
            this.expectedQueryParameters_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHost() {
            this.host_ = getDefaultInstance().getHost();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScheme() {
            this.scheme_ = getDefaultInstance().getScheme();
        }

        private void ensureExpectedQueryParametersIsMutable() {
            Internal.ProtobufList<String> protobufList = this.expectedQueryParameters_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.expectedQueryParameters_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Matcher getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Matcher parseDelimitedFrom(InputStream inputStream) {
            return (Matcher) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Matcher parseFrom(ByteBuffer byteBuffer) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Matcher> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpectedQueryParameters(int i11, String str) {
            str.getClass();
            ensureExpectedQueryParametersIsMutable();
            this.expectedQueryParameters_.set(i11, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHost(String str) {
            str.getClass();
            this.host_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.host_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(String str) {
            str.getClass();
            this.path_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPathBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.path_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScheme(String str) {
            str.getClass();
            this.scheme_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.scheme_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (c1.f18233a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Matcher();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț", new Object[]{"scheme_", "host_", "path_", "expectedQueryParameters_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Matcher> parser = PARSER;
                    if (parser == null) {
                        synchronized (Matcher.class) {
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

        public String getExpectedQueryParameters(int i11) {
            return this.expectedQueryParameters_.get(i11);
        }

        public ByteString getExpectedQueryParametersBytes(int i11) {
            return ByteString.copyFromUtf8(this.expectedQueryParameters_.get(i11));
        }

        public int getExpectedQueryParametersCount() {
            return this.expectedQueryParameters_.size();
        }

        public List<String> getExpectedQueryParametersList() {
            return this.expectedQueryParameters_;
        }

        public String getHost() {
            return this.host_;
        }

        public ByteString getHostBytes() {
            return ByteString.copyFromUtf8(this.host_);
        }

        public String getPath() {
            return this.path_;
        }

        public ByteString getPathBytes() {
            return ByteString.copyFromUtf8(this.path_);
        }

        public String getScheme() {
            return this.scheme_;
        }

        public ByteString getSchemeBytes() {
            return ByteString.copyFromUtf8(this.scheme_);
        }

        public static a newBuilder(Matcher matcher) {
            return DEFAULT_INSTANCE.createBuilder(matcher);
        }

        public static Matcher parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Matcher parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Matcher parseFrom(ByteString byteString) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Matcher parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Matcher parseFrom(byte[] bArr) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Matcher parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Matcher parseFrom(InputStream inputStream) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Matcher parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Matcher parseFrom(CodedInputStream codedInputStream) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Matcher parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$URLBehaviorConfiguration, a> implements c {
        public a() {
            super(Common$URLBehaviorConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$URLBehaviorConfiguration common$URLBehaviorConfiguration = new Common$URLBehaviorConfiguration();
        DEFAULT_INSTANCE = common$URLBehaviorConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Common$URLBehaviorConfiguration.class, common$URLBehaviorConfiguration);
    }

    private Common$URLBehaviorConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBehavior() {
        this.behavior_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatcher() {
        this.matcher_ = null;
    }

    public static Common$URLBehaviorConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMatcher(Matcher matcher) {
        matcher.getClass();
        Matcher matcher2 = this.matcher_;
        if (matcher2 != null && matcher2 != Matcher.getDefaultInstance()) {
            this.matcher_ = Matcher.newBuilder(this.matcher_).mergeFrom((Matcher.a) matcher).buildPartial();
        } else {
            this.matcher_ = matcher;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$URLBehaviorConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$URLBehaviorConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$URLBehaviorConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBehavior(n1 n1Var) {
        this.behavior_ = n1Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBehaviorValue(int i11) {
        this.behavior_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatcher(Matcher matcher) {
        matcher.getClass();
        this.matcher_ = matcher;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$URLBehaviorConfiguration();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"matcher_", "behavior_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$URLBehaviorConfiguration> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$URLBehaviorConfiguration.class) {
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

    public n1 getBehavior() {
        n1 forNumber = n1.forNumber(this.behavior_);
        return forNumber == null ? n1.UNRECOGNIZED : forNumber;
    }

    public int getBehaviorValue() {
        return this.behavior_;
    }

    public Matcher getMatcher() {
        Matcher matcher = this.matcher_;
        return matcher == null ? Matcher.getDefaultInstance() : matcher;
    }

    public boolean hasMatcher() {
        return this.matcher_ != null;
    }

    public static a newBuilder(Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(common$URLBehaviorConfiguration);
    }

    public static Common$URLBehaviorConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(ByteString byteString) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$URLBehaviorConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(byte[] bArr) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$URLBehaviorConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(InputStream inputStream) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$URLBehaviorConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$URLBehaviorConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}