package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE = new ListFieldSchemaFull();
    private static final ListFieldSchema LITE_INSTANCE = new ListFieldSchemaLite();

    /* loaded from: classes2.dex */
    private static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        static <E> List<E> getList(Object obj, long j11) {
            return (List) UnsafeUtil.getObject(obj, j11);
        }

        @Override // com.google.protobuf.ListFieldSchema
        void makeImmutableListAt(Object obj, long j11) {
            Object unmodifiableList;
            List list = (List) UnsafeUtil.getObject(obj, j11);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.putObject(obj, j11, unmodifiableList);
        }

        @Override // com.google.protobuf.ListFieldSchema
        <E> void mergeListsAt(Object obj, Object obj2, long j11) {
            List list = getList(obj2, j11);
            List mutableListAt = mutableListAt(obj, j11, list.size());
            int size = mutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                mutableListAt.addAll(list);
            }
            if (size > 0) {
                list = mutableListAt;
            }
            UnsafeUtil.putObject(obj, j11, list);
        }

        @Override // com.google.protobuf.ListFieldSchema
        <L> List<L> mutableListAt(Object obj, long j11) {
            return mutableListAt(obj, j11, 10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> mutableListAt(Object obj, long j11, int i11) {
            LazyStringArrayList lazyStringArrayList;
            List<L> arrayList;
            List<L> list = getList(obj, j11);
            if (list.isEmpty()) {
                if (list instanceof LazyStringList) {
                    arrayList = new LazyStringArrayList(i11);
                } else if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    arrayList = ((Internal.ProtobufList) list).mutableCopyWithCapacity(i11);
                } else {
                    arrayList = new ArrayList<>(i11);
                }
                UnsafeUtil.putObject(obj, j11, arrayList);
                return arrayList;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList2 = new ArrayList(list.size() + i11);
                arrayList2.addAll(list);
                UnsafeUtil.putObject(obj, j11, arrayList2);
                lazyStringArrayList = arrayList2;
            } else if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i11);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.putObject(obj, j11, lazyStringArrayList2);
                lazyStringArrayList = lazyStringArrayList2;
            } else if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    return list;
                }
                Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(list.size() + i11);
                UnsafeUtil.putObject(obj, j11, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            } else {
                return list;
            }
            return lazyStringArrayList;
        }
    }

    /* loaded from: classes2.dex */
    private static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j11) {
            return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j11);
        }

        @Override // com.google.protobuf.ListFieldSchema
        void makeImmutableListAt(Object obj, long j11) {
            getProtobufList(obj, j11).makeImmutable();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.protobuf.ListFieldSchema
        <E> void mergeListsAt(Object obj, Object obj2, long j11) {
            Internal.ProtobufList<E> protobufList = getProtobufList(obj, j11);
            Internal.ProtobufList<E> protobufList2 = getProtobufList(obj2, j11);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            Internal.ProtobufList<E> protobufList3 = protobufList;
            protobufList3 = protobufList;
            if (size > 0 && size2 > 0) {
                boolean isModifiable = protobufList.isModifiable();
                Internal.ProtobufList<E> protobufList4 = protobufList;
                if (!isModifiable) {
                    protobufList4 = protobufList.mutableCopyWithCapacity(size2 + size);
                }
                protobufList4.addAll(protobufList2);
                protobufList3 = protobufList4;
            }
            if (size > 0) {
                protobufList2 = protobufList3;
            }
            UnsafeUtil.putObject(obj, j11, protobufList2);
        }

        @Override // com.google.protobuf.ListFieldSchema
        <L> List<L> mutableListAt(Object obj, long j11) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j11);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            UnsafeUtil.putObject(obj, j11, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ListFieldSchema lite() {
        return LITE_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void makeImmutableListAt(Object obj, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> mutableListAt(Object obj, long j11);

    private ListFieldSchema() {
    }
}