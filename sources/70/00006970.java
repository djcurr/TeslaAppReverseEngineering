package expo.modules.filesystem;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.interfaces.filesystem.FilePermissionModuleInterface;
import expo.modules.interfaces.filesystem.Permission;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import wz.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\nH\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\u0012"}, d2 = {"Lexpo/modules/filesystem/FilePermissionModule;", "Lexpo/modules/interfaces/filesystem/FilePermissionModuleInterface;", "Lexpo/modules/core/interfaces/InternalModule;", "", "path", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/EnumSet;", "Lexpo/modules/interfaces/filesystem/Permission;", "getInternalPathPermissions", "", "getInternalPaths", "Ljava/lang/Class;", "getExportedInterfaces", "getPathPermissions", "getExternalPathPermissions", "<init>", "()V", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public class FilePermissionModule implements FilePermissionModuleInterface, InternalModule {
    private final EnumSet<Permission> getInternalPathPermissions(String str, Context context) {
        Object obj;
        boolean H;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            Iterator<T> it2 = getInternalPaths(context).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                String str2 = (String) obj;
                s.f(canonicalPath, "canonicalPath");
                boolean z11 = false;
                H = v.H(canonicalPath, str2 + "/", false, 2, null);
                if (H || s.c(str2, canonicalPath)) {
                    z11 = true;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
            if (((String) obj) == null) {
                return null;
            }
            return EnumSet.of(Permission.READ, Permission.WRITE);
        } catch (IOException unused) {
            return EnumSet.noneOf(Permission.class);
        }
    }

    private final List<String> getInternalPaths(Context context) {
        List<String> l11;
        l11 = w.l(context.getFilesDir().getCanonicalPath(), context.getCacheDir().getCanonicalPath());
        return l11;
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<?>> getExportedInterfaces() {
        List<Class<?>> d11;
        d11 = wz.v.d(FilePermissionModuleInterface.class);
        return d11;
    }

    protected EnumSet<Permission> getExternalPathPermissions(String path) {
        s.g(path, "path");
        File file = new File(path);
        EnumSet<Permission> noneOf = EnumSet.noneOf(Permission.class);
        if (file.canRead()) {
            noneOf.add(Permission.READ);
        }
        if (file.canWrite()) {
            noneOf.add(Permission.WRITE);
        }
        s.f(noneOf, "noneOf(Permission::class…sion.WRITE)\n      }\n    }");
        return noneOf;
    }

    @Override // expo.modules.interfaces.filesystem.FilePermissionModuleInterface
    public EnumSet<Permission> getPathPermissions(Context context, String path) {
        s.g(context, "context");
        s.g(path, "path");
        EnumSet<Permission> internalPathPermissions = getInternalPathPermissions(path, context);
        return internalPathPermissions == null ? getExternalPathPermissions(path) : internalPathPermissions;
    }
}