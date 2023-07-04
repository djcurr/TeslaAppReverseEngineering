package expo.modules.mailcomposer;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryDelegate;
import expo.modules.core.Promise;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.k;
import vz.m;
import wz.e0;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00018\u00008\u00000\u0004\"\u0006\b\u0000\u0010\u0003\u0018\u0001H\u0082\bJ\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lexpo/modules/mailcomposer/MailComposerModule;", "Lexpo/modules/core/ExportedModule;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "T", "Lvz/k;", "kotlin.jvm.PlatformType", "moduleRegistry", "", "getName", "Lexpo/modules/core/ModuleRegistry;", "Lvz/b0;", "onCreate", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "isAvailableAsync", "Lexpo/modules/core/arguments/ReadableArguments;", "options", "composeAsync", "onHostResume", "onHostPause", "onHostDestroy", "Lexpo/modules/core/ModuleRegistryDelegate;", "moduleRegistryDelegate", "Lexpo/modules/core/ModuleRegistryDelegate;", "", "composerOpened", "Z", "pendingPromise", "Lexpo/modules/core/Promise;", "Lexpo/modules/core/interfaces/ActivityProvider;", "activityProvider$delegate", "Lvz/k;", "getActivityProvider", "()Lexpo/modules/core/interfaces/ActivityProvider;", "activityProvider", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lexpo/modules/core/ModuleRegistryDelegate;)V", "expo-mail-composer_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class MailComposerModule extends ExportedModule implements LifecycleEventListener {
    private final k activityProvider$delegate;
    private boolean composerOpened;
    private final ModuleRegistryDelegate moduleRegistryDelegate;
    private Promise pendingPromise;

    public /* synthetic */ MailComposerModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new ModuleRegistryDelegate() : moduleRegistryDelegate);
    }

    private final ActivityProvider getActivityProvider() {
        Object value = this.activityProvider$delegate.getValue();
        s.f(value, "<get-activityProvider>(...)");
        return (ActivityProvider) value;
    }

    private final /* synthetic */ <T> k<T> moduleRegistry() {
        k<T> a11;
        ModuleRegistryDelegate moduleRegistryDelegate = this.moduleRegistryDelegate;
        s.l();
        a11 = m.a(new MailComposerModule$moduleRegistry$$inlined$getFromModuleRegistry$1(moduleRegistryDelegate));
        return a11;
    }

    @ExpoMethod
    public final void composeAsync(ReadableArguments options, Promise promise) {
        int t11;
        List Q0;
        s.g(options, "options");
        s.g(promise, "promise");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        Application application = getActivityProvider().getCurrentActivity().getApplication();
        List<ResolveInfo> queryIntentActivities = getContext().getPackageManager().queryIntentActivities(intent, 0);
        s.f(queryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
        t11 = x.t(queryIntentActivities, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<T> it2 = queryIntentActivities.iterator();
        while (true) {
            boolean z11 = true;
            if (it2.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo) it2.next();
                if (!options.containsKey("isHtml") || !options.getBoolean("isHtml")) {
                    z11 = false;
                }
                MailIntentBuilder mailIntentBuilder = new MailIntentBuilder(options);
                String str = resolveInfo.activityInfo.packageName;
                s.f(str, "info.activityInfo.packageName");
                String str2 = resolveInfo.activityInfo.name;
                s.f(str2, "info.activityInfo.name");
                MailIntentBuilder putExtraIfKeyExists = mailIntentBuilder.setComponentName(str, str2).putExtraIfKeyExists("recipients", "android.intent.extra.EMAIL").putExtraIfKeyExists("ccRecipients", "android.intent.extra.CC").putExtraIfKeyExists("bccRecipients", "android.intent.extra.BCC").putExtraIfKeyExists("subject", "android.intent.extra.SUBJECT").putExtraIfKeyExists("body", "android.intent.extra.TEXT", z11);
                s.f(application, "application");
                arrayList.add(new LabeledIntent(putExtraIfKeyExists.putParcelableArrayListExtraIfKeyExists("attachments", "android.intent.extra.STREAM", application).build(), resolveInfo.activityInfo.packageName, resolveInfo.loadLabel(getContext().getPackageManager()), resolveInfo.icon));
            } else {
                Q0 = e0.Q0(arrayList);
                Intent createChooser = Intent.createChooser((Intent) Q0.remove(Q0.size() - 1), null);
                Object[] array = Q0.toArray(new LabeledIntent[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) array);
                createChooser.addFlags(268435456);
                createChooser.addFlags(1);
                this.pendingPromise = promise;
                getContext().startActivity(createChooser);
                this.composerOpened = true;
                return;
            }
        }
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoMailComposer";
    }

    @ExpoMethod
    public final void isAvailableAsync(Promise promise) {
        s.g(promise, "promise");
        promise.resolve(Boolean.TRUE);
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.moduleRegistryDelegate.onCreate(moduleRegistry);
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        Promise promise = this.pendingPromise;
        if (promise != null && this.composerOpened) {
            this.composerOpened = false;
            Bundle bundle = new Bundle();
            bundle.putString(PermissionsResponse.STATUS_KEY, "sent");
            b0 b0Var = b0.f54756a;
            promise.resolve(bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MailComposerModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate) {
        super(context);
        k a11;
        s.g(context, "context");
        s.g(moduleRegistryDelegate, "moduleRegistryDelegate");
        this.moduleRegistryDelegate = moduleRegistryDelegate;
        a11 = m.a(new MailComposerModule$special$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        this.activityProvider$delegate = a11;
    }
}