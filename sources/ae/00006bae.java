package expo.modules.mailcomposer;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.util.Log;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.core.arguments.ReadableArguments;
import ezvcard.property.Kind;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u001e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lexpo/modules/mailcomposer/MailIntentBuilder;", "", "", Action.KEY_ATTRIBUTE, "", "getStringArrayFrom", "(Ljava/lang/String;)[Ljava/lang/String;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Landroid/app/Application;", Kind.APPLICATION, "Landroid/net/Uri;", "contentUriFromFile", "Landroid/content/Intent;", "build", "pkg", "cls", "setComponentName", "intentName", "putExtraIfKeyExists", "", "isBodyHtml", "putParcelableArrayListExtraIfKeyExists", "Lexpo/modules/core/arguments/ReadableArguments;", "options", "Lexpo/modules/core/arguments/ReadableArguments;", "mailIntent", "Landroid/content/Intent;", "<init>", "(Lexpo/modules/core/arguments/ReadableArguments;)V", "expo-mail-composer_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class MailIntentBuilder {
    private final Intent mailIntent;
    private final ReadableArguments options;

    public MailIntentBuilder(ReadableArguments options) {
        s.g(options, "options");
        this.options = options;
        this.mailIntent = new Intent("android.intent.action.SEND_MULTIPLE");
    }

    private final Uri contentUriFromFile(File file, Application application) {
        try {
            String packageName = application.getPackageName();
            Uri uriForFile = FileProvider.getUriForFile(application, packageName + ".MailComposerFileProvider", file);
            s.f(uriForFile, "{\n    FileProvider.getUr…er\",\n      file\n    )\n  }");
            return uriForFile;
        } catch (Exception unused) {
            Uri fromFile = Uri.fromFile(file);
            s.f(fromFile, "{\n    Uri.fromFile(file)\n  }");
            return fromFile;
        }
    }

    private final String[] getStringArrayFrom(String str) {
        List list = this.options.getList(str);
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String?>");
        Object[] array = list.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public final Intent build() {
        return this.mailIntent;
    }

    public final MailIntentBuilder putExtraIfKeyExists(String key, String intentName) {
        s.g(key, "key");
        s.g(intentName, "intentName");
        if (this.options.containsKey(key)) {
            if (this.options.getList(key) != null) {
                this.mailIntent.putExtra(intentName, getStringArrayFrom(key));
            } else {
                this.mailIntent.putExtra(intentName, this.options.getString(key));
            }
        }
        return this;
    }

    public final MailIntentBuilder putParcelableArrayListExtraIfKeyExists(String key, String intentName, Application application) {
        s.g(key, "key");
        s.g(intentName, "intentName");
        s.g(application, "application");
        try {
            if (this.options.containsKey(key)) {
                String[] stringArrayFrom = getStringArrayFrom(key);
                ArrayList arrayList = new ArrayList(stringArrayFrom.length);
                int i11 = 0;
                int length = stringArrayFrom.length;
                while (i11 < length) {
                    String str = stringArrayFrom[i11];
                    i11++;
                    String path = Uri.parse(str).getPath();
                    if (path != null) {
                        arrayList.add(contentUriFromFile(new File(path), application));
                    } else {
                        throw new IllegalArgumentException("Path to attachment can not be null".toString());
                    }
                }
                this.mailIntent.putParcelableArrayListExtra(intentName, (ArrayList) u.K0(arrayList, new ArrayList()));
            }
        } catch (IllegalArgumentException e11) {
            Log.e("ExpoMailComposer", "Illegal argument:", e11);
        }
        return this;
    }

    public final MailIntentBuilder setComponentName(String pkg, String cls) {
        s.g(pkg, "pkg");
        s.g(cls, "cls");
        this.mailIntent.setComponent(new ComponentName(pkg, cls));
        return this;
    }

    public final MailIntentBuilder putExtraIfKeyExists(String key, String intentName, boolean z11) {
        CharSequence string;
        s.g(key, "key");
        s.g(intentName, "intentName");
        if (this.options.containsKey(key)) {
            if (z11) {
                string = Html.fromHtml(this.options.getString(key));
            } else {
                string = this.options.getString(key);
            }
            this.mailIntent.putExtra(intentName, string);
        }
        return this;
    }
}