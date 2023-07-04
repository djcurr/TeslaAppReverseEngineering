package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Common$TextInputValidation extends GeneratedMessageLite<Common$TextInputValidation, a> implements MessageLiteOrBuilder {
    private static final Common$TextInputValidation DEFAULT_INSTANCE;
    private static volatile Parser<Common$TextInputValidation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Rule> rules_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes2.dex */
    public static final class Rule extends GeneratedMessageLite<Rule, a> implements b {
        private static final Rule DEFAULT_INSTANCE;
        public static final int DISPLAY_ERROR_FIELD_NUMBER = 1;
        public static final int EQUALITY_FIELD_NUMBER = 5;
        public static final int LENGTH_FIELD_NUMBER = 2;
        private static volatile Parser<Rule> PARSER = null;
        public static final int PHONE_NUMBER_COUNTRY_CODE_FIELD_NUMBER = 7;
        public static final int REGEX_FIELD_NUMBER = 4;
        public static final int ROUTING_FIELD_NUMBER = 6;
        public static final int VALUE_FIELD_NUMBER = 3;
        private Common$LocalizedString displayError_;
        private int validationCase_ = 0;
        private Object validation_;

        /* loaded from: classes2.dex */
        public static final class Equality extends GeneratedMessageLite<Equality, a> implements MessageLiteOrBuilder {
            private static final Equality DEFAULT_INSTANCE;
            public static final int OTHER_TEXT_INPUT_ID_FIELD_NUMBER = 1;
            private static volatile Parser<Equality> PARSER;
            private String otherTextInputId_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Equality, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Equality.DEFAULT_INSTANCE);
                }
            }

            static {
                Equality equality = new Equality();
                DEFAULT_INSTANCE = equality;
                GeneratedMessageLite.registerDefaultInstance(Equality.class, equality);
            }

            private Equality() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOtherTextInputId() {
                this.otherTextInputId_ = getDefaultInstance().getOtherTextInputId();
            }

            public static Equality getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Equality parseDelimitedFrom(InputStream inputStream) {
                return (Equality) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Equality parseFrom(ByteBuffer byteBuffer) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Equality> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOtherTextInputId(String str) {
                str.getClass();
                this.otherTextInputId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOtherTextInputIdBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.otherTextInputId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (c1.f18233a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Equality();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"otherTextInputId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Equality> parser = PARSER;
                        if (parser == null) {
                            synchronized (Equality.class) {
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

            public String getOtherTextInputId() {
                return this.otherTextInputId_;
            }

            public ByteString getOtherTextInputIdBytes() {
                return ByteString.copyFromUtf8(this.otherTextInputId_);
            }

            public static a newBuilder(Equality equality) {
                return DEFAULT_INSTANCE.createBuilder(equality);
            }

            public static Equality parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Equality parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Equality parseFrom(ByteString byteString) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Equality parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Equality parseFrom(byte[] bArr) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Equality parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Equality parseFrom(InputStream inputStream) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Equality parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Equality parseFrom(CodedInputStream codedInputStream) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Equality parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Length extends GeneratedMessageLite<Length, a> implements MessageLiteOrBuilder {
            private static final Length DEFAULT_INSTANCE;
            public static final int MAXIMUM_FIELD_NUMBER = 2;
            public static final int MINIMUM_FIELD_NUMBER = 1;
            private static volatile Parser<Length> PARSER;
            private int maximum_;
            private int minimum_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Length, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Length.DEFAULT_INSTANCE);
                }
            }

            static {
                Length length = new Length();
                DEFAULT_INSTANCE = length;
                GeneratedMessageLite.registerDefaultInstance(Length.class, length);
            }

            private Length() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaximum() {
                this.maximum_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMinimum() {
                this.minimum_ = 0;
            }

            public static Length getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Length parseDelimitedFrom(InputStream inputStream) {
                return (Length) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Length parseFrom(ByteBuffer byteBuffer) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Length> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaximum(int i11) {
                this.maximum_ = i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMinimum(int i11) {
                this.minimum_ = i11;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (c1.f18233a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Length();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"minimum_", "maximum_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Length> parser = PARSER;
                        if (parser == null) {
                            synchronized (Length.class) {
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

            public int getMaximum() {
                return this.maximum_;
            }

            public int getMinimum() {
                return this.minimum_;
            }

            public static a newBuilder(Length length) {
                return DEFAULT_INSTANCE.createBuilder(length);
            }

            public static Length parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Length parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Length parseFrom(ByteString byteString) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Length parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Length parseFrom(byte[] bArr) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Length parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Length parseFrom(InputStream inputStream) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Length parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Length parseFrom(CodedInputStream codedInputStream) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Length parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PhoneNumber extends GeneratedMessageLite<PhoneNumber, a> implements MessageLiteOrBuilder {
            private static final PhoneNumber DEFAULT_INSTANCE;
            private static volatile Parser<PhoneNumber> PARSER = null;
            public static final int PHONE_NUMBER_COUNTRY_CODE_FIELD_NUMBER = 1;
            private String phoneNumberCountryCode_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<PhoneNumber, a> implements MessageLiteOrBuilder {
                public a() {
                    super(PhoneNumber.DEFAULT_INSTANCE);
                }
            }

            static {
                PhoneNumber phoneNumber = new PhoneNumber();
                DEFAULT_INSTANCE = phoneNumber;
                GeneratedMessageLite.registerDefaultInstance(PhoneNumber.class, phoneNumber);
            }

            private PhoneNumber() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPhoneNumberCountryCode() {
                this.phoneNumberCountryCode_ = getDefaultInstance().getPhoneNumberCountryCode();
            }

            public static PhoneNumber getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PhoneNumber parseDelimitedFrom(InputStream inputStream) {
                return (PhoneNumber) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PhoneNumber parseFrom(ByteBuffer byteBuffer) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PhoneNumber> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPhoneNumberCountryCode(String str) {
                str.getClass();
                this.phoneNumberCountryCode_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPhoneNumberCountryCodeBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.phoneNumberCountryCode_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (c1.f18233a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PhoneNumber();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"phoneNumberCountryCode_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PhoneNumber> parser = PARSER;
                        if (parser == null) {
                            synchronized (PhoneNumber.class) {
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

            public String getPhoneNumberCountryCode() {
                return this.phoneNumberCountryCode_;
            }

            public ByteString getPhoneNumberCountryCodeBytes() {
                return ByteString.copyFromUtf8(this.phoneNumberCountryCode_);
            }

            public static a newBuilder(PhoneNumber phoneNumber) {
                return DEFAULT_INSTANCE.createBuilder(phoneNumber);
            }

            public static PhoneNumber parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(ByteString byteString) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PhoneNumber parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(byte[] bArr) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PhoneNumber parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(InputStream inputStream) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PhoneNumber parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(CodedInputStream codedInputStream) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PhoneNumber parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Regex extends GeneratedMessageLite<Regex, a> implements MessageLiteOrBuilder {
            private static final Regex DEFAULT_INSTANCE;
            private static volatile Parser<Regex> PARSER = null;
            public static final int REGEX_FIELD_NUMBER = 1;
            private String regex_ = "";

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Regex, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Regex.DEFAULT_INSTANCE);
                }
            }

            static {
                Regex regex = new Regex();
                DEFAULT_INSTANCE = regex;
                GeneratedMessageLite.registerDefaultInstance(Regex.class, regex);
            }

            private Regex() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRegex() {
                this.regex_ = getDefaultInstance().getRegex();
            }

            public static Regex getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Regex parseDelimitedFrom(InputStream inputStream) {
                return (Regex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Regex parseFrom(ByteBuffer byteBuffer) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Regex> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegex(String str) {
                str.getClass();
                this.regex_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegexBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.regex_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (c1.f18233a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Regex();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"regex_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Regex> parser = PARSER;
                        if (parser == null) {
                            synchronized (Regex.class) {
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

            public String getRegex() {
                return this.regex_;
            }

            public ByteString getRegexBytes() {
                return ByteString.copyFromUtf8(this.regex_);
            }

            public static a newBuilder(Regex regex) {
                return DEFAULT_INSTANCE.createBuilder(regex);
            }

            public static Regex parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Regex parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Regex parseFrom(ByteString byteString) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Regex parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Regex parseFrom(byte[] bArr) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Regex parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Regex parseFrom(InputStream inputStream) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Regex parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Regex parseFrom(CodedInputStream codedInputStream) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Regex parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class RoutingNumber extends GeneratedMessageLite<RoutingNumber, a> implements MessageLiteOrBuilder {
            private static final RoutingNumber DEFAULT_INSTANCE;
            private static volatile Parser<RoutingNumber> PARSER;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<RoutingNumber, a> implements MessageLiteOrBuilder {
                public a() {
                    super(RoutingNumber.DEFAULT_INSTANCE);
                }
            }

            static {
                RoutingNumber routingNumber = new RoutingNumber();
                DEFAULT_INSTANCE = routingNumber;
                GeneratedMessageLite.registerDefaultInstance(RoutingNumber.class, routingNumber);
            }

            private RoutingNumber() {
            }

            public static RoutingNumber getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static RoutingNumber parseDelimitedFrom(InputStream inputStream) {
                return (RoutingNumber) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RoutingNumber parseFrom(ByteBuffer byteBuffer) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<RoutingNumber> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (c1.f18233a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new RoutingNumber();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<RoutingNumber> parser = PARSER;
                        if (parser == null) {
                            synchronized (RoutingNumber.class) {
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

            public static a newBuilder(RoutingNumber routingNumber) {
                return DEFAULT_INSTANCE.createBuilder(routingNumber);
            }

            public static RoutingNumber parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(ByteString byteString) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static RoutingNumber parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(byte[] bArr) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RoutingNumber parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(InputStream inputStream) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RoutingNumber parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(CodedInputStream codedInputStream) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static RoutingNumber parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Value extends GeneratedMessageLite<Value, a> implements MessageLiteOrBuilder {
            private static final Value DEFAULT_INSTANCE;
            public static final int MAXIMUM_FIELD_NUMBER = 2;
            public static final int MINIMUM_FIELD_NUMBER = 1;
            private static volatile Parser<Value> PARSER;
            private Int64Value maximum_;
            private Int64Value minimum_;

            /* loaded from: classes2.dex */
            public static final class a extends GeneratedMessageLite.Builder<Value, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Value.DEFAULT_INSTANCE);
                }
            }

            static {
                Value value = new Value();
                DEFAULT_INSTANCE = value;
                GeneratedMessageLite.registerDefaultInstance(Value.class, value);
            }

            private Value() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaximum() {
                this.maximum_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMinimum() {
                this.minimum_ = null;
            }

            public static Value getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeMaximum(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.maximum_;
                if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
                    this.maximum_ = (Int64Value) ((Int64Value.Builder) Int64Value.newBuilder(this.maximum_).mergeFrom((GeneratedMessageLite) int64Value)).buildPartial();
                } else {
                    this.maximum_ = int64Value;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeMinimum(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.minimum_;
                if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
                    this.minimum_ = (Int64Value) ((Int64Value.Builder) Int64Value.newBuilder(this.minimum_).mergeFrom((GeneratedMessageLite) int64Value)).buildPartial();
                } else {
                    this.minimum_ = int64Value;
                }
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Value parseDelimitedFrom(InputStream inputStream) {
                return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Value parseFrom(ByteBuffer byteBuffer) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Value> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaximum(Int64Value int64Value) {
                int64Value.getClass();
                this.maximum_ = int64Value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMinimum(Int64Value int64Value) {
                int64Value.getClass();
                this.minimum_ = int64Value;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (c1.f18233a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Value();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"minimum_", "maximum_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Value> parser = PARSER;
                        if (parser == null) {
                            synchronized (Value.class) {
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

            public Int64Value getMaximum() {
                Int64Value int64Value = this.maximum_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public Int64Value getMinimum() {
                Int64Value int64Value = this.minimum_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public boolean hasMaximum() {
                return this.maximum_ != null;
            }

            public boolean hasMinimum() {
                return this.minimum_ != null;
            }

            public static a newBuilder(Value value) {
                return DEFAULT_INSTANCE.createBuilder(value);
            }

            public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Value parseFrom(ByteString byteString) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Value parseFrom(byte[] bArr) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Value parseFrom(InputStream inputStream) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Value parseFrom(CodedInputStream codedInputStream) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
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
            LENGTH(2),
            VALUE(3),
            REGEX(4),
            EQUALITY(5),
            ROUTING(6),
            PHONE_NUMBER_COUNTRY_CODE(7),
            VALIDATION_NOT_SET(0);
            

            /* renamed from: a  reason: collision with root package name */
            public final int f18361a;

            b(int i11) {
                this.f18361a = i11;
            }

            public static b forNumber(int i11) {
                if (i11 != 0) {
                    switch (i11) {
                        case 2:
                            return LENGTH;
                        case 3:
                            return VALUE;
                        case 4:
                            return REGEX;
                        case 5:
                            return EQUALITY;
                        case 6:
                            return ROUTING;
                        case 7:
                            return PHONE_NUMBER_COUNTRY_CODE;
                        default:
                            return null;
                    }
                }
                return VALIDATION_NOT_SET;
            }

            public int getNumber() {
                return this.f18361a;
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
        public void clearDisplayError() {
            this.displayError_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEquality() {
            if (this.validationCase_ == 5) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLength() {
            if (this.validationCase_ == 2) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneNumberCountryCode() {
            if (this.validationCase_ == 7) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegex() {
            if (this.validationCase_ == 4) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRouting() {
            if (this.validationCase_ == 6) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValidation() {
            this.validationCase_ = 0;
            this.validation_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            if (this.validationCase_ == 3) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        public static Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDisplayError(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.displayError_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                this.displayError_ = Common$LocalizedString.newBuilder(this.displayError_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
            } else {
                this.displayError_ = common$LocalizedString;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEquality(Equality equality) {
            equality.getClass();
            if (this.validationCase_ == 5 && this.validation_ != Equality.getDefaultInstance()) {
                this.validation_ = Equality.newBuilder((Equality) this.validation_).mergeFrom((Equality.a) equality).buildPartial();
            } else {
                this.validation_ = equality;
            }
            this.validationCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLength(Length length) {
            length.getClass();
            if (this.validationCase_ == 2 && this.validation_ != Length.getDefaultInstance()) {
                this.validation_ = Length.newBuilder((Length) this.validation_).mergeFrom((Length.a) length).buildPartial();
            } else {
                this.validation_ = length;
            }
            this.validationCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePhoneNumberCountryCode(PhoneNumber phoneNumber) {
            phoneNumber.getClass();
            if (this.validationCase_ == 7 && this.validation_ != PhoneNumber.getDefaultInstance()) {
                this.validation_ = PhoneNumber.newBuilder((PhoneNumber) this.validation_).mergeFrom((PhoneNumber.a) phoneNumber).buildPartial();
            } else {
                this.validation_ = phoneNumber;
            }
            this.validationCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRegex(Regex regex) {
            regex.getClass();
            if (this.validationCase_ == 4 && this.validation_ != Regex.getDefaultInstance()) {
                this.validation_ = Regex.newBuilder((Regex) this.validation_).mergeFrom((Regex.a) regex).buildPartial();
            } else {
                this.validation_ = regex;
            }
            this.validationCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRouting(RoutingNumber routingNumber) {
            routingNumber.getClass();
            if (this.validationCase_ == 6 && this.validation_ != RoutingNumber.getDefaultInstance()) {
                this.validation_ = RoutingNumber.newBuilder((RoutingNumber) this.validation_).mergeFrom((RoutingNumber.a) routingNumber).buildPartial();
            } else {
                this.validation_ = routingNumber;
            }
            this.validationCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValue(Value value) {
            value.getClass();
            if (this.validationCase_ == 3 && this.validation_ != Value.getDefaultInstance()) {
                this.validation_ = Value.newBuilder((Value) this.validation_).mergeFrom((Value.a) value).buildPartial();
            } else {
                this.validation_ = value;
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
        public void setDisplayError(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.displayError_ = common$LocalizedString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEquality(Equality equality) {
            equality.getClass();
            this.validation_ = equality;
            this.validationCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLength(Length length) {
            length.getClass();
            this.validation_ = length;
            this.validationCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneNumberCountryCode(PhoneNumber phoneNumber) {
            phoneNumber.getClass();
            this.validation_ = phoneNumber;
            this.validationCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegex(Regex regex) {
            regex.getClass();
            this.validation_ = regex;
            this.validationCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRouting(RoutingNumber routingNumber) {
            routingNumber.getClass();
            this.validation_ = routingNumber;
            this.validationCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(Value value) {
            value.getClass();
            this.validation_ = value;
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"validation_", "validationCase_", "displayError_", Length.class, Value.class, Regex.class, Equality.class, RoutingNumber.class, PhoneNumber.class});
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

        public Common$LocalizedString getDisplayError() {
            Common$LocalizedString common$LocalizedString = this.displayError_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Equality getEquality() {
            if (this.validationCase_ == 5) {
                return (Equality) this.validation_;
            }
            return Equality.getDefaultInstance();
        }

        public Length getLength() {
            if (this.validationCase_ == 2) {
                return (Length) this.validation_;
            }
            return Length.getDefaultInstance();
        }

        public PhoneNumber getPhoneNumberCountryCode() {
            if (this.validationCase_ == 7) {
                return (PhoneNumber) this.validation_;
            }
            return PhoneNumber.getDefaultInstance();
        }

        public Regex getRegex() {
            if (this.validationCase_ == 4) {
                return (Regex) this.validation_;
            }
            return Regex.getDefaultInstance();
        }

        public RoutingNumber getRouting() {
            if (this.validationCase_ == 6) {
                return (RoutingNumber) this.validation_;
            }
            return RoutingNumber.getDefaultInstance();
        }

        public b getValidationCase() {
            return b.forNumber(this.validationCase_);
        }

        public Value getValue() {
            if (this.validationCase_ == 3) {
                return (Value) this.validation_;
            }
            return Value.getDefaultInstance();
        }

        public boolean hasDisplayError() {
            return this.displayError_ != null;
        }

        public boolean hasEquality() {
            return this.validationCase_ == 5;
        }

        public boolean hasLength() {
            return this.validationCase_ == 2;
        }

        public boolean hasPhoneNumberCountryCode() {
            return this.validationCase_ == 7;
        }

        public boolean hasRegex() {
            return this.validationCase_ == 4;
        }

        public boolean hasRouting() {
            return this.validationCase_ == 6;
        }

        public boolean hasValue() {
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
    public static final class a extends GeneratedMessageLite.Builder<Common$TextInputValidation, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$TextInputValidation.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends MessageLiteOrBuilder {
    }

    static {
        Common$TextInputValidation common$TextInputValidation = new Common$TextInputValidation();
        DEFAULT_INSTANCE = common$TextInputValidation;
        GeneratedMessageLite.registerDefaultInstance(Common$TextInputValidation.class, common$TextInputValidation);
    }

    private Common$TextInputValidation() {
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

    public static Common$TextInputValidation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TextInputValidation parseDelimitedFrom(InputStream inputStream) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextInputValidation parseFrom(ByteBuffer byteBuffer) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$TextInputValidation> parser() {
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
                return new Common$TextInputValidation();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", Rule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TextInputValidation> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$TextInputValidation.class) {
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

    public static a newBuilder(Common$TextInputValidation common$TextInputValidation) {
        return DEFAULT_INSTANCE.createBuilder(common$TextInputValidation);
    }

    public static Common$TextInputValidation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(ByteString byteString) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i11, Rule rule) {
        rule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i11, rule);
    }

    public static Common$TextInputValidation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(byte[] bArr) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TextInputValidation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(InputStream inputStream) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextInputValidation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(CodedInputStream codedInputStream) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TextInputValidation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}