package com.henninghall.date_picker;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import net.time4j.android.ApplicationStarter;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.i18n.MessageBundle;

/* loaded from: classes2.dex */
public class DatePickerModule extends ReactContextBaseJavaModule {
    private AlertDialog dialog;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f17461a;

        a(DatePickerModule datePickerModule, Callback callback) {
            this.f17461a = callback;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f17461a.invoke(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f17462a;

        b(DatePickerModule datePickerModule, Callback callback) {
            this.f17462a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            this.f17462a.invoke(new Object[0]);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f17463a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f17464b;

        c(DatePickerModule datePickerModule, Callback callback, g gVar) {
            this.f17463a = callback;
            this.f17464b = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            this.f17463a.invoke(this.f17464b.getDate());
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        ApplicationStarter.b(reactApplicationContext, false);
    }

    private AlertDialog createDialog(ReadableMap readableMap, g gVar, Callback callback, Callback callback2) {
        String string = readableMap.getString(MessageBundle.TITLE_ENTRY);
        String string2 = readableMap.getString("confirmText");
        return new AlertDialog.Builder(com.henninghall.date_picker.a.f17465a.getCurrentActivity(), getTheme(readableMap)).setTitle(string).setCancelable(true).setView(withTopMargin(gVar)).setPositiveButton(string2, new c(this, callback, gVar)).setNegativeButton(readableMap.getString("cancelText"), new b(this, callback2)).setOnCancelListener(new a(this, callback2)).create();
    }

    private g createPicker(ReadableMap readableMap) {
        g gVar = new g(new LinearLayout.LayoutParams(-1, k.k(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256)));
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (!nextKey.equals("style")) {
                try {
                    gVar.d(nextKey, dynamic);
                } catch (Exception unused) {
                }
            }
        }
        gVar.c();
        return gVar;
    }

    private int getTheme(ReadableMap readableMap) {
        String string = readableMap.getString("theme");
        if (string == null) {
            return 0;
        }
        if (string.equals("dark")) {
            return 4;
        }
        return !string.equals("light") ? 0 : 5;
    }

    private View withTopMargin(g gVar) {
        LinearLayout linearLayout = new LinearLayout(com.henninghall.date_picker.a.f17465a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(gVar);
        linearLayout.setPadding(0, k.k(20), 0, 0);
        return linearLayout;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void closePicker() {
        this.dialog.dismiss();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNDatePicker";
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap, Callback callback, Callback callback2) {
        AlertDialog createDialog = createDialog(readableMap, createPicker(readableMap), callback, callback2);
        this.dialog = createDialog;
        createDialog.show();
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}