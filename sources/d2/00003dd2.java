package com.google.protobuf.util;

import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.model.payments.request.Address;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.u;
import com.google.common.io.BaseEncoding;
import com.google.gson.JsonIOException;
import com.google.gson.e;
import com.google.gson.f;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.protobuf.Any;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Duration;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.FieldMask;
import com.google.protobuf.FloatValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ListValue;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.NullValue;
import com.google.protobuf.StringValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt64Value;
import com.google.protobuf.Value;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;
import tn.a;

/* loaded from: classes2.dex */
public class JsonFormat {
    private static final Logger logger = Logger.getLogger(JsonFormat.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.util.JsonFormat$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class CompactTextGenerator implements TextGenerator {
        private final Appendable output;

        /* synthetic */ CompactTextGenerator(Appendable appendable, AnonymousClass1 anonymousClass1) {
            this(appendable);
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void indent() {
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void outdent() {
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void print(CharSequence charSequence) {
            this.output.append(charSequence);
        }

        private CompactTextGenerator(Appendable appendable) {
            this.output = appendable;
        }
    }

    /* loaded from: classes2.dex */
    public static class Parser {
        private static final int DEFAULT_RECURSION_LIMIT = 100;
        private final boolean ignoringUnknownFields;
        private final TypeRegistry oldRegistry;
        private final int recursionLimit;
        private final com.google.protobuf.TypeRegistry registry;

        /* synthetic */ Parser(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z11, int i11, AnonymousClass1 anonymousClass1) {
            this(typeRegistry, typeRegistry2, z11, i11);
        }

        public Parser ignoringUnknownFields() {
            return new Parser(this.registry, this.oldRegistry, true, this.recursionLimit);
        }

        public void merge(String str, Message.Builder builder) {
            new ParserImpl(this.registry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit).merge(str, builder);
        }

        Parser usingRecursionLimit(int i11) {
            return new Parser(this.registry, this.oldRegistry, this.ignoringUnknownFields, i11);
        }

        public Parser usingTypeRegistry(TypeRegistry typeRegistry) {
            if (this.oldRegistry == TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                return new Parser(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), typeRegistry, this.ignoringUnknownFields, this.recursionLimit);
            }
            throw new IllegalArgumentException("Only one registry is allowed.");
        }

        private Parser(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z11, int i11) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.ignoringUnknownFields = z11;
            this.recursionLimit = i11;
        }

        public void merge(Reader reader, Message.Builder builder) {
            new ParserImpl(this.registry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit).merge(reader, builder);
        }

        public Parser usingTypeRegistry(com.google.protobuf.TypeRegistry typeRegistry) {
            if (this.oldRegistry == TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                return new Parser(typeRegistry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit);
            }
            throw new IllegalArgumentException("Only one registry is allowed.");
        }
    }

    /* loaded from: classes2.dex */
    private static final class PrettyTextGenerator implements TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;

        /* synthetic */ PrettyTextGenerator(Appendable appendable, AnonymousClass1 anonymousClass1) {
            this(appendable);
        }

        private void write(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return;
            }
            if (this.atStartOfLine) {
                this.atStartOfLine = false;
                this.output.append(this.indent);
            }
            this.output.append(charSequence);
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void indent() {
            this.indent.append("  ");
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void outdent() {
            int length = this.indent.length();
            if (length >= 2) {
                this.indent.delete(length - 2, length);
                return;
            }
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void print(CharSequence charSequence) {
            int length = charSequence.length();
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (charSequence.charAt(i12) == '\n') {
                    int i13 = i12 + 1;
                    write(charSequence.subSequence(i11, i13));
                    this.atStartOfLine = true;
                    i11 = i13;
                }
            }
            write(charSequence.subSequence(i11, length));
        }

        private PrettyTextGenerator(Appendable appendable) {
            this.indent = new StringBuilder();
            this.atStartOfLine = true;
            this.output = appendable;
        }
    }

    /* loaded from: classes2.dex */
    public static class Printer {
        private boolean alwaysOutputDefaultValueFields;
        private Set<Descriptors.FieldDescriptor> includingDefaultValueFields;
        private final TypeRegistry oldRegistry;
        private final boolean omittingInsignificantWhitespace;
        private final boolean preservingProtoFieldNames;
        private final boolean printingEnumsAsInts;
        private final com.google.protobuf.TypeRegistry registry;
        private final boolean sortingMapKeys;

        /* synthetic */ Printer(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z11, Set set, boolean z12, boolean z13, boolean z14, boolean z15, AnonymousClass1 anonymousClass1) {
            this(typeRegistry, typeRegistry2, z11, set, z12, z13, z14, z15);
        }

        private void checkUnsetIncludingDefaultValueFields() {
            if (this.alwaysOutputDefaultValueFields || !this.includingDefaultValueFields.isEmpty()) {
                throw new IllegalStateException("JsonFormat includingDefaultValueFields has already been set.");
            }
        }

        private void checkUnsetPrintingEnumsAsInts() {
            if (this.printingEnumsAsInts) {
                throw new IllegalStateException("JsonFormat printingEnumsAsInts has already been set.");
            }
        }

        public void appendTo(MessageOrBuilder messageOrBuilder, Appendable appendable) {
            new PrinterImpl(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, appendable, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys).print(messageOrBuilder);
        }

        public Printer includingDefaultValueFields() {
            checkUnsetIncludingDefaultValueFields();
            return new Printer(this.registry, this.oldRegistry, true, Collections.emptySet(), this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer omittingInsignificantWhitespace() {
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, true, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer preservingProtoFieldNames() {
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, true, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public String print(MessageOrBuilder messageOrBuilder) {
            try {
                StringBuilder sb2 = new StringBuilder();
                appendTo(messageOrBuilder, sb2);
                return sb2.toString();
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (IOException e12) {
                throw new IllegalStateException(e12);
            }
        }

        public Printer printingEnumsAsInts() {
            checkUnsetPrintingEnumsAsInts();
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, true, this.sortingMapKeys);
        }

        public Printer sortingMapKeys() {
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, true);
        }

        public Printer usingTypeRegistry(TypeRegistry typeRegistry) {
            if (this.oldRegistry == TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                return new Printer(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), typeRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
            }
            throw new IllegalArgumentException("Only one registry is allowed.");
        }

        private Printer(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z11, Set<Descriptors.FieldDescriptor> set, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.alwaysOutputDefaultValueFields = z11;
            this.includingDefaultValueFields = set;
            this.preservingProtoFieldNames = z12;
            this.omittingInsignificantWhitespace = z13;
            this.printingEnumsAsInts = z14;
            this.sortingMapKeys = z15;
        }

        public Printer includingDefaultValueFields(Set<Descriptors.FieldDescriptor> set) {
            u.e((set == null || set.isEmpty()) ? false : true, "Non-empty Set must be supplied for includingDefaultValueFields.");
            checkUnsetIncludingDefaultValueFields();
            return new Printer(this.registry, this.oldRegistry, false, Collections.unmodifiableSet(new HashSet(set)), this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer usingTypeRegistry(com.google.protobuf.TypeRegistry typeRegistry) {
            if (this.oldRegistry == TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                return new Printer(typeRegistry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
            }
            throw new IllegalArgumentException("Only one registry is allowed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class PrinterImpl {
        private static final Map<String, WellKnownTypePrinter> wellKnownTypePrinters = buildWellKnownTypePrinters();
        private final boolean alwaysOutputDefaultValueFields;
        private final CharSequence blankOrNewLine;
        private final CharSequence blankOrSpace;
        private final TextGenerator generator;
        private final e gson = GsonHolder.DEFAULT_GSON;
        private final Set<Descriptors.FieldDescriptor> includingDefaultValueFields;
        private final TypeRegistry oldRegistry;
        private final boolean preservingProtoFieldNames;
        private final boolean printingEnumsAsInts;
        private final com.google.protobuf.TypeRegistry registry;
        private final boolean sortingMapKeys;

        /* loaded from: classes2.dex */
        private static class GsonHolder {
            private static final e DEFAULT_GSON = new f().b();

            private GsonHolder() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public interface WellKnownTypePrinter {
            void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder);
        }

        PrinterImpl(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z11, Set<Descriptors.FieldDescriptor> set, boolean z12, Appendable appendable, boolean z13, boolean z14, boolean z15) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.alwaysOutputDefaultValueFields = z11;
            this.includingDefaultValueFields = set;
            this.preservingProtoFieldNames = z12;
            this.printingEnumsAsInts = z14;
            this.sortingMapKeys = z15;
            if (z13) {
                this.generator = new CompactTextGenerator(appendable, null);
                this.blankOrSpace = "";
                this.blankOrNewLine = "";
                return;
            }
            this.generator = new PrettyTextGenerator(appendable, null);
            this.blankOrSpace = " ";
            this.blankOrNewLine = "\n";
        }

        private static Map<String, WellKnownTypePrinter> buildWellKnownTypePrinters() {
            HashMap hashMap = new HashMap();
            hashMap.put(Any.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.1
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printAny(messageOrBuilder);
                }
            });
            WellKnownTypePrinter wellKnownTypePrinter = new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.2
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printWrapper(messageOrBuilder);
                }
            };
            hashMap.put(BoolValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(Int32Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(UInt32Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(Int64Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(UInt64Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(StringValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(BytesValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(FloatValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(DoubleValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            hashMap.put(Timestamp.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.3
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printTimestamp(messageOrBuilder);
                }
            });
            hashMap.put(Duration.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.4
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printDuration(messageOrBuilder);
                }
            });
            hashMap.put(FieldMask.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.5
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printFieldMask(messageOrBuilder);
                }
            });
            hashMap.put(Struct.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.6
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printStruct(messageOrBuilder);
                }
            });
            hashMap.put(Value.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.7
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printValue(messageOrBuilder);
                }
            });
            hashMap.put(ListValue.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.8
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printListValue(messageOrBuilder);
                }
            });
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printAny(MessageOrBuilder messageOrBuilder) {
            if (Any.getDefaultInstance().equals(messageOrBuilder)) {
                this.generator.print("{}");
                return;
            }
            Descriptors.Descriptor descriptorForType = messageOrBuilder.getDescriptorForType();
            Descriptors.FieldDescriptor findFieldByName = descriptorForType.findFieldByName("type_url");
            Descriptors.FieldDescriptor findFieldByName2 = descriptorForType.findFieldByName("value");
            if (findFieldByName != null && findFieldByName2 != null && findFieldByName.getType() == Descriptors.FieldDescriptor.Type.STRING && findFieldByName2.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
                String str = (String) messageOrBuilder.getField(findFieldByName);
                Descriptors.Descriptor descriptorForTypeUrl = this.registry.getDescriptorForTypeUrl(str);
                if (descriptorForTypeUrl == null && (descriptorForTypeUrl = this.oldRegistry.getDescriptorForTypeUrl(str)) == null) {
                    throw new InvalidProtocolBufferException("Cannot find type for url: " + str);
                }
                DynamicMessage parseFrom = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).getParserForType().parseFrom((ByteString) messageOrBuilder.getField(findFieldByName2));
                WellKnownTypePrinter wellKnownTypePrinter = wellKnownTypePrinters.get(JsonFormat.getTypeName(str));
                if (wellKnownTypePrinter != null) {
                    TextGenerator textGenerator = this.generator;
                    textGenerator.print("{" + ((Object) this.blankOrNewLine));
                    this.generator.indent();
                    TextGenerator textGenerator2 = this.generator;
                    textGenerator2.print("\"@type\":" + ((Object) this.blankOrSpace) + this.gson.r(str) + "," + ((Object) this.blankOrNewLine));
                    TextGenerator textGenerator3 = this.generator;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("\"value\":");
                    sb2.append((Object) this.blankOrSpace);
                    textGenerator3.print(sb2.toString());
                    wellKnownTypePrinter.print(this, parseFrom);
                    this.generator.print(this.blankOrNewLine);
                    this.generator.outdent();
                    this.generator.print("}");
                    return;
                }
                print(parseFrom, str);
                return;
            }
            throw new InvalidProtocolBufferException("Invalid Any type.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printDuration(MessageOrBuilder messageOrBuilder) {
            Duration parseFrom = Duration.parseFrom(toByteString(messageOrBuilder));
            TextGenerator textGenerator = this.generator;
            textGenerator.print("\"" + Durations.toString(parseFrom) + "\"");
        }

        private void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (this.preservingProtoFieldNames) {
                TextGenerator textGenerator = this.generator;
                textGenerator.print("\"" + fieldDescriptor.getName() + "\":" + ((Object) this.blankOrSpace));
            } else {
                TextGenerator textGenerator2 = this.generator;
                textGenerator2.print("\"" + fieldDescriptor.getJsonName() + "\":" + ((Object) this.blankOrSpace));
            }
            if (fieldDescriptor.isMapField()) {
                printMapFieldValue(fieldDescriptor, obj);
            } else if (fieldDescriptor.isRepeated()) {
                printRepeatedFieldValue(fieldDescriptor, obj);
            } else {
                printSingleFieldValue(fieldDescriptor, obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printFieldMask(MessageOrBuilder messageOrBuilder) {
            FieldMask parseFrom = FieldMask.parseFrom(toByteString(messageOrBuilder));
            TextGenerator textGenerator = this.generator;
            textGenerator.print("\"" + FieldMaskUtil.toJsonString(parseFrom) + "\"");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printListValue(MessageOrBuilder messageOrBuilder) {
            Descriptors.FieldDescriptor findFieldByName = messageOrBuilder.getDescriptorForType().findFieldByName("values");
            if (findFieldByName != null) {
                printRepeatedFieldValue(findFieldByName, messageOrBuilder.getField(findFieldByName));
                return;
            }
            throw new InvalidProtocolBufferException("Invalid ListValue type.");
        }

        private void printMapFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            Descriptors.Descriptor messageType = fieldDescriptor.getMessageType();
            Descriptors.FieldDescriptor findFieldByName = messageType.findFieldByName(Action.KEY_ATTRIBUTE);
            Descriptors.FieldDescriptor findFieldByName2 = messageType.findFieldByName("value");
            if (findFieldByName != null && findFieldByName2 != null) {
                this.generator.print("{" + ((Object) this.blankOrNewLine));
                this.generator.indent();
                Collection<Message> collection = (List) obj;
                if (this.sortingMapKeys && !collection.isEmpty()) {
                    TreeMap treeMap = new TreeMap(findFieldByName.getType() == Descriptors.FieldDescriptor.Type.STRING ? new Comparator<Object>() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.9
                        @Override // java.util.Comparator
                        public int compare(Object obj2, Object obj3) {
                            return ByteString.unsignedLexicographicalComparator().compare(ByteString.copyFromUtf8((String) obj2), ByteString.copyFromUtf8((String) obj3));
                        }
                    } : null);
                    for (Object obj2 : collection) {
                        treeMap.put(((Message) obj2).getField(findFieldByName), obj2);
                    }
                    collection = treeMap.values();
                }
                boolean z11 = false;
                for (Message message : collection) {
                    Object field = message.getField(findFieldByName);
                    Object field2 = message.getField(findFieldByName2);
                    if (z11) {
                        this.generator.print("," + ((Object) this.blankOrNewLine));
                    } else {
                        z11 = true;
                    }
                    printSingleFieldValue(findFieldByName, field, true);
                    this.generator.print(":" + ((Object) this.blankOrSpace));
                    printSingleFieldValue(findFieldByName2, field2);
                }
                if (z11) {
                    this.generator.print(this.blankOrNewLine);
                }
                this.generator.outdent();
                this.generator.print("}");
                return;
            }
            throw new InvalidProtocolBufferException("Invalid map field.");
        }

        private void printRepeatedFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.generator.print("[");
            boolean z11 = false;
            for (Object obj2 : (List) obj) {
                if (z11) {
                    TextGenerator textGenerator = this.generator;
                    textGenerator.print("," + ((Object) this.blankOrSpace));
                } else {
                    z11 = true;
                }
                printSingleFieldValue(fieldDescriptor, obj2);
            }
            this.generator.print("]");
        }

        private void printSingleFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            printSingleFieldValue(fieldDescriptor, obj, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printStruct(MessageOrBuilder messageOrBuilder) {
            Descriptors.FieldDescriptor findFieldByName = messageOrBuilder.getDescriptorForType().findFieldByName("fields");
            if (findFieldByName != null) {
                printMapFieldValue(findFieldByName, messageOrBuilder.getField(findFieldByName));
                return;
            }
            throw new InvalidProtocolBufferException("Invalid Struct type.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printTimestamp(MessageOrBuilder messageOrBuilder) {
            Timestamp parseFrom = Timestamp.parseFrom(toByteString(messageOrBuilder));
            TextGenerator textGenerator = this.generator;
            textGenerator.print("\"" + Timestamps.toString(parseFrom) + "\"");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printValue(MessageOrBuilder messageOrBuilder) {
            Map<Descriptors.FieldDescriptor, Object> allFields = messageOrBuilder.getAllFields();
            if (allFields.isEmpty()) {
                this.generator.print(Address.ADDRESS_NULL_PLACEHOLDER);
            } else if (allFields.size() == 1) {
                for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : allFields.entrySet()) {
                    printSingleFieldValue(entry.getKey(), entry.getValue());
                }
            } else {
                throw new InvalidProtocolBufferException("Invalid Value type.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printWrapper(MessageOrBuilder messageOrBuilder) {
            Descriptors.FieldDescriptor findFieldByName = messageOrBuilder.getDescriptorForType().findFieldByName("value");
            if (findFieldByName != null) {
                printSingleFieldValue(findFieldByName, messageOrBuilder.getField(findFieldByName));
                return;
            }
            throw new InvalidProtocolBufferException("Invalid Wrapper type.");
        }

        private ByteString toByteString(MessageOrBuilder messageOrBuilder) {
            if (messageOrBuilder instanceof Message) {
                return ((Message) messageOrBuilder).toByteString();
            }
            return ((Message.Builder) messageOrBuilder).build().toByteString();
        }

        void print(MessageOrBuilder messageOrBuilder) {
            WellKnownTypePrinter wellKnownTypePrinter = wellKnownTypePrinters.get(messageOrBuilder.getDescriptorForType().getFullName());
            if (wellKnownTypePrinter != null) {
                wellKnownTypePrinter.print(this, messageOrBuilder);
            } else {
                print(messageOrBuilder, null);
            }
        }

        private void printSingleFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, boolean z11) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    if (z11) {
                        this.generator.print("\"");
                    }
                    this.generator.print(((Integer) obj).toString());
                    if (z11) {
                        this.generator.print("\"");
                        return;
                    }
                    return;
                case 4:
                case 5:
                case 6:
                    TextGenerator textGenerator = this.generator;
                    textGenerator.print("\"" + ((Long) obj).toString() + "\"");
                    return;
                case 7:
                    if (z11) {
                        this.generator.print("\"");
                    }
                    if (((Boolean) obj).booleanValue()) {
                        this.generator.print("true");
                    } else {
                        this.generator.print("false");
                    }
                    if (z11) {
                        this.generator.print("\"");
                        return;
                    }
                    return;
                case 8:
                    Float f11 = (Float) obj;
                    if (f11.isNaN()) {
                        this.generator.print("\"NaN\"");
                        return;
                    } else if (f11.isInfinite()) {
                        if (f11.floatValue() < BitmapDescriptorFactory.HUE_RED) {
                            this.generator.print("\"-Infinity\"");
                            return;
                        } else {
                            this.generator.print("\"Infinity\"");
                            return;
                        }
                    } else {
                        if (z11) {
                            this.generator.print("\"");
                        }
                        this.generator.print(f11.toString());
                        if (z11) {
                            this.generator.print("\"");
                            return;
                        }
                        return;
                    }
                case 9:
                    Double d11 = (Double) obj;
                    if (d11.isNaN()) {
                        this.generator.print("\"NaN\"");
                        return;
                    } else if (d11.isInfinite()) {
                        if (d11.doubleValue() < 0.0d) {
                            this.generator.print("\"-Infinity\"");
                            return;
                        } else {
                            this.generator.print("\"Infinity\"");
                            return;
                        }
                    } else {
                        if (z11) {
                            this.generator.print("\"");
                        }
                        this.generator.print(d11.toString());
                        if (z11) {
                            this.generator.print("\"");
                            return;
                        }
                        return;
                    }
                case 10:
                case 11:
                    if (z11) {
                        this.generator.print("\"");
                    }
                    this.generator.print(JsonFormat.unsignedToString(((Integer) obj).intValue()));
                    if (z11) {
                        this.generator.print("\"");
                        return;
                    }
                    return;
                case 12:
                case 13:
                    TextGenerator textGenerator2 = this.generator;
                    textGenerator2.print("\"" + JsonFormat.unsignedToString(((Long) obj).longValue()) + "\"");
                    return;
                case 14:
                    this.generator.print(this.gson.r(obj));
                    return;
                case 15:
                    this.generator.print("\"");
                    this.generator.print(BaseEncoding.a().f(((ByteString) obj).toByteArray()));
                    this.generator.print("\"");
                    return;
                case 16:
                    if (fieldDescriptor.getEnumType().getFullName().equals("google.protobuf.NullValue")) {
                        if (z11) {
                            this.generator.print("\"");
                        }
                        this.generator.print(Address.ADDRESS_NULL_PLACEHOLDER);
                        if (z11) {
                            this.generator.print("\"");
                            return;
                        }
                        return;
                    }
                    if (!this.printingEnumsAsInts) {
                        Descriptors.EnumValueDescriptor enumValueDescriptor = (Descriptors.EnumValueDescriptor) obj;
                        if (enumValueDescriptor.getIndex() != -1) {
                            TextGenerator textGenerator3 = this.generator;
                            textGenerator3.print("\"" + enumValueDescriptor.getName() + "\"");
                            return;
                        }
                    }
                    this.generator.print(String.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                    return;
                case 17:
                case 18:
                    print((Message) obj);
                    return;
                default:
                    return;
            }
        }

        private void print(MessageOrBuilder messageOrBuilder, String str) {
            boolean z11;
            Map<Descriptors.FieldDescriptor, Object> map;
            this.generator.print("{" + ((Object) this.blankOrNewLine));
            this.generator.indent();
            if (str != null) {
                this.generator.print("\"@type\":" + ((Object) this.blankOrSpace) + this.gson.r(str));
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.alwaysOutputDefaultValueFields && this.includingDefaultValueFields.isEmpty()) {
                map = messageOrBuilder.getAllFields();
            } else {
                TreeMap treeMap = new TreeMap(messageOrBuilder.getAllFields());
                for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
                    if (fieldDescriptor.isOptional()) {
                        if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE || messageOrBuilder.hasField(fieldDescriptor)) {
                            if (fieldDescriptor.getContainingOneof() != null && !messageOrBuilder.hasField(fieldDescriptor)) {
                            }
                        }
                    }
                    if (!treeMap.containsKey(fieldDescriptor) && (this.alwaysOutputDefaultValueFields || this.includingDefaultValueFields.contains(fieldDescriptor))) {
                        treeMap.put(fieldDescriptor, messageOrBuilder.getField(fieldDescriptor));
                    }
                }
                map = treeMap;
            }
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
                if (z11) {
                    this.generator.print("," + ((Object) this.blankOrNewLine));
                } else {
                    z11 = true;
                }
                printField(entry.getKey(), entry.getValue());
            }
            if (z11) {
                this.generator.print(this.blankOrNewLine);
            }
            this.generator.outdent();
            this.generator.print("}");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface TextGenerator {
        void indent();

        void outdent();

        void print(CharSequence charSequence);
    }

    /* loaded from: classes2.dex */
    public static class TypeRegistry {
        private final Map<String, Descriptors.Descriptor> types;

        /* loaded from: classes2.dex */
        public static class Builder {
            private boolean built;
            private final Set<String> files;
            private Map<String, Descriptors.Descriptor> types;

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private void addFile(Descriptors.FileDescriptor fileDescriptor) {
                if (this.files.add(fileDescriptor.getFullName())) {
                    for (Descriptors.FileDescriptor fileDescriptor2 : fileDescriptor.getDependencies()) {
                        addFile(fileDescriptor2);
                    }
                    for (Descriptors.Descriptor descriptor : fileDescriptor.getMessageTypes()) {
                        addMessage(descriptor);
                    }
                }
            }

            private void addMessage(Descriptors.Descriptor descriptor) {
                for (Descriptors.Descriptor descriptor2 : descriptor.getNestedTypes()) {
                    addMessage(descriptor2);
                }
                if (this.types.containsKey(descriptor.getFullName())) {
                    Logger logger = JsonFormat.logger;
                    logger.warning("Type " + descriptor.getFullName() + " is added multiple times.");
                    return;
                }
                this.types.put(descriptor.getFullName(), descriptor);
            }

            public Builder add(Descriptors.Descriptor descriptor) {
                if (!this.built) {
                    addFile(descriptor.getFile());
                    return this;
                }
                throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
            }

            public TypeRegistry build() {
                this.built = true;
                return new TypeRegistry(this.types, null);
            }

            private Builder() {
                this.files = new HashSet();
                this.types = new HashMap();
                this.built = false;
            }

            public Builder add(Iterable<Descriptors.Descriptor> iterable) {
                if (!this.built) {
                    for (Descriptors.Descriptor descriptor : iterable) {
                        addFile(descriptor.getFile());
                    }
                    return this;
                }
                throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class EmptyTypeRegistryHolder {
            private static final TypeRegistry EMPTY = new TypeRegistry(Collections.emptyMap(), null);

            private EmptyTypeRegistryHolder() {
            }
        }

        /* synthetic */ TypeRegistry(Map map, AnonymousClass1 anonymousClass1) {
            this(map);
        }

        public static TypeRegistry getEmptyTypeRegistry() {
            return EmptyTypeRegistryHolder.EMPTY;
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public Descriptors.Descriptor find(String str) {
            return this.types.get(str);
        }

        Descriptors.Descriptor getDescriptorForTypeUrl(String str) {
            return find(JsonFormat.getTypeName(str));
        }

        private TypeRegistry(Map<String, Descriptors.Descriptor> map) {
            this.types = map;
        }
    }

    private JsonFormat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getTypeName(String str) {
        String[] split = str.split("/");
        if (split.length != 1) {
            return split[split.length - 1];
        }
        throw new InvalidProtocolBufferException("Invalid type url found: " + str);
    }

    public static Parser parser() {
        return new Parser(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), TypeRegistry.getEmptyTypeRegistry(), false, 100, null);
    }

    public static Printer printer() {
        return new Printer(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), TypeRegistry.getEmptyTypeRegistry(), false, Collections.emptySet(), false, false, false, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String unsignedToString(int i11) {
        if (i11 >= 0) {
            return Integer.toString(i11);
        }
        return Long.toString(i11 & 4294967295L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String unsignedToString(long j11) {
        if (j11 >= 0) {
            return Long.toString(j11);
        }
        return BigInteger.valueOf(j11 & Long.MAX_VALUE).setBit(63).toString();
    }

    /* loaded from: classes2.dex */
    private static class ParserImpl {
        private static final double EPSILON = 1.0E-6d;
        private static final BigDecimal MAX_DOUBLE;
        private static final BigDecimal MIN_DOUBLE;
        private static final BigDecimal MORE_THAN_ONE;
        private final boolean ignoringUnknownFields;
        private final TypeRegistry oldRegistry;
        private final int recursionLimit;
        private final com.google.protobuf.TypeRegistry registry;
        private static final Map<String, WellKnownTypeParser> wellKnownTypeParsers = buildWellKnownTypeParsers();
        private static final BigInteger MAX_UINT64 = new BigInteger("FFFFFFFFFFFFFFFF", 16);
        private final Map<Descriptors.Descriptor, Map<String, Descriptors.FieldDescriptor>> fieldNameMaps = new HashMap();
        private int currentDepth = 0;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public interface WellKnownTypeParser {
            void merge(ParserImpl parserImpl, k kVar, Message.Builder builder);
        }

        static {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(1.000001d));
            MORE_THAN_ONE = bigDecimal;
            MAX_DOUBLE = new BigDecimal(String.valueOf(Double.MAX_VALUE)).multiply(bigDecimal);
            MIN_DOUBLE = new BigDecimal(String.valueOf(-1.7976931348623157E308d)).multiply(bigDecimal);
        }

        ParserImpl(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z11, int i11) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.ignoringUnknownFields = z11;
            this.recursionLimit = i11;
        }

        private static Map<String, WellKnownTypeParser> buildWellKnownTypeParsers() {
            HashMap hashMap = new HashMap();
            hashMap.put(Any.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.1
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, k kVar, Message.Builder builder) {
                    parserImpl.mergeAny(kVar, builder);
                }
            });
            WellKnownTypeParser wellKnownTypeParser = new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.2
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, k kVar, Message.Builder builder) {
                    parserImpl.mergeWrapper(kVar, builder);
                }
            };
            hashMap.put(BoolValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(Int32Value.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(UInt32Value.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(Int64Value.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(UInt64Value.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(StringValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(BytesValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(FloatValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(DoubleValue.getDescriptor().getFullName(), wellKnownTypeParser);
            hashMap.put(Timestamp.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.3
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, k kVar, Message.Builder builder) {
                    parserImpl.mergeTimestamp(kVar, builder);
                }
            });
            hashMap.put(Duration.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.4
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, k kVar, Message.Builder builder) {
                    parserImpl.mergeDuration(kVar, builder);
                }
            });
            hashMap.put(FieldMask.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.5
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, k kVar, Message.Builder builder) {
                    parserImpl.mergeFieldMask(kVar, builder);
                }
            });
            hashMap.put(Struct.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.6
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, k kVar, Message.Builder builder) {
                    parserImpl.mergeStruct(kVar, builder);
                }
            });
            hashMap.put(ListValue.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.7
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, k kVar, Message.Builder builder) {
                    parserImpl.mergeListValue(kVar, builder);
                }
            });
            hashMap.put(Value.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.8
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, k kVar, Message.Builder builder) {
                    parserImpl.mergeValue(kVar, builder);
                }
            });
            return hashMap;
        }

        private Map<String, Descriptors.FieldDescriptor> getFieldNameMap(Descriptors.Descriptor descriptor) {
            if (!this.fieldNameMaps.containsKey(descriptor)) {
                HashMap hashMap = new HashMap();
                for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
                    hashMap.put(fieldDescriptor.getName(), fieldDescriptor);
                    hashMap.put(fieldDescriptor.getJsonName(), fieldDescriptor);
                }
                this.fieldNameMaps.put(descriptor, hashMap);
                return hashMap;
            }
            return this.fieldNameMaps.get(descriptor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAny(k kVar, Message.Builder builder) {
            Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
            Descriptors.FieldDescriptor findFieldByName = descriptorForType.findFieldByName("type_url");
            Descriptors.FieldDescriptor findFieldByName2 = descriptorForType.findFieldByName("value");
            if (findFieldByName != null && findFieldByName2 != null && findFieldByName.getType() == Descriptors.FieldDescriptor.Type.STRING && findFieldByName2.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
                if (kVar instanceof m) {
                    m mVar = (m) kVar;
                    if (mVar.o().isEmpty()) {
                        return;
                    }
                    k p11 = mVar.p("@type");
                    if (p11 != null) {
                        String f11 = p11.f();
                        Descriptors.Descriptor descriptorForTypeUrl = this.registry.getDescriptorForTypeUrl(f11);
                        if (descriptorForTypeUrl == null && (descriptorForTypeUrl = this.oldRegistry.getDescriptorForTypeUrl(f11)) == null) {
                            throw new InvalidProtocolBufferException("Cannot resolve type: " + f11);
                        }
                        builder.setField(findFieldByName, f11);
                        DynamicMessage.Builder newBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                        WellKnownTypeParser wellKnownTypeParser = wellKnownTypeParsers.get(descriptorForTypeUrl.getFullName());
                        if (wellKnownTypeParser != null) {
                            k p12 = mVar.p("value");
                            if (p12 != null) {
                                wellKnownTypeParser.merge(this, p12, newBuilderForType);
                            }
                        } else {
                            mergeMessage(kVar, newBuilderForType, true);
                        }
                        builder.setField(findFieldByName2, newBuilderForType.build().toByteString());
                        return;
                    }
                    throw new InvalidProtocolBufferException("Missing type url when parsing: " + kVar);
                }
                throw new InvalidProtocolBufferException("Expect message object but got: " + kVar);
            }
            throw new InvalidProtocolBufferException("Invalid Any type.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDuration(k kVar, Message.Builder builder) {
            try {
                builder.mergeFrom(Durations.parse(kVar.f()).toByteString());
            } catch (UnsupportedOperationException | ParseException unused) {
                throw new InvalidProtocolBufferException("Failed to parse duration: " + kVar);
            }
        }

        private void mergeField(Descriptors.FieldDescriptor fieldDescriptor, k kVar, Message.Builder builder) {
            if (fieldDescriptor.isRepeated()) {
                if (builder.getRepeatedFieldCount(fieldDescriptor) > 0) {
                    throw new InvalidProtocolBufferException("Field " + fieldDescriptor.getFullName() + " has already been set.");
                }
            } else if (builder.hasField(fieldDescriptor)) {
                throw new InvalidProtocolBufferException("Field " + fieldDescriptor.getFullName() + " has already been set.");
            }
            if (fieldDescriptor.isRepeated() && (kVar instanceof l)) {
                return;
            }
            if (fieldDescriptor.isMapField()) {
                mergeMapField(fieldDescriptor, kVar, builder);
            } else if (fieldDescriptor.isRepeated()) {
                mergeRepeatedField(fieldDescriptor, kVar, builder);
            } else if (fieldDescriptor.getContainingOneof() != null) {
                mergeOneofField(fieldDescriptor, kVar, builder);
            } else {
                Object parseFieldValue = parseFieldValue(fieldDescriptor, kVar, builder);
                if (parseFieldValue != null) {
                    builder.setField(fieldDescriptor, parseFieldValue);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFieldMask(k kVar, Message.Builder builder) {
            builder.mergeFrom(FieldMaskUtil.fromJsonString(kVar.f()).toByteString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeListValue(k kVar, Message.Builder builder) {
            Descriptors.FieldDescriptor findFieldByName = builder.getDescriptorForType().findFieldByName("values");
            if (findFieldByName != null) {
                mergeRepeatedField(findFieldByName, kVar, builder);
                return;
            }
            throw new InvalidProtocolBufferException("Invalid ListValue type.");
        }

        private void mergeMapField(Descriptors.FieldDescriptor fieldDescriptor, k kVar, Message.Builder builder) {
            if (kVar instanceof m) {
                Descriptors.Descriptor messageType = fieldDescriptor.getMessageType();
                Descriptors.FieldDescriptor findFieldByName = messageType.findFieldByName(Action.KEY_ATTRIBUTE);
                Descriptors.FieldDescriptor findFieldByName2 = messageType.findFieldByName("value");
                if (findFieldByName != null && findFieldByName2 != null) {
                    for (Map.Entry<String, k> entry : ((m) kVar).o()) {
                        Message.Builder newBuilderForField = builder.newBuilderForField(fieldDescriptor);
                        Object parseFieldValue = parseFieldValue(findFieldByName, new o(entry.getKey()), newBuilderForField);
                        Object parseFieldValue2 = parseFieldValue(findFieldByName2, entry.getValue(), newBuilderForField);
                        if (parseFieldValue2 == null) {
                            if (!this.ignoringUnknownFields || findFieldByName2.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                                throw new InvalidProtocolBufferException("Map value cannot be null.");
                            }
                        } else {
                            newBuilderForField.setField(findFieldByName, parseFieldValue);
                            newBuilderForField.setField(findFieldByName2, parseFieldValue2);
                            builder.addRepeatedField(fieldDescriptor, newBuilderForField.build());
                        }
                    }
                    return;
                }
                throw new InvalidProtocolBufferException("Invalid map field: " + fieldDescriptor.getFullName());
            }
            throw new InvalidProtocolBufferException("Expect a map object but found: " + kVar);
        }

        private void mergeMessage(k kVar, Message.Builder builder, boolean z11) {
            if (kVar instanceof m) {
                Map<String, Descriptors.FieldDescriptor> fieldNameMap = getFieldNameMap(builder.getDescriptorForType());
                for (Map.Entry<String, k> entry : ((m) kVar).o()) {
                    if (!z11 || !entry.getKey().equals("@type")) {
                        Descriptors.FieldDescriptor fieldDescriptor = fieldNameMap.get(entry.getKey());
                        if (fieldDescriptor == null) {
                            if (!this.ignoringUnknownFields) {
                                throw new InvalidProtocolBufferException("Cannot find field: " + entry.getKey() + " in message " + builder.getDescriptorForType().getFullName());
                            }
                        } else {
                            mergeField(fieldDescriptor, entry.getValue(), builder);
                        }
                    }
                }
                return;
            }
            throw new InvalidProtocolBufferException("Expect message object but got: " + kVar);
        }

        private void mergeOneofField(Descriptors.FieldDescriptor fieldDescriptor, k kVar, Message.Builder builder) {
            Object parseFieldValue = parseFieldValue(fieldDescriptor, kVar, builder);
            if (parseFieldValue == null) {
                return;
            }
            if (builder.getOneofFieldDescriptor(fieldDescriptor.getContainingOneof()) == null) {
                builder.setField(fieldDescriptor, parseFieldValue);
                return;
            }
            throw new InvalidProtocolBufferException("Cannot set field " + fieldDescriptor.getFullName() + " because another field " + builder.getOneofFieldDescriptor(fieldDescriptor.getContainingOneof()).getFullName() + " belonging to the same oneof has already been set ");
        }

        private void mergeRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, k kVar, Message.Builder builder) {
            if (kVar instanceof h) {
                h hVar = (h) kVar;
                for (int i11 = 0; i11 < hVar.size(); i11++) {
                    Object parseFieldValue = parseFieldValue(fieldDescriptor, hVar.n(i11), builder);
                    if (parseFieldValue == null) {
                        if (!this.ignoringUnknownFields || fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                            throw new InvalidProtocolBufferException("Repeated field elements cannot be null in field: " + fieldDescriptor.getFullName());
                        }
                    } else {
                        builder.addRepeatedField(fieldDescriptor, parseFieldValue);
                    }
                }
                return;
            }
            throw new InvalidProtocolBufferException("Expect an array but found: " + kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStruct(k kVar, Message.Builder builder) {
            Descriptors.FieldDescriptor findFieldByName = builder.getDescriptorForType().findFieldByName("fields");
            if (findFieldByName != null) {
                mergeMapField(findFieldByName, kVar, builder);
                return;
            }
            throw new InvalidProtocolBufferException("Invalid Struct type.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(k kVar, Message.Builder builder) {
            try {
                builder.mergeFrom(Timestamps.parse(kVar.f()).toByteString());
            } catch (UnsupportedOperationException | ParseException unused) {
                throw new InvalidProtocolBufferException("Failed to parse timestamp: " + kVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValue(k kVar, Message.Builder builder) {
            Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
            if (kVar instanceof o) {
                o oVar = (o) kVar;
                if (oVar.q()) {
                    builder.setField(descriptorForType.findFieldByName("bool_value"), Boolean.valueOf(oVar.m()));
                } else if (oVar.s()) {
                    builder.setField(descriptorForType.findFieldByName("number_value"), Double.valueOf(oVar.n()));
                } else {
                    builder.setField(descriptorForType.findFieldByName("string_value"), oVar.f());
                }
            } else if (kVar instanceof m) {
                Descriptors.FieldDescriptor findFieldByName = descriptorForType.findFieldByName("struct_value");
                Message.Builder newBuilderForField = builder.newBuilderForField(findFieldByName);
                merge(kVar, newBuilderForField);
                builder.setField(findFieldByName, newBuilderForField.build());
            } else if (kVar instanceof h) {
                Descriptors.FieldDescriptor findFieldByName2 = descriptorForType.findFieldByName("list_value");
                Message.Builder newBuilderForField2 = builder.newBuilderForField(findFieldByName2);
                merge(kVar, newBuilderForField2);
                builder.setField(findFieldByName2, newBuilderForField2.build());
            } else if (kVar instanceof l) {
                builder.setField(descriptorForType.findFieldByName("null_value"), NullValue.NULL_VALUE.getValueDescriptor());
            } else {
                throw new IllegalStateException("Unexpected json data: " + kVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWrapper(k kVar, Message.Builder builder) {
            Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
            Descriptors.FieldDescriptor findFieldByName = descriptorForType.findFieldByName("value");
            if (findFieldByName != null) {
                builder.setField(findFieldByName, parseFieldValue(findFieldByName, kVar, builder));
                return;
            }
            throw new InvalidProtocolBufferException("Invalid wrapper type: " + descriptorForType.getFullName());
        }

        private boolean parseBool(k kVar) {
            if (kVar.f().equals("true")) {
                return true;
            }
            if (kVar.f().equals("false")) {
                return false;
            }
            throw new InvalidProtocolBufferException("Invalid bool value: " + kVar);
        }

        private ByteString parseBytes(k kVar) {
            try {
                return ByteString.copyFrom(BaseEncoding.a().c(kVar.f()));
            } catch (IllegalArgumentException unused) {
                return ByteString.copyFrom(BaseEncoding.b().c(kVar.f()));
            }
        }

        private double parseDouble(k kVar) {
            if (kVar.f().equals("NaN")) {
                return Double.NaN;
            }
            if (kVar.f().equals("Infinity")) {
                return Double.POSITIVE_INFINITY;
            }
            if (kVar.f().equals("-Infinity")) {
                return Double.NEGATIVE_INFINITY;
            }
            try {
                BigDecimal bigDecimal = new BigDecimal(kVar.f());
                if (bigDecimal.compareTo(MAX_DOUBLE) <= 0 && bigDecimal.compareTo(MIN_DOUBLE) >= 0) {
                    return bigDecimal.doubleValue();
                }
                throw new InvalidProtocolBufferException("Out of range double value: " + kVar);
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (Exception unused) {
                throw new InvalidProtocolBufferException("Not an double value: " + kVar);
            }
        }

        private Descriptors.EnumValueDescriptor parseEnum(Descriptors.EnumDescriptor enumDescriptor, k kVar) {
            Descriptors.EnumValueDescriptor findValueByNumber;
            String f11 = kVar.f();
            Descriptors.EnumValueDescriptor findValueByName = enumDescriptor.findValueByName(f11);
            if (findValueByName == null) {
                try {
                    int parseInt32 = parseInt32(kVar);
                    if (enumDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3) {
                        findValueByNumber = enumDescriptor.findValueByNumberCreatingIfUnknown(parseInt32);
                    } else {
                        findValueByNumber = enumDescriptor.findValueByNumber(parseInt32);
                    }
                    findValueByName = findValueByNumber;
                } catch (InvalidProtocolBufferException unused) {
                }
                if (findValueByName == null && !this.ignoringUnknownFields) {
                    throw new InvalidProtocolBufferException("Invalid enum value: " + f11 + " for enum type: " + enumDescriptor.getFullName());
                }
            }
            return findValueByName;
        }

        private Object parseFieldValue(Descriptors.FieldDescriptor fieldDescriptor, k kVar, Message.Builder builder) {
            if (kVar instanceof l) {
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && fieldDescriptor.getMessageType().getFullName().equals(Value.getDescriptor().getFullName())) {
                    return builder.newBuilderForField(fieldDescriptor).mergeFrom(Value.newBuilder().setNullValueValue(0).build().toByteString()).build();
                }
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM && fieldDescriptor.getEnumType().getFullName().equals(NullValue.getDescriptor().getFullName())) {
                    return fieldDescriptor.getEnumType().findValueByNumber(0);
                }
                return null;
            } else if ((kVar instanceof m) && fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.GROUP) {
                throw new InvalidProtocolBufferException(String.format("Invalid value: %s for expected type: %s", kVar, fieldDescriptor.getType()));
            } else {
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        return Integer.valueOf(parseInt32(kVar));
                    case 4:
                    case 5:
                    case 6:
                        return Long.valueOf(parseInt64(kVar));
                    case 7:
                        return Boolean.valueOf(parseBool(kVar));
                    case 8:
                        return Float.valueOf(parseFloat(kVar));
                    case 9:
                        return Double.valueOf(parseDouble(kVar));
                    case 10:
                    case 11:
                        return Integer.valueOf(parseUint32(kVar));
                    case 12:
                    case 13:
                        return Long.valueOf(parseUint64(kVar));
                    case 14:
                        return parseString(kVar);
                    case 15:
                        return parseBytes(kVar);
                    case 16:
                        return parseEnum(fieldDescriptor.getEnumType(), kVar);
                    case 17:
                    case 18:
                        int i11 = this.currentDepth;
                        if (i11 < this.recursionLimit) {
                            this.currentDepth = i11 + 1;
                            Message.Builder newBuilderForField = builder.newBuilderForField(fieldDescriptor);
                            merge(kVar, newBuilderForField);
                            this.currentDepth--;
                            return newBuilderForField.build();
                        }
                        throw new InvalidProtocolBufferException("Hit recursion limit.");
                    default:
                        throw new InvalidProtocolBufferException("Invalid field type: " + fieldDescriptor.getType());
                }
            }
        }

        private float parseFloat(k kVar) {
            if (kVar.f().equals("NaN")) {
                return Float.NaN;
            }
            if (kVar.f().equals("Infinity")) {
                return Float.POSITIVE_INFINITY;
            }
            if (kVar.f().equals("-Infinity")) {
                return Float.NEGATIVE_INFINITY;
            }
            try {
                double parseDouble = Double.parseDouble(kVar.f());
                if (parseDouble > 3.402826869208755E38d || parseDouble < -3.402826869208755E38d) {
                    throw new InvalidProtocolBufferException("Out of range float value: " + kVar);
                }
                return (float) parseDouble;
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (Exception unused) {
                throw new InvalidProtocolBufferException("Not a float value: " + kVar);
            }
        }

        private int parseInt32(k kVar) {
            try {
                try {
                    return Integer.parseInt(kVar.f());
                } catch (Exception unused) {
                    throw new InvalidProtocolBufferException("Not an int32 value: " + kVar);
                }
            } catch (Exception unused2) {
                return new BigDecimal(kVar.f()).intValueExact();
            }
        }

        private long parseInt64(k kVar) {
            try {
                try {
                    return Long.parseLong(kVar.f());
                } catch (Exception unused) {
                    throw new InvalidProtocolBufferException("Not an int64 value: " + kVar);
                }
            } catch (Exception unused2) {
                return new BigDecimal(kVar.f()).longValueExact();
            }
        }

        private String parseString(k kVar) {
            return kVar.f();
        }

        private int parseUint32(k kVar) {
            try {
                try {
                    long parseLong = Long.parseLong(kVar.f());
                    if (parseLong < 0 || parseLong > 4294967295L) {
                        throw new InvalidProtocolBufferException("Out of range uint32 value: " + kVar);
                    }
                    return (int) parseLong;
                } catch (InvalidProtocolBufferException e11) {
                    throw e11;
                } catch (Exception unused) {
                    throw new InvalidProtocolBufferException("Not an uint32 value: " + kVar);
                }
            } catch (InvalidProtocolBufferException e12) {
                throw e12;
            } catch (Exception unused2) {
                BigInteger bigIntegerExact = new BigDecimal(kVar.f()).toBigIntegerExact();
                if (bigIntegerExact.signum() >= 0 && bigIntegerExact.compareTo(new BigInteger("FFFFFFFF", 16)) <= 0) {
                    return bigIntegerExact.intValue();
                }
                throw new InvalidProtocolBufferException("Out of range uint32 value: " + kVar);
            }
        }

        private long parseUint64(k kVar) {
            try {
                BigInteger bigIntegerExact = new BigDecimal(kVar.f()).toBigIntegerExact();
                if (bigIntegerExact.compareTo(BigInteger.ZERO) >= 0 && bigIntegerExact.compareTo(MAX_UINT64) <= 0) {
                    return bigIntegerExact.longValue();
                }
                throw new InvalidProtocolBufferException("Out of range uint64 value: " + kVar);
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (Exception unused) {
                throw new InvalidProtocolBufferException("Not an uint64 value: " + kVar);
            }
        }

        void merge(Reader reader, Message.Builder builder) {
            try {
                a aVar = new a(reader);
                aVar.b1(false);
                merge(n.b(aVar), builder);
            } catch (JsonIOException e11) {
                if (e11.getCause() instanceof IOException) {
                    throw ((IOException) e11.getCause());
                }
                throw new InvalidProtocolBufferException(e11.getMessage());
            } catch (InvalidProtocolBufferException e12) {
                throw e12;
            } catch (Exception e13) {
                throw new InvalidProtocolBufferException(e13.getMessage());
            }
        }

        void merge(String str, Message.Builder builder) {
            try {
                a aVar = new a(new StringReader(str));
                aVar.b1(false);
                merge(n.b(aVar), builder);
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (Exception e12) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e12.getMessage());
                invalidProtocolBufferException.initCause(e12);
                throw invalidProtocolBufferException;
            }
        }

        private void merge(k kVar, Message.Builder builder) {
            WellKnownTypeParser wellKnownTypeParser = wellKnownTypeParsers.get(builder.getDescriptorForType().getFullName());
            if (wellKnownTypeParser != null) {
                wellKnownTypeParser.merge(this, kVar, builder);
            } else {
                mergeMessage(kVar, builder, false);
            }
        }
    }
}