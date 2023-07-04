package expo.modules.constants;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import e00.b;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.interfaces.constants.ConstantsInterface;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import u30.d;
import vz.v;
import wz.r0;
import wz.s0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002()B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u0016J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00078B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lexpo/modules/constants/ConstantsService;", "Lexpo/modules/core/interfaces/InternalModule;", "Lexpo/modules/interfaces/constants/ConstantsInterface;", "", "Ljava/lang/Class;", "getExportedInterfaces", "", "", "", "getConstants", "getAppScopeKey", "getAppOwnership", "getDeviceName", "", "getDeviceYearClass", "", "getIsDevice", "getStatusBarHeight", "getSystemVersion", "getOrCreateInstallationId", "getSystemFonts", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "statusBarHeightInternal", "I", "getStatusBarHeightInternal", "()I", "setStatusBarHeightInternal", "(I)V", "sessionId", "Ljava/lang/String;", "Lexpo/modules/constants/ExponentInstallationId;", "exponentInstallationId", "Lexpo/modules/constants/ExponentInstallationId;", "getAppConfig", "()Ljava/lang/String;", "appConfig", "<init>", "(Landroid/content/Context;)V", "Companion", "ExecutionEnvironment", "expo-constants_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public class ConstantsService implements InternalModule, ConstantsInterface {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final ExponentInstallationId exponentInstallationId;
    private final String sessionId;
    private int statusBarHeightInternal;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002R\u0016\u0010\r\u001a\u00020\f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lexpo/modules/constants/ConstantsService$Companion;", "", "", "px", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "convertPixelsToDp", "Landroid/content/pm/PackageInfo;", "info", "", "getLongVersionCode", "", "isRunningOnGenymotion", "()Z", "isRunningOnStockEmulator", "<init>", "()V", "expo-constants_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int convertPixelsToDp(float f11, Context context) {
            return (int) (f11 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long getLongVersionCode(PackageInfo packageInfo) {
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isRunningOnGenymotion() {
            boolean M;
            String FINGERPRINT = Build.FINGERPRINT;
            s.f(FINGERPRINT, "FINGERPRINT");
            M = w.M(FINGERPRINT, "vbox", false, 2, null);
            return M;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isRunningOnStockEmulator() {
            boolean M;
            String FINGERPRINT = Build.FINGERPRINT;
            s.f(FINGERPRINT, "FINGERPRINT");
            M = w.M(FINGERPRINT, "generic", false, 2, null);
            return M;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/constants/ConstantsService$ExecutionEnvironment;", "", "", "string", "Ljava/lang/String;", "getString", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BARE", "STANDALONE", "STORE_CLIENT", "expo-constants_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public enum ExecutionEnvironment {
        BARE("bare"),
        STANDALONE("standalone"),
        STORE_CLIENT("storeClient");
        
        private final String string;

        ExecutionEnvironment(String str) {
            this.string = str;
        }

        public final String getString() {
            return this.string;
        }
    }

    public ConstantsService(Context context) {
        s.g(context, "context");
        this.context = context;
        Integer valueOf = Integer.valueOf(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        valueOf = valueOf.intValue() > 0 ? valueOf : null;
        this.statusBarHeightInternal = valueOf != null ? Companion.convertPixelsToDp(Integer.valueOf(context.getResources().getDimensionPixelSize(valueOf.intValue())).intValue(), context) : 0;
        String uuid = UUID.randomUUID().toString();
        s.f(uuid, "randomUUID().toString()");
        this.sessionId = uuid;
        this.exponentInstallationId = new ExponentInstallationId(context);
    }

    private final String getAppConfig() {
        String str;
        try {
            InputStream open = this.context.getAssets().open("app.config");
            String j11 = d.j(open, StandardCharsets.UTF_8);
            b.a(open, null);
            return j11;
        } catch (FileNotFoundException unused) {
            return null;
        } catch (Exception e11) {
            str = ConstantsServiceKt.TAG;
            Log.e(str, "Error reading embedded app config", e11);
            return null;
        }
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getAppOwnership() {
        return "guest";
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getAppScopeKey() {
        return this.context.getPackageName();
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public Map<String, Object> getConstants() {
        Map i11;
        Map f11;
        Map<String, Object> n11;
        String str;
        i11 = s0.i();
        f11 = r0.f(v.a("android", i11));
        n11 = s0.n(v.a("sessionId", this.sessionId), v.a("executionEnvironment", ExecutionEnvironment.BARE.getString()), v.a("statusBarHeight", Integer.valueOf(this.statusBarHeightInternal)), v.a("deviceYearClass", Integer.valueOf(getDeviceYearClass())), v.a("deviceName", getDeviceName()), v.a("isDevice", Boolean.valueOf(getIsDevice())), v.a("systemFonts", getSystemFonts()), v.a("systemVersion", getSystemVersion()), v.a("installationId", getOrCreateInstallationId()), v.a("manifest", getAppConfig()), v.a("platform", f11));
        try {
            PackageInfo pInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            n11.put("nativeAppVersion", pInfo.versionName);
            Companion companion = Companion;
            s.f(pInfo, "pInfo");
            n11.put("nativeBuildVersion", String.valueOf((int) companion.getLongVersionCode(pInfo)));
        } catch (PackageManager.NameNotFoundException e11) {
            str = ConstantsServiceKt.TAG;
            Log.e(str, "Exception: ", e11);
        }
        return n11;
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getDeviceName() {
        String MODEL = Build.MODEL;
        s.f(MODEL, "MODEL");
        return MODEL;
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public int getDeviceYearClass() {
        return zd.b.d(this.context);
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<?>> getExportedInterfaces() {
        List<Class<?>> d11;
        d11 = wz.v.d(ConstantsInterface.class);
        return d11;
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public boolean getIsDevice() {
        Companion companion = Companion;
        return (companion.isRunningOnGenymotion() || companion.isRunningOnStockEmulator()) ? false : true;
    }

    public String getOrCreateInstallationId() {
        return this.exponentInstallationId.getOrCreateUUID();
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public int getStatusBarHeight() {
        return this.statusBarHeightInternal;
    }

    public final int getStatusBarHeightInternal() {
        return this.statusBarHeightInternal;
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public List<String> getSystemFonts() {
        List<String> l11;
        l11 = wz.w.l("normal", "notoserif", "sans-serif", "sans-serif-light", "sans-serif-thin", "sans-serif-condensed", "sans-serif-medium", "serif", "Roboto", "monospace");
        return l11;
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getSystemVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        s.f(RELEASE, "RELEASE");
        return RELEASE;
    }

    public final void setStatusBarHeightInternal(int i11) {
        this.statusBarHeightInternal = i11;
    }
}