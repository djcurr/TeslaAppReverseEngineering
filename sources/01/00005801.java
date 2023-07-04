package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.content.SharedPreferences;
import h00.p;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.i;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.k;
import vz.m;
import vz.q;
import vz.r;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultAppInfoRepository implements AppInfoRepository {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int INVALID_VERSION_CODE = -1;
    private final int appVersion;
    private final Store store;

    @f(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$1", f = "DefaultAppInfoRepository.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        int I$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            int i11;
            d11 = a00.d.d();
            int i12 = this.label;
            if (i12 == 0) {
                r.b(obj);
                int i13 = DefaultAppInfoRepository.this.appVersion;
                Store store = DefaultAppInfoRepository.this.store;
                this.I$0 = i13;
                this.label = 1;
                Object obj2 = store.get(this);
                if (obj2 == d11) {
                    return d11;
                }
                i11 = i13;
                obj = obj2;
            } else if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i11 = this.I$0;
                r.b(obj);
            }
            AppInfo appInfo = (AppInfo) obj;
            if (!(appInfo != null && i11 == appInfo.getVersion())) {
                DefaultAppInfoRepository.this.initAppInfo();
            }
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getAppVersion(Context context) {
            Integer b11;
            try {
                q.a aVar = q.f54772b;
                b11 = q.b(Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            if (q.g(b11)) {
                b11 = -1;
            }
            return ((Number) b11).intValue();
        }
    }

    /* loaded from: classes6.dex */
    public interface Store {

        /* loaded from: classes6.dex */
        public static final class Default implements Store {
            private static final Companion Companion = new Companion(null);
            @Deprecated
            private static final String KEY_APP_VERSION = "app_version";
            @Deprecated
            private static final String KEY_SDK_APP_ID = "sdk_app_id";
            @Deprecated
            private static final String PREFS_NAME = "app_info";
            private final int appVersion;
            private final k sharedPrefs$delegate;
            private final g workContext;

            /* loaded from: classes6.dex */
            private static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public Default(Context context, int i11, g workContext) {
                k a11;
                s.g(context, "context");
                s.g(workContext, "workContext");
                this.appVersion = i11;
                this.workContext = workContext;
                a11 = m.a(new DefaultAppInfoRepository$Store$Default$sharedPrefs$2(context));
                this.sharedPrefs$delegate = a11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final SharedPreferences getSharedPrefs() {
                Object value = this.sharedPrefs$delegate.getValue();
                s.f(value, "<get-sharedPrefs>(...)");
                return (SharedPreferences) value;
            }

            @Override // com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository.Store
            public Object get(d<? super AppInfo> dVar) {
                return i.g(this.workContext, new DefaultAppInfoRepository$Store$Default$get$2(this, null), dVar);
            }

            @Override // com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository.Store
            public void save(AppInfo appInfo) {
                s.g(appInfo, "appInfo");
                getSharedPrefs().edit().putInt("app_version", this.appVersion).putString(KEY_SDK_APP_ID, appInfo.getSdkAppId()).apply();
            }
        }

        Object get(d<? super AppInfo> dVar);

        void save(AppInfo appInfo);
    }

    public DefaultAppInfoRepository(Store store, int i11, g workContext) {
        s.g(store, "store");
        s.g(workContext, "workContext");
        this.store = store;
        this.appVersion = i11;
        v20.k.d(p0.a(workContext), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppInfo initAppInfo() {
        String uuid = UUID.randomUUID().toString();
        s.f(uuid, "randomUUID().toString()");
        AppInfo appInfo = new AppInfo(uuid, this.appVersion);
        this.store.save(appInfo);
        return appInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.stripe3ds2.init.AppInfoRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(zz.d<? super com.stripe.android.stripe3ds2.init.AppInfo> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1
            if (r0 == 0) goto L13
            r0 = r5
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1 r0 = (com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1 r0 = new com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository r0 = (com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository) r0
            vz.r.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            vz.r.b(r5)
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$Store r5 = r4.store
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            com.stripe.android.stripe3ds2.init.AppInfo r5 = (com.stripe.android.stripe3ds2.init.AppInfo) r5
            if (r5 != 0) goto L4e
            com.stripe.android.stripe3ds2.init.AppInfo r5 = r0.initAppInfo()
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository.get(zz.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository(Context context, g workContext) {
        this(context, Companion.getAppVersion(context), workContext);
        s.g(context, "context");
        s.g(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository(Context context, int i11, g workContext) {
        this(new Store.Default(context, i11, workContext), i11, workContext);
        s.g(context, "context");
        s.g(workContext, "workContext");
    }
}