package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Transition;
import com.plaid.internal.t7;
import com.plaid.internal.u7;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Pane$Navigation extends GeneratedMessageLite<Pane$Navigation, a> implements MessageLiteOrBuilder {
    public static final int BACK_STACK_BEHAVIOR_FIELD_NUMBER = 3;
    public static final int BACK_VISIBLE_FIELD_NUMBER = 2;
    private static final Pane$Navigation DEFAULT_INSTANCE;
    public static final int EXIT_VISIBLE_FIELD_NUMBER = 1;
    public static final int LOGO_FIELD_NUMBER = 5;
    private static volatile Parser<Pane$Navigation> PARSER = null;
    public static final int TRANSITION_FIELD_NUMBER = 4;
    private int backStackBehavior_;
    private boolean backVisible_;
    private boolean exitVisible_;
    private int logo_;
    private Pane$Transition transition_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Pane$Navigation, a> implements MessageLiteOrBuilder {
        public a() {
            super(Pane$Navigation.DEFAULT_INSTANCE);
        }

        public a a(boolean z11) {
            copyOnWrite();
            ((Pane$Navigation) this.instance).setBackVisible(z11);
            return this;
        }

        public a b(boolean z11) {
            copyOnWrite();
            ((Pane$Navigation) this.instance).setExitVisible(z11);
            return this;
        }
    }

    static {
        Pane$Navigation pane$Navigation = new Pane$Navigation();
        DEFAULT_INSTANCE = pane$Navigation;
        GeneratedMessageLite.registerDefaultInstance(Pane$Navigation.class, pane$Navigation);
    }

    private Pane$Navigation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackStackBehavior() {
        this.backStackBehavior_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackVisible() {
        this.backVisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitVisible() {
        this.exitVisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogo() {
        this.logo_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransition() {
        this.transition_ = null;
    }

    public static Pane$Navigation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransition(Pane$Transition pane$Transition) {
        pane$Transition.getClass();
        Pane$Transition pane$Transition2 = this.transition_;
        if (pane$Transition2 != null && pane$Transition2 != Pane$Transition.getDefaultInstance()) {
            this.transition_ = Pane$Transition.newBuilder(this.transition_).mergeFrom((Pane$Transition.a) pane$Transition).buildPartial();
        } else {
            this.transition_ = pane$Transition;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$Navigation parseDelimitedFrom(InputStream inputStream) {
        return (Pane$Navigation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$Navigation parseFrom(ByteBuffer byteBuffer) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$Navigation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackStackBehavior(u7 u7Var) {
        this.backStackBehavior_ = u7Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackStackBehaviorValue(int i11) {
        this.backStackBehavior_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackVisible(boolean z11) {
        this.backVisible_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitVisible(boolean z11) {
        this.exitVisible_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogo(com.plaid.internal.d dVar) {
        this.logo_ = dVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoValue(int i11) {
        this.logo_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransition(Pane$Transition pane$Transition) {
        pane$Transition.getClass();
        this.transition_ = pane$Transition;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (t7.f19513a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$Navigation();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\f\u0004\t\u0005\f", new Object[]{"exitVisible_", "backVisible_", "backStackBehavior_", "transition_", "logo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$Navigation> parser = PARSER;
                if (parser == null) {
                    synchronized (Pane$Navigation.class) {
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

    public u7 getBackStackBehavior() {
        u7 forNumber = u7.forNumber(this.backStackBehavior_);
        return forNumber == null ? u7.UNRECOGNIZED : forNumber;
    }

    public int getBackStackBehaviorValue() {
        return this.backStackBehavior_;
    }

    public boolean getBackVisible() {
        return this.backVisible_;
    }

    public boolean getExitVisible() {
        return this.exitVisible_;
    }

    public com.plaid.internal.d getLogo() {
        com.plaid.internal.d forNumber = com.plaid.internal.d.forNumber(this.logo_);
        return forNumber == null ? com.plaid.internal.d.UNRECOGNIZED : forNumber;
    }

    public int getLogoValue() {
        return this.logo_;
    }

    public Pane$Transition getTransition() {
        Pane$Transition pane$Transition = this.transition_;
        return pane$Transition == null ? Pane$Transition.getDefaultInstance() : pane$Transition;
    }

    public boolean hasTransition() {
        return this.transition_ != null;
    }

    public static a newBuilder(Pane$Navigation pane$Navigation) {
        return DEFAULT_INSTANCE.createBuilder(pane$Navigation);
    }

    public static Pane$Navigation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(ByteString byteString) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pane$Navigation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(byte[] bArr) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$Navigation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(InputStream inputStream) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$Navigation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(CodedInputStream codedInputStream) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$Navigation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}