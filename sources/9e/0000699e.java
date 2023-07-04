package expo.modules.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryDelegate;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.interfaces.constants.ConstantsInterface;
import expo.modules.interfaces.font.FontManagerInterface;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00018\u00008\u00000\u0003\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0082\bJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J \u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\n@\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\n@\nX\u008a\u0084\u0002"}, d2 = {"Lexpo/modules/font/FontLoaderModule;", "Lexpo/modules/core/ExportedModule;", "T", "Lvz/k;", "kotlin.jvm.PlatformType", "moduleRegistry", "Lexpo/modules/core/ModuleRegistry;", "Lvz/b0;", "onCreate", "", "getName", "fontFamilyName", "localUri", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "loadAsync", "Lexpo/modules/core/ModuleRegistryDelegate;", "moduleRegistryDelegate", "Lexpo/modules/core/ModuleRegistryDelegate;", "", "isScoped", "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lexpo/modules/interfaces/font/FontManagerInterface;", "fontManager", "Lexpo/modules/interfaces/constants/ConstantsInterface;", "constantsModule", "expo-font_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class FontLoaderModule extends ExportedModule {
    private final ModuleRegistryDelegate moduleRegistryDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontLoaderModule(Context context) {
        super(context);
        s.g(context, "context");
        this.moduleRegistryDelegate = new ModuleRegistryDelegate();
    }

    /* renamed from: _get_isScoped_$lambda-1  reason: not valid java name */
    private static final ConstantsInterface m604_get_isScoped_$lambda1(k<? extends ConstantsInterface> kVar) {
        return kVar.getValue();
    }

    private final boolean isScoped() {
        k a11;
        a11 = m.a(new FontLoaderModule$special$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        if (m604_get_isScoped_$lambda1(a11) != null) {
            ConstantsInterface m604_get_isScoped_$lambda1 = m604_get_isScoped_$lambda1(a11);
            s.e(m604_get_isScoped_$lambda1);
            if (s.c("expo", m604_get_isScoped_$lambda1.getAppOwnership())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: loadAsync$lambda-0  reason: not valid java name */
    private static final FontManagerInterface m605loadAsync$lambda0(k<? extends FontManagerInterface> kVar) {
        return kVar.getValue();
    }

    private final /* synthetic */ <T> k<T> moduleRegistry() {
        k<T> a11;
        ModuleRegistryDelegate moduleRegistryDelegate = this.moduleRegistryDelegate;
        s.l();
        a11 = m.a(new FontLoaderModule$moduleRegistry$$inlined$getFromModuleRegistry$1(moduleRegistryDelegate));
        return a11;
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoFontLoader";
    }

    @ExpoMethod
    public final void loadAsync(String fontFamilyName, String localUri, Promise promise) {
        boolean H;
        Typeface createFromFile;
        k a11;
        s.g(fontFamilyName, "fontFamilyName");
        s.g(localUri, "localUri");
        s.g(promise, "promise");
        try {
            String str = isScoped() ? "ExpoFont-" : "";
            H = v.H(localUri, "asset://", false, 2, null);
            if (H) {
                AssetManager assets = getContext().getAssets();
                String substring = localUri.substring(9);
                s.f(substring, "this as java.lang.String).substring(startIndex)");
                createFromFile = Typeface.createFromAsset(assets, substring);
                s.f(createFromFile, "{\n        Typeface.creat…th + 1)\n        )\n      }");
            } else {
                createFromFile = Typeface.createFromFile(new File(Uri.parse(localUri).getPath()));
                s.f(createFromFile, "{\n        Typeface.creat…(localUri).path))\n      }");
            }
            a11 = m.a(new FontLoaderModule$loadAsync$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
            if (m605loadAsync$lambda0(a11) == null) {
                promise.reject("E_NO_FONT_MANAGER", "There is no FontManager in module registry. Are you sure all the dependencies of expo-font are installed and linked?");
                return;
            }
            FontManagerInterface m605loadAsync$lambda0 = m605loadAsync$lambda0(a11);
            s.e(m605loadAsync$lambda0);
            m605loadAsync$lambda0.setTypeface(str + fontFamilyName, 0, createFromFile);
            promise.resolve(null);
        } catch (Exception e11) {
            String message = e11.getMessage();
            promise.reject("E_UNEXPECTED", "Font.loadAsync unexpected exception: " + message, e11);
        }
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.moduleRegistryDelegate.onCreate(moduleRegistry);
    }
}