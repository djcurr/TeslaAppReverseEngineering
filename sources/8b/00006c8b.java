package f;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes.dex */
public class b extends f.a<String, List<Uri>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25474a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Uri> a(Intent intent) {
            List<Uri> i11;
            s.g(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                i11 = w.i();
                return i11;
            }
            if (clipData != null) {
                int i12 = 0;
                int itemCount = clipData.getItemCount();
                if (itemCount > 0) {
                    while (true) {
                        int i13 = i12 + 1;
                        Uri uri = clipData.getItemAt(i12).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                        if (i13 >= itemCount) {
                            break;
                        }
                        i12 = i13;
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }
    }

    @Override // f.a
    /* renamed from: a */
    public Intent createIntent(Context context, String input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        s.f(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
        return putExtra;
    }

    @Override // f.a
    /* renamed from: b */
    public final a.C0496a<List<Uri>> getSynchronousResult(Context context, String input) {
        s.g(context, "context");
        s.g(input, "input");
        return null;
    }

    @Override // f.a
    /* renamed from: c */
    public final List<Uri> parseResult(int i11, Intent intent) {
        List<Uri> i12;
        if (!(i11 == -1)) {
            intent = null;
        }
        if (intent == null) {
            i12 = w.i();
            return i12;
        }
        return f25474a.a(intent);
    }
}