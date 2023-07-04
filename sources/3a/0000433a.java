package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.p1;
import com.plaid.internal.q1;
import com.plaid.internal.r1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Configuration$SDKMetadata extends GeneratedMessageLite<Configuration$SDKMetadata, a> implements MessageLiteOrBuilder {
    public static final int APP_PACKAGE_NAME_FIELD_NUMBER = 6;
    public static final int CLIENT_TYPE_FIELD_NUMBER = 1;
    public static final int COMMIT_FIELD_NUMBER = 3;
    private static final Configuration$SDKMetadata DEFAULT_INSTANCE;
    public static final int INTEGRATION_MODE_FIELD_NUMBER = 4;
    private static volatile Parser<Configuration$SDKMetadata> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final int WRAPPING_SDKS_FIELD_NUMBER = 5;
    private int clientType_;
    private int integrationMode_;
    private String version_ = "";
    private String commit_ = "";
    private Internal.ProtobufList<WrappingSDK> wrappingSdks_ = GeneratedMessageLite.emptyProtobufList();
    private String appPackageName_ = "";

    /* loaded from: classes2.dex */
    public static final class WrappingSDK extends GeneratedMessageLite<WrappingSDK, a> implements b {
        public static final int CLIENT_TYPE_FIELD_NUMBER = 1;
        private static final WrappingSDK DEFAULT_INSTANCE;
        private static volatile Parser<WrappingSDK> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int clientType_;
        private String version_ = "";

        static {
            WrappingSDK wrappingSDK = new WrappingSDK();
            DEFAULT_INSTANCE = wrappingSDK;
            GeneratedMessageLite.registerDefaultInstance(WrappingSDK.class, wrappingSDK);
        }

        private WrappingSDK() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientType() {
            this.clientType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static WrappingSDK getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WrappingSDK parseDelimitedFrom(InputStream inputStream) {
            return (WrappingSDK) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WrappingSDK parseFrom(ByteBuffer byteBuffer) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WrappingSDK> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientType(q1 q1Var) {
            this.clientType_ = q1Var.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientTypeValue(int i11) {
            this.clientType_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (p1.f19204a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WrappingSDK();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"clientType_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WrappingSDK> parser = PARSER;
                    if (parser == null) {
                        synchronized (WrappingSDK.class) {
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

        public q1 getClientType() {
            q1 forNumber = q1.forNumber(this.clientType_);
            return forNumber == null ? q1.UNRECOGNIZED : forNumber;
        }

        public int getClientTypeValue() {
            return this.clientType_;
        }

        public String getVersion() {
            return this.version_;
        }

        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<WrappingSDK, a> implements b {
            public a() {
                super(WrappingSDK.DEFAULT_INSTANCE);
            }

            public a a(q1 q1Var) {
                copyOnWrite();
                ((WrappingSDK) this.instance).setClientType(q1Var);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((WrappingSDK) this.instance).setVersion(str);
                return this;
            }
        }

        public static a newBuilder(WrappingSDK wrappingSDK) {
            return DEFAULT_INSTANCE.createBuilder(wrappingSDK);
        }

        public static WrappingSDK parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(ByteString byteString) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WrappingSDK parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(byte[] bArr) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WrappingSDK parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(InputStream inputStream) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WrappingSDK parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(CodedInputStream codedInputStream) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WrappingSDK parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends MessageLiteOrBuilder {
    }

    static {
        Configuration$SDKMetadata configuration$SDKMetadata = new Configuration$SDKMetadata();
        DEFAULT_INSTANCE = configuration$SDKMetadata;
        GeneratedMessageLite.registerDefaultInstance(Configuration$SDKMetadata.class, configuration$SDKMetadata);
    }

    private Configuration$SDKMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWrappingSdks(Iterable<? extends WrappingSDK> iterable) {
        ensureWrappingSdksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.wrappingSdks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrappingSdks(WrappingSDK wrappingSDK) {
        wrappingSDK.getClass();
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.add(wrappingSDK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppPackageName() {
        this.appPackageName_ = getDefaultInstance().getAppPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientType() {
        this.clientType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommit() {
        this.commit_ = getDefaultInstance().getCommit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntegrationMode() {
        this.integrationMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrappingSdks() {
        this.wrappingSdks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureWrappingSdksIsMutable() {
        Internal.ProtobufList<WrappingSDK> protobufList = this.wrappingSdks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.wrappingSdks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Configuration$SDKMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$SDKMetadata parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SDKMetadata parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$SDKMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWrappingSdks(int i11) {
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageName(String str) {
        str.getClass();
        this.appPackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appPackageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientType(q1 q1Var) {
        this.clientType_ = q1Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTypeValue(int i11) {
        this.clientType_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommit(String str) {
        str.getClass();
        this.commit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommitBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.commit_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntegrationMode(r1 r1Var) {
        this.integrationMode_ = r1Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntegrationModeValue(int i11) {
        this.integrationMode_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrappingSdks(int i11, WrappingSDK wrappingSDK) {
        wrappingSDK.getClass();
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.set(i11, wrappingSDK);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (p1.f19204a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$SDKMetadata();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b\u0006Ȉ", new Object[]{"clientType_", "version_", "commit_", "integrationMode_", "wrappingSdks_", WrappingSDK.class, "appPackageName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$SDKMetadata> parser = PARSER;
                if (parser == null) {
                    synchronized (Configuration$SDKMetadata.class) {
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

    public String getAppPackageName() {
        return this.appPackageName_;
    }

    public ByteString getAppPackageNameBytes() {
        return ByteString.copyFromUtf8(this.appPackageName_);
    }

    public q1 getClientType() {
        q1 forNumber = q1.forNumber(this.clientType_);
        return forNumber == null ? q1.UNRECOGNIZED : forNumber;
    }

    public int getClientTypeValue() {
        return this.clientType_;
    }

    public String getCommit() {
        return this.commit_;
    }

    public ByteString getCommitBytes() {
        return ByteString.copyFromUtf8(this.commit_);
    }

    public r1 getIntegrationMode() {
        r1 forNumber = r1.forNumber(this.integrationMode_);
        return forNumber == null ? r1.UNRECOGNIZED : forNumber;
    }

    public int getIntegrationModeValue() {
        return this.integrationMode_;
    }

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    public WrappingSDK getWrappingSdks(int i11) {
        return this.wrappingSdks_.get(i11);
    }

    public int getWrappingSdksCount() {
        return this.wrappingSdks_.size();
    }

    public List<WrappingSDK> getWrappingSdksList() {
        return this.wrappingSdks_;
    }

    public b getWrappingSdksOrBuilder(int i11) {
        return this.wrappingSdks_.get(i11);
    }

    public List<? extends b> getWrappingSdksOrBuilderList() {
        return this.wrappingSdks_;
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Configuration$SDKMetadata, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$SDKMetadata.DEFAULT_INSTANCE);
        }

        public a a(q1 q1Var) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).setClientType(q1Var);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).setCommit(str);
            return this;
        }

        public a c(String str) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).setVersion(str);
            return this;
        }

        public a a(WrappingSDK wrappingSDK) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).addWrappingSdks(wrappingSDK);
            return this;
        }

        public a a(String str) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).setAppPackageName(str);
            return this;
        }
    }

    public static a newBuilder(Configuration$SDKMetadata configuration$SDKMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$SDKMetadata);
    }

    public static Configuration$SDKMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(ByteString byteString) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrappingSdks(int i11, WrappingSDK wrappingSDK) {
        wrappingSDK.getClass();
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.add(i11, wrappingSDK);
    }

    public static Configuration$SDKMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(byte[] bArr) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$SDKMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(InputStream inputStream) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SDKMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$SDKMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}