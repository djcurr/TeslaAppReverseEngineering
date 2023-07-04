package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Common$LocalAction extends GeneratedMessageLite<Common$LocalAction, b> implements MessageLiteOrBuilder {
    public static final int ALSO_SUBMIT_ACTION_FIELD_NUMBER = 5;
    public static final int CALL_PHONE_NUMBER_FIELD_NUMBER = 3;
    private static final Common$LocalAction DEFAULT_INSTANCE;
    public static final int EXECUTE_RECAPTCHA_ENTERPRISE_FIELD_NUMBER = 9;
    public static final int FOCUS_INPUT_FIELD_NUMBER = 8;
    public static final int GO_BACK_FIELD_NUMBER = 7;
    public static final int HIDE_MODAL_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATE_TO_URL_FIELD_NUMBER = 2;
    private static volatile Parser<Common$LocalAction> PARSER = null;
    public static final int SHOW_MODAL_FIELD_NUMBER = 4;
    private Object action_;
    private boolean alsoSubmitAction_;
    private int actionCase_ = 0;
    private String id_ = "";

    /* loaded from: classes2.dex */
    public enum a {
        NAVIGATE_TO_URL(2),
        CALL_PHONE_NUMBER(3),
        SHOW_MODAL(4),
        HIDE_MODAL(6),
        GO_BACK(7),
        FOCUS_INPUT(8),
        EXECUTE_RECAPTCHA_ENTERPRISE(9),
        ACTION_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18349a;

        a(int i11) {
            this.f18349a = i11;
        }

        public static a forNumber(int i11) {
            switch (i11) {
                case 0:
                    return ACTION_NOT_SET;
                case 1:
                case 5:
                default:
                    return null;
                case 2:
                    return NAVIGATE_TO_URL;
                case 3:
                    return CALL_PHONE_NUMBER;
                case 4:
                    return SHOW_MODAL;
                case 6:
                    return HIDE_MODAL;
                case 7:
                    return GO_BACK;
                case 8:
                    return FOCUS_INPUT;
                case 9:
                    return EXECUTE_RECAPTCHA_ENTERPRISE;
            }
        }

        public int getNumber() {
            return this.f18349a;
        }

        @Deprecated
        public static a valueOf(int i11) {
            return forNumber(i11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.Builder<Common$LocalAction, b> implements MessageLiteOrBuilder {
        public b() {
            super(Common$LocalAction.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$LocalAction common$LocalAction = new Common$LocalAction();
        DEFAULT_INSTANCE = common$LocalAction;
        GeneratedMessageLite.registerDefaultInstance(Common$LocalAction.class, common$LocalAction);
    }

    private Common$LocalAction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.actionCase_ = 0;
        this.action_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlsoSubmitAction() {
        this.alsoSubmitAction_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallPhoneNumber() {
        if (this.actionCase_ == 3) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExecuteRecaptchaEnterprise() {
        if (this.actionCase_ == 9) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFocusInput() {
        if (this.actionCase_ == 8) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoBack() {
        if (this.actionCase_ == 7) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideModal() {
        if (this.actionCase_ == 6) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigateToUrl() {
        if (this.actionCase_ == 2) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowModal() {
        if (this.actionCase_ == 4) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public static Common$LocalAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShowModal(Common$Modal common$Modal) {
        common$Modal.getClass();
        if (this.actionCase_ == 4 && this.action_ != Common$Modal.getDefaultInstance()) {
            this.action_ = Common$Modal.newBuilder((Common$Modal) this.action_).mergeFrom((Common$Modal.a) common$Modal).buildPartial();
        } else {
            this.action_ = common$Modal;
        }
        this.actionCase_ = 4;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$LocalAction parseDelimitedFrom(InputStream inputStream) {
        return (Common$LocalAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$LocalAction parseFrom(ByteBuffer byteBuffer) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$LocalAction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlsoSubmitAction(boolean z11) {
        this.alsoSubmitAction_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallPhoneNumber(String str) {
        str.getClass();
        this.actionCase_ = 3;
        this.action_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallPhoneNumberBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExecuteRecaptchaEnterprise(boolean z11) {
        this.actionCase_ = 9;
        this.action_ = Boolean.valueOf(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFocusInput(String str) {
        str.getClass();
        this.actionCase_ = 8;
        this.action_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFocusInputBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoBack(boolean z11) {
        this.actionCase_ = 7;
        this.action_ = Boolean.valueOf(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideModal(boolean z11) {
        this.actionCase_ = 6;
        this.action_ = Boolean.valueOf(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigateToUrl(String str) {
        str.getClass();
        this.actionCase_ = 2;
        this.action_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigateToUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowModal(Common$Modal common$Modal) {
        common$Modal.getClass();
        this.action_ = common$Modal;
        this.actionCase_ = 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$LocalAction();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005\u0007\u0006:\u0000\u0007:\u0000\bȻ\u0000\t:\u0000", new Object[]{"action_", "actionCase_", "id_", Common$Modal.class, "alsoSubmitAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$LocalAction> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$LocalAction.class) {
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

    public a getActionCase() {
        return a.forNumber(this.actionCase_);
    }

    public boolean getAlsoSubmitAction() {
        return this.alsoSubmitAction_;
    }

    public String getCallPhoneNumber() {
        return this.actionCase_ == 3 ? (String) this.action_ : "";
    }

    public ByteString getCallPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.actionCase_ == 3 ? (String) this.action_ : "");
    }

    public boolean getExecuteRecaptchaEnterprise() {
        if (this.actionCase_ == 9) {
            return ((Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public String getFocusInput() {
        return this.actionCase_ == 8 ? (String) this.action_ : "";
    }

    public ByteString getFocusInputBytes() {
        return ByteString.copyFromUtf8(this.actionCase_ == 8 ? (String) this.action_ : "");
    }

    public boolean getGoBack() {
        if (this.actionCase_ == 7) {
            return ((Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public boolean getHideModal() {
        if (this.actionCase_ == 6) {
            return ((Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public String getNavigateToUrl() {
        return this.actionCase_ == 2 ? (String) this.action_ : "";
    }

    public ByteString getNavigateToUrlBytes() {
        return ByteString.copyFromUtf8(this.actionCase_ == 2 ? (String) this.action_ : "");
    }

    public Common$Modal getShowModal() {
        if (this.actionCase_ == 4) {
            return (Common$Modal) this.action_;
        }
        return Common$Modal.getDefaultInstance();
    }

    public boolean hasCallPhoneNumber() {
        return this.actionCase_ == 3;
    }

    public boolean hasExecuteRecaptchaEnterprise() {
        return this.actionCase_ == 9;
    }

    public boolean hasFocusInput() {
        return this.actionCase_ == 8;
    }

    public boolean hasGoBack() {
        return this.actionCase_ == 7;
    }

    public boolean hasHideModal() {
        return this.actionCase_ == 6;
    }

    public boolean hasNavigateToUrl() {
        return this.actionCase_ == 2;
    }

    public boolean hasShowModal() {
        return this.actionCase_ == 4;
    }

    public static b newBuilder(Common$LocalAction common$LocalAction) {
        return DEFAULT_INSTANCE.createBuilder(common$LocalAction);
    }

    public static Common$LocalAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$LocalAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$LocalAction parseFrom(ByteString byteString) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$LocalAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$LocalAction parseFrom(byte[] bArr) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$LocalAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$LocalAction parseFrom(InputStream inputStream) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$LocalAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$LocalAction parseFrom(CodedInputStream codedInputStream) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$LocalAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}