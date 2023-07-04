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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Common$FileUploadValidation extends GeneratedMessageLite<Common$FileUploadValidation, a> implements MessageLiteOrBuilder {
    private static final Common$FileUploadValidation DEFAULT_INSTANCE;
    private static volatile Parser<Common$FileUploadValidation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Rule> rules_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes2.dex */
    public static final class Rule extends GeneratedMessageLite<Rule, a> implements b {
        private static final Rule DEFAULT_INSTANCE;
        public static final int ERROR_DETAIL_FIELD_NUMBER = 1;
        private static volatile Parser<Rule> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int UNIQUE_NAME_FIELD_NUMBER = 3;
        private Common$LocalizedString errorDetail_;
        private int validationCase_ = 0;
        private Object validation_;

        /* loaded from: classes2.dex */
        public static final class Size extends GeneratedMessageLite<Size, a> implements MessageLiteOrBuilder {
            private static final Size DEFAULT_INSTANCE;
            public static final int MAX_KB_FIELD_NUMBER = 1;
            private static volatile Parser<Size> PARSER;
            private int maxKb_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Size, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Size.DEFAULT_INSTANCE);
                }
            }

            static {
                Size size = new Size();
                DEFAULT_INSTANCE = size;
                GeneratedMessageLite.registerDefaultInstance(Size.class, size);
            }

            private Size() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxKb() {
                this.maxKb_ = 0;
            }

            public static Size getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Size parseDelimitedFrom(InputStream inputStream) {
                return (Size) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Size parseFrom(ByteBuffer byteBuffer) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Size> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxKb(int i11) {
                this.maxKb_ = i11;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (c1.f18233a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Size();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"maxKb_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Size> parser = PARSER;
                        if (parser == null) {
                            synchronized (Size.class) {
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

            public int getMaxKb() {
                return this.maxKb_;
            }

            public static a newBuilder(Size size) {
                return DEFAULT_INSTANCE.createBuilder(size);
            }

            public static Size parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Size) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Size parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Size parseFrom(ByteString byteString) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Size parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Size parseFrom(byte[] bArr) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Size parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Size parseFrom(InputStream inputStream) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Size parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Size parseFrom(CodedInputStream codedInputStream) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Size parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class UniqueName extends GeneratedMessageLite<UniqueName, a> implements MessageLiteOrBuilder {
            private static final UniqueName DEFAULT_INSTANCE;
            private static volatile Parser<UniqueName> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<UniqueName, a> implements MessageLiteOrBuilder {
                public a() {
                    super(UniqueName.DEFAULT_INSTANCE);
                }
            }

            static {
                UniqueName uniqueName = new UniqueName();
                DEFAULT_INSTANCE = uniqueName;
                GeneratedMessageLite.registerDefaultInstance(UniqueName.class, uniqueName);
            }

            private UniqueName() {
            }

            public static UniqueName getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static UniqueName parseDelimitedFrom(InputStream inputStream) {
                return (UniqueName) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static UniqueName parseFrom(ByteBuffer byteBuffer) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<UniqueName> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (c1.f18233a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new UniqueName();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<UniqueName> parser = PARSER;
                        if (parser == null) {
                            synchronized (UniqueName.class) {
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

            public static a newBuilder(UniqueName uniqueName) {
                return DEFAULT_INSTANCE.createBuilder(uniqueName);
            }

            public static UniqueName parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (UniqueName) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static UniqueName parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static UniqueName parseFrom(ByteString byteString) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static UniqueName parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static UniqueName parseFrom(byte[] bArr) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static UniqueName parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static UniqueName parseFrom(InputStream inputStream) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static UniqueName parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static UniqueName parseFrom(CodedInputStream codedInputStream) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static UniqueName parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (UniqueName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Rule, a> implements b {
            public a() {
                super(Rule.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes2.dex */
        public enum b {
            SIZE(2),
            UNIQUE_NAME(3),
            VALIDATION_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18347a;

            b(int i11) {
                this.f18347a = i11;
            }

            public static b forNumber(int i11) {
                if (i11 != 0) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return UNIQUE_NAME;
                    }
                    return SIZE;
                }
                return VALIDATION_NOT_SET;
            }

            public int getNumber() {
                return this.f18347a;
            }

            @Deprecated
            public static b valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            Rule rule = new Rule();
            DEFAULT_INSTANCE = rule;
            GeneratedMessageLite.registerDefaultInstance(Rule.class, rule);
        }

        private Rule() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorDetail() {
            this.errorDetail_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            if (this.validationCase_ == 2) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUniqueName() {
            if (this.validationCase_ == 3) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValidation() {
            this.validationCase_ = 0;
            this.validation_ = null;
        }

        public static Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeErrorDetail(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.errorDetail_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.errorDetail_ = Common$LocalizedString.newBuilder(this.errorDetail_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.errorDetail_ = common$LocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSize(Size size) {
            size.getClass();
            if (this.validationCase_ == 2 && this.validation_ != Size.getDefaultInstance()) {
                this.validation_ = Size.newBuilder((Size) this.validation_).mergeFrom((Size.a) size).buildPartial();
            } else {
                this.validation_ = size;
            }
            this.validationCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUniqueName(UniqueName uniqueName) {
            uniqueName.getClass();
            if (this.validationCase_ == 3 && this.validation_ != UniqueName.getDefaultInstance()) {
                this.validation_ = UniqueName.newBuilder((UniqueName) this.validation_).mergeFrom((UniqueName.a) uniqueName).buildPartial();
            } else {
                this.validation_ = uniqueName;
            }
            this.validationCase_ = 3;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Rule parseDelimitedFrom(InputStream inputStream) {
            return (Rule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Rule> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorDetail(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.errorDetail_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(Size size) {
            size.getClass();
            this.validation_ = size;
            this.validationCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUniqueName(UniqueName uniqueName) {
            uniqueName.getClass();
            this.validation_ = uniqueName;
            this.validationCase_ = 3;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (c1.f18233a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rule();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000", new Object[]{"validation_", "validationCase_", "errorDetail_", Size.class, UniqueName.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Rule> parser = PARSER;
                    if (parser == null) {
                        synchronized (Rule.class) {
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

        public Common$LocalizedString getErrorDetail() {
            Common$LocalizedString common$LocalizedString = this.errorDetail_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Size getSize() {
            if (this.validationCase_ == 2) {
                return (Size) this.validation_;
            }
            return Size.getDefaultInstance();
        }

        public UniqueName getUniqueName() {
            if (this.validationCase_ == 3) {
                return (UniqueName) this.validation_;
            }
            return UniqueName.getDefaultInstance();
        }

        public b getValidationCase() {
            return b.forNumber(this.validationCase_);
        }

        public boolean hasErrorDetail() {
            return this.errorDetail_ != null;
        }

        public boolean hasSize() {
            return this.validationCase_ == 2;
        }

        public boolean hasUniqueName() {
            return this.validationCase_ == 3;
        }

        public static a newBuilder(Rule rule) {
            return DEFAULT_INSTANCE.createBuilder(rule);
        }

        public static Rule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Rule parseFrom(ByteString byteString) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Rule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Rule parseFrom(byte[] bArr) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Rule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Rule parseFrom(InputStream inputStream) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rule parseFrom(CodedInputStream codedInputStream) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Rule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Common$FileUploadValidation, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$FileUploadValidation.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends MessageLiteOrBuilder {
    }

    static {
        Common$FileUploadValidation common$FileUploadValidation = new Common$FileUploadValidation();
        DEFAULT_INSTANCE = common$FileUploadValidation;
        GeneratedMessageLite.registerDefaultInstance(Common$FileUploadValidation.class, common$FileUploadValidation);
    }

    private Common$FileUploadValidation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends Rule> iterable) {
        ensureRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(Rule rule) {
        rule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(rule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<Rule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$FileUploadValidation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$FileUploadValidation parseDelimitedFrom(InputStream inputStream) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$FileUploadValidation parseFrom(ByteBuffer byteBuffer) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$FileUploadValidation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i11) {
        ensureRulesIsMutable();
        this.rules_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i11, Rule rule) {
        rule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i11, rule);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$FileUploadValidation();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", Rule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$FileUploadValidation> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$FileUploadValidation.class) {
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

    public Rule getRules(int i11) {
        return this.rules_.get(i11);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<Rule> getRulesList() {
        return this.rules_;
    }

    public b getRulesOrBuilder(int i11) {
        return this.rules_.get(i11);
    }

    public List<? extends b> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static a newBuilder(Common$FileUploadValidation common$FileUploadValidation) {
        return DEFAULT_INSTANCE.createBuilder(common$FileUploadValidation);
    }

    public static Common$FileUploadValidation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$FileUploadValidation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$FileUploadValidation parseFrom(ByteString byteString) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i11, Rule rule) {
        rule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i11, rule);
    }

    public static Common$FileUploadValidation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$FileUploadValidation parseFrom(byte[] bArr) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$FileUploadValidation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$FileUploadValidation parseFrom(InputStream inputStream) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$FileUploadValidation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$FileUploadValidation parseFrom(CodedInputStream codedInputStream) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$FileUploadValidation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FileUploadValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}