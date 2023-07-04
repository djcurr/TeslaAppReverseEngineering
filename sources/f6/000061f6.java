package com.teslamotors.plugins.ble;

import android.os.Build;
import android.os.ParcelUuid;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f22142a;

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f22143b;

    /* renamed from: c  reason: collision with root package name */
    public static final ParcelUuid f22144c;

    /* renamed from: d  reason: collision with root package name */
    public static final UUID f22145d;

    /* renamed from: e  reason: collision with root package name */
    public static final UUID f22146e;

    /* renamed from: f  reason: collision with root package name */
    public static final UUID f22147f;

    /* renamed from: g  reason: collision with root package name */
    public static final UUID f22148g;

    /* renamed from: h  reason: collision with root package name */
    public static final Set<String> f22149h;

    /* renamed from: i  reason: collision with root package name */
    public static final Set<String> f22150i;

    static {
        f22142a = Build.VERSION.SDK_INT >= 26;
        f22143b = UUID.fromString("00000211-b2d1-43f0-9b88-960cebf8b91e");
        f22144c = ParcelUuid.fromString("00001122-0000-1000-8000-00805F9B34FB");
        f22145d = UUID.fromString("00000212-b2d1-43f0-9b88-960cebf8b91e");
        f22146e = UUID.fromString("00000213-b2d1-43f0-9b88-960cebf8b91e");
        f22147f = UUID.fromString("00000214-b2d1-43f0-9b88-960cebf8b91e");
        f22148g = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        new SimpleDateFormat("MM/dd/yy HH:mm:ss.SSS");
        f22149h = new HashSet(Arrays.asList(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "R", "D", "P"));
        f22150i = new HashSet(Arrays.asList(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE));
    }
}