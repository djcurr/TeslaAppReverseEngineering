package org.godotengine.godot.utils;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Build;
import android.util.Log;
import androidx.core.content.b;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class PermissionsUtil {
    static final int REQUEST_ALL_PERMISSION_REQ_CODE = 1001;
    static final int REQUEST_CAMERA_PERMISSION = 2;
    static final int REQUEST_RECORD_AUDIO_PERMISSION = 1;
    static final int REQUEST_VIBRATE_PERMISSION = 3;
    private static final String TAG = "PermissionsUtil";

    private PermissionsUtil() {
    }

    public static String[] getGrantedPermissions(Activity activity) {
        try {
            String[] manifestPermissions = getManifestPermissions(activity);
            if (manifestPermissions.length == 0) {
                return manifestPermissions;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : manifestPermissions) {
                try {
                    PermissionInfo permissionInfo = getPermissionInfo(activity, str);
                    if ((Build.VERSION.SDK_INT >= 28 ? permissionInfo.getProtection() : permissionInfo.protectionLevel) == 1 && b.checkSelfPermission(activity, str) == 0) {
                        arrayList.add(str);
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.w(TAG, "Unable to identify permission " + str, e11);
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (PackageManager.NameNotFoundException e12) {
            e12.printStackTrace();
            return new String[0];
        }
    }

    private static String[] getManifestPermissions(Activity activity) {
        String[] strArr = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 4096).requestedPermissions;
        return strArr == null ? new String[0] : strArr;
    }

    private static PermissionInfo getPermissionInfo(Activity activity, String str) {
        return activity.getPackageManager().getPermissionInfo(str, 0);
    }

    public static boolean hasManifestPermission(Activity activity, String str) {
        try {
            for (String str2 : getManifestPermissions(activity)) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean requestManifestPermissions(Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            String[] manifestPermissions = getManifestPermissions(activity);
            if (manifestPermissions.length == 0) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : manifestPermissions) {
                try {
                    PermissionInfo permissionInfo = getPermissionInfo(activity, str);
                    if ((Build.VERSION.SDK_INT >= 28 ? permissionInfo.getProtection() : permissionInfo.protectionLevel) == 1 && b.checkSelfPermission(activity, str) != 0) {
                        arrayList.add(str);
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.w(TAG, "Unable to identify permission " + str, e11);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            activity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1001);
            return false;
        } catch (PackageManager.NameNotFoundException e12) {
            e12.printStackTrace();
            return false;
        }
    }

    public static boolean requestPermission(String str, Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (str.equals("RECORD_AUDIO") && b.checkSelfPermission(activity, "android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 1);
            return false;
        } else if (str.equals("CAMERA") && b.checkSelfPermission(activity, "android.permission.CAMERA") != 0) {
            activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 2);
            return false;
        } else if (!str.equals("VIBRATE") || b.checkSelfPermission(activity, "android.permission.VIBRATE") == 0) {
            return true;
        } else {
            activity.requestPermissions(new String[]{"android.permission.VIBRATE"}, 3);
            return false;
        }
    }
}