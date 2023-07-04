package expo.modules.imagepicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import e00.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import u30.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lexpo/modules/imagepicker/PickerResultsStore;", "", "", "path", "readAsBase64", "Landroid/os/Bundle;", "bundle", "", "kotlin.jvm.PlatformType", "bundleToBytes", "bytes", "bytesToBundle", "Lvz/b0;", "addPendingResult", "", "getAllPendingResults", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class PickerResultsStore {
    private final SharedPreferences sharedPreferences;

    public PickerResultsStore(Context context) {
        s.g(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PickerResultsStoreKt.SHARED_PREFERENCES_NAME, 0);
        s.f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
    }

    private final byte[] bundleToBytes(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    private final Bundle bytesToBundle(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(PickerResultsStore.class.getClassLoader());
        obtain.recycle();
        return readBundle;
    }

    private final String readAsBase64(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            d.a(fileInputStream, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            b.a(fileInputStream, null);
            return encodeToString;
        } catch (IOException e11) {
            Log.e(ImagePickerConstants.TAG, e11.getMessage(), e11);
            return null;
        }
    }

    public final void addPendingResult(Bundle bundle) {
        s.g(bundle, "bundle");
        bundle.putLong(PickerResultsStoreKt.EXPIRE_KEY, new Date().getTime() + ((long) PickerResultsStoreKt.EXPIRATION_TIME));
        String uuid = UUID.randomUUID().toString();
        s.f(uuid, "randomUUID().toString()");
        this.sharedPreferences.edit().putString(uuid, Base64.encodeToString(bundleToBytes(bundle), 0)).apply();
    }

    public final List<Bundle> getAllPendingResults() {
        String readAsBase64;
        ArrayList arrayList = new ArrayList();
        long time = new Date().getTime();
        Map<String, ?> all = this.sharedPreferences.getAll();
        s.f(all, "sharedPreferences.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                byte[] decode = Base64.decode((String) value, 0);
                s.f(decode, "decode(value, 0)");
                Bundle bytesToBundle = bytesToBundle(decode);
                if (bytesToBundle != null) {
                    if (bytesToBundle.containsKey("uri")) {
                        if (bytesToBundle.getLong(PickerResultsStoreKt.EXPIRE_KEY) >= time) {
                            String path = Uri.parse(bytesToBundle.getString("uri")).getPath();
                            s.e(path);
                            s.f(path, "parse(decodedBundle.getString(\"uri\")).path!!");
                            if (new File(path).exists()) {
                                if (bytesToBundle.getBoolean(ImagePickerConstants.OPTION_BASE64, false) && (readAsBase64 = readAsBase64(path)) != null) {
                                    bytesToBundle.putString(ImagePickerConstants.OPTION_BASE64, readAsBase64);
                                }
                            }
                        }
                    }
                    bytesToBundle.remove(PickerResultsStoreKt.EXPIRE_KEY);
                    arrayList.add(bytesToBundle);
                }
            }
        }
        this.sharedPreferences.edit().clear().apply();
        return arrayList;
    }
}