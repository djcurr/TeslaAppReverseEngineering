package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.plaid.internal.c1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.d1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Common$AttributedLocalizedString extends GeneratedMessageLite<Common$AttributedLocalizedString, b> implements d1 {
    public static final int ACTIONS_FIELD_NUMBER = 2;
    private static final Common$AttributedLocalizedString DEFAULT_INSTANCE;
    public static final int LOCALIZED_STRING_FIELD_NUMBER = 1;
    private static volatile Parser<Common$AttributedLocalizedString> PARSER;
    private MapFieldLite<String, Common$LocalAction> actions_ = MapFieldLite.emptyMapField();
    private Common$LocalizedString localizedString_;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final MapEntryLite<String, Common$LocalAction> f18345a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Common$LocalAction.getDefaultInstance());
    }

    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.Builder<Common$AttributedLocalizedString, b> implements d1 {
        public b() {
            super(Common$AttributedLocalizedString.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$AttributedLocalizedString common$AttributedLocalizedString = new Common$AttributedLocalizedString();
        DEFAULT_INSTANCE = common$AttributedLocalizedString;
        GeneratedMessageLite.registerDefaultInstance(Common$AttributedLocalizedString.class, common$AttributedLocalizedString);
    }

    private Common$AttributedLocalizedString() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalizedString() {
        this.localizedString_ = null;
    }

    public static Common$AttributedLocalizedString getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Common$LocalAction> getMutableActionsMap() {
        return internalGetMutableActions();
    }

    private MapFieldLite<String, Common$LocalAction> internalGetActions() {
        return this.actions_;
    }

    private MapFieldLite<String, Common$LocalAction> internalGetMutableActions() {
        if (!this.actions_.isMutable()) {
            this.actions_ = this.actions_.mutableCopy();
        }
        return this.actions_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocalizedString(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.localizedString_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            this.localizedString_ = Common$LocalizedString.newBuilder(this.localizedString_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        } else {
            this.localizedString_ = common$LocalizedString;
        }
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$AttributedLocalizedString parseDelimitedFrom(InputStream inputStream) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AttributedLocalizedString parseFrom(ByteBuffer byteBuffer) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$AttributedLocalizedString> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalizedString(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.localizedString_ = common$LocalizedString;
    }

    public boolean containsActions(String str) {
        str.getClass();
        return internalGetActions().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (c1.f18233a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$AttributedLocalizedString();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", new Object[]{"localizedString_", "actions_", a.f18345a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$AttributedLocalizedString> parser = PARSER;
                if (parser == null) {
                    synchronized (Common$AttributedLocalizedString.class) {
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

    @Deprecated
    public Map<String, Common$LocalAction> getActions() {
        return getActionsMap();
    }

    public int getActionsCount() {
        return internalGetActions().size();
    }

    public Map<String, Common$LocalAction> getActionsMap() {
        return Collections.unmodifiableMap(internalGetActions());
    }

    public Common$LocalAction getActionsOrDefault(String str, Common$LocalAction common$LocalAction) {
        str.getClass();
        MapFieldLite<String, Common$LocalAction> internalGetActions = internalGetActions();
        return internalGetActions.containsKey(str) ? internalGetActions.get(str) : common$LocalAction;
    }

    public Common$LocalAction getActionsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Common$LocalAction> internalGetActions = internalGetActions();
        if (internalGetActions.containsKey(str)) {
            return internalGetActions.get(str);
        }
        throw new IllegalArgumentException();
    }

    public Common$LocalizedString getLocalizedString() {
        Common$LocalizedString common$LocalizedString = this.localizedString_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasLocalizedString() {
        return this.localizedString_ != null;
    }

    public static b newBuilder(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        return DEFAULT_INSTANCE.createBuilder(common$AttributedLocalizedString);
    }

    public static Common$AttributedLocalizedString parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(ByteString byteString) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$AttributedLocalizedString parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(byte[] bArr) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$AttributedLocalizedString parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(InputStream inputStream) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AttributedLocalizedString parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(CodedInputStream codedInputStream) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$AttributedLocalizedString parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}