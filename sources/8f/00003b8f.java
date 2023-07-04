package com.google.protobuf;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.TextFormat;
import com.google.protobuf.WireFormat;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class Descriptors {
    private static final Logger logger = Logger.getLogger(Descriptors.class.getName());
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Descriptor[] EMPTY_DESCRIPTORS = new Descriptor[0];
    private static final FieldDescriptor[] EMPTY_FIELD_DESCRIPTORS = new FieldDescriptor[0];
    private static final EnumDescriptor[] EMPTY_ENUM_DESCRIPTORS = new EnumDescriptor[0];
    private static final ServiceDescriptor[] EMPTY_SERVICE_DESCRIPTORS = new ServiceDescriptor[0];
    private static final OneofDescriptor[] EMPTY_ONEOF_DESCRIPTORS = new OneofDescriptor[0];

    /* renamed from: com.google.protobuf.Descriptors$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[FieldDescriptor.JavaType.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = iArr;
            try {
                iArr[FieldDescriptor.JavaType.ENUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[FieldDescriptor.JavaType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr2;
            try {
                iArr2[FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SINT64.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.UINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FIXED64.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FLOAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.DOUBLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.BOOL.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Descriptor extends GenericDescriptor {
        private final Descriptor containingType;
        private final EnumDescriptor[] enumTypes;
        private final int[] extensionRangeLowerBounds;
        private final int[] extensionRangeUpperBounds;
        private final FieldDescriptor[] extensions;
        private final FieldDescriptor[] fields;
        private final FieldDescriptor[] fieldsSortedByNumber;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final Descriptor[] nestedTypes;
        private final OneofDescriptor[] oneofs;
        private DescriptorProtos.DescriptorProto proto;
        private final int realOneofCount;

        /* synthetic */ Descriptor(DescriptorProtos.DescriptorProto descriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i11, AnonymousClass1 anonymousClass1) {
            this(descriptorProto, fileDescriptor, descriptor, i11);
        }

        public void crossLink() {
            for (Descriptor descriptor : this.nestedTypes) {
                descriptor.crossLink();
            }
            for (FieldDescriptor fieldDescriptor : this.fields) {
                fieldDescriptor.crossLink();
            }
            Arrays.sort(this.fieldsSortedByNumber);
            validateNoDuplicateFieldNumbers();
            for (FieldDescriptor fieldDescriptor2 : this.extensions) {
                fieldDescriptor2.crossLink();
            }
        }

        public void setProto(DescriptorProtos.DescriptorProto descriptorProto) {
            this.proto = descriptorProto;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                Descriptor[] descriptorArr = this.nestedTypes;
                if (i12 >= descriptorArr.length) {
                    break;
                }
                descriptorArr[i12].setProto(descriptorProto.getNestedType(i12));
                i12++;
            }
            int i13 = 0;
            while (true) {
                OneofDescriptor[] oneofDescriptorArr = this.oneofs;
                if (i13 >= oneofDescriptorArr.length) {
                    break;
                }
                oneofDescriptorArr[i13].setProto(descriptorProto.getOneofDecl(i13));
                i13++;
            }
            int i14 = 0;
            while (true) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                if (i14 >= enumDescriptorArr.length) {
                    break;
                }
                enumDescriptorArr[i14].setProto(descriptorProto.getEnumType(i14));
                i14++;
            }
            int i15 = 0;
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.fields;
                if (i15 >= fieldDescriptorArr.length) {
                    break;
                }
                fieldDescriptorArr[i15].setProto(descriptorProto.getField(i15));
                i15++;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr2 = this.extensions;
                if (i11 >= fieldDescriptorArr2.length) {
                    return;
                }
                fieldDescriptorArr2[i11].setProto(descriptorProto.getExtension(i11));
                i11++;
            }
        }

        private void validateNoDuplicateFieldNumbers() {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                FieldDescriptor[] fieldDescriptorArr = this.fieldsSortedByNumber;
                if (i12 >= fieldDescriptorArr.length) {
                    return;
                }
                FieldDescriptor fieldDescriptor = fieldDescriptorArr[i11];
                FieldDescriptor fieldDescriptor2 = fieldDescriptorArr[i12];
                if (fieldDescriptor.getNumber() == fieldDescriptor2.getNumber()) {
                    throw new DescriptorValidationException(fieldDescriptor2, "Field number " + fieldDescriptor2.getNumber() + " has already been used in \"" + fieldDescriptor2.getContainingType().getFullName() + "\" by field \"" + fieldDescriptor.getName() + "\".", (AnonymousClass1) null);
                }
                i11 = i12;
            }
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + CoreConstants.DOT + str);
            if (findSymbol instanceof EnumDescriptor) {
                return (EnumDescriptor) findSymbol;
            }
            return null;
        }

        public FieldDescriptor findFieldByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + CoreConstants.DOT + str);
            if (findSymbol instanceof FieldDescriptor) {
                return (FieldDescriptor) findSymbol;
            }
            return null;
        }

        public FieldDescriptor findFieldByNumber(int i11) {
            FieldDescriptor[] fieldDescriptorArr = this.fieldsSortedByNumber;
            return (FieldDescriptor) Descriptors.binarySearch(fieldDescriptorArr, fieldDescriptorArr.length, FieldDescriptor.NUMBER_GETTER, i11);
        }

        public Descriptor findNestedTypeByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + CoreConstants.DOT + str);
            if (findSymbol instanceof Descriptor) {
                return (Descriptor) findSymbol;
            }
            return null;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public List<Descriptor> getNestedTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.nestedTypes));
        }

        public List<OneofDescriptor> getOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs));
        }

        public DescriptorProtos.MessageOptions getOptions() {
            return this.proto.getOptions();
        }

        public List<OneofDescriptor> getRealOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs).subList(0, this.realOneofCount));
        }

        public boolean isExtendable() {
            return !this.proto.getExtensionRangeList().isEmpty();
        }

        public boolean isExtensionNumber(int i11) {
            int binarySearch = Arrays.binarySearch(this.extensionRangeLowerBounds, i11);
            if (binarySearch < 0) {
                binarySearch = (~binarySearch) - 1;
            }
            return binarySearch >= 0 && i11 < this.extensionRangeUpperBounds[binarySearch];
        }

        public boolean isReservedName(String str) {
            Internal.checkNotNull(str);
            for (String str2 : this.proto.getReservedNameList()) {
                if (str2.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedNumber(int i11) {
            for (DescriptorProtos.DescriptorProto.ReservedRange reservedRange : this.proto.getReservedRangeList()) {
                if (reservedRange.getStart() <= i11 && i11 < reservedRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        Descriptor(String str) {
            super(null);
            String str2;
            String str3;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str.substring(lastIndexOf + 1);
                str2 = str.substring(0, lastIndexOf);
            } else {
                str2 = "";
                str3 = str;
            }
            this.index = 0;
            this.proto = DescriptorProtos.DescriptorProto.newBuilder().setName(str3).addExtensionRange(DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder().setStart(1).setEnd(PKIFailureInfo.duplicateCertReq).build()).build();
            this.fullName = str;
            this.containingType = null;
            this.nestedTypes = Descriptors.EMPTY_DESCRIPTORS;
            this.enumTypes = Descriptors.EMPTY_ENUM_DESCRIPTORS;
            this.fields = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.fieldsSortedByNumber = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.extensions = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.oneofs = Descriptors.EMPTY_ONEOF_DESCRIPTORS;
            this.realOneofCount = 0;
            this.file = new FileDescriptor(str2, this);
            this.extensionRangeLowerBounds = new int[]{1};
            this.extensionRangeUpperBounds = new int[]{PKIFailureInfo.duplicateCertReq};
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.DescriptorProto toProto() {
            return this.proto;
        }

        private Descriptor(DescriptorProtos.DescriptorProto descriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i11) {
            super(null);
            OneofDescriptor[] oneofDescriptorArr;
            Descriptor[] descriptorArr;
            EnumDescriptor[] enumDescriptorArr;
            FieldDescriptor[] fieldDescriptorArr;
            FieldDescriptor[] fieldDescriptorArr2;
            this.index = i11;
            this.proto = descriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, descriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            if (descriptorProto.getOneofDeclCount() <= 0) {
                oneofDescriptorArr = Descriptors.EMPTY_ONEOF_DESCRIPTORS;
            } else {
                oneofDescriptorArr = new OneofDescriptor[descriptorProto.getOneofDeclCount()];
            }
            this.oneofs = oneofDescriptorArr;
            int i12 = 0;
            for (int i13 = 0; i13 < descriptorProto.getOneofDeclCount(); i13++) {
                this.oneofs[i13] = new OneofDescriptor(descriptorProto.getOneofDecl(i13), fileDescriptor, this, i13, null);
            }
            if (descriptorProto.getNestedTypeCount() <= 0) {
                descriptorArr = Descriptors.EMPTY_DESCRIPTORS;
            } else {
                descriptorArr = new Descriptor[descriptorProto.getNestedTypeCount()];
            }
            this.nestedTypes = descriptorArr;
            for (int i14 = 0; i14 < descriptorProto.getNestedTypeCount(); i14++) {
                this.nestedTypes[i14] = new Descriptor(descriptorProto.getNestedType(i14), fileDescriptor, this, i14);
            }
            if (descriptorProto.getEnumTypeCount() <= 0) {
                enumDescriptorArr = Descriptors.EMPTY_ENUM_DESCRIPTORS;
            } else {
                enumDescriptorArr = new EnumDescriptor[descriptorProto.getEnumTypeCount()];
            }
            this.enumTypes = enumDescriptorArr;
            for (int i15 = 0; i15 < descriptorProto.getEnumTypeCount(); i15++) {
                this.enumTypes[i15] = new EnumDescriptor(descriptorProto.getEnumType(i15), fileDescriptor, this, i15, null);
            }
            if (descriptorProto.getFieldCount() <= 0) {
                fieldDescriptorArr = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            } else {
                fieldDescriptorArr = new FieldDescriptor[descriptorProto.getFieldCount()];
            }
            this.fields = fieldDescriptorArr;
            for (int i16 = 0; i16 < descriptorProto.getFieldCount(); i16++) {
                this.fields[i16] = new FieldDescriptor(descriptorProto.getField(i16), fileDescriptor, this, i16, false, null);
            }
            this.fieldsSortedByNumber = descriptorProto.getFieldCount() > 0 ? (FieldDescriptor[]) this.fields.clone() : Descriptors.EMPTY_FIELD_DESCRIPTORS;
            if (descriptorProto.getExtensionCount() <= 0) {
                fieldDescriptorArr2 = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            } else {
                fieldDescriptorArr2 = new FieldDescriptor[descriptorProto.getExtensionCount()];
            }
            this.extensions = fieldDescriptorArr2;
            for (int i17 = 0; i17 < descriptorProto.getExtensionCount(); i17++) {
                this.extensions[i17] = new FieldDescriptor(descriptorProto.getExtension(i17), fileDescriptor, this, i17, true, null);
            }
            for (int i18 = 0; i18 < descriptorProto.getOneofDeclCount(); i18++) {
                OneofDescriptor[] oneofDescriptorArr2 = this.oneofs;
                oneofDescriptorArr2[i18].fields = new FieldDescriptor[oneofDescriptorArr2[i18].getFieldCount()];
                this.oneofs[i18].fieldCount = 0;
            }
            for (int i19 = 0; i19 < descriptorProto.getFieldCount(); i19++) {
                OneofDescriptor containingOneof = this.fields[i19].getContainingOneof();
                if (containingOneof != null) {
                    containingOneof.fields[OneofDescriptor.access$2608(containingOneof)] = this.fields[i19];
                }
            }
            int i21 = 0;
            for (OneofDescriptor oneofDescriptor : this.oneofs) {
                if (oneofDescriptor.isSynthetic()) {
                    i21++;
                } else if (i21 > 0) {
                    throw new DescriptorValidationException(this, "Synthetic oneofs must come last.", (AnonymousClass1) null);
                }
            }
            this.realOneofCount = this.oneofs.length - i21;
            fileDescriptor.pool.addSymbol(this);
            if (descriptorProto.getExtensionRangeCount() <= 0) {
                this.extensionRangeLowerBounds = Descriptors.EMPTY_INT_ARRAY;
                this.extensionRangeUpperBounds = Descriptors.EMPTY_INT_ARRAY;
                return;
            }
            this.extensionRangeLowerBounds = new int[descriptorProto.getExtensionRangeCount()];
            this.extensionRangeUpperBounds = new int[descriptorProto.getExtensionRangeCount()];
            for (DescriptorProtos.DescriptorProto.ExtensionRange extensionRange : descriptorProto.getExtensionRangeList()) {
                this.extensionRangeLowerBounds[i12] = extensionRange.getStart();
                this.extensionRangeUpperBounds[i12] = extensionRange.getEnd();
                i12++;
            }
            Arrays.sort(this.extensionRangeLowerBounds);
            Arrays.sort(this.extensionRangeUpperBounds);
        }
    }

    /* loaded from: classes2.dex */
    public static final class DescriptorPool {
        private boolean allowUnknownDependencies;
        private final Set<FileDescriptor> dependencies;
        private final Map<String, GenericDescriptor> descriptorsByName = new HashMap();

        /* loaded from: classes2.dex */
        public static final class PackageDescriptor extends GenericDescriptor {
            private final FileDescriptor file;
            private final String fullName;
            private final String name;

            PackageDescriptor(String str, String str2, FileDescriptor fileDescriptor) {
                super(null);
                this.file = fileDescriptor;
                this.fullName = str2;
                this.name = str;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public FileDescriptor getFile() {
                return this.file;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public String getFullName() {
                return this.fullName;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public String getName() {
                return this.name;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public Message toProto() {
                return this.file.toProto();
            }
        }

        /* loaded from: classes2.dex */
        public enum SearchFilter {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        DescriptorPool(FileDescriptor[] fileDescriptorArr, boolean z11) {
            this.dependencies = Collections.newSetFromMap(new IdentityHashMap(fileDescriptorArr.length));
            this.allowUnknownDependencies = z11;
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                this.dependencies.add(fileDescriptor);
                importPublicDependencies(fileDescriptor);
            }
            for (FileDescriptor fileDescriptor2 : this.dependencies) {
                try {
                    addPackage(fileDescriptor2.getPackage(), fileDescriptor2);
                } catch (DescriptorValidationException e11) {
                    throw new AssertionError(e11);
                }
            }
        }

        private void importPublicDependencies(FileDescriptor fileDescriptor) {
            for (FileDescriptor fileDescriptor2 : fileDescriptor.getPublicDependencies()) {
                if (this.dependencies.add(fileDescriptor2)) {
                    importPublicDependencies(fileDescriptor2);
                }
            }
        }

        static void validateSymbolName(GenericDescriptor genericDescriptor) {
            String name = genericDescriptor.getName();
            if (name.length() != 0) {
                for (int i11 = 0; i11 < name.length(); i11++) {
                    char charAt = name.charAt(i11);
                    if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && charAt != '_' && ('0' > charAt || charAt > '9' || i11 <= 0))) {
                        throw new DescriptorValidationException(genericDescriptor, CoreConstants.DOUBLE_QUOTE_CHAR + name + "\" is not a valid identifier.", (AnonymousClass1) null);
                    }
                }
                return;
            }
            throw new DescriptorValidationException(genericDescriptor, "Missing name.", (AnonymousClass1) null);
        }

        void addPackage(String str, FileDescriptor fileDescriptor) {
            String substring;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                substring = str;
            } else {
                addPackage(str.substring(0, lastIndexOf), fileDescriptor);
                substring = str.substring(lastIndexOf + 1);
            }
            GenericDescriptor put = this.descriptorsByName.put(str, new PackageDescriptor(substring, str, fileDescriptor));
            if (put != null) {
                this.descriptorsByName.put(str, put);
                if (put instanceof PackageDescriptor) {
                    return;
                }
                throw new DescriptorValidationException(fileDescriptor, CoreConstants.DOUBLE_QUOTE_CHAR + substring + "\" is already defined (as something other than a package) in file \"" + put.getFile().getName() + "\".", (AnonymousClass1) null);
            }
        }

        void addSymbol(GenericDescriptor genericDescriptor) {
            validateSymbolName(genericDescriptor);
            String fullName = genericDescriptor.getFullName();
            GenericDescriptor put = this.descriptorsByName.put(fullName, genericDescriptor);
            if (put != null) {
                this.descriptorsByName.put(fullName, put);
                if (genericDescriptor.getFile() == put.getFile()) {
                    int lastIndexOf = fullName.lastIndexOf(46);
                    if (lastIndexOf == -1) {
                        throw new DescriptorValidationException(genericDescriptor, CoreConstants.DOUBLE_QUOTE_CHAR + fullName + "\" is already defined.", (AnonymousClass1) null);
                    }
                    throw new DescriptorValidationException(genericDescriptor, CoreConstants.DOUBLE_QUOTE_CHAR + fullName.substring(lastIndexOf + 1) + "\" is already defined in \"" + fullName.substring(0, lastIndexOf) + "\".", (AnonymousClass1) null);
                }
                throw new DescriptorValidationException(genericDescriptor, CoreConstants.DOUBLE_QUOTE_CHAR + fullName + "\" is already defined in file \"" + put.getFile().getName() + "\".", (AnonymousClass1) null);
            }
        }

        GenericDescriptor findSymbol(String str) {
            return findSymbol(str, SearchFilter.ALL_SYMBOLS);
        }

        boolean isAggregate(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor) || (genericDescriptor instanceof PackageDescriptor) || (genericDescriptor instanceof ServiceDescriptor);
        }

        boolean isType(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor);
        }

        GenericDescriptor lookupSymbol(String str, GenericDescriptor genericDescriptor, SearchFilter searchFilter) {
            GenericDescriptor findSymbol;
            String str2;
            if (str.startsWith(".")) {
                str2 = str.substring(1);
                findSymbol = findSymbol(str2, searchFilter);
            } else {
                int indexOf = str.indexOf(46);
                String substring = indexOf == -1 ? str : str.substring(0, indexOf);
                StringBuilder sb2 = new StringBuilder(genericDescriptor.getFullName());
                while (true) {
                    int lastIndexOf = sb2.lastIndexOf(".");
                    if (lastIndexOf == -1) {
                        findSymbol = findSymbol(str, searchFilter);
                        str2 = str;
                        break;
                    }
                    int i11 = lastIndexOf + 1;
                    sb2.setLength(i11);
                    sb2.append(substring);
                    GenericDescriptor findSymbol2 = findSymbol(sb2.toString(), SearchFilter.AGGREGATES_ONLY);
                    if (findSymbol2 != null) {
                        if (indexOf != -1) {
                            sb2.setLength(i11);
                            sb2.append(str);
                            findSymbol = findSymbol(sb2.toString(), searchFilter);
                        } else {
                            findSymbol = findSymbol2;
                        }
                        str2 = sb2.toString();
                    } else {
                        sb2.setLength(lastIndexOf);
                    }
                }
            }
            if (findSymbol == null) {
                if (this.allowUnknownDependencies && searchFilter == SearchFilter.TYPES_ONLY) {
                    Logger logger = Descriptors.logger;
                    logger.warning("The descriptor for message type \"" + str + "\" can not be found and a placeholder is created for it");
                    Descriptor descriptor = new Descriptor(str2);
                    this.dependencies.add(descriptor.getFile());
                    return descriptor;
                }
                throw new DescriptorValidationException(genericDescriptor, CoreConstants.DOUBLE_QUOTE_CHAR + str + "\" is not defined.", (AnonymousClass1) null);
            }
            return findSymbol;
        }

        GenericDescriptor findSymbol(String str, SearchFilter searchFilter) {
            GenericDescriptor genericDescriptor = this.descriptorsByName.get(str);
            if (genericDescriptor == null || !(searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor))))) {
                for (FileDescriptor fileDescriptor : this.dependencies) {
                    GenericDescriptor genericDescriptor2 = fileDescriptor.pool.descriptorsByName.get(str);
                    if (genericDescriptor2 != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor2)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor2))))) {
                        return genericDescriptor2;
                    }
                }
                return null;
            }
            return genericDescriptor;
        }
    }

    /* loaded from: classes2.dex */
    public static class DescriptorValidationException extends Exception {
        private static final long serialVersionUID = 5750205775490483148L;
        private final String description;
        private final String name;
        private final Message proto;

        /* synthetic */ DescriptorValidationException(FileDescriptor fileDescriptor, String str, AnonymousClass1 anonymousClass1) {
            this(fileDescriptor, str);
        }

        public String getDescription() {
            return this.description;
        }

        public Message getProblemProto() {
            return this.proto;
        }

        public String getProblemSymbolName() {
            return this.name;
        }

        /* synthetic */ DescriptorValidationException(GenericDescriptor genericDescriptor, String str, AnonymousClass1 anonymousClass1) {
            this(genericDescriptor, str);
        }

        /* synthetic */ DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th2, AnonymousClass1 anonymousClass1) {
            this(genericDescriptor, str, th2);
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str) {
            super(genericDescriptor.getFullName() + ": " + str);
            this.name = genericDescriptor.getFullName();
            this.proto = genericDescriptor.toProto();
            this.description = str;
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th2) {
            this(genericDescriptor, str);
            initCause(th2);
        }

        private DescriptorValidationException(FileDescriptor fileDescriptor, String str) {
            super(fileDescriptor.getName() + ": " + str);
            this.name = fileDescriptor.getName();
            this.proto = fileDescriptor.toProto();
            this.description = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class EnumDescriptor extends GenericDescriptor implements Internal.EnumLiteMap<EnumValueDescriptor> {
        private ReferenceQueue<EnumValueDescriptor> cleanupQueue;
        private final Descriptor containingType;
        private final int distinctNumbers;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private DescriptorProtos.EnumDescriptorProto proto;
        private Map<Integer, WeakReference<EnumValueDescriptor>> unknownValues;
        private final EnumValueDescriptor[] values;
        private final EnumValueDescriptor[] valuesSortedByNumber;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class UnknownEnumValueReference extends WeakReference<EnumValueDescriptor> {
            private final int number;

            /* synthetic */ UnknownEnumValueReference(int i11, EnumValueDescriptor enumValueDescriptor, AnonymousClass1 anonymousClass1) {
                this(i11, enumValueDescriptor);
            }

            private UnknownEnumValueReference(int i11, EnumValueDescriptor enumValueDescriptor) {
                super(enumValueDescriptor);
                this.number = i11;
            }
        }

        /* synthetic */ EnumDescriptor(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i11, AnonymousClass1 anonymousClass1) {
            this(enumDescriptorProto, fileDescriptor, descriptor, i11);
        }

        public void setProto(DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            this.proto = enumDescriptorProto;
            int i11 = 0;
            while (true) {
                EnumValueDescriptor[] enumValueDescriptorArr = this.values;
                if (i11 >= enumValueDescriptorArr.length) {
                    return;
                }
                enumValueDescriptorArr[i11].setProto(enumDescriptorProto.getValue(i11));
                i11++;
            }
        }

        public EnumValueDescriptor findValueByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + CoreConstants.DOT + str);
            if (findSymbol instanceof EnumValueDescriptor) {
                return (EnumValueDescriptor) findSymbol;
            }
            return null;
        }

        public EnumValueDescriptor findValueByNumberCreatingIfUnknown(int i11) {
            EnumValueDescriptor enumValueDescriptor;
            EnumValueDescriptor findValueByNumber = findValueByNumber(i11);
            if (findValueByNumber != null) {
                return findValueByNumber;
            }
            synchronized (this) {
                if (this.cleanupQueue == null) {
                    this.cleanupQueue = new ReferenceQueue<>();
                    this.unknownValues = new HashMap();
                } else {
                    while (true) {
                        UnknownEnumValueReference unknownEnumValueReference = (UnknownEnumValueReference) this.cleanupQueue.poll();
                        if (unknownEnumValueReference == null) {
                            break;
                        }
                        this.unknownValues.remove(Integer.valueOf(unknownEnumValueReference.number));
                    }
                }
                WeakReference<EnumValueDescriptor> weakReference = this.unknownValues.get(Integer.valueOf(i11));
                enumValueDescriptor = weakReference == null ? null : weakReference.get();
                if (enumValueDescriptor == null) {
                    enumValueDescriptor = new EnumValueDescriptor(this, Integer.valueOf(i11), null);
                    this.unknownValues.put(Integer.valueOf(i11), new UnknownEnumValueReference(i11, enumValueDescriptor, null));
                }
            }
            return enumValueDescriptor;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.EnumOptions getOptions() {
            return this.proto.getOptions();
        }

        int getUnknownEnumValueDescriptorCount() {
            return this.unknownValues.size();
        }

        public List<EnumValueDescriptor> getValues() {
            return Collections.unmodifiableList(Arrays.asList(this.values));
        }

        private EnumDescriptor(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i11) {
            super(null);
            this.unknownValues = null;
            this.cleanupQueue = null;
            this.index = i11;
            this.proto = enumDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, enumDescriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            if (enumDescriptorProto.getValueCount() != 0) {
                this.values = new EnumValueDescriptor[enumDescriptorProto.getValueCount()];
                int i12 = 0;
                for (int i13 = 0; i13 < enumDescriptorProto.getValueCount(); i13++) {
                    this.values[i13] = new EnumValueDescriptor(enumDescriptorProto.getValue(i13), fileDescriptor, this, i13, null);
                }
                EnumValueDescriptor[] enumValueDescriptorArr = (EnumValueDescriptor[]) this.values.clone();
                this.valuesSortedByNumber = enumValueDescriptorArr;
                Arrays.sort(enumValueDescriptorArr, EnumValueDescriptor.BY_NUMBER);
                for (int i14 = 1; i14 < enumDescriptorProto.getValueCount(); i14++) {
                    EnumValueDescriptor[] enumValueDescriptorArr2 = this.valuesSortedByNumber;
                    EnumValueDescriptor enumValueDescriptor = enumValueDescriptorArr2[i12];
                    EnumValueDescriptor enumValueDescriptor2 = enumValueDescriptorArr2[i14];
                    if (enumValueDescriptor.getNumber() != enumValueDescriptor2.getNumber()) {
                        i12++;
                        this.valuesSortedByNumber[i12] = enumValueDescriptor2;
                    }
                }
                int i15 = i12 + 1;
                this.distinctNumbers = i15;
                Arrays.fill(this.valuesSortedByNumber, i15, enumDescriptorProto.getValueCount(), (Object) null);
                fileDescriptor.pool.addSymbol(this);
                return;
            }
            throw new DescriptorValidationException(this, "Enums must contain at least one value.", (AnonymousClass1) null);
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public EnumValueDescriptor findValueByNumber(int i11) {
            return (EnumValueDescriptor) Descriptors.binarySearch(this.valuesSortedByNumber, this.distinctNumbers, EnumValueDescriptor.NUMBER_GETTER, i11);
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.EnumDescriptorProto toProto() {
            return this.proto;
        }
    }

    /* loaded from: classes2.dex */
    public static final class EnumValueDescriptor extends GenericDescriptor implements Internal.EnumLite {
        static final Comparator<EnumValueDescriptor> BY_NUMBER = new Comparator<EnumValueDescriptor>() { // from class: com.google.protobuf.Descriptors.EnumValueDescriptor.1
            @Override // java.util.Comparator
            public int compare(EnumValueDescriptor enumValueDescriptor, EnumValueDescriptor enumValueDescriptor2) {
                return Integer.compare(enumValueDescriptor.getNumber(), enumValueDescriptor2.getNumber());
            }
        };
        static final NumberGetter<EnumValueDescriptor> NUMBER_GETTER = new NumberGetter<EnumValueDescriptor>() { // from class: com.google.protobuf.Descriptors.EnumValueDescriptor.2
            @Override // com.google.protobuf.Descriptors.NumberGetter
            public int getNumber(EnumValueDescriptor enumValueDescriptor) {
                return enumValueDescriptor.getNumber();
            }
        };
        private final String fullName;
        private final int index;
        private DescriptorProtos.EnumValueDescriptorProto proto;
        private final EnumDescriptor type;

        /* synthetic */ EnumValueDescriptor(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i11, AnonymousClass1 anonymousClass1) {
            this(enumValueDescriptorProto, fileDescriptor, enumDescriptor, i11);
        }

        public void setProto(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto) {
            this.proto = enumValueDescriptorProto;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.type.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.proto.getNumber();
        }

        public DescriptorProtos.EnumValueOptions getOptions() {
            return this.proto.getOptions();
        }

        public EnumDescriptor getType() {
            return this.type;
        }

        public String toString() {
            return this.proto.getName();
        }

        /* synthetic */ EnumValueDescriptor(EnumDescriptor enumDescriptor, Integer num, AnonymousClass1 anonymousClass1) {
            this(enumDescriptor, num);
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.EnumValueDescriptorProto toProto() {
            return this.proto;
        }

        private EnumValueDescriptor(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i11) {
            super(null);
            this.index = i11;
            this.proto = enumValueDescriptorProto;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + CoreConstants.DOT + enumValueDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
        }

        private EnumValueDescriptor(EnumDescriptor enumDescriptor, Integer num) {
            super(null);
            DescriptorProtos.EnumValueDescriptorProto build = DescriptorProtos.EnumValueDescriptorProto.newBuilder().setName("UNKNOWN_ENUM_VALUE_" + enumDescriptor.getName() + "_" + num).setNumber(num.intValue()).build();
            this.index = -1;
            this.proto = build;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + CoreConstants.DOT + build.getName();
        }
    }

    /* loaded from: classes2.dex */
    public static final class FieldDescriptor extends GenericDescriptor implements Comparable<FieldDescriptor>, FieldSet.FieldDescriptorLite<FieldDescriptor> {
        private static final NumberGetter<FieldDescriptor> NUMBER_GETTER = new NumberGetter<FieldDescriptor>() { // from class: com.google.protobuf.Descriptors.FieldDescriptor.1
            @Override // com.google.protobuf.Descriptors.NumberGetter
            public int getNumber(FieldDescriptor fieldDescriptor) {
                return fieldDescriptor.getNumber();
            }
        };
        private static final WireFormat.FieldType[] table = WireFormat.FieldType.values();
        private OneofDescriptor containingOneof;
        private Descriptor containingType;
        private Object defaultValue;
        private EnumDescriptor enumType;
        private final Descriptor extensionScope;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final boolean isProto3Optional;
        private String jsonName;
        private Descriptor messageType;
        private DescriptorProtos.FieldDescriptorProto proto;
        private Type type;

        /* loaded from: classes2.dex */
        public enum JavaType {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.FALSE),
            STRING(""),
            BYTE_STRING(ByteString.EMPTY),
            ENUM(null),
            MESSAGE(null);
            
            private final Object defaultDefault;

            JavaType(Object obj) {
                this.defaultDefault = obj;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Type {
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type BOOL;
            public static final Type BYTES;
            public static final Type DOUBLE;
            public static final Type ENUM;
            public static final Type FIXED32;
            public static final Type FIXED64;
            public static final Type FLOAT;
            public static final Type GROUP;
            public static final Type INT32;
            public static final Type INT64;
            public static final Type MESSAGE;
            public static final Type SFIXED32;
            public static final Type SFIXED64;
            public static final Type SINT32;
            public static final Type SINT64;
            public static final Type STRING;
            public static final Type UINT32;
            public static final Type UINT64;
            private static final Type[] types;
            private final JavaType javaType;

            static {
                Type type = new Type("DOUBLE", 0, JavaType.DOUBLE);
                DOUBLE = type;
                Type type2 = new Type("FLOAT", 1, JavaType.FLOAT);
                FLOAT = type2;
                JavaType javaType = JavaType.LONG;
                Type type3 = new Type("INT64", 2, javaType);
                INT64 = type3;
                Type type4 = new Type("UINT64", 3, javaType);
                UINT64 = type4;
                JavaType javaType2 = JavaType.INT;
                Type type5 = new Type("INT32", 4, javaType2);
                INT32 = type5;
                Type type6 = new Type("FIXED64", 5, javaType);
                FIXED64 = type6;
                Type type7 = new Type("FIXED32", 6, javaType2);
                FIXED32 = type7;
                Type type8 = new Type("BOOL", 7, JavaType.BOOLEAN);
                BOOL = type8;
                Type type9 = new Type("STRING", 8, JavaType.STRING);
                STRING = type9;
                JavaType javaType3 = JavaType.MESSAGE;
                Type type10 = new Type("GROUP", 9, javaType3);
                GROUP = type10;
                Type type11 = new Type("MESSAGE", 10, javaType3);
                MESSAGE = type11;
                Type type12 = new Type("BYTES", 11, JavaType.BYTE_STRING);
                BYTES = type12;
                Type type13 = new Type("UINT32", 12, javaType2);
                UINT32 = type13;
                Type type14 = new Type("ENUM", 13, JavaType.ENUM);
                ENUM = type14;
                Type type15 = new Type("SFIXED32", 14, javaType2);
                SFIXED32 = type15;
                Type type16 = new Type("SFIXED64", 15, javaType);
                SFIXED64 = type16;
                Type type17 = new Type("SINT32", 16, javaType2);
                SINT32 = type17;
                Type type18 = new Type("SINT64", 17, javaType);
                SINT64 = type18;
                $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18};
                types = values();
            }

            private Type(String str, int i11, JavaType javaType) {
                super(str, i11);
                this.javaType = javaType;
            }

            public static Type valueOf(String str) {
                return (Type) java.lang.Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            public JavaType getJavaType() {
                return this.javaType;
            }

            public DescriptorProtos.FieldDescriptorProto.Type toProto() {
                return DescriptorProtos.FieldDescriptorProto.Type.forNumber(ordinal() + 1);
            }

            public static Type valueOf(DescriptorProtos.FieldDescriptorProto.Type type) {
                return types[type.getNumber() - 1];
            }
        }

        static {
            if (Type.types.length != DescriptorProtos.FieldDescriptorProto.Type.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        /* synthetic */ FieldDescriptor(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i11, boolean z11, AnonymousClass1 anonymousClass1) {
            this(fieldDescriptorProto, fileDescriptor, descriptor, i11, z11);
        }

        public void crossLink() {
            if (this.proto.hasExtendee()) {
                GenericDescriptor lookupSymbol = this.file.pool.lookupSymbol(this.proto.getExtendee(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (lookupSymbol instanceof Descriptor) {
                    this.containingType = (Descriptor) lookupSymbol;
                    if (!getContainingType().isExtensionNumber(getNumber())) {
                        throw new DescriptorValidationException(this, CoreConstants.DOUBLE_QUOTE_CHAR + getContainingType().getFullName() + "\" does not declare " + getNumber() + " as an extension number.", (AnonymousClass1) null);
                    }
                } else {
                    throw new DescriptorValidationException(this, CoreConstants.DOUBLE_QUOTE_CHAR + this.proto.getExtendee() + "\" is not a message type.", (AnonymousClass1) null);
                }
            }
            if (this.proto.hasTypeName()) {
                GenericDescriptor lookupSymbol2 = this.file.pool.lookupSymbol(this.proto.getTypeName(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (!this.proto.hasType()) {
                    if (lookupSymbol2 instanceof Descriptor) {
                        this.type = Type.MESSAGE;
                    } else if (lookupSymbol2 instanceof EnumDescriptor) {
                        this.type = Type.ENUM;
                    } else {
                        throw new DescriptorValidationException(this, CoreConstants.DOUBLE_QUOTE_CHAR + this.proto.getTypeName() + "\" is not a type.", (AnonymousClass1) null);
                    }
                }
                if (getJavaType() == JavaType.MESSAGE) {
                    if (lookupSymbol2 instanceof Descriptor) {
                        this.messageType = (Descriptor) lookupSymbol2;
                        if (this.proto.hasDefaultValue()) {
                            throw new DescriptorValidationException(this, "Messages can't have default values.", (AnonymousClass1) null);
                        }
                    } else {
                        throw new DescriptorValidationException(this, CoreConstants.DOUBLE_QUOTE_CHAR + this.proto.getTypeName() + "\" is not a message type.", (AnonymousClass1) null);
                    }
                } else if (getJavaType() == JavaType.ENUM) {
                    if (lookupSymbol2 instanceof EnumDescriptor) {
                        this.enumType = (EnumDescriptor) lookupSymbol2;
                    } else {
                        throw new DescriptorValidationException(this, CoreConstants.DOUBLE_QUOTE_CHAR + this.proto.getTypeName() + "\" is not an enum type.", (AnonymousClass1) null);
                    }
                } else {
                    throw new DescriptorValidationException(this, "Field with primitive type has type_name.", (AnonymousClass1) null);
                }
            } else if (getJavaType() == JavaType.MESSAGE || getJavaType() == JavaType.ENUM) {
                throw new DescriptorValidationException(this, "Field with message or enum type missing type_name.", (AnonymousClass1) null);
            }
            if (this.proto.getOptions().getPacked() && !isPackable()) {
                throw new DescriptorValidationException(this, "[packed = true] can only be specified for repeated primitive fields.", (AnonymousClass1) null);
            }
            if (this.proto.hasDefaultValue()) {
                if (!isRepeated()) {
                    try {
                        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[getType().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                this.defaultValue = Integer.valueOf(TextFormat.parseInt32(this.proto.getDefaultValue()));
                                break;
                            case 4:
                            case 5:
                                this.defaultValue = Integer.valueOf(TextFormat.parseUInt32(this.proto.getDefaultValue()));
                                break;
                            case 6:
                            case 7:
                            case 8:
                                this.defaultValue = Long.valueOf(TextFormat.parseInt64(this.proto.getDefaultValue()));
                                break;
                            case 9:
                            case 10:
                                this.defaultValue = Long.valueOf(TextFormat.parseUInt64(this.proto.getDefaultValue()));
                                break;
                            case 11:
                                if (this.proto.getDefaultValue().equals("inf")) {
                                    this.defaultValue = Float.valueOf(Float.POSITIVE_INFINITY);
                                    break;
                                } else if (this.proto.getDefaultValue().equals("-inf")) {
                                    this.defaultValue = Float.valueOf(Float.NEGATIVE_INFINITY);
                                    break;
                                } else if (this.proto.getDefaultValue().equals("nan")) {
                                    this.defaultValue = Float.valueOf(Float.NaN);
                                    break;
                                } else {
                                    this.defaultValue = Float.valueOf(this.proto.getDefaultValue());
                                    break;
                                }
                            case 12:
                                if (this.proto.getDefaultValue().equals("inf")) {
                                    this.defaultValue = Double.valueOf(Double.POSITIVE_INFINITY);
                                    break;
                                } else if (this.proto.getDefaultValue().equals("-inf")) {
                                    this.defaultValue = Double.valueOf(Double.NEGATIVE_INFINITY);
                                    break;
                                } else if (this.proto.getDefaultValue().equals("nan")) {
                                    this.defaultValue = Double.valueOf(Double.NaN);
                                    break;
                                } else {
                                    this.defaultValue = Double.valueOf(this.proto.getDefaultValue());
                                    break;
                                }
                            case 13:
                                this.defaultValue = Boolean.valueOf(this.proto.getDefaultValue());
                                break;
                            case 14:
                                this.defaultValue = this.proto.getDefaultValue();
                                break;
                            case 15:
                                try {
                                    this.defaultValue = TextFormat.unescapeBytes(this.proto.getDefaultValue());
                                    break;
                                } catch (TextFormat.InvalidEscapeSequenceException e11) {
                                    throw new DescriptorValidationException(this, "Couldn't parse default value: " + e11.getMessage(), e11, null);
                                }
                            case 16:
                                EnumValueDescriptor findValueByName = this.enumType.findValueByName(this.proto.getDefaultValue());
                                this.defaultValue = findValueByName;
                                if (findValueByName == null) {
                                    throw new DescriptorValidationException(this, "Unknown enum default value: \"" + this.proto.getDefaultValue() + CoreConstants.DOUBLE_QUOTE_CHAR, (AnonymousClass1) null);
                                }
                                break;
                            case 17:
                            case 18:
                                throw new DescriptorValidationException(this, "Message type had default value.", (AnonymousClass1) null);
                        }
                    } catch (NumberFormatException e12) {
                        throw new DescriptorValidationException(this, "Could not parse default value: \"" + this.proto.getDefaultValue() + CoreConstants.DOUBLE_QUOTE_CHAR, e12, null);
                    }
                } else {
                    throw new DescriptorValidationException(this, "Repeated fields cannot have default values.", (AnonymousClass1) null);
                }
            } else if (isRepeated()) {
                this.defaultValue = Collections.emptyList();
            } else {
                int i11 = AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[getJavaType().ordinal()];
                if (i11 == 1) {
                    this.defaultValue = this.enumType.getValues().get(0);
                } else if (i11 != 2) {
                    this.defaultValue = getJavaType().defaultDefault;
                } else {
                    this.defaultValue = null;
                }
            }
            Descriptor descriptor = this.containingType;
            if (descriptor == null || !descriptor.getOptions().getMessageSetWireFormat()) {
                return;
            }
            if (isExtension()) {
                if (!isOptional() || getType() != Type.MESSAGE) {
                    throw new DescriptorValidationException(this, "Extensions of MessageSets must be optional messages.", (AnonymousClass1) null);
                }
                return;
            }
            throw new DescriptorValidationException(this, "MessageSets cannot have fields, only extensions.", (AnonymousClass1) null);
        }

        private static String fieldNameToJsonName(String str) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length);
            boolean z11 = false;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt == '_') {
                    z11 = true;
                } else if (z11) {
                    if ('a' <= charAt && charAt <= 'z') {
                        charAt = (char) ((charAt - 'a') + 65);
                    }
                    sb2.append(charAt);
                    z11 = false;
                } else {
                    sb2.append(charAt);
                }
            }
            return sb2.toString();
        }

        public void setProto(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            this.proto = fieldDescriptorProto;
        }

        public OneofDescriptor getContainingOneof() {
            return this.containingOneof;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public Object getDefaultValue() {
            if (getJavaType() != JavaType.MESSAGE) {
                return this.defaultValue;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        public Descriptor getExtensionScope() {
            if (isExtension()) {
                return this.extensionScope;
            }
            throw new UnsupportedOperationException(String.format("This field is not an extension. (%s)", this.fullName));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public JavaType getJavaType() {
            return this.type.getJavaType();
        }

        public String getJsonName() {
            String str = this.jsonName;
            if (str != null) {
                return str;
            }
            if (this.proto.hasJsonName()) {
                String jsonName = this.proto.getJsonName();
                this.jsonName = jsonName;
                return jsonName;
            }
            String fieldNameToJsonName = fieldNameToJsonName(this.proto.getName());
            this.jsonName = fieldNameToJsonName;
            return fieldNameToJsonName;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return getLiteType().getJavaType();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return table[this.type.ordinal()];
        }

        public Descriptor getMessageType() {
            if (getJavaType() == JavaType.MESSAGE) {
                return this.messageType;
            }
            throw new UnsupportedOperationException(String.format("This field is not of message type. (%s)", this.fullName));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.proto.getNumber();
        }

        public DescriptorProtos.FieldOptions getOptions() {
            return this.proto.getOptions();
        }

        public OneofDescriptor getRealContainingOneof() {
            OneofDescriptor oneofDescriptor = this.containingOneof;
            if (oneofDescriptor == null || oneofDescriptor.isSynthetic()) {
                return null;
            }
            return this.containingOneof;
        }

        public Type getType() {
            return this.type;
        }

        public boolean hasDefaultValue() {
            return this.proto.hasDefaultValue();
        }

        public boolean hasOptionalKeyword() {
            return this.isProto3Optional || (this.file.getSyntax() == FileDescriptor.Syntax.PROTO2 && isOptional() && getContainingOneof() == null);
        }

        public boolean hasPresence() {
            if (isRepeated()) {
                return false;
            }
            return getType() == Type.MESSAGE || getType() == Type.GROUP || getContainingOneof() != null || this.file.getSyntax() == FileDescriptor.Syntax.PROTO2;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Message.Builder) builder).mergeFrom((Message) messageLite);
        }

        public boolean isExtension() {
            return this.proto.hasExtendee();
        }

        public boolean isMapField() {
            return getType() == Type.MESSAGE && isRepeated() && getMessageType().getOptions().getMapEntry();
        }

        public boolean isOptional() {
            return this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL;
        }

        public boolean isPackable() {
            return isRepeated() && getLiteType().isPackable();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            if (isPackable()) {
                if (getFile().getSyntax() == FileDescriptor.Syntax.PROTO2) {
                    return getOptions().getPacked();
                }
                return !getOptions().hasPacked() || getOptions().getPacked();
            }
            return false;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REPEATED;
        }

        public boolean isRequired() {
            return this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REQUIRED;
        }

        public boolean needsUtf8Check() {
            if (this.type != Type.STRING) {
                return false;
            }
            if (getContainingType().getOptions().getMapEntry() || getFile().getSyntax() == FileDescriptor.Syntax.PROTO3) {
                return true;
            }
            return getFile().getOptions().getJavaStringCheckUtf8();
        }

        public String toString() {
            return getFullName();
        }

        private FieldDescriptor(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i11, boolean z11) {
            super(null);
            this.index = i11;
            this.proto = fieldDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, fieldDescriptorProto.getName());
            this.file = fileDescriptor;
            if (fieldDescriptorProto.hasType()) {
                this.type = Type.valueOf(fieldDescriptorProto.getType());
            }
            this.isProto3Optional = fieldDescriptorProto.getProto3Optional();
            if (getNumber() > 0) {
                if (z11) {
                    if (fieldDescriptorProto.hasExtendee()) {
                        this.containingType = null;
                        if (descriptor != null) {
                            this.extensionScope = descriptor;
                        } else {
                            this.extensionScope = null;
                        }
                        if (!fieldDescriptorProto.hasOneofIndex()) {
                            this.containingOneof = null;
                        } else {
                            throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index set for extension field.", (AnonymousClass1) null);
                        }
                    } else {
                        throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee not set for extension field.", (AnonymousClass1) null);
                    }
                } else if (!fieldDescriptorProto.hasExtendee()) {
                    this.containingType = descriptor;
                    if (fieldDescriptorProto.hasOneofIndex()) {
                        if (fieldDescriptorProto.getOneofIndex() >= 0 && fieldDescriptorProto.getOneofIndex() < descriptor.toProto().getOneofDeclCount()) {
                            OneofDescriptor oneofDescriptor = descriptor.getOneofs().get(fieldDescriptorProto.getOneofIndex());
                            this.containingOneof = oneofDescriptor;
                            OneofDescriptor.access$2608(oneofDescriptor);
                        } else {
                            throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index is out of range for type " + descriptor.getName(), (AnonymousClass1) null);
                        }
                    } else {
                        this.containingOneof = null;
                    }
                    this.extensionScope = null;
                } else {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee set for non-extension field.", (AnonymousClass1) null);
                }
                fileDescriptor.pool.addSymbol(this);
                return;
            }
            throw new DescriptorValidationException(this, "Field numbers must be positive integers.", (AnonymousClass1) null);
        }

        @Override // java.lang.Comparable
        public int compareTo(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.containingType == this.containingType) {
                return getNumber() - fieldDescriptor.getNumber();
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public EnumDescriptor getEnumType() {
            if (getJavaType() == JavaType.ENUM) {
                return this.enumType;
            }
            throw new UnsupportedOperationException(String.format("This field is not of enum type. (%s)", this.fullName));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.FieldDescriptorProto toProto() {
            return this.proto;
        }
    }

    /* loaded from: classes2.dex */
    public static final class FileDescriptor extends GenericDescriptor {
        private final FileDescriptor[] dependencies;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final Descriptor[] messageTypes;
        private final DescriptorPool pool;
        private DescriptorProtos.FileDescriptorProto proto;
        private final FileDescriptor[] publicDependencies;
        private final ServiceDescriptor[] services;

        @Deprecated
        /* loaded from: classes2.dex */
        public interface InternalDescriptorAssigner {
            ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
        }

        /* loaded from: classes2.dex */
        public enum Syntax {
            UNKNOWN("unknown"),
            PROTO2("proto2"),
            PROTO3("proto3");
            
            private final String name;

            Syntax(String str) {
                this.name = str;
            }
        }

        private FileDescriptor(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, DescriptorPool descriptorPool, boolean z11) {
            super(null);
            Descriptor[] descriptorArr;
            EnumDescriptor[] enumDescriptorArr;
            ServiceDescriptor[] serviceDescriptorArr;
            FieldDescriptor[] fieldDescriptorArr;
            this.pool = descriptorPool;
            this.proto = fileDescriptorProto;
            this.dependencies = (FileDescriptor[]) fileDescriptorArr.clone();
            HashMap hashMap = new HashMap();
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                hashMap.put(fileDescriptor.getName(), fileDescriptor);
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < fileDescriptorProto.getPublicDependencyCount(); i11++) {
                int publicDependency = fileDescriptorProto.getPublicDependency(i11);
                if (publicDependency >= 0 && publicDependency < fileDescriptorProto.getDependencyCount()) {
                    String dependency = fileDescriptorProto.getDependency(publicDependency);
                    FileDescriptor fileDescriptor2 = (FileDescriptor) hashMap.get(dependency);
                    if (fileDescriptor2 != null) {
                        arrayList.add(fileDescriptor2);
                    } else if (!z11) {
                        throw new DescriptorValidationException(this, "Invalid public dependency: " + dependency, (AnonymousClass1) null);
                    }
                } else {
                    throw new DescriptorValidationException(this, "Invalid public dependency index.", (AnonymousClass1) null);
                }
            }
            FileDescriptor[] fileDescriptorArr2 = new FileDescriptor[arrayList.size()];
            this.publicDependencies = fileDescriptorArr2;
            arrayList.toArray(fileDescriptorArr2);
            descriptorPool.addPackage(getPackage(), this);
            if (fileDescriptorProto.getMessageTypeCount() <= 0) {
                descriptorArr = Descriptors.EMPTY_DESCRIPTORS;
            } else {
                descriptorArr = new Descriptor[fileDescriptorProto.getMessageTypeCount()];
            }
            this.messageTypes = descriptorArr;
            for (int i12 = 0; i12 < fileDescriptorProto.getMessageTypeCount(); i12++) {
                this.messageTypes[i12] = new Descriptor(fileDescriptorProto.getMessageType(i12), this, null, i12, null);
            }
            if (fileDescriptorProto.getEnumTypeCount() <= 0) {
                enumDescriptorArr = Descriptors.EMPTY_ENUM_DESCRIPTORS;
            } else {
                enumDescriptorArr = new EnumDescriptor[fileDescriptorProto.getEnumTypeCount()];
            }
            this.enumTypes = enumDescriptorArr;
            for (int i13 = 0; i13 < fileDescriptorProto.getEnumTypeCount(); i13++) {
                this.enumTypes[i13] = new EnumDescriptor(fileDescriptorProto.getEnumType(i13), this, null, i13, null);
            }
            if (fileDescriptorProto.getServiceCount() <= 0) {
                serviceDescriptorArr = Descriptors.EMPTY_SERVICE_DESCRIPTORS;
            } else {
                serviceDescriptorArr = new ServiceDescriptor[fileDescriptorProto.getServiceCount()];
            }
            this.services = serviceDescriptorArr;
            for (int i14 = 0; i14 < fileDescriptorProto.getServiceCount(); i14++) {
                this.services[i14] = new ServiceDescriptor(fileDescriptorProto.getService(i14), this, i14, null);
            }
            if (fileDescriptorProto.getExtensionCount() <= 0) {
                fieldDescriptorArr = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            } else {
                fieldDescriptorArr = new FieldDescriptor[fileDescriptorProto.getExtensionCount()];
            }
            this.extensions = fieldDescriptorArr;
            for (int i15 = 0; i15 < fileDescriptorProto.getExtensionCount(); i15++) {
                this.extensions[i15] = new FieldDescriptor(fileDescriptorProto.getExtension(i15), this, null, i15, true, null);
            }
        }

        public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr) {
            return buildFrom(fileDescriptorProto, fileDescriptorArr, false);
        }

        private void crossLink() {
            for (Descriptor descriptor : this.messageTypes) {
                descriptor.crossLink();
            }
            for (ServiceDescriptor serviceDescriptor : this.services) {
                serviceDescriptor.crossLink();
            }
            for (FieldDescriptor fieldDescriptor : this.extensions) {
                fieldDescriptor.crossLink();
            }
        }

        private static FileDescriptor[] findDescriptors(Class<?> cls, String[] strArr, String[] strArr2) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                try {
                    arrayList.add((FileDescriptor) cls.getClassLoader().loadClass(strArr[i11]).getField("descriptor").get(null));
                } catch (Exception unused) {
                    Descriptors.logger.warning("Descriptors for \"" + strArr2[i11] + "\" can not be found.");
                }
            }
            return (FileDescriptor[]) arrayList.toArray(new FileDescriptor[0]);
        }

        @Deprecated
        public static void internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr, InternalDescriptorAssigner internalDescriptorAssigner) {
            byte[] latin1Cat = latin1Cat(strArr);
            try {
                DescriptorProtos.FileDescriptorProto parseFrom = DescriptorProtos.FileDescriptorProto.parseFrom(latin1Cat);
                try {
                    FileDescriptor buildFrom = buildFrom(parseFrom, fileDescriptorArr, true);
                    ExtensionRegistry assignDescriptors = internalDescriptorAssigner.assignDescriptors(buildFrom);
                    if (assignDescriptors != null) {
                        try {
                            buildFrom.setProto(DescriptorProtos.FileDescriptorProto.parseFrom(latin1Cat, assignDescriptors));
                        } catch (InvalidProtocolBufferException e11) {
                            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e11);
                        }
                    }
                } catch (DescriptorValidationException e12) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + parseFrom.getName() + "\".", e12);
                }
            } catch (InvalidProtocolBufferException e13) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e13);
            }
        }

        public static void internalUpdateFileDescriptor(FileDescriptor fileDescriptor, ExtensionRegistry extensionRegistry) {
            try {
                fileDescriptor.setProto(DescriptorProtos.FileDescriptorProto.parseFrom(fileDescriptor.proto.toByteString(), extensionRegistry));
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e11);
            }
        }

        private static byte[] latin1Cat(String[] strArr) {
            if (strArr.length == 1) {
                return strArr[0].getBytes(Internal.ISO_8859_1);
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArr) {
                sb2.append(str);
            }
            return sb2.toString().getBytes(Internal.ISO_8859_1);
        }

        private void setProto(DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
            this.proto = fileDescriptorProto;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                Descriptor[] descriptorArr = this.messageTypes;
                if (i12 >= descriptorArr.length) {
                    break;
                }
                descriptorArr[i12].setProto(fileDescriptorProto.getMessageType(i12));
                i12++;
            }
            int i13 = 0;
            while (true) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                if (i13 >= enumDescriptorArr.length) {
                    break;
                }
                enumDescriptorArr[i13].setProto(fileDescriptorProto.getEnumType(i13));
                i13++;
            }
            int i14 = 0;
            while (true) {
                ServiceDescriptor[] serviceDescriptorArr = this.services;
                if (i14 >= serviceDescriptorArr.length) {
                    break;
                }
                serviceDescriptorArr[i14].setProto(fileDescriptorProto.getService(i14));
                i14++;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.extensions;
                if (i11 >= fieldDescriptorArr.length) {
                    return;
                }
                fieldDescriptorArr[i11].setProto(fileDescriptorProto.getExtension(i11));
                i11++;
            }
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + CoreConstants.DOT + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            if ((findSymbol instanceof EnumDescriptor) && findSymbol.getFile() == this) {
                return (EnumDescriptor) findSymbol;
            }
            return null;
        }

        public FieldDescriptor findExtensionByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + CoreConstants.DOT + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            if ((findSymbol instanceof FieldDescriptor) && findSymbol.getFile() == this) {
                return (FieldDescriptor) findSymbol;
            }
            return null;
        }

        public Descriptor findMessageTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + CoreConstants.DOT + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            if ((findSymbol instanceof Descriptor) && findSymbol.getFile() == this) {
                return (Descriptor) findSymbol;
            }
            return null;
        }

        public ServiceDescriptor findServiceByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + CoreConstants.DOT + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            if ((findSymbol instanceof ServiceDescriptor) && findSymbol.getFile() == this) {
                return (ServiceDescriptor) findSymbol;
            }
            return null;
        }

        public List<FileDescriptor> getDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.dependencies));
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.proto.getName();
        }

        public List<Descriptor> getMessageTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.messageTypes));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.FileOptions getOptions() {
            return this.proto.getOptions();
        }

        public String getPackage() {
            return this.proto.getPackage();
        }

        public List<FileDescriptor> getPublicDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.publicDependencies));
        }

        public List<ServiceDescriptor> getServices() {
            return Collections.unmodifiableList(Arrays.asList(this.services));
        }

        public Syntax getSyntax() {
            Syntax syntax = Syntax.PROTO3;
            return syntax.name.equals(this.proto.getSyntax()) ? syntax : Syntax.PROTO2;
        }

        public boolean supportsUnknownEnumValue() {
            return getSyntax() == Syntax.PROTO3;
        }

        public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, boolean z11) {
            FileDescriptor fileDescriptor = new FileDescriptor(fileDescriptorProto, fileDescriptorArr, new DescriptorPool(fileDescriptorArr, z11), z11);
            fileDescriptor.crossLink();
            return fileDescriptor;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.FileDescriptorProto toProto() {
            return this.proto;
        }

        public static FileDescriptor internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr) {
            DescriptorProtos.FileDescriptorProtoOrBuilder fileDescriptorProtoOrBuilder;
            try {
                try {
                    return buildFrom(DescriptorProtos.FileDescriptorProto.parseFrom(latin1Cat(strArr)), fileDescriptorArr, true);
                } catch (DescriptorValidationException e11) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + fileDescriptorProtoOrBuilder.getName() + "\".", e11);
                }
            } catch (InvalidProtocolBufferException e12) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e12);
            }
        }

        @Deprecated
        public static void internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3, InternalDescriptorAssigner internalDescriptorAssigner) {
            internalBuildGeneratedFileFrom(strArr, findDescriptors(cls, strArr2, strArr3), internalDescriptorAssigner);
        }

        public static FileDescriptor internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3) {
            return internalBuildGeneratedFileFrom(strArr, findDescriptors(cls, strArr2, strArr3));
        }

        FileDescriptor(String str, Descriptor descriptor) {
            super(null);
            DescriptorPool descriptorPool = new DescriptorPool(new FileDescriptor[0], true);
            this.pool = descriptorPool;
            DescriptorProtos.FileDescriptorProto.Builder newBuilder = DescriptorProtos.FileDescriptorProto.newBuilder();
            this.proto = newBuilder.setName(descriptor.getFullName() + ".placeholder.proto").setPackage(str).addMessageType(descriptor.toProto()).build();
            this.dependencies = new FileDescriptor[0];
            this.publicDependencies = new FileDescriptor[0];
            this.messageTypes = new Descriptor[]{descriptor};
            this.enumTypes = Descriptors.EMPTY_ENUM_DESCRIPTORS;
            this.services = Descriptors.EMPTY_SERVICE_DESCRIPTORS;
            this.extensions = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            descriptorPool.addPackage(str, this);
            descriptorPool.addSymbol(descriptor);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class GenericDescriptor {
        /* synthetic */ GenericDescriptor(AnonymousClass1 anonymousClass1) {
            this();
        }

        public abstract FileDescriptor getFile();

        public abstract String getFullName();

        public abstract String getName();

        public abstract Message toProto();

        private GenericDescriptor() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class MethodDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Descriptor inputType;
        private Descriptor outputType;
        private DescriptorProtos.MethodDescriptorProto proto;
        private final ServiceDescriptor service;

        /* synthetic */ MethodDescriptor(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i11, AnonymousClass1 anonymousClass1) {
            this(methodDescriptorProto, fileDescriptor, serviceDescriptor, i11);
        }

        public void crossLink() {
            DescriptorPool descriptorPool = getFile().pool;
            String inputType = this.proto.getInputType();
            DescriptorPool.SearchFilter searchFilter = DescriptorPool.SearchFilter.TYPES_ONLY;
            GenericDescriptor lookupSymbol = descriptorPool.lookupSymbol(inputType, this, searchFilter);
            if (lookupSymbol instanceof Descriptor) {
                this.inputType = (Descriptor) lookupSymbol;
                GenericDescriptor lookupSymbol2 = getFile().pool.lookupSymbol(this.proto.getOutputType(), this, searchFilter);
                if (lookupSymbol2 instanceof Descriptor) {
                    this.outputType = (Descriptor) lookupSymbol2;
                    return;
                }
                throw new DescriptorValidationException(this, CoreConstants.DOUBLE_QUOTE_CHAR + this.proto.getOutputType() + "\" is not a message type.", (AnonymousClass1) null);
            }
            throw new DescriptorValidationException(this, CoreConstants.DOUBLE_QUOTE_CHAR + this.proto.getInputType() + "\" is not a message type.", (AnonymousClass1) null);
        }

        public void setProto(DescriptorProtos.MethodDescriptorProto methodDescriptorProto) {
            this.proto = methodDescriptorProto;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public Descriptor getInputType() {
            return this.inputType;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.MethodOptions getOptions() {
            return this.proto.getOptions();
        }

        public Descriptor getOutputType() {
            return this.outputType;
        }

        public ServiceDescriptor getService() {
            return this.service;
        }

        public boolean isClientStreaming() {
            return this.proto.getClientStreaming();
        }

        public boolean isServerStreaming() {
            return this.proto.getServerStreaming();
        }

        private MethodDescriptor(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i11) {
            super(null);
            this.index = i11;
            this.proto = methodDescriptorProto;
            this.file = fileDescriptor;
            this.service = serviceDescriptor;
            this.fullName = serviceDescriptor.getFullName() + CoreConstants.DOT + methodDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.MethodDescriptorProto toProto() {
            return this.proto;
        }
    }

    /* loaded from: classes2.dex */
    public interface NumberGetter<T> {
        int getNumber(T t11);
    }

    /* loaded from: classes2.dex */
    public static final class OneofDescriptor extends GenericDescriptor {
        private Descriptor containingType;
        private int fieldCount;
        private FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private DescriptorProtos.OneofDescriptorProto proto;

        /* synthetic */ OneofDescriptor(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i11, AnonymousClass1 anonymousClass1) {
            this(oneofDescriptorProto, fileDescriptor, descriptor, i11);
        }

        static /* synthetic */ int access$2608(OneofDescriptor oneofDescriptor) {
            int i11 = oneofDescriptor.fieldCount;
            oneofDescriptor.fieldCount = i11 + 1;
            return i11;
        }

        public void setProto(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto) {
            this.proto = oneofDescriptorProto;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public FieldDescriptor getField(int i11) {
            return this.fields[i11];
        }

        public int getFieldCount() {
            return this.fieldCount;
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.OneofOptions getOptions() {
            return this.proto.getOptions();
        }

        public boolean isSynthetic() {
            FieldDescriptor[] fieldDescriptorArr = this.fields;
            return fieldDescriptorArr.length == 1 && fieldDescriptorArr[0].isProto3Optional;
        }

        private OneofDescriptor(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i11) {
            super(null);
            this.proto = oneofDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, oneofDescriptorProto.getName());
            this.file = fileDescriptor;
            this.index = i11;
            this.containingType = descriptor;
            this.fieldCount = 0;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.OneofDescriptorProto toProto() {
            return this.proto;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ServiceDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private MethodDescriptor[] methods;
        private DescriptorProtos.ServiceDescriptorProto proto;

        /* synthetic */ ServiceDescriptor(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i11, AnonymousClass1 anonymousClass1) {
            this(serviceDescriptorProto, fileDescriptor, i11);
        }

        public void crossLink() {
            for (MethodDescriptor methodDescriptor : this.methods) {
                methodDescriptor.crossLink();
            }
        }

        public void setProto(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto) {
            this.proto = serviceDescriptorProto;
            int i11 = 0;
            while (true) {
                MethodDescriptor[] methodDescriptorArr = this.methods;
                if (i11 >= methodDescriptorArr.length) {
                    return;
                }
                methodDescriptorArr[i11].setProto(serviceDescriptorProto.getMethod(i11));
                i11++;
            }
        }

        public MethodDescriptor findMethodByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + CoreConstants.DOT + str);
            if (findSymbol instanceof MethodDescriptor) {
                return (MethodDescriptor) findSymbol;
            }
            return null;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public List<MethodDescriptor> getMethods() {
            return Collections.unmodifiableList(Arrays.asList(this.methods));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.ServiceOptions getOptions() {
            return this.proto.getOptions();
        }

        private ServiceDescriptor(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i11) {
            super(null);
            this.index = i11;
            this.proto = serviceDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, null, serviceDescriptorProto.getName());
            this.file = fileDescriptor;
            this.methods = new MethodDescriptor[serviceDescriptorProto.getMethodCount()];
            for (int i12 = 0; i12 < serviceDescriptorProto.getMethodCount(); i12++) {
                this.methods[i12] = new MethodDescriptor(serviceDescriptorProto.getMethod(i12), fileDescriptor, this, i12, null);
            }
            fileDescriptor.pool.addSymbol(this);
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.ServiceDescriptorProto toProto() {
            return this.proto;
        }
    }

    public static <T> T binarySearch(T[] tArr, int i11, NumberGetter<T> numberGetter, int i12) {
        int i13 = i11 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) / 2;
            T t11 = tArr[i15];
            int number = numberGetter.getNumber(t11);
            if (i12 < number) {
                i13 = i15 - 1;
            } else if (i12 <= number) {
                return t11;
            } else {
                i14 = i15 + 1;
            }
        }
        return null;
    }

    public static String computeFullName(FileDescriptor fileDescriptor, Descriptor descriptor, String str) {
        if (descriptor != null) {
            return descriptor.getFullName() + CoreConstants.DOT + str;
        }
        String str2 = fileDescriptor.getPackage();
        if (str2.isEmpty()) {
            return str;
        }
        return str2 + CoreConstants.DOT + str;
    }
}