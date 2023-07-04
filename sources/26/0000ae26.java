package ql;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import sl.a;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f48348g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    static final DateFormat f48349h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private final String f48350a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48351b;

    /* renamed from: c  reason: collision with root package name */
    private final String f48352c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f48353d;

    /* renamed from: e  reason: collision with root package name */
    private final long f48354e;

    /* renamed from: f  reason: collision with root package name */
    private final long f48355f;

    public a(String str, String str2, String str3, Date date, long j11, long j12) {
        this.f48350a = str;
        this.f48351b = str2;
        this.f48352c = str3;
        this.f48353d = date;
        this.f48354e = j11;
        this.f48355f = j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Map<String, String> map) {
        e(map);
        try {
            return new a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f48349h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e11) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e11);
        } catch (ParseException e12) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e12);
        }
    }

    private static void e(Map<String, String> map) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : f48348g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f48350a;
    }

    long c() {
        return this.f48353d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a.c d(String str) {
        a.c cVar = new a.c();
        cVar.f50446a = str;
        cVar.f50458m = c();
        cVar.f50447b = this.f48350a;
        cVar.f50448c = this.f48351b;
        cVar.f50449d = TextUtils.isEmpty(this.f48352c) ? null : this.f48352c;
        cVar.f50450e = this.f48354e;
        cVar.f50455j = this.f48355f;
        return cVar;
    }
}