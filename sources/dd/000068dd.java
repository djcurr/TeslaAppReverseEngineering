package expo.modules.constants;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import e00.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lexpo/modules/constants/ExponentInstallationId;", "", "", "getUUID", "getOrCreateUUID", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", ExponentInstallationId.LEGACY_UUID_KEY, "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "mSharedPreferences", "Landroid/content/SharedPreferences;", "Ljava/io/File;", "getNonBackedUpUuidFile", "()Ljava/io/File;", "nonBackedUpUuidFile", "<init>", "(Landroid/content/Context;)V", "Companion", "expo-constants_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ExponentInstallationId {
    public static final Companion Companion = new Companion(null);
    public static final String LEGACY_UUID_KEY = "uuid";
    public static final String UUID_FILE_NAME = "expo_installation_uuid.txt";
    private final Context context;
    private final SharedPreferences mSharedPreferences;
    private String uuid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lexpo/modules/constants/ExponentInstallationId$Companion;", "", "", "LEGACY_UUID_KEY", "Ljava/lang/String;", "UUID_FILE_NAME", "<init>", "()V", "expo-constants_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExponentInstallationId(Context context) {
        s.g(context, "context");
        this.context = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("host.exp.exponent.SharedPreferences", 0);
        s.f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.mSharedPreferences = sharedPreferences;
    }

    private final File getNonBackedUpUuidFile() {
        return new File(this.context.getNoBackupFilesDir(), UUID_FILE_NAME);
    }

    public final String getOrCreateUUID() {
        String str;
        String uuid = getUUID();
        if (uuid != null) {
            return uuid;
        }
        this.uuid = UUID.randomUUID().toString();
        try {
            FileWriter fileWriter = new FileWriter(getNonBackedUpUuidFile());
            fileWriter.write(this.uuid);
            b0 b0Var = b0.f54756a;
            b.a(fileWriter, null);
        } catch (IOException e11) {
            str = ExponentInstallationIdKt.TAG;
            Log.e(str, "Error while writing new UUID. " + e11);
        }
        String str2 = this.uuid;
        s.e(str2);
        return str2;
    }

    public final String getUUID() {
        String str;
        String str2 = this.uuid;
        if (str2 != null) {
            return str2;
        }
        File nonBackedUpUuidFile = getNonBackedUpUuidFile();
        boolean z11 = true;
        try {
            FileReader fileReader = new FileReader(nonBackedUpUuidFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            this.uuid = UUID.fromString(bufferedReader.readLine()).toString();
            b0 b0Var = b0.f54756a;
            b.a(bufferedReader, null);
            b.a(fileReader, null);
        } catch (Exception e11) {
            if (!(e11 instanceof IOException ? true : e11 instanceof IllegalArgumentException)) {
                throw e11;
            }
        }
        String str3 = this.uuid;
        if (str3 != null) {
            return str3;
        }
        String string = this.mSharedPreferences.getString(LEGACY_UUID_KEY, null);
        if (string != null) {
            this.uuid = string;
            try {
                FileWriter fileWriter = new FileWriter(nonBackedUpUuidFile);
                fileWriter.write(string);
                b0 b0Var2 = b0.f54756a;
                b.a(fileWriter, null);
            } catch (IOException e12) {
                str = ExponentInstallationIdKt.TAG;
                Log.e(str, "Error while migrating UUID from legacy storage. " + e12);
                z11 = false;
            }
            if (z11) {
                this.mSharedPreferences.edit().remove(LEGACY_UUID_KEY).apply();
            }
        }
        return this.uuid;
    }
}