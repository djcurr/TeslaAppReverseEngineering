package expo.modules.errorrecovery;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.ExportedModule;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ExpoMethod;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0016\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\n\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014R\u001c\u0010\u000f\u001a\u00020\u000e8\u0014@\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lexpo/modules/errorrecovery/ErrorRecoveryModule;", "Lexpo/modules/core/ExportedModule;", "", "getName", "props", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "saveRecoveryProps", "", "", "getConstants", "setRecoveryProps", "consumeRecoveryProps", "Landroid/content/SharedPreferences;", "mSharedPreferences", "Landroid/content/SharedPreferences;", "getMSharedPreferences", "()Landroid/content/SharedPreferences;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "expo-error-recovery_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public class ErrorRecoveryModule extends ExportedModule {
    private final SharedPreferences mSharedPreferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorRecoveryModule(Context context) {
        super(context);
        s.g(context, "context");
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(ErrorRecoveryModuleKt.RECOVERY_STORE, 0);
        s.f(sharedPreferences, "context.applicationConte…RE, Context.MODE_PRIVATE)");
        this.mSharedPreferences = sharedPreferences;
    }

    protected String consumeRecoveryProps() {
        String string = getMSharedPreferences().getString("recoveredProps", null);
        if (string == null) {
            return null;
        }
        getMSharedPreferences().edit().remove("recoveredProps").commit();
        return string;
    }

    @Override // expo.modules.core.ExportedModule
    public Map<String, Object> getConstants() {
        Map<String, Object> f11;
        f11 = r0.f(v.a("recoveredProps", consumeRecoveryProps()));
        return f11;
    }

    protected SharedPreferences getMSharedPreferences() {
        return this.mSharedPreferences;
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoErrorRecovery";
    }

    @ExpoMethod
    public final void saveRecoveryProps(String str, Promise promise) {
        s.g(promise, "promise");
        if (str != null) {
            setRecoveryProps(str);
        }
        promise.resolve(null);
    }

    protected void setRecoveryProps(String props) {
        s.g(props, "props");
        getMSharedPreferences().edit().putString("recoveredProps", props).commit();
    }
}