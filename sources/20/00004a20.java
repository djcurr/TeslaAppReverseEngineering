package com.reactnativestripesdk;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import com.stripe.android.financialconnections.model.Balance;
import com.stripe.android.financialconnections.model.BalanceRefresh;
import com.stripe.android.financialconnections.model.CashBalance;
import com.stripe.android.financialconnections.model.CreditBalance;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.tesla.TeslaV4.BuildConfig;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/reactnativestripesdk/x;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "f", "a", "b", "stripe_stripe-react-native_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class x extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public static final a f20385f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private Promise f20386a;

    /* renamed from: b  reason: collision with root package name */
    private ReactApplicationContext f20387b;

    /* renamed from: c  reason: collision with root package name */
    private String f20388c;

    /* renamed from: d  reason: collision with root package name */
    private String f20389d;

    /* renamed from: e  reason: collision with root package name */
    private b f20390e;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.reactnativestripesdk.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0357a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f20391a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ int[] f20392b;

            /* renamed from: c  reason: collision with root package name */
            public static final /* synthetic */ int[] f20393c;

            /* renamed from: d  reason: collision with root package name */
            public static final /* synthetic */ int[] f20394d;

            /* renamed from: e  reason: collision with root package name */
            public static final /* synthetic */ int[] f20395e;

            /* renamed from: f  reason: collision with root package name */
            public static final /* synthetic */ int[] f20396f;

            /* renamed from: g  reason: collision with root package name */
            public static final /* synthetic */ int[] f20397g;

            static {
                int[] iArr = new int[FinancialConnectionsAccount.Status.values().length];
                iArr[FinancialConnectionsAccount.Status.ACTIVE.ordinal()] = 1;
                iArr[FinancialConnectionsAccount.Status.DISCONNECTED.ordinal()] = 2;
                iArr[FinancialConnectionsAccount.Status.INACTIVE.ordinal()] = 3;
                iArr[FinancialConnectionsAccount.Status.UNKNOWN.ordinal()] = 4;
                f20391a = iArr;
                int[] iArr2 = new int[FinancialConnectionsAccount.Category.values().length];
                iArr2[FinancialConnectionsAccount.Category.CASH.ordinal()] = 1;
                iArr2[FinancialConnectionsAccount.Category.CREDIT.ordinal()] = 2;
                iArr2[FinancialConnectionsAccount.Category.INVESTMENT.ordinal()] = 3;
                iArr2[FinancialConnectionsAccount.Category.OTHER.ordinal()] = 4;
                iArr2[FinancialConnectionsAccount.Category.UNKNOWN.ordinal()] = 5;
                f20392b = iArr2;
                int[] iArr3 = new int[FinancialConnectionsAccount.Subcategory.values().length];
                iArr3[FinancialConnectionsAccount.Subcategory.CHECKING.ordinal()] = 1;
                iArr3[FinancialConnectionsAccount.Subcategory.CREDIT_CARD.ordinal()] = 2;
                iArr3[FinancialConnectionsAccount.Subcategory.LINE_OF_CREDIT.ordinal()] = 3;
                iArr3[FinancialConnectionsAccount.Subcategory.MORTGAGE.ordinal()] = 4;
                iArr3[FinancialConnectionsAccount.Subcategory.OTHER.ordinal()] = 5;
                iArr3[FinancialConnectionsAccount.Subcategory.SAVINGS.ordinal()] = 6;
                iArr3[FinancialConnectionsAccount.Subcategory.UNKNOWN.ordinal()] = 7;
                f20393c = iArr3;
                int[] iArr4 = new int[FinancialConnectionsAccount.Permissions.values().length];
                iArr4[FinancialConnectionsAccount.Permissions.PAYMENT_METHOD.ordinal()] = 1;
                iArr4[FinancialConnectionsAccount.Permissions.BALANCES.ordinal()] = 2;
                iArr4[FinancialConnectionsAccount.Permissions.OWNERSHIP.ordinal()] = 3;
                iArr4[FinancialConnectionsAccount.Permissions.TRANSACTIONS.ordinal()] = 4;
                iArr4[FinancialConnectionsAccount.Permissions.UNKNOWN.ordinal()] = 5;
                f20394d = iArr4;
                int[] iArr5 = new int[FinancialConnectionsAccount.SupportedPaymentMethodTypes.values().length];
                iArr5[FinancialConnectionsAccount.SupportedPaymentMethodTypes.US_BANK_ACCOUNT.ordinal()] = 1;
                iArr5[FinancialConnectionsAccount.SupportedPaymentMethodTypes.LINK.ordinal()] = 2;
                iArr5[FinancialConnectionsAccount.SupportedPaymentMethodTypes.UNKNOWN.ordinal()] = 3;
                f20395e = iArr5;
                int[] iArr6 = new int[Balance.Type.values().length];
                iArr6[Balance.Type.CASH.ordinal()] = 1;
                iArr6[Balance.Type.CREDIT.ordinal()] = 2;
                iArr6[Balance.Type.UNKNOWN.ordinal()] = 3;
                f20396f = iArr6;
                int[] iArr7 = new int[BalanceRefresh.BalanceRefreshStatus.values().length];
                iArr7[BalanceRefresh.BalanceRefreshStatus.SUCCEEDED.ordinal()] = 1;
                iArr7[BalanceRefresh.BalanceRefreshStatus.FAILED.ordinal()] = 2;
                iArr7[BalanceRefresh.BalanceRefreshStatus.PENDING.ordinal()] = 3;
                iArr7[BalanceRefresh.BalanceRefreshStatus.UNKNOWN.ordinal()] = 4;
                f20397g = iArr7;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WritableMap c(FinancialConnectionsSheetForTokenResult.Completed completed) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("session", x.f20385f.k(completed.getFinancialConnectionsSession()));
            writableNativeMap.putMap("token", hr.d.y(completed.getToken()));
            return writableNativeMap;
        }

        private final WritableMap d(Balance balance) {
            if (balance == null) {
                return null;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("asOf", balance.getAsOf() * 1000.0d);
            writableNativeMap.putString("type", h(balance.getType()));
            writableNativeMap.putMap("current", (ReadableMap) balance.getCurrent());
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            CashBalance cash = balance.getCash();
            Map<String, Integer> available = cash == null ? null : cash.getAvailable();
            Objects.requireNonNull(available, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
            writableNativeMap2.putMap("available", (ReadableMap) available);
            writableNativeMap.putMap("cash", writableNativeMap2);
            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
            CreditBalance credit = balance.getCredit();
            Map<String, Integer> used = credit != null ? credit.getUsed() : null;
            Objects.requireNonNull(used, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
            writableNativeMap3.putMap("used", (ReadableMap) used);
            writableNativeMap.putMap("credit", writableNativeMap3);
            return writableNativeMap;
        }

        private final WritableMap e(BalanceRefresh balanceRefresh) {
            if (balanceRefresh == null) {
                return null;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(PermissionsResponse.STATUS_KEY, g(balanceRefresh.getStatus()));
            writableNativeMap.putDouble("lastAttemptedAt", balanceRefresh.getLastAttemptedAt() * 1000.0d);
            return writableNativeMap;
        }

        private final ReadableArray f(FinancialConnectionsAccountList financialConnectionsAccountList) {
            int t11;
            ReadableArray a11;
            int t12;
            WritableArray createArray = Arguments.createArray();
            kotlin.jvm.internal.s.f(createArray, "createArray()");
            for (FinancialConnectionsAccount financialConnectionsAccount : financialConnectionsAccountList.getData()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("id", financialConnectionsAccount.getId());
                writableNativeMap.putBoolean("livemode", financialConnectionsAccount.getLivemode());
                writableNativeMap.putString("displayName", financialConnectionsAccount.getDisplayName());
                writableNativeMap.putString(PermissionsResponse.STATUS_KEY, l(financialConnectionsAccount.getStatus()));
                writableNativeMap.putString("institutionName", financialConnectionsAccount.getInstitutionName());
                writableNativeMap.putString("last4", financialConnectionsAccount.getLast4());
                writableNativeMap.putDouble("created", financialConnectionsAccount.getCreated() * 1000.0d);
                writableNativeMap.putMap("balance", d(financialConnectionsAccount.getBalance()));
                writableNativeMap.putMap("balanceRefresh", e(financialConnectionsAccount.getBalanceRefresh()));
                writableNativeMap.putString("category", i(financialConnectionsAccount.getCategory()));
                writableNativeMap.putString("subcategory", m(financialConnectionsAccount.getSubcategory()));
                List<FinancialConnectionsAccount.Permissions> permissions = financialConnectionsAccount.getPermissions();
                if (permissions == null) {
                    a11 = null;
                } else {
                    t11 = wz.x.t(permissions, 10);
                    ArrayList arrayList = new ArrayList(t11);
                    for (FinancialConnectionsAccount.Permissions permissions2 : permissions) {
                        arrayList.add(x.f20385f.j(permissions2));
                    }
                    a11 = y.a(arrayList);
                }
                writableNativeMap.putArray("permissions", a11);
                List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes = financialConnectionsAccount.getSupportedPaymentMethodTypes();
                t12 = wz.x.t(supportedPaymentMethodTypes, 10);
                ArrayList arrayList2 = new ArrayList(t12);
                for (FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes2 : supportedPaymentMethodTypes) {
                    arrayList2.add(x.f20385f.n(supportedPaymentMethodTypes2));
                }
                writableNativeMap.putArray("supportedPaymentMethodTypes", y.a(arrayList2));
                createArray.pushMap(writableNativeMap);
            }
            return createArray;
        }

        private final String g(BalanceRefresh.BalanceRefreshStatus balanceRefreshStatus) {
            int i11 = balanceRefreshStatus == null ? -1 : C0357a.f20397g[balanceRefreshStatus.ordinal()];
            if (i11 != -1) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                return "unparsable";
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return "pending";
                    }
                    return "failed";
                }
                return "succeeded";
            }
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }

        private final String h(Balance.Type type) {
            int i11 = C0357a.f20396f[type.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return "unparsable";
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "credit";
            }
            return "cash";
        }

        private final String i(FinancialConnectionsAccount.Category category) {
            int i11 = C0357a.f20392b[category.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return "unparsable";
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return "other";
                    }
                    return "investment";
                }
                return "credit";
            }
            return "cash";
        }

        private final String j(FinancialConnectionsAccount.Permissions permissions) {
            int i11 = C0357a.f20394d[permissions.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return "unparsable";
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return "transactions";
                    }
                    return BuildConfig.AUTH_OPENID_CLIENT_ID;
                }
                return "balances";
            }
            return "paymentMethod";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WritableMap k(FinancialConnectionsSession financialConnectionsSession) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("id", financialConnectionsSession.getId());
            writableNativeMap.putString("clientSecret", financialConnectionsSession.getClientSecret());
            writableNativeMap.putBoolean("livemode", financialConnectionsSession.getLivemode());
            writableNativeMap.putArray("accounts", f(financialConnectionsSession.getAccounts()));
            return writableNativeMap;
        }

        private final String l(FinancialConnectionsAccount.Status status) {
            int i11 = C0357a.f20391a[status.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return "unparsable";
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return "inactive";
                }
                return "disconnected";
            }
            return "active";
        }

        private final String m(FinancialConnectionsAccount.Subcategory subcategory) {
            switch (C0357a.f20393c[subcategory.ordinal()]) {
                case 1:
                    return "checking";
                case 2:
                    return "creditCard";
                case 3:
                    return "lineOfCredit";
                case 4:
                    return "mortgage";
                case 5:
                    return "other";
                case 6:
                    return "savings";
                case 7:
                    return "unparsable";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private final String n(FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes) {
            int i11 = C0357a.f20395e[supportedPaymentMethodTypes.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return "unparsable";
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "link";
            }
            return "usBankAccount";
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        ForToken,
        ForSession
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20398a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.ForToken.ordinal()] = 1;
            iArr[b.ForSession.ordinal()] = 2;
            f20398a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class d extends kotlin.jvm.internal.p implements h00.l<FinancialConnectionsSheetForTokenResult, vz.b0> {
        d(Object obj) {
            super(1, obj, x.class, "onFinancialConnectionsSheetForTokenResult", "onFinancialConnectionsSheetForTokenResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V", 0);
        }

        public final void d(FinancialConnectionsSheetForTokenResult p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            ((x) this.receiver).f(p02);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(FinancialConnectionsSheetForTokenResult financialConnectionsSheetForTokenResult) {
            d(financialConnectionsSheetForTokenResult);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class e implements FinancialConnectionsSheetResultCallback, kotlin.jvm.internal.m {
        e() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FinancialConnectionsSheetResultCallback) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.m
        public final vz.g<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.p(1, x.this, x.class, "onFinancialConnectionsSheetForDataResult", "onFinancialConnectionsSheetForDataResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback
        public final void onFinancialConnectionsSheetResult(FinancialConnectionsSheetResult p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            x.this.e(p02);
        }
    }

    private final void c(androidx.appcompat.app.d dVar) {
        dVar.getSupportFragmentManager().m().o(this).i();
    }

    private final void d(androidx.appcompat.app.d dVar) {
        try {
            dVar.getSupportFragmentManager().m().e(this, "financial_connections_sheet_launch_fragment").h();
        } catch (IllegalStateException e11) {
            Promise promise = this.f20386a;
            if (promise == null) {
                kotlin.jvm.internal.s.x(BaseJavaModule.METHOD_TYPE_PROMISE);
                promise = null;
            }
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), e11.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        androidx.fragment.app.q supportFragmentManager;
        androidx.fragment.app.z m11;
        androidx.fragment.app.z o11;
        Promise promise = null;
        Promise promise2 = null;
        if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Canceled) {
            Promise promise3 = this.f20386a;
            if (promise3 == null) {
                kotlin.jvm.internal.s.x(BaseJavaModule.METHOD_TYPE_PROMISE);
            } else {
                promise = promise3;
            }
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Canceled.toString(), "The flow has been canceled"));
        } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Failed) {
            Promise promise4 = this.f20386a;
            if (promise4 == null) {
                kotlin.jvm.internal.s.x(BaseJavaModule.METHOD_TYPE_PROMISE);
            } else {
                promise2 = promise4;
            }
            promise2.resolve(hr.a.e(com.reactnativestripesdk.utils.d.Failed.toString(), ((FinancialConnectionsSheetResult.Failed) financialConnectionsSheetResult).getError()));
        } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Completed) {
            Promise promise5 = this.f20386a;
            if (promise5 == null) {
                kotlin.jvm.internal.s.x(BaseJavaModule.METHOD_TYPE_PROMISE);
                promise5 = null;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("session", f20385f.k(((FinancialConnectionsSheetResult.Completed) financialConnectionsSheetResult).getFinancialConnectionsSession()));
            vz.b0 b0Var = vz.b0.f54756a;
            promise5.resolve(writableNativeMap);
            ReactApplicationContext reactApplicationContext = this.f20387b;
            if (reactApplicationContext == null) {
                kotlin.jvm.internal.s.x(CoreConstants.CONTEXT_SCOPE_VALUE);
                reactApplicationContext = null;
            }
            Activity currentActivity = reactApplicationContext.getCurrentActivity();
            androidx.appcompat.app.d dVar = currentActivity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) currentActivity : null;
            if (dVar == null || (supportFragmentManager = dVar.getSupportFragmentManager()) == null || (m11 = supportFragmentManager.m()) == null || (o11 = m11.o(this)) == null) {
                return;
            }
            o11.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(FinancialConnectionsSheetForTokenResult financialConnectionsSheetForTokenResult) {
        androidx.fragment.app.q supportFragmentManager;
        androidx.fragment.app.z m11;
        androidx.fragment.app.z o11;
        Promise promise = null;
        Promise promise2 = null;
        if (financialConnectionsSheetForTokenResult instanceof FinancialConnectionsSheetForTokenResult.Canceled) {
            Promise promise3 = this.f20386a;
            if (promise3 == null) {
                kotlin.jvm.internal.s.x(BaseJavaModule.METHOD_TYPE_PROMISE);
            } else {
                promise = promise3;
            }
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Canceled.toString(), "The flow has been canceled"));
        } else if (financialConnectionsSheetForTokenResult instanceof FinancialConnectionsSheetForTokenResult.Failed) {
            Promise promise4 = this.f20386a;
            if (promise4 == null) {
                kotlin.jvm.internal.s.x(BaseJavaModule.METHOD_TYPE_PROMISE);
            } else {
                promise2 = promise4;
            }
            promise2.resolve(hr.a.e(com.reactnativestripesdk.utils.d.Failed.toString(), ((FinancialConnectionsSheetForTokenResult.Failed) financialConnectionsSheetForTokenResult).getError()));
        } else if (financialConnectionsSheetForTokenResult instanceof FinancialConnectionsSheetForTokenResult.Completed) {
            Promise promise5 = this.f20386a;
            if (promise5 == null) {
                kotlin.jvm.internal.s.x(BaseJavaModule.METHOD_TYPE_PROMISE);
                promise5 = null;
            }
            promise5.resolve(f20385f.c((FinancialConnectionsSheetForTokenResult.Completed) financialConnectionsSheetForTokenResult));
            ReactApplicationContext reactApplicationContext = this.f20387b;
            if (reactApplicationContext == null) {
                kotlin.jvm.internal.s.x(CoreConstants.CONTEXT_SCOPE_VALUE);
                reactApplicationContext = null;
            }
            Activity currentActivity = reactApplicationContext.getCurrentActivity();
            androidx.appcompat.app.d dVar = currentActivity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) currentActivity : null;
            if (dVar == null || (supportFragmentManager = dVar.getSupportFragmentManager()) == null || (m11 = supportFragmentManager.m()) == null || (o11 = m11.o(this)) == null) {
                return;
            }
            o11.i();
        }
    }

    public final void g(String clientSecret, b mode, String publishableKey, Promise promise, ReactApplicationContext context) {
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(mode, "mode");
        kotlin.jvm.internal.s.g(publishableKey, "publishableKey");
        kotlin.jvm.internal.s.g(promise, "promise");
        kotlin.jvm.internal.s.g(context, "context");
        this.f20386a = promise;
        this.f20387b = context;
        this.f20388c = clientSecret;
        this.f20389d = publishableKey;
        this.f20390e = mode;
        Activity currentActivity = context.getCurrentActivity();
        vz.b0 b0Var = null;
        androidx.appcompat.app.d dVar = currentActivity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) currentActivity : null;
        if (dVar != null) {
            c(dVar);
            d(dVar);
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            promise.resolve(hr.a.f());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        b bVar = this.f20390e;
        String str = null;
        if (bVar == null) {
            kotlin.jvm.internal.s.x("mode");
            bVar = null;
        }
        int i11 = c.f20398a[bVar.ordinal()];
        if (i11 == 1) {
            FinancialConnectionsSheet createForBankAccountToken = FinancialConnectionsSheet.Companion.createForBankAccountToken(this, new d(this));
            String str2 = this.f20388c;
            if (str2 == null) {
                kotlin.jvm.internal.s.x("clientSecret");
                str2 = null;
            }
            String str3 = this.f20389d;
            if (str3 == null) {
                kotlin.jvm.internal.s.x("publishableKey");
            } else {
                str = str3;
            }
            createForBankAccountToken.present(new FinancialConnectionsSheet.Configuration(str2, str));
        } else if (i11 != 2) {
        } else {
            FinancialConnectionsSheet create = FinancialConnectionsSheet.Companion.create(this, new e());
            String str4 = this.f20388c;
            if (str4 == null) {
                kotlin.jvm.internal.s.x("clientSecret");
                str4 = null;
            }
            String str5 = this.f20389d;
            if (str5 == null) {
                kotlin.jvm.internal.s.x("publishableKey");
            } else {
                str = str5;
            }
            create.present(new FinancialConnectionsSheet.Configuration(str4, str));
        }
    }
}