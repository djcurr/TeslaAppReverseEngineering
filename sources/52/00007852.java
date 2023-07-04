package io.realm.internal;

import ch.qos.logback.core.CoreConstants;
import io.realm.RealmFieldType;
import io.realm.g0;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsResults;
import io.realm.internal.android.AndroidRealmNotifier;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Keep
/* loaded from: classes5.dex */
public final class OsSharedRealm implements Closeable, h {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final io.realm.internal.a capabilities;
    public final g context;
    final List<WeakReference<OsResults.a>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<k>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    @Keep
    /* loaded from: classes5.dex */
    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    @Keep
    /* loaded from: classes5.dex */
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j11, long j12);
    }

    @Keep
    /* loaded from: classes5.dex */
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    /* loaded from: classes5.dex */
    public static class a implements Comparable<a> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f31886c = new a(-1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final long f31887a;

        /* renamed from: b  reason: collision with root package name */
        public final long f31888b;

        a(long j11, long j12) {
            this.f31887a = j11;
            this.f31888b = j12;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a aVar) {
            if (aVar != null) {
                long j11 = this.f31887a;
                long j12 = aVar.f31887a;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            }
            throw new IllegalArgumentException("Version cannot be compared to a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31887a == aVar.f31887a && this.f31888b == aVar.f31888b;
        }

        public int hashCode() {
            long j11 = this.f31887a;
            long j12 = this.f31888b;
            return (((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) ((j12 >>> 32) ^ j12));
        }

        public String toString() {
            return "VersionID{version=" + this.f31887a + ", index=" + this.f31888b + CoreConstants.CURLY_RIGHT;
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.tempSharedRealmsForCallback = arrayList;
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        io.realm.internal.android.a aVar2 = new io.realm.internal.android.a();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, aVar2);
        g a11 = osRealmConfig.a();
        this.context = a11;
        List<OsSharedRealm> list = sharedRealmsUnderConstruction;
        list.add(this);
        try {
            long nativeGetSharedRealm = nativeGetSharedRealm(osRealmConfig.getNativePtr(), aVar.f31887a, aVar.f31888b, androidRealmNotifier);
            this.nativePtr = nativeGetSharedRealm;
            arrayList.clear();
            list.remove(this);
            this.osRealmConfig = osRealmConfig;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(nativeGetSharedRealm), this);
            a11.a(this);
            this.capabilities = aVar2;
            this.realmNotifier = androidRealmNotifier;
            if (aVar.equals(a.f31886c)) {
                nativeSetAutoRefresh(nativeGetSharedRealm, aVar2.c());
            }
        } catch (Throwable th2) {
            try {
                for (OsSharedRealm osSharedRealm : this.tempSharedRealmsForCallback) {
                    if (!osSharedRealm.isClosed()) {
                        osSharedRealm.close();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                this.tempSharedRealmsForCallback.clear();
                sharedRealmsUnderConstruction.remove(this);
                throw th3;
            }
        }
    }

    private void detachIterators() {
        for (WeakReference<OsResults.a> weakReference : this.iterators) {
            OsResults.a aVar = weakReference.get();
            if (aVar != null) {
                aVar.b();
            }
        }
        this.iterators.clear();
    }

    private void executePendingRowQueries() {
        for (WeakReference<k> weakReference : this.pendingRows) {
            k kVar = weakReference.get();
            if (kVar != null) {
                kVar.b();
            }
        }
        this.pendingRows.clear();
    }

    public static OsSharedRealm getInstance(g0 g0Var, a aVar) {
        return getInstance(new OsRealmConfig.b(g0Var), aVar);
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public static void initialize(File file) {
        if (temporaryDirectory != null) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("failed to create temporary directory: " + absolutePath);
        }
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        nativeInit(absolutePath);
        temporaryDirectory = file;
    }

    private static native void nativeBeginTransaction(long j11);

    private static native void nativeCancelTransaction(long j11);

    private static native void nativeCloseSharedRealm(long j11);

    private static native void nativeCommitTransaction(long j11);

    private static native boolean nativeCompact(long j11);

    private static native long nativeCreateTable(long j11, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j11, String str, String str2, int i11, boolean z11);

    private static native long nativeFreeze(long j11);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetSchemaInfo(long j11);

    private static native long nativeGetSharedRealm(long j11, long j12, long j13, RealmNotifier realmNotifier);

    private static native long nativeGetTableRef(long j11, String str);

    private static native String[] nativeGetTablesName(long j11);

    private static native long[] nativeGetVersionID(long j11);

    private static native boolean nativeHasTable(long j11, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j11);

    private static native boolean nativeIsClosed(long j11);

    private static native boolean nativeIsEmpty(long j11);

    private static native boolean nativeIsFrozen(long j11);

    private static native boolean nativeIsInTransaction(long j11);

    private static native long nativeNumberOfVersions(long j11);

    private static native void nativeRefresh(long j11);

    private static native void nativeRegisterSchemaChangedCallback(long j11, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j11, String str, String str2);

    private static native void nativeSetAutoRefresh(long j11, boolean z11);

    private static native long nativeSize(long j11);

    private static native void nativeStopWaitForChange(long j11);

    private static native boolean nativeWaitForChange(long j11);

    private static native void nativeWriteCopy(long j11, String str, byte[] bArr);

    private static void runInitializationCallback(long j11, OsRealmConfig osRealmConfig, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j11, osRealmConfig));
    }

    private static void runMigrationCallback(long j11, OsRealmConfig osRealmConfig, MigrationCallback migrationCallback, long j12) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j11, osRealmConfig), j12, osRealmConfig.b().o());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addIterator(OsResults.a aVar) {
        this.iterators.add(new WeakReference<>(aVar));
    }

    void addPendingRow(k kVar) {
        this.pendingRows.add(new WeakReference<>(kVar));
    }

    public void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RealmNotifier realmNotifier = this.realmNotifier;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    public void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public Table createTableWithPrimaryKey(String str, String str2, RealmFieldType realmFieldType, boolean z11) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, realmFieldType.getNativeValue(), z11));
    }

    public OsSharedRealm freeze() {
        return new OsSharedRealm(this.osRealmConfig, getVersionID());
    }

    public g0 getConfiguration() {
        return this.osRealmConfig.b();
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNumberOfVersions() {
        return nativeNumberOfVersions(this.nativePtr);
    }

    public String getPath() {
        return this.osRealmConfig.b().k();
    }

    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public Table getTable(String str) {
        return new Table(this, nativeGetTableRef(this.nativePtr, str));
    }

    public String[] getTablesNames() {
        String[] nativeGetTablesName = nativeGetTablesName(this.nativePtr);
        return nativeGetTablesName != null ? nativeGetTablesName : new String[0];
    }

    public a getVersionID() {
        long[] nativeGetVersionID = nativeGetVersionID(this.nativePtr);
        if (nativeGetVersionID != null) {
            return new a(nativeGetVersionID[0], nativeGetVersionID[1]);
        }
        throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
    }

    public boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void invalidateIterators() {
        for (WeakReference<OsResults.a> weakReference : this.iterators) {
            OsResults.a aVar = weakReference.get();
            if (aVar != null) {
                aVar.e();
            }
        }
        this.iterators.clear();
    }

    public boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public boolean isFrozen() {
        return nativeIsFrozen(this.nativePtr);
    }

    public boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public boolean isSyncRealm() {
        return this.osRealmConfig.c() != null;
    }

    public void refresh() {
        if (!isFrozen()) {
            nativeRefresh(this.nativePtr);
            return;
        }
        throw new IllegalStateException("It is not possible to refresh frozen Realms.");
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removePendingRow(k kVar) {
        for (WeakReference<k> weakReference : this.pendingRows) {
            k kVar2 = weakReference.get();
            if (kVar2 == null || kVar2 == kVar) {
                this.pendingRows.remove(weakReference);
            }
        }
    }

    public void renameTable(String str, String str2) {
        nativeRenameTable(this.nativePtr, str, str2);
    }

    public void setAutoRefresh(boolean z11) {
        this.capabilities.b(null);
        nativeSetAutoRefresh(this.nativePtr, z11);
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public void writeCopy(File file, byte[] bArr) {
        if (file.isFile() && file.exists()) {
            throw new IllegalArgumentException("The destination file must not exist");
        }
        nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
    }

    public static OsSharedRealm getInstance(OsRealmConfig.b bVar, a aVar) {
        OsRealmConfig b11 = bVar.b();
        i.d().i(b11);
        return new OsSharedRealm(b11, aVar);
    }

    private OsSharedRealm(long j11, OsRealmConfig osRealmConfig) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = j11;
        this.osRealmConfig = osRealmConfig;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(j11), this);
        g a11 = osRealmConfig.a();
        this.context = a11;
        a11.a(this);
        this.capabilities = new io.realm.internal.android.a();
        this.realmNotifier = null;
        boolean z11 = false;
        nativeSetAutoRefresh(j11, false);
        Iterator<OsSharedRealm> it2 = sharedRealmsUnderConstruction.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            OsSharedRealm next = it2.next();
            if (next.context == osRealmConfig.a()) {
                z11 = true;
                next.tempSharedRealmsForCallback.add(this);
                break;
            }
        }
        if (!z11) {
            throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
        }
    }
}