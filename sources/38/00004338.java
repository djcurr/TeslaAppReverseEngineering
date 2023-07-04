package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.p1;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Configuration$LinkTokenConfiguration extends GeneratedMessageLite<Configuration$LinkTokenConfiguration, a> implements MessageLiteOrBuilder {
    private static final Configuration$LinkTokenConfiguration DEFAULT_INSTANCE;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 4;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 2;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 3;
    public static final int LINK_TOKEN_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$LinkTokenConfiguration> PARSER;
    private String linkToken_ = "";
    private String linkOpenId_ = "";
    private String linkPersistentId_ = "";
    private String institutionId_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Configuration$LinkTokenConfiguration, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$LinkTokenConfiguration.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setInstitutionId(str);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setLinkOpenId(str);
            return this;
        }

        public a c(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setLinkPersistentId(str);
            return this;
        }

        public a d(String str) {
            copyOnWrite();
            ((Configuration$LinkTokenConfiguration) this.instance).setLinkToken(str);
            return this;
        }
    }

    static {
        Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration = new Configuration$LinkTokenConfiguration();
        DEFAULT_INSTANCE = configuration$LinkTokenConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$LinkTokenConfiguration.class, configuration$LinkTokenConfiguration);
    }

    private Configuration$LinkTokenConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkOpenId() {
        this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkPersistentId() {
        this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkToken() {
        this.linkToken_ = getDefaultInstance().getLinkToken();
    }

    public static Configuration$LinkTokenConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$LinkTokenConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$LinkTokenConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionId(String str) {
        str.getClass();
        this.institutionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkOpenId(String str) {
        str.getClass();
        this.linkOpenId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkOpenIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkOpenId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentId(String str) {
        str.getClass();
        this.linkPersistentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkPersistentId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkToken(String str) {
        str.getClass();
        this.linkToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkToken_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (p1.f19204a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$LinkTokenConfiguration();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"linkToken_", "linkOpenId_", "linkPersistentId_", "institutionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$LinkTokenConfiguration> parser = PARSER;
                if (parser == null) {
                    synchronized (Configuration$LinkTokenConfiguration.class) {
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

    public String getInstitutionId() {
        return this.institutionId_;
    }

    public ByteString getInstitutionIdBytes() {
        return ByteString.copyFromUtf8(this.institutionId_);
    }

    public String getLinkOpenId() {
        return this.linkOpenId_;
    }

    public ByteString getLinkOpenIdBytes() {
        return ByteString.copyFromUtf8(this.linkOpenId_);
    }

    public String getLinkPersistentId() {
        return this.linkPersistentId_;
    }

    public ByteString getLinkPersistentIdBytes() {
        return ByteString.copyFromUtf8(this.linkPersistentId_);
    }

    public String getLinkToken() {
        return this.linkToken_;
    }

    public ByteString getLinkTokenBytes() {
        return ByteString.copyFromUtf8(this.linkToken_);
    }

    public static a newBuilder(Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$LinkTokenConfiguration);
    }

    public static Configuration$LinkTokenConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(ByteString byteString) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(byte[] bArr) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$LinkTokenConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}