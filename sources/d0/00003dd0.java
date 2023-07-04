package com.google.protobuf.util;

import com.google.common.base.n;
import com.google.common.base.r;
import com.google.common.base.u;
import com.google.common.base.x;
import com.google.protobuf.Descriptors;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Internal;
import com.google.protobuf.Message;
import fl.d;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class FieldMaskUtil {
    private static final String FIELD_PATH_SEPARATOR = ",";
    private static final String FIELD_PATH_SEPARATOR_REGEX = ",";
    private static final String FIELD_SEPARATOR_REGEX = "\\.";

    /* loaded from: classes2.dex */
    public static final class MergeOptions {
        private boolean replaceMessageFields = false;
        private boolean replaceRepeatedFields = false;
        private boolean replacePrimitiveFields = false;

        public boolean replaceMessageFields() {
            return this.replaceMessageFields;
        }

        public boolean replacePrimitiveFields() {
            return this.replacePrimitiveFields;
        }

        public boolean replaceRepeatedFields() {
            return this.replaceRepeatedFields;
        }

        public MergeOptions setReplaceMessageFields(boolean z11) {
            this.replaceMessageFields = z11;
            return this;
        }

        public MergeOptions setReplacePrimitiveFields(boolean z11) {
            this.replacePrimitiveFields = z11;
            return this;
        }

        public MergeOptions setReplaceRepeatedFields(boolean z11) {
            this.replaceRepeatedFields = z11;
            return this;
        }
    }

    private FieldMaskUtil() {
    }

    public static FieldMask fromFieldNumbers(Class<? extends Message> cls, int... iArr) {
        return fromFieldNumbers(cls, d.c(iArr));
    }

    public static FieldMask fromJsonString(String str) {
        Iterable<String> j11 = x.h(",").j(str);
        FieldMask.Builder newBuilder = FieldMask.newBuilder();
        for (String str2 : j11) {
            if (!str2.isEmpty()) {
                newBuilder.addPaths(com.google.common.base.d.LOWER_CAMEL.to(com.google.common.base.d.LOWER_UNDERSCORE, str2));
            }
        }
        return newBuilder.build();
    }

    public static FieldMask fromString(String str) {
        return fromStringList(Arrays.asList(str.split(",")));
    }

    public static FieldMask fromStringList(Class<? extends Message> cls, Iterable<String> iterable) {
        return fromStringList(((Message) Internal.getDefaultInstance(cls)).getDescriptorForType(), iterable);
    }

    public static FieldMask intersection(FieldMask fieldMask, FieldMask fieldMask2) {
        FieldMaskTree fieldMaskTree = new FieldMaskTree(fieldMask);
        FieldMaskTree fieldMaskTree2 = new FieldMaskTree();
        for (String str : fieldMask2.getPathsList()) {
            fieldMaskTree.intersectFieldPath(str, fieldMaskTree2);
        }
        return fieldMaskTree2.toFieldMask();
    }

    public static boolean isValid(Class<? extends Message> cls, FieldMask fieldMask) {
        return isValid(((Message) Internal.getDefaultInstance(cls)).getDescriptorForType(), fieldMask);
    }

    public static void merge(FieldMask fieldMask, Message message, Message.Builder builder, MergeOptions mergeOptions) {
        new FieldMaskTree(fieldMask).merge(message, builder, mergeOptions);
    }

    public static FieldMask normalize(FieldMask fieldMask) {
        return new FieldMaskTree(fieldMask).toFieldMask();
    }

    public static FieldMask subtract(FieldMask fieldMask, FieldMask fieldMask2, FieldMask... fieldMaskArr) {
        FieldMaskTree removeFromFieldMask = new FieldMaskTree(fieldMask).removeFromFieldMask(fieldMask2);
        for (FieldMask fieldMask3 : fieldMaskArr) {
            removeFromFieldMask.removeFromFieldMask(fieldMask3);
        }
        return removeFromFieldMask.toFieldMask();
    }

    public static String toJsonString(FieldMask fieldMask) {
        ArrayList arrayList = new ArrayList(fieldMask.getPathsCount());
        for (String str : fieldMask.getPathsList()) {
            if (!str.isEmpty()) {
                arrayList.add(com.google.common.base.d.LOWER_UNDERSCORE.to(com.google.common.base.d.LOWER_CAMEL, str));
            }
        }
        return n.g(",").d(arrayList);
    }

    public static String toString(FieldMask fieldMask) {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (String str : fieldMask.getPathsList()) {
            if (!str.isEmpty()) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(",");
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static <P extends Message> P trim(FieldMask fieldMask, P p11) {
        Message.Builder newBuilderForType = p11.newBuilderForType();
        merge(fieldMask, p11, newBuilderForType);
        return (P) newBuilderForType.build();
    }

    public static FieldMask union(FieldMask fieldMask, FieldMask fieldMask2, FieldMask... fieldMaskArr) {
        FieldMaskTree mergeFromFieldMask = new FieldMaskTree(fieldMask).mergeFromFieldMask(fieldMask2);
        for (FieldMask fieldMask3 : fieldMaskArr) {
            mergeFromFieldMask.mergeFromFieldMask(fieldMask3);
        }
        return mergeFromFieldMask.toFieldMask();
    }

    public static FieldMask fromFieldNumbers(Class<? extends Message> cls, Iterable<Integer> iterable) {
        Descriptors.Descriptor descriptorForType = ((Message) Internal.getDefaultInstance(cls)).getDescriptorForType();
        FieldMask.Builder newBuilder = FieldMask.newBuilder();
        for (Integer num : iterable) {
            Descriptors.FieldDescriptor findFieldByNumber = descriptorForType.findFieldByNumber(num.intValue());
            u.e(findFieldByNumber != null, String.format("%s is not a valid field number for %s.", num, cls));
            newBuilder.addPaths(findFieldByNumber.getName());
        }
        return newBuilder.build();
    }

    public static FieldMask fromString(Class<? extends Message> cls, String str) {
        return fromStringList(cls, Arrays.asList(str.split(",")));
    }

    public static FieldMask fromStringList(Descriptors.Descriptor descriptor, Iterable<String> iterable) {
        return fromStringList(r.d(descriptor), iterable);
    }

    public static void merge(FieldMask fieldMask, Message message, Message.Builder builder) {
        merge(fieldMask, message, builder, new MergeOptions());
    }

    public static FieldMask fromStringList(Iterable<String> iterable) {
        return fromStringList(r.a(), iterable);
    }

    public static boolean isValid(Descriptors.Descriptor descriptor, FieldMask fieldMask) {
        for (String str : fieldMask.getPathsList()) {
            if (!isValid(descriptor, str)) {
                return false;
            }
        }
        return true;
    }

    private static FieldMask fromStringList(r<Descriptors.Descriptor> rVar, Iterable<String> iterable) {
        FieldMask.Builder newBuilder = FieldMask.newBuilder();
        for (String str : iterable) {
            if (!str.isEmpty()) {
                if (rVar.c() && !isValid(rVar.b(), str)) {
                    throw new IllegalArgumentException(str + " is not a valid path for " + rVar.b().getFullName());
                }
                newBuilder.addPaths(str);
            }
        }
        return newBuilder.build();
    }

    public static boolean isValid(Class<? extends Message> cls, String str) {
        return isValid(((Message) Internal.getDefaultInstance(cls)).getDescriptorForType(), str);
    }

    public static boolean isValid(Descriptors.Descriptor descriptor, String str) {
        Descriptors.FieldDescriptor findFieldByName;
        String[] split = str.split(FIELD_SEPARATOR_REGEX);
        if (split.length == 0) {
            return false;
        }
        for (String str2 : split) {
            if (descriptor == null || (findFieldByName = descriptor.findFieldByName(str2)) == null) {
                return false;
            }
            descriptor = (findFieldByName.isRepeated() || findFieldByName.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) ? null : findFieldByName.getMessageType();
        }
        return true;
    }
}