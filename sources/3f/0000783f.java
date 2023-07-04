package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.exceptions.RealmException;
import io.realm.internal.j;
import io.realm.l0;
import io.realm.o0;
import io.realm.t;
import java.util.UUID;
import org.bson.types.ObjectId;

@Keep
/* loaded from: classes5.dex */
public class OsObject implements h {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private j<b> observerPairs = new j<>();

    /* loaded from: classes5.dex */
    private static class a implements j.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f31845a;

        a(String[] strArr) {
            this.f31845a = strArr;
        }

        private t b() {
            String[] strArr = this.f31845a;
            boolean z11 = strArr == null;
            if (z11) {
                strArr = new String[0];
            }
            return new c(strArr, z11);
        }

        @Override // io.realm.internal.j.a
        /* renamed from: c */
        public void a(b bVar, Object obj) {
            bVar.a((l0) obj, b());
        }
    }

    /* loaded from: classes5.dex */
    public static class b<T extends l0> extends j.b<T, o0<T>> {
        public b(T t11, o0<T> o0Var) {
            super(t11, o0Var);
        }

        public void a(T t11, t tVar) {
            ((o0) this.f31939b).a(t11, tVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c implements t {
        c(String[] strArr, boolean z11) {
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.a(this);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.p().context, table, nativeCreateNewObject(table.getNativePtr()));
    }

    public static long createEmbeddedObject(Table table, long j11, long j12) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), j11, j12);
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table, long j11, Object obj) {
        RealmFieldType m11 = table.m(j11);
        OsSharedRealm p11 = table.p();
        if (m11 == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return nativeCreateRowWithStringPrimaryKey(p11.getNativePtr(), table.getNativePtr(), j11, (String) obj);
        } else if (m11 == RealmFieldType.INTEGER) {
            return nativeCreateRowWithLongPrimaryKey(p11.getNativePtr(), table.getNativePtr(), j11, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null);
        } else {
            if (m11 == RealmFieldType.OBJECT_ID) {
                if (obj == null || (obj instanceof ObjectId)) {
                    return nativeCreateRowWithObjectIdPrimaryKey(p11.getNativePtr(), table.getNativePtr(), j11, obj != null ? obj.toString() : null);
                }
                throw new IllegalArgumentException("Primary key value is not an ObjectId: " + obj);
            } else if (m11 == RealmFieldType.UUID) {
                if (obj == null || (obj instanceof UUID)) {
                    return nativeCreateRowWithUUIDPrimaryKey(p11.getNativePtr(), table.getNativePtr(), j11, obj != null ? obj.toString() : null);
                }
                throw new IllegalArgumentException("Primary key value is not an UUID: " + obj);
            } else {
                throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + m11);
            }
        }
    }

    public static UncheckedRow createWithPrimaryKey(Table table, Object obj) {
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType m11 = table.m(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm p11 = table.p();
        if (m11 == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return new UncheckedRow(p11.context, table, nativeCreateNewObjectWithStringPrimaryKey(p11.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
        } else if (m11 == RealmFieldType.INTEGER) {
            return new UncheckedRow(p11.context, table, nativeCreateNewObjectWithLongPrimaryKey(p11.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null));
        } else if (m11 == RealmFieldType.OBJECT_ID) {
            return new UncheckedRow(p11.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(p11.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? null : obj.toString()));
        } else if (m11 == RealmFieldType.UUID) {
            return new UncheckedRow(p11.context, table, nativeCreateNewObjectWithUUIDPrimaryKey(p11.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? null : obj.toString()));
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + m11);
        }
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String b11 = OsObjectStore.b(table.p(), table.g());
        if (b11 != null) {
            return table.j(b11);
        }
        throw new IllegalStateException(table.o() + " has no primary key defined.");
    }

    private static native long nativeCreate(long j11, long j12);

    private static native long nativeCreateEmbeddedObject(long j11, long j12, long j13);

    private static native long nativeCreateNewObject(long j11);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j11, long j12, long j13, long j14, boolean z11);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateRow(long j11);

    private static native long nativeCreateRowWithLongPrimaryKey(long j11, long j12, long j13, long j14, boolean z11);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j11);

    private native void nativeStopListening(long j11);

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.c(new a(strArr));
    }

    public <T extends l0> void addListener(T t11, o0<T> o0Var) {
        if (this.observerPairs.d()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.a(new b(t11, o0Var));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends l0> void removeListener(T t11) {
        this.observerPairs.f(t11);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(j<b> jVar) {
        if (this.observerPairs.d()) {
            this.observerPairs = jVar;
            if (jVar.d()) {
                return;
            }
            nativeStartListening(this.nativePtr);
            return;
        }
        throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
    }

    public <T extends l0> void removeListener(T t11, o0<T> o0Var) {
        this.observerPairs.e(t11, o0Var);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }
}