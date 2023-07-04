package com.facebook.react.modules.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

@fg.a(name = AsyncStorageModule.NAME)
/* loaded from: classes3.dex */
public final class AsyncStorageModule extends NativeAsyncSQLiteDBStorageSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "AsyncSQLiteDBStorage";
    private final g executor;
    private com.facebook.react.modules.storage.c mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* loaded from: classes3.dex */
    class a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f12085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f12086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f12085a = callback;
            this.f12086b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1 A[LOOP:3: B:21:0x00bb->B:23:0x00c1, LOOP_END] */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void doInBackgroundGuarded(java.lang.Void... r20) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.AsyncStorageModule.a.doInBackgroundGuarded(java.lang.Void[]):void");
        }
    }

    /* loaded from: classes3.dex */
    class b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f12088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f12089b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f12088a = callback;
            this.f12089b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (AsyncStorageModule.this.ensureDatabase()) {
                SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.p().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
                try {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.p().beginTransaction();
                        for (int i11 = 0; i11 < this.f12089b.size(); i11++) {
                            if (this.f12089b.getArray(i11).size() != 2) {
                                WritableMap d11 = com.facebook.react.modules.storage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                                    return;
                                } catch (Exception e11) {
                                    nd.a.H("ReactNative", e11.getMessage(), e11);
                                    if (d11 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e11.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f12089b.getArray(i11).getString(0) == null) {
                                WritableMap c11 = com.facebook.react.modules.storage.b.c(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                                    return;
                                } catch (Exception e12) {
                                    nd.a.H("ReactNative", e12.getMessage(), e12);
                                    if (c11 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e12.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f12089b.getArray(i11).getString(1) == null) {
                                WritableMap d12 = com.facebook.react.modules.storage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                                    return;
                                } catch (Exception e13) {
                                    nd.a.H("ReactNative", e13.getMessage(), e13);
                                    if (d12 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e13.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                compileStatement.clearBindings();
                                compileStatement.bindString(1, this.f12089b.getArray(i11).getString(0));
                                compileStatement.bindString(2, this.f12089b.getArray(i11).getString(1));
                                compileStatement.execute();
                            }
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.p().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                        } catch (Exception e14) {
                            nd.a.H("ReactNative", e14.getMessage(), e14);
                            writableMap = com.facebook.react.modules.storage.b.b(null, e14.getMessage());
                        }
                    } catch (Exception e15) {
                        nd.a.H("ReactNative", e15.getMessage(), e15);
                        WritableMap b11 = com.facebook.react.modules.storage.b.b(null, e15.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                        } catch (Exception e16) {
                            nd.a.H("ReactNative", e16.getMessage(), e16);
                            if (b11 == null) {
                                writableMap = com.facebook.react.modules.storage.b.b(null, e16.getMessage());
                            }
                        }
                        writableMap = b11;
                    }
                    if (writableMap != null) {
                        this.f12088a.invoke(writableMap);
                        return;
                    } else {
                        this.f12088a.invoke(new Object[0]);
                        return;
                    }
                } catch (Throwable th2) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                    } catch (Exception e17) {
                        nd.a.H("ReactNative", e17.getMessage(), e17);
                        com.facebook.react.modules.storage.b.b(null, e17.getMessage());
                    }
                    throw th2;
                }
            }
            this.f12088a.invoke(com.facebook.react.modules.storage.b.a(null));
        }
    }

    /* loaded from: classes3.dex */
    class c extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f12091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f12092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f12091a = callback;
            this.f12092b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            try {
                if (AsyncStorageModule.this.ensureDatabase()) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.p().beginTransaction();
                        for (int i11 = 0; i11 < this.f12092b.size(); i11 += 999) {
                            int min = Math.min(this.f12092b.size() - i11, 999);
                            AsyncStorageModule.this.mReactDatabaseSupplier.p().delete("catalystLocalStorage", com.facebook.react.modules.storage.a.a(min), com.facebook.react.modules.storage.a.b(this.f12092b, i11, min));
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.p().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                        } catch (Exception e11) {
                            nd.a.H("ReactNative", e11.getMessage(), e11);
                            writableMap = com.facebook.react.modules.storage.b.b(null, e11.getMessage());
                        }
                    } catch (Exception e12) {
                        nd.a.H("ReactNative", e12.getMessage(), e12);
                        WritableMap b11 = com.facebook.react.modules.storage.b.b(null, e12.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                        } catch (Exception e13) {
                            nd.a.H("ReactNative", e13.getMessage(), e13);
                            if (b11 == null) {
                                writableMap = com.facebook.react.modules.storage.b.b(null, e13.getMessage());
                            }
                        }
                        writableMap = b11;
                    }
                    if (writableMap != null) {
                        this.f12091a.invoke(writableMap);
                        return;
                    } else {
                        this.f12091a.invoke(new Object[0]);
                        return;
                    }
                }
                this.f12091a.invoke(com.facebook.react.modules.storage.b.a(null));
            } catch (Throwable th2) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                } catch (Exception e14) {
                    nd.a.H("ReactNative", e14.getMessage(), e14);
                    com.facebook.react.modules.storage.b.b(null, e14.getMessage());
                }
                throw th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f12094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f12095b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f12094a = callback;
            this.f12095b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            try {
                if (AsyncStorageModule.this.ensureDatabase()) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.p().beginTransaction();
                        for (int i11 = 0; i11 < this.f12095b.size(); i11++) {
                            if (this.f12095b.getArray(i11).size() != 2) {
                                WritableMap d11 = com.facebook.react.modules.storage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                                    return;
                                } catch (Exception e11) {
                                    nd.a.H("ReactNative", e11.getMessage(), e11);
                                    if (d11 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e11.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f12095b.getArray(i11).getString(0) == null) {
                                WritableMap c11 = com.facebook.react.modules.storage.b.c(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                                    return;
                                } catch (Exception e12) {
                                    nd.a.H("ReactNative", e12.getMessage(), e12);
                                    if (c11 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e12.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (this.f12095b.getArray(i11).getString(1) == null) {
                                WritableMap d12 = com.facebook.react.modules.storage.b.d(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                                    return;
                                } catch (Exception e13) {
                                    nd.a.H("ReactNative", e13.getMessage(), e13);
                                    if (d12 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e13.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            } else if (!com.facebook.react.modules.storage.a.e(AsyncStorageModule.this.mReactDatabaseSupplier.p(), this.f12095b.getArray(i11).getString(0), this.f12095b.getArray(i11).getString(1))) {
                                WritableMap a11 = com.facebook.react.modules.storage.b.a(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                                    return;
                                } catch (Exception e14) {
                                    nd.a.H("ReactNative", e14.getMessage(), e14);
                                    if (a11 == null) {
                                        com.facebook.react.modules.storage.b.b(null, e14.getMessage());
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.p().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                        } catch (Exception e15) {
                            nd.a.H("ReactNative", e15.getMessage(), e15);
                            writableMap = com.facebook.react.modules.storage.b.b(null, e15.getMessage());
                        }
                    } catch (Exception e16) {
                        nd.a.H("ReactNative", e16.getMessage(), e16);
                        WritableMap b11 = com.facebook.react.modules.storage.b.b(null, e16.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                        } catch (Exception e17) {
                            nd.a.H("ReactNative", e17.getMessage(), e17);
                            if (b11 == null) {
                                writableMap = com.facebook.react.modules.storage.b.b(null, e17.getMessage());
                            }
                        }
                        writableMap = b11;
                    }
                    if (writableMap != null) {
                        this.f12094a.invoke(writableMap);
                        return;
                    } else {
                        this.f12094a.invoke(new Object[0]);
                        return;
                    }
                }
                this.f12094a.invoke(com.facebook.react.modules.storage.b.a(null));
            } catch (Throwable th2) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.p().endTransaction();
                } catch (Exception e18) {
                    nd.a.H("ReactNative", e18.getMessage(), e18);
                    com.facebook.react.modules.storage.b.b(null, e18.getMessage());
                }
                throw th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f12097a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f12097a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (AsyncStorageModule.this.mReactDatabaseSupplier.m()) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.a();
                    this.f12097a.invoke(new Object[0]);
                    return;
                } catch (Exception e11) {
                    nd.a.H("ReactNative", e11.getMessage(), e11);
                    this.f12097a.invoke(com.facebook.react.modules.storage.b.b(null, e11.getMessage()));
                    return;
                }
            }
            this.f12097a.invoke(com.facebook.react.modules.storage.b.a(null));
        }
    }

    /* loaded from: classes3.dex */
    class f extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f12099a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f12099a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f12099a.invoke(com.facebook.react.modules.storage.b.a(null), null);
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.p().query("catalystLocalStorage", new String[]{Action.KEY_ATTRIBUTE}, null, null, null, null, null);
            try {
                try {
                    if (query.moveToFirst()) {
                        do {
                            createArray.pushString(query.getString(0));
                        } while (query.moveToNext());
                        query.close();
                        this.f12099a.invoke(null, createArray);
                    }
                    query.close();
                    this.f12099a.invoke(null, createArray);
                } catch (Exception e11) {
                    nd.a.H("ReactNative", e11.getMessage(), e11);
                    this.f12099a.invoke(com.facebook.react.modules.storage.b.b(null, e11.getMessage()), null);
                    query.close();
                }
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    private class g implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<Runnable> f12101a = new ArrayDeque<>();

        /* renamed from: b  reason: collision with root package name */
        private Runnable f12102b;

        /* renamed from: c  reason: collision with root package name */
        private final Executor f12103c;

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f12104a;

            a(Runnable runnable) {
                this.f12104a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f12104a.run();
                } finally {
                    g.this.a();
                }
            }
        }

        g(AsyncStorageModule asyncStorageModule, Executor executor) {
            this.f12103c = executor;
        }

        synchronized void a() {
            Runnable poll = this.f12101a.poll();
            this.f12102b = poll;
            if (poll != null) {
                this.f12103c.execute(poll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f12101a.offer(new a(runnable));
            if (this.f12102b == null) {
                a();
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.m();
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.g();
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(com.facebook.react.modules.storage.b.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(com.facebook.react.modules.storage.b.c(null));
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(com.facebook.react.modules.storage.b.c(null));
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new g(this, executor);
        this.mReactDatabaseSupplier = com.facebook.react.modules.storage.c.C(reactApplicationContext);
    }
}